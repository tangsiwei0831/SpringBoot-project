INSERT  INTO person(name) VALUES('Amila');
INSERT  INTO person(name) VALUES('Iroshan');

INSERT INTO employee(first_name, last_name, email) VALUES ('Leslie','Andrews','leslie@luv2code.com');
INSERT INTO employee(first_name, last_name, email) VALUES ('Emma','Baumgarten','emma@luv2code.com');
INSERT INTO employee(first_name, last_name, email) VALUES	('Avani','Gupta','avani@luv2code.com');
INSERT INTO employee(first_name, last_name, email) VALUES	('Yuri','Petrov','yuri@luv2code.com');
INSERT INTO employee(first_name, last_name, email) VALUES	('Juan','Vega','juan@luv2code.com');

INSERT INTO `members`
VALUES
('john','{bcrypt}$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q',1),
('mary','{bcrypt}$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q',1),
('susan','{bcrypt}$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q',1);

INSERT INTO `roles`
VALUES
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('susan','ROLE_EMPLOYEE'),
('susan','ROLE_MANAGER'),
('susan','ROLE_ADMIN');