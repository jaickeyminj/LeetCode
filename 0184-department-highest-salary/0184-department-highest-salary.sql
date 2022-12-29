# Write your MySQL query statement below

SELECT D.NAME AS DEPARTMENT, E.NAME AS EMPLOYEE, (E.SALARY) FROM EMPLOYEE E INNER JOIN DEPARTMENT D ON E.DEPARTMENTID = D.ID WHERE
    (E.DepartmentId , E.Salary) IN
    (   SELECT
            DepartmentId, MAX(Salary)
        FROM
            Employee
        GROUP BY DepartmentId
    )
;;
