-- 코드를 입력하세요
SELECT 
    b.TITLE, 
    b.BOARD_ID, 
    r.REPLY_ID, 
    r.WRITER_ID, 
    r.CONTENTS, 
    TO_CHAR(r.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
from 
    USED_GOODS_BOARD b, 
    USED_GOODS_REPLY r
where 
    b.BOARD_ID = r.BOARD_ID
and 
    TO_CHAR(b.CREATED_DATE, 'YYYY-MM') = '2022-10'
order by 
    r.CREATED_DATE, 
    b.TITLE;