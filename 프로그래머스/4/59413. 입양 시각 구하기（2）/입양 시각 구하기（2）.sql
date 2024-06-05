-- 코드를 입력하세요
WITH RECURSIVE Hours AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM Hours
    WHERE HOUR < 23
)
SELECT h.HOUR, count(a.ANIMAL_ID) as COUNT
from Hours h
left join ANIMAL_OUTS a
on h.HOUR = HOUR(a.DATETIME)
group by h.HOUR
order by h.HOUR