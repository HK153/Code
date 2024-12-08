-- 코드를 입력하세요
SELECT 
    BOOK_ID, 
    TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') as PUBLISHED_DATE 
from 
    BOOK
where 
    TO_CHAR(PUBLISHED_DATE, 'YYYY') = '2021'
    And CATEGORY ='인문'
order by 2