-- 코드를 작성해주세요
select 
    count(*) as FISH_COUNT, 
    MAX(COALESCE(LENGTH, 10)) as MAX_LENGTH, 
    FISH_TYPE
from 
    FISH_INFO
group by 
    FISH_TYPE
having 
    avg(COALESCE(LENGTH, 10)) >= 33
order by 
    FISH_TYPE