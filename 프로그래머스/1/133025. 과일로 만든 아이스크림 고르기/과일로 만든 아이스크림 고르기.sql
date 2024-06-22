-- 코드를 입력하세요
SELECT f.FLAVOR
from ICECREAM_INFO i
join FIRST_HALF f
on i.FLAVOR = f.FLAVOR
where INGREDIENT_TYPE = 'fruit_based' 
    and TOTAL_ORDER >= 3000
order by TOTAL_ORDER DESC