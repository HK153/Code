-- 코드를 입력하세요
SELECT 
    count(NAME) 
from (SELECT distinct NAME from ANIMAL_INS) as a;