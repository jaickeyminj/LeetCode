# Write your MySQL query statement below
select c.name as Customers from Customers c LEFT JOIN Orders o on c.id = o.customerId where o.CustomerId IS NULL;
# SELECT Name AS Customers FROM Customers WHERE Id Not In (SELECT CustomerID FROM Orders)