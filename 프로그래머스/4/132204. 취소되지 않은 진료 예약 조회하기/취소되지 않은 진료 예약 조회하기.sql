-- 코드를 입력하세요
SELECT 
    APNT_NO, 
    PT_NAME, 
    a.PT_NO, 
    a.MCDP_CD, 
    DR_NAME, 
    APNT_YMD
from PATIENT p 
join APPOINTMENT a on a.PT_NO = p.PT_NO 
join DOCTOR d on a.MDDR_ID = d.DR_ID
where APNT_CNCL_YMD IS NULL 
AND APNT_YMD like '2022-04-13%' 
AND a.MCDP_CD = 'CS'
order by APNT_YMD