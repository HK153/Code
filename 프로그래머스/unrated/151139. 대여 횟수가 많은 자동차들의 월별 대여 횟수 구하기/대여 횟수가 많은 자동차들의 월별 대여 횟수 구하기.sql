-- 코드를 입력하세요
SELECT MONTH(START_DATE) as MONTH, CAR_ID ,count(HISTORY_ID) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY as r
where  r.CAR_ID IN (select CAR_ID 
                    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                    where START_DATE 
                    BETWEEN '2022-08-01' AND '2022-10-31' 
                    GROUP BY CAR_ID
                    having count(HISTORY_ID) != 0 and count(HISTORY_ID) >= 5
                   )
AND r.START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
group by MONTH(START_DATE), CAR_ID 
order by MONTH, CAR_ID DESC