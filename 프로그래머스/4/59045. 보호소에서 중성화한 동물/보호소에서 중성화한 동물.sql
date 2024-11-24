-- 코드를 입력하세요
SELECT 
    i.ANIMAL_ID, 
    i.ANIMAL_TYPE, 
    i.NAME
from 
    ANIMAL_INS i, 
    ANIMAL_OUTS o
where 
    i.ANIMAL_ID = o.ANIMAL_ID
    and SEX_UPON_INTAKE like '%Intact%' 
    AND (SEX_UPON_OUTCOME like 'Neutered%'
        or SEX_UPON_OUTCOME like 'Spayed%')
order by i.ANIMAL_ID