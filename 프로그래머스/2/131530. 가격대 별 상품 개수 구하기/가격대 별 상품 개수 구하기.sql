-- 코드를 입력하세요
SELECT 
    TRUNC(PRICE,-4) as PRICE_GROUP, 
    COUNT(*) PRODUCTS 
from PRODUCT
Group by TRUNC(PRICE,-4)
order by PRICE_GROUP