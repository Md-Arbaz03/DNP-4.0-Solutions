CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_account IN Accounts.AccountID%TYPE,
    p_target_account IN Accounts.AccountID%TYPE,
    p_amount IN NUMBER
) AS
    v_balance NUMBER;
BEGIN

    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_source_account;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-32025, 'Insufficient balance in source account.');
    END IF;

    
    UPDATE Accounts
    SET Balance = Balance - p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_source_account;

    
    UPDATE Accounts
    SET Balance = Balance + p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_target_account;

    COMMIT;
END;

BEGIN
    TransferFunds(1, 2, 300);
END;

SELECT * FROM Accounts;