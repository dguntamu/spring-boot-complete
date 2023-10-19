DROP DATABASE IF EXISTS `test`;
CREATE DATABASE `test`;
USE `test`;

SET NAMES utf8 ;
SET character_set_client = utf8mb4 ;

CREATE TABLE EMP (
        emp_id int NOT NULL,
        emp_name varchar(255) NOT NULL,
        emp_sal varchar(255),
        emp_address varchar(255),
        emp_dept int,
        PRIMARY KEY (emp_id)
    );

INSERT INTO EMP (emp_id, emp_name, emp_sal, emp_address,emp_dept) VALUES (101, 'EMP1', '20000', 'HYDERBAD', 10);
INSERT INTO EMP (emp_id, emp_name, emp_sal, emp_address,emp_dept) VALUES (102, 'EMP2', '30000', 'PUNE', 20);
INSERT INTO EMP (emp_id, emp_name, emp_sal, emp_address,emp_dept) VALUES (103, 'EMP3', '10000', 'MUMBAI', 30);
INSERT INTO EMP (emp_id, emp_name, emp_sal, emp_address,emp_dept) VALUES (104, 'EMP4', '25000', 'BNGL', 10);
INSERT INTO EMP (emp_id, emp_name, emp_sal, emp_address,emp_dept) VALUES (105, 'EMP5', '5000', 'VSKP', 20);
INSERT INTO EMP (emp_id, emp_name, emp_sal, emp_address,emp_dept) VALUES (106, 'EMP6', '35000', 'HYDERBAD', 10);
