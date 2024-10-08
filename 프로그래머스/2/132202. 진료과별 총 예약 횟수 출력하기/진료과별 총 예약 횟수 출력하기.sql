-- 코드를 입력하세요
SELECT 
    MCDP_CD as "진료과 코드", 
    count(*) as "5월예약건수"
from APPOINTMENT 
WHERE APNT_YMD between TO_DATE('2022-05-01', 'YYYY-MM-DD') AND TO_DATE('2022-05-31', 'YYYY-MM-DD')
group by MCDP_CD
order by 2, 1