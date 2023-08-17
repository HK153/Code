-- 코드를 입력하세요
SELECT MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE,'%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE m 
join REST_REVIEW r
on r.MEMBER_ID = m.MEMBER_ID
where r.MEMBER_ID like (
    SELECT MEMBER_ID
    from REST_REVIEW 
    group by MEMBER_ID
    order by count(*) DESC
    limit 1
)
order by REVIEW_DATE ,REVIEW_TEXT 