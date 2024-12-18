-- 코드를 입력하세요
SELECT 
    concat('/home/grep/src/', 
           f.BOARD_ID,'/', 
           FILE_ID,FILE_NAME,FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD b
join USED_GOODS_FILE f
on b.BOARD_ID = f.BOARD_ID
where b.VIEWS = (select 
                 MAX(VIEWS) 
                 from USED_GOODS_BOARD)
order by FILE_ID DESC