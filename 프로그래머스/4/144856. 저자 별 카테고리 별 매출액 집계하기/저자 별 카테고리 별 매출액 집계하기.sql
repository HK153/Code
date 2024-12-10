-- 코드를 입력하세요
SELECT 
    a.AUTHOR_ID, 
    AUTHOR_NAME, 
    CATEGORY, 
    sum(SALES*PRICE) as TOTAL_SALES
from 
    BOOK_SALES s, 
    BOOK b, 
    AUTHOR a
where 
    s.BOOK_ID = b.BOOK_ID 
    and b.AUTHOR_ID = a.AUTHOR_ID
    and TO_CHAR(SALES_DATE, 'YYYY-MM') like '2022-01%'
group by 
    a.AUTHOR_ID, 
    AUTHOR_NAME, 
    CATEGORY
order by 
    a.AUTHOR_ID ASC, 
    CATEGORY DESC