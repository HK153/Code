-- 코드를 입력하세요
SELECT 
    USER_ID, 
    PRODUCT_ID
from 
    ONLINE_SALE 
group by 
    USER_ID, PRODUCT_ID
having 
    count(PRODUCT_ID) >= 2
order by 
    USER_ID, 
    PRODUCT_ID DESC