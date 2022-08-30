/* GROUP BY절: 여러 데이터에서 의미 있는 하나의 결과를 특정 열 값별로 묶어서 출력 */
/* GROUP BY절에 없는 열을 SELECT절에 포함하면 오류(ORA-00979) 발생 */
SELECT AVG(SAL), DEPTNO
 FROM EMP
GROUP BY DEPTNO;