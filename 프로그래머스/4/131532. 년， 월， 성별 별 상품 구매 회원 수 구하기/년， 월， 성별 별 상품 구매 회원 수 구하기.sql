-- 코드를 입력하세요
SELECT 
    EXTRACT(YEAR from SALES_DATE) as YEAR, 
    EXTRACT(MONTH from SALES_DATE) as MONTH,
    GENDER,
    count(DISTINCT o.USER_ID) as USERS
from 
    USER_INFO u join ONLINE_SALE o
on u.USER_ID = o.USER_ID
where 
    GENDER is not null
group by 
    EXTRACT(YEAR from SALES_DATE), 
    EXTRACT(MONTH from SALES_DATE), 
    GENDER
order by 
    YEAR, 
    MONTH, 
    GENDER