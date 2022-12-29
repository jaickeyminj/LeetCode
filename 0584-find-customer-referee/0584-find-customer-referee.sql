# Write your MySQL query statement below
# Select name from Customer where referee_id is NULL OR referee_id != 2;
select name from customer where IFNULL (referee_id, 0) <> 2;