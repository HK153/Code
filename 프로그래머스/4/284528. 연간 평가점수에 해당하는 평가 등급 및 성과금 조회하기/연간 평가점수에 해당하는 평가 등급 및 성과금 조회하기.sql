-- 코드를 작성해주세요
with Average_Score as (
select e.EMP_NO, e.EMP_NAME, SAL, AVG(SCORE) as AVG_SCORE
from HR_EMPLOYEES e
join HR_GRADE g
on e.EMP_NO	= g.EMP_NO
where YEAR = '2022'
group by e.EMP_NO
)
select EMP_NO, EMP_NAME,
    CASE
        WHEN AVG_SCORE >= 96 THEN 'S'
        WHEN AVG_SCORE >= 90 THEN 'A'
        WHEN AVG_SCORE >= 80 THEN 'B'
        ELSE 'C'
    END AS GRADE,
    CASE
        WHEN AVG_SCORE >= 96 THEN SAL * 0.20
        WHEN AVG_SCORE >= 90 THEN SAL * 0.15
        WHEN AVG_SCORE >= 80 THEN SAL * 0.10
        ELSE 0
    END AS BONUS
from Average_Score
order by EMP_NO