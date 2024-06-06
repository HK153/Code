-- 코드를 작성해주세요
select 
    concat(quarter,'Q') as QUARTER, 
    count(*) as ECOLI_COUNT
from (select quarter(DIFFERENTIATION_DATE) as QUARTER from ECOLI_DATA) as quarter
group by quarter
order by quarter