-- 코드를 입력하세요
SELECT COUNT(*) USERS 
from USER_INFO
where 
    EXTRACT(YEAR from JOINED) = '2021' 
    and AGE between 20 and 29;