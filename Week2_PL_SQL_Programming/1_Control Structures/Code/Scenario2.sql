ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

DECLARE
    CURSOR cur_customers IS
        SELECT CustomerID, Balance FROM Customers;

    v_custID Customers.CustomerID%TYPE;
    v_balance Customers.Balance%TYPE;
BEGIN
    OPEN cur_customers;
    LOOP
        FETCH cur_customers INTO v_custID, v_balance;
        EXIT WHEN cur_customers%NOTFOUND;

        IF v_balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = v_custID;
        ELSE
            UPDATE Customers
            SET IsVIP = NULL
            WHERE CustomerID = v_custID;
        END IF;
    END LOOP;
    CLOSE cur_customers;

    COMMIT;
END;

SELECT * FROM Customers;