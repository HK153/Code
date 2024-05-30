-- 코드를 작성해주세요
select ii.ITEM_ID, ITEM_NAME, RARITY
from ITEM_INFO ii
join ITEM_TREE it
on ii.ITEM_ID = it.ITEM_ID
where it.PARENT_ITEM_ID in 
    (select ITEM_ID 
    from ITEM_INFO
    where RARITY = 'RARE')
order by ITEM_ID DESC
