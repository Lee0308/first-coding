/* HAVING절: GROUP BY절을 통해 그룹화된 결과 값의 범위를 제한하는 데에 사용 */
/* SELECT문에 GROUP BY절이 있을 때만 사용 가능 */
SELECT DEPTNO, JOB, AVG(SAL)
 FROM EMP
GROUP BY DEPTNO, JOB
    HAVING AVG(SAL) >= 2000
ORDER BY DEPTNO, JOB;