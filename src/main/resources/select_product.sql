SELECT product_name
FROM dao.orders o
         JOIN dao.customers c ON o.customer_id = c.id
WHERE c.name LIKE :name;
