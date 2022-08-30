/* GROUP BY절: 여러 데이터에서 의미 있는 하나의 결과를 특정 열 값별로 묶어서 출력 */
/* GROUP BY절이 명시하는 열은 여러 개 지정할 수 있음. 먼저 지정한 열로 대그룹을 나누고 그 다음 지정한 열로 소그룹을 나눔 */
/* GROUP BY절에서는 별칭(AS ~)이 인식되지 않음 = 열 이름이나 연산식을 그대로 지정해야 함 */
SELECT DEPTNO, JOB, AVG(SAL)
 FROM EMP
 GROUP BY DEPTNO, JOB
 ORDER BY DEPTNO, JOB;