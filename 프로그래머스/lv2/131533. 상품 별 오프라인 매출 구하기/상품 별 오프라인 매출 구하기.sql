-- 코드를 입력하세요
SELECT PRODUCT_CODE, sum(PRICE * sales_amount) as SALES
from PRODUCT p 
join OFFLINE_SALE o
on p.PRODUCT_ID = o.PRODUCT_ID
group by PRODUCT_CODE
order by SALES DESC, PRODUCT_CODE ASC