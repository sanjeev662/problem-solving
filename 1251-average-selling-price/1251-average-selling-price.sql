# Write your MySQL query statement below

select Prices.product_id, 
IFNULL( 
    ROUND((SUM(Prices.price*UnitsSold.units)/SUM(UnitsSold.units)),2)
    ,0) as average_price from Prices
LEFT JOIN UnitsSold 
ON Prices.product_id = UnitsSold.product_id
AND UnitsSold.purchase_date>=Prices.start_date 
AND UnitsSold.purchase_date<=Prices.end_date
group by Prices.product_id;
