-- 코드를 입력하세요
select *
from 
    (SELECT *
    from FOOD_PRODUCT
    order by PRICE DESC)
where rownum = 1