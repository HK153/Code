-- 코드를 작성해주세요
with ROOT_IDS as (
    select ID 
    from ECOLI_DATA 
    where PARENT_ID 
    is null
),
CHILD_IDS as (
    select ID 
    from ECOLI_DATA 
    where PARENT_ID 
    in (select ID from ROOT_IDS)
),
GRANDCHILD_IDS as (
    select ID 
    from ECOLI_DATA 
    where PARENT_ID 
    in (select ID from CHILD_IDS)
)
select ID
from GRANDCHILD_IDS
order by ID