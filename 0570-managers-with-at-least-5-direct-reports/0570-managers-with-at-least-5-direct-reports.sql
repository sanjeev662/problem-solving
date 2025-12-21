# Write your MySQL query statement below

SELECT name From Employee where id IN (SELECT managerId
FROM Employee
GROUP BY managerId
HAVING COUNT(*) >= 5);