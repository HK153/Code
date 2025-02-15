-- 코드를 입력하세요
SELECT 
    concat('/home/grep/src/', 
           BOARD_ID,'/', 
           FILE_ID,FILE_NAME,FILE_EXT) as FILE_PATH
from (
    SELECT 
    *, RANK() OVER (ORDER BY VIEWS DESC) AS RNK
    FROM 
        USED_GOODS_BOARD
    JOIN 
        USED_GOODS_FILE  
    USING (BOARD_ID)
    ) RANKTABLE
WHERE 
    RNK = 1
ORDER BY 
    FILE_ID DESC