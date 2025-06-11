-- 코드를 작성해주세요
select 
    ROUTE,
    concat(ROUND(SUM(D_BETWEEN_DIST), 2), 'km') as TOTAL_DISTANCE,
    concat(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') as AVERAGE_DISTANCE
from 
    SUBWAY_DISTANCE
group by 
    ROUTE
order by 
    SUM(D_BETWEEN_DIST) DESC