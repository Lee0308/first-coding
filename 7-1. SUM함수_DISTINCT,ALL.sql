/* SUM�Լ��� NULL �����ʹ� �����ϰ� �հ踦 ���� */
/* DISTINCT�� �ߺ� ���� ��� */
SELECT SUM(DISTINCT SAL),
SUM(ALL SAL),
SUM(SAL)
FROM EMP;