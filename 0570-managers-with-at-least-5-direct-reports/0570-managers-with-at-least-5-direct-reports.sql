# Write your MySQL query statement below

-- SELECT name From Employee where id IN (SELECT managerId
-- FROM Employee
-- GROUP BY managerId
-- HAVING COUNT(*) >= 5);

SELECT e1.name from Employee as e1
JOIN Employee as e2
ON e1.id = e2.managerId
GROUP BY e1.id, e1.name
HAVING COUNT(e2.id)>=5;