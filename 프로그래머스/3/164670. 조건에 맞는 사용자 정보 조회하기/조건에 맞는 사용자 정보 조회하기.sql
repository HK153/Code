-- 코드를 입력하세요
SELECT
    u.USER_ID,
    u.NICKNAME,
    u.CITY || ' ' || u.STREET_ADDRESS1 || ' ' || NVL(u.STREET_ADDRESS2, '') AS 전체주소,
    REGEXP_REPLACE(u.TLNO, '(\d{3})(\d{4})(\d{4})', '\1-\2-\3') AS 전화번호
FROM
    USED_GOODS_USER u
JOIN (
    SELECT
        WRITER_ID,
        COUNT(*) AS POST_COUNT
    FROM
        USED_GOODS_BOARD
    GROUP BY
        WRITER_ID
    HAVING
        COUNT(*) >= 3
) b ON u.USER_ID = b.WRITER_ID
ORDER BY
    u.USER_ID DESC;