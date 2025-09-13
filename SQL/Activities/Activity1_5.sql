--Activity1
CREATE TABLE salesman(salesman_id int PRIMARY KEY,salesman_name varchar(20) NOT NULL, salesman_city varchar(20),commission int);
DESCRIBE salesman;

--Activity2
INSERT ALL
	INTO salesman VALUES(5001, 'james Hoog', 'New york', 15)
	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
	INTO salesman VALUES(5003, 'pit alex', 'london', 14)
	INTO salesman VALUES(5004, 'mclyon', 'paris', 11)
	INTO salesman VALUES(5005, 'paul adam', 'San jose', 12)
SELECT 1 FROM DUAL;
SELECT * FROM salesman;

--Activity3
SELECT salesman_id, salesmam_city FROM salesman;
--show  data of salesman from paris
SELECT * FROM salesman WHERE salesman_city='paris';
--show salesman_id and commision of paul adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='paul adam';

--Activity4
ALTER TABLE salesman ADD(grade int);
DESCRIBE salesman;
UPDATE salesman SET grade=100;
SELECT*from salesman;

--Activity5
UPDATE salesman SET grade=200 WHERE salesman_city ='Rome';
UPDATE salesman SET grade=300 WHERE salesman_name = 'james Hoog';
UPDATE salesman SET salesman_name ='Pierre' WHERE salesman_name='mclyon';
SELECT * FROM salesman;
