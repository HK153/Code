-- 코드를 입력하세요
SELECT 
    MEMBER_ID, MEMBER_NAME, GENDER, 
    To_char(DATE_OF_BIRTH,'YYYY-MM-DD') as DATE_OF_BIRTH 
from MEMBER_PROFILE
where 
    TLNO is not null 
    and To_char(DATE_OF_BIRTH, 'MM') like '03' 
    and GENDER ='W'
order by MEMBER_ID;