-- 코드를 작성해주세요
select 
    o.ID, 
    count(a.ID) as CHILD_COUNT
from 
    ECOLI_DATA o
left join 
    ECOLI_DATA a
on 
    o.ID = a.PARENT_ID
group by 
    1
order by 
    1