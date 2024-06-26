-- 코드를 입력하세요
SELECT USER_ID, u.NICKNAME, 
    concat(CITY,' ', STREET_ADDRESS1,' ', STREET_ADDRESS2) as '전체주소', 
    concat(substring(TLNO, 1, 3), '-',
              substring(TLNO, 4, 4), '-',
              substring(TLNO, 8, 4)) as '전화번호'
from USED_GOODS_BOARD b
join USED_GOODS_USER u
on b.WRITER_ID = u.USER_ID
group by USER_ID 
having count(*) >= 3
order by USER_ID DESC;