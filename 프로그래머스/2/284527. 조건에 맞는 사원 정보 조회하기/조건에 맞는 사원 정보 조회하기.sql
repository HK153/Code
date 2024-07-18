-- 코드를 작성해주세요
select 
    sum(g.SCORE) as SCORE, 
    e.EMP_NO, e.EMP_NAME, 
    e.POSITION, e.EMAIL
from HR_GRADE g
join HR_EMPLOYEES e
on g.EMP_NO = e.EMP_NO
group by e.EMP_NO, e.EMP_NAME, e.POSITION, e.EMAIL
having e.EMP_NO = (select EMP_NO 
                  from HR_GRADE 
                  group by EMP_NO 
                  order by sum(SCORE) DESC 
                  limit 1)