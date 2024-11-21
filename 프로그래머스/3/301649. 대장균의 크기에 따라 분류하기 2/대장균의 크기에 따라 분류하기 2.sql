-- 코드를 작성해주세요
with ranked_ecoli as (
select 
    ID, 
    SIZE_OF_COLONY,
    NTILE(4) over(order by SIZE_OF_COLONY DESC) as ranking
    from ECOLI_DATA
)
select ID, (case 
           when ranking = 1 then 'CRITICAL'
           when ranking = 2 then 'HIGH'
            when ranking = 3 then 'MEDIUM'
           else 'LOW'
           end) as COLONY_NAME
from ranked_ecoli
order by ID