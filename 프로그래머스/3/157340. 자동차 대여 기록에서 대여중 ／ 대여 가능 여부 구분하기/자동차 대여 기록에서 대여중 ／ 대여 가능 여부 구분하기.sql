-- 코드를 입력하세요
SELECT CAR_ID, 
       if(
           sum(
               if('2022-10-16' BETWEEN START_DATE AND END_DATE, 1,0))=0,'대여 가능', '대여중') as AVAILABILITY
from 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by 
    CAR_ID
order by 
    CAR_ID DESC;