--1527. Patients With a Condition


--Write your MySQL query statement below
SELECT  * 
FROM Patients 
WHERE conditions LIKE 'DIAB1%' OR 
conditions LIKE '% DIAB1%' ;
