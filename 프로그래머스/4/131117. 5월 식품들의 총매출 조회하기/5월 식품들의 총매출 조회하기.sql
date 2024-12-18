-- 코드를 입력하세요
SELECT 
    p.PRODUCT_ID, 
    PRODUCT_NAME, 
    SUM(PRICE * AMOUNT) as TOTAL_SALES
from FOOD_PRODUCT p, FOOD_ORDER o
where 
    p.PRODUCT_ID = o.PRODUCT_ID 
    and TO_CHAR(o.PRODUCE_DATE, 'YYYY-MM') = '2022-05'
group by 
    p.PRODUCT_ID, PRODUCT_NAME
order by 
    3 DESC, 1