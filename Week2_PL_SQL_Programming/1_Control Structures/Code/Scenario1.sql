DECLARE
    CURSOR cur_customers IS
        SELECT CustomerID, DOB FROM Customers;

    v_custID Customers.CustomerID%TYPE;
    v_dob Customers.DOB%TYPE;
    v_age NUMBER;
BEGIN
    OPEN cur_customers;
    LOOP
        FETCH cur_customers INTO v_custID, v_dob;
        EXIT WHEN cur_customers%NOTFOUND;

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, v_dob) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = v_custID;
        END IF;
    END LOOP;
    CLOSE cur_customers;

    COMMIT;
END;

SELECT * FROM Loans;