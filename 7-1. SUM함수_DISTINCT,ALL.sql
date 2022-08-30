/* SUM함수는 NULL 데이터는 제외하고 합계를 구함 */
/* DISTINCT는 중복 제거 기능 */
SELECT SUM(DISTINCT SAL),
SUM(ALL SAL),
SUM(SAL)
FROM EMP;