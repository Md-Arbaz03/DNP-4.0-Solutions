DECLARE
    CURSOR cur_loans IS
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30;

    v_loanID Loans.LoanID%TYPE;
    v_custID Loans.CustomerID%TYPE;
    v_endDate Loans.EndDate%TYPE;
    v_name Customers.Name%TYPE;
BEGIN
    OPEN cur_loans;
    LOOP
        FETCH cur_loans INTO v_loanID, v_custID, v_endDate;
        EXIT WHEN cur_loans%NOTFOUND;

        SELECT Name INTO v_name
        FROM Customers
        WHERE CustomerID = v_custID;

        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || v_loanID ||
                             ' for customer ' || v_name ||
                             ' is due on ' || TO_CHAR(v_endDate, 'DD-MON-YYYY'));
    END LOOP;
    CLOSE cur_loans;
END;