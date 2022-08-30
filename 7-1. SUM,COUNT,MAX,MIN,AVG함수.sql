/* 다중행 함수를 사용한 SELECT절에는 여러 행이 결과로 나올 수 있는 열을 함께 사용할 수 없음 */

SELECT SUM(SAL),
/* SUM함수: SELECT문으로 조회된 행에서 지정한 열 값을 모두 더한 값을 반환해주는 함수 */
COUNT(SAL),
/* COUNT함수: 지정한 데이터의 개수 반환 */
MAX(SAL),
/* MAX함수: 지정한 데이터 중 최댓값 반환 */
MIN(SAL),
/* MIN함수: 지정한 데이터 중 최솟값 반환 */
AVG(SAL)
/* AVG함수: 지정한 데이터의 평균값 반환 */
FROM EMP;