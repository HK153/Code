-- 코드를 입력하세요
with a as (
SELECT distinct NAME from ANIMAL_INS
)
SELECT 
    count(NAME) 
from a;