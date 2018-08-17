CREATE INDEX user ON user (user_id);

DROP TABLE user;
CREATE TABLE user(
user_id INT(20) PRIMARY KEY NOT NULL,
user_name VARCHAR(20) NOT NULL,
user_pwd VARCHAR(20) NOT NULL DEFAULT 000000,
user_role VARCHAR(30) NOT NULL DEFAULT 0,
user_phone VARCHAR(30),
user_email VARCHAR(30),
user_department VARCHAR(20),
user_job VARCHAR(20),
user_province VARCHAR(20)
)ENGINE=INNODB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_bin;
CREATE INDEX user ON user (user_id);

---建表

---建立索引


INSERT user(user_id,user_name,user_pwd, user_role,user_phone,user_email,user_department,user_job,user_province)
VALUE(10001,'覃蕊', '123456', '0', 17789875774,'17789875774@189.cn','网络监控/维护中心','网络监控维护','中国电信海南分公司');

---增加记录

INSERT user(user_id,user_name,user_pwd, user_role,user_phone,user_email,user_department,user_job,user_province)
VALUE(1,'连沛轩', '1', '1', 17789875774,'13302333287@189.cn','网络监控/维护中心','网络监控维护','中国电信海南分公司');


DELETE FROM user WHERE user_id=10001;---删除记录
SELECT * FROM user;---查询记录
UPDATE user SET user_province='中国电信股份有限公司海南分公司' WHERE user_id=10001;---修改记录
-------------------------------------------------------------------------------------------------------------------------
DROP TABLE exam;
CREATE TABLE exam(
exam_id INT(20) PRIMARY KEY NOT NULL,
exam_name VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL,
exam_subject VARCHAR(20) NOT NULL,
exam_province VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL,
exam_start_date DATETIME NOT NULL,
exam_end_date DATETIME NOT NULL,
exam_deadline_time DATETIME NOT NULL,
exam_remark VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL
)ENGINE=INNODB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_bin;
CREATE INDEX exam ON exam (exam_id);
---建立索引

INSERT exam(exam_id,exam_name,exam_subject,exam_province,exam_start_date,exam_end_date, exam_deadline_time, exam_remark )
VALUE(101,'开源考试','Java','海南省','2018-8-17 09:00:00','2018-8-17 21:00:00','2018-8-1 21:00:00', '');

INSERT exam(exam_id,exam_name,exam_subject,exam_province,exam_start_date,exam_end_date, exam_deadline_time, exam_remark )
VALUE(102,'开源考试Exam','C++','广东省','2018-8-17 09:00:00','2018-8-17 21:00:00','2018-8-1 21:00:00', '');



---增加记录

alter table 表名 rename column 现列名 to 新列名

DELETE FROM exam WHERE exam_id=101;---删除记录
SELECT * FROM exam;---查询记录
UPDATE exam SET exam_name='开源人才考试' WHERE exam_id=101;---修改记录
-------------------------------------------------------------------------------------------------------------------------

DROP TABLE score; -- 删表
CREATE TABLE score(
user_id INT(20) NOT NULL,
exam_id INT(20) NOT NULL,
exam_state INT(20) DEFAULT 0,---0未报名,1已报名未考试,2已考试
score INT(20) DEFAULT 0,
PRIMARY KEY(user_id,exam_id)
) ENGINE=INNODB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE INDEX score ON score (user_id,exam_id);---建立索引

INSERT INTO score(user_id,exam_id,score) VALUE(10001,101,59);---增加记录
DELETE FROM score WHERE user_id=10001;---删除记录
SELECT * FROM score;---查询记录
UPDATE score SET score=58 WHERE user_id=10001 AND exam_id=101;---修改记录
-------------------------------------------------------------------------------------------------------------------------

CREATE TABLE agreement (
user_id INT(20) NOT NULL,
exam_id INT(20) NOT NULL,
score INT(20) DEFAULT -1,
PRIMARY KEY(user_id,exam_id)
);---建表


-------------------------------------------------------------------------------------------------------------------------
DROP TABLE score;---删表

CREATE TABLE score (
user_id INT(20) NOT NULL,
exam_id INT(20) NOT NULL,
score INT(20) DEFAULT -1,
PRIMARY KEY(user_id,exam_id)
);
---建表

CREATE INDEX score ON score (user_id,exam_id);---建立索引

INSERT INTO score(user_id,exam_id,score) VALUE(10001,101,59);---增加记录
DELETE FROM score WHERE user_id=10001;---删除记录
SELECT * FROM score;---查询记录
UPDATE score SET score=58 WHERE user_id=10001 AND exam_id=101;---修改记录
-------------------------------------------------------------------------------



关联查询
SELECT * FROM user a,exam b,score c WHERE a.user_id=c.user_id AND b.exam_id=c.exam_id;


http://localhost:8888/exam/showExamByExamName?examName=
