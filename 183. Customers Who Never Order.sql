--183. Customers Who Never Order

--Write your MySQL query statement below
SELECT name AS CUSTOMERS FROM Customers
WHERE id NOT IN (select customerId FROM orders );
