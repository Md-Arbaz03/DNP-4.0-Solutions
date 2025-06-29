CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN Employees.Department%TYPE,
    p_bonus_pct IN NUMBER 
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_department;

    COMMIT;
END;

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;

SELECT * FROM Employees;