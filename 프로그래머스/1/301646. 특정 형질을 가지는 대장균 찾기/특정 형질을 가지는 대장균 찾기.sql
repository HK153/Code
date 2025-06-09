-- 코드를 작성해주세요
select 
    COUNT(*) AS COUNT
from ECOLI_DATA
where 
    (GENOTYPE & 2) = 0
    and ((GENOTYPE & 1) > 0 OR (GENOTYPE & 4) > 0)