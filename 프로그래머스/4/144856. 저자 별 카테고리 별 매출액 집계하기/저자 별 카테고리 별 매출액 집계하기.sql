-- 코드를 입력하세요
SELECT 
    a.AUTHOR_ID, AUTHOR_NAME, CATEGORY, sum(SALES*PRICE) as TOTAL_SALES
from 
    BOOK_SALES s
join 
    BOOK b on s.BOOK_ID = b.BOOK_ID
join 
    AUTHOR a on b.AUTHOR_ID = a.AUTHOR_ID
where 
    SALES_DATE like '2022-01%'
group by 
    a.AUTHOR_ID, CATEGORY
order by 
    a.AUTHOR_ID ASC, CATEGORY DESC