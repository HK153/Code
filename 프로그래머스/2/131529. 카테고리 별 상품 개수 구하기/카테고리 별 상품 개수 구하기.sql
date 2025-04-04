-- 코드를 입력하세요
SELECT
  SUBSTR(PRODUCT_CODE, 1, 2) AS category_code,
  COUNT(*) AS product_count
FROM 
    PRODUCT
GROUP BY 
    SUBSTR(PRODUCT_CODE, 1, 2)
ORDER BY 1 ASC;