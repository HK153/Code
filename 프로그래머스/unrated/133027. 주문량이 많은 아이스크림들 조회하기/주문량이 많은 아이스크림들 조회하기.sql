-- 코드를 입력하세요
SELECT FLAVOR 
from (SELECT * from JULY
      UNION
      SELECT * from FIRST_HALF ) as sub
GROUP BY FLAVOR
ORDER by SUM(TOTAL_ORDER) DESC
LIMIT 3;