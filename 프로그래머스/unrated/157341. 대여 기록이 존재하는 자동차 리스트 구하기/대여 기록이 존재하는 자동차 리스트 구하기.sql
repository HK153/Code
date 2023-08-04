-- 코드를 입력하세요
SELECT distinct h.CAR_ID
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.CAR_ID = h.CAR_ID
where CAR_TYPE = '세단' 
and start_date like '2022-10%'
order by h.CAR_ID DESC