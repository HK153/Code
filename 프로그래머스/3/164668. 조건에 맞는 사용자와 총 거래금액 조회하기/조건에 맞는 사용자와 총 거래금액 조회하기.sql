-- 코드를 입력하세요
SELECT u.USER_ID, NICKNAME, 
    sum(PRICE) as TOTAL_SALES
from USED_GOODS_BOARD b, USED_GOODS_USER u
where b.WRITER_ID = u.USER_ID
and STATUS = 'DONE'
group by u.USER_ID, NICKNAME
having sum(PRICE) >=700000
order by sum(PRICE)