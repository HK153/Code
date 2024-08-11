-- 코드를 입력하세요
SELECT 
    CATEGORY, 
    sum(SALES) as TOTAL_SALES
from 
    BOOK b,
    BOOK_SALES s
where b.BOOK_ID = s.BOOK_ID
and TO_CHAR(SALES_DATE, 'YYYY-MM') = '2022-01'
group by CATEGORY
order by CATEGORY