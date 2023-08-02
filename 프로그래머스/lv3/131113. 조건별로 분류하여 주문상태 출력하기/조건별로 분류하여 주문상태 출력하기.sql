-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') OUT_DATE, 
(Case
    when OUT_DATE between '2022-01-01' and '2022-05-01' then '출고완료'
    when OUT_DATE between '2022-05-02' and '2022-12-31' then '출고대기'
    else '출고미정'
end ) as '출고여부'
from FOOD_ORDER 
order by ORDER_ID;