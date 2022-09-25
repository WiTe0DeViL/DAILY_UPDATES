-- Outer joins between table
-- Excercises

select 
	p.product_id,
	p.name,
    oi.quantity
from order_items oi
right join products p
	on oi.product_id = p.product_id
order by p.product_id;


-- Outer joins between mnultiple tables

select o.order_date,
	   o.order_id,
       c.first_name,
       sh.name as shipper,
       os.name as status
from orders o
join customers c
	on c.customer_id = o.customer_id 
left join shippers sh
	on sh.shipper_id = o.shipper_id
join order_statuses os
	on os.order_status_id = o.status
order by o.status;

-- REfactoring Joins using *USING keyword
-- *only for unique column names
use sql_invoicing;
select p.date,
	   c.name as client,
       p.amount,
       pm.name
from clients c
join payments p 
	USING (client_id)
join payment_methods pm
	on p.payment_method = pm.payment_method_id;

-- Natural JOINS

use sql_store;
select o.order_id,
	   c.first_name
from orders o
NATURAL JOIN customers c;

-- CROSS JOINS

select c.first_name,
	   p.name
from products p -- , customers c      *Both are doing the same process
CROSS JOIN customers c 
order by c.first_name;

-- Union Excersice used to combine quries
-- Final Excersice

select 
	c.customer_id,
    c.first_name as customer,
    c.points,
    'Bronze' as type
from customers c
WHERE points < 2000 
union
select 
	c.customer_id,
    c.first_name as customer,
    c.points,
    'Silver' as type
from customers c
WHERE points between 2000 and 3000 
union
select 
	c.customer_id,
    c.first_name as customer,
    c.points,
    'Gold' as type
from customers c
WHERE points > 3000
order by customer;


-- Distinct remove duplicates
select distinct state 
from customers