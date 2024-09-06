-- 코드를 입력하세요
SELECT f.FLAVOR
from ICECREAM_INFO i, FIRST_HALF f
where i.FLAVOR = f.FLAVOR
    and INGREDIENT_TYPE = 'fruit_based' 
    and TOTAL_ORDER >= 3000
order by TOTAL_ORDER DESC