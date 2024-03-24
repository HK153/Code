-- 코드를 입력하세요
SELECT hour(DATETIME) as HOUR , count(*)
from ANIMAL_OUTS
where time(DATETIME) between '09:00:00' and '20:00:00'
group by HOUR
order by HOUR