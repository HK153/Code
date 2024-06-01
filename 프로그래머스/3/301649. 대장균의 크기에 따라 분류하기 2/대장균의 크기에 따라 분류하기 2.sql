-- 코드를 작성해주세요
with ranked_ecoli as (
select ID, SIZE_OF_COLONY,
    PERCENT_RANK() over(order by SIZE_OF_COLONY DESC) as ranking
    from ECOLI_DATA
)
select ID, (case 
           when ranking <= 0.25 then 'CRITICAL'
           when ranking <= 0.50 then 'HIGH'
            when ranking <= 0.75 then 'MEDIUM'
           else 'LOW'
           end) as COLONY_NAME
from ranked_ecoli
order by ID 