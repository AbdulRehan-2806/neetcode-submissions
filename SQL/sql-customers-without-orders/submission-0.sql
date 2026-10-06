-- Write your query below
Select name 
From customers as c
where id not in (
    select customer_id 
    from orders 
    where c.id = customer_id
);