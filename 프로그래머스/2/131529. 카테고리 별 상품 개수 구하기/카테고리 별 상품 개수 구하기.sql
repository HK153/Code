-- 코드를 입력하세요
SELECT
  SUBSTRING(PRODUCT_CODE, 1, 2) AS category_code,
  COUNT(*) AS product_count
FROM PRODUCT
GROUP BY SUBSTRING(PRODUCT_CODE, 1, 2)
ORDER BY category_code ASC;