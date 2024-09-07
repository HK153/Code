-- 코드를 입력하세요
SELECT 
    '/home/grep/src/' || f.BOARD_ID || '/' || FILE_ID || FILE_NAME || FILE_EXT AS FILE_PATH
from USED_GOODS_BOARD b, USED_GOODS_FILE f
where b.BOARD_ID = f.BOARD_ID
    and b.VIEWS = (select MAX(VIEWS) from USED_GOODS_BOARD)
order by FILE_ID DESC