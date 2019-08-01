INSERT INTO myfriends.role (id,name) VALUES
(1,'ADMIN'),
(2,'MANAGER');

INSERT INTO myfriends.user (id,username,password,email,created_at,updated_at) VALUES
(1,'admin','admin','admin@admin.com',now(),now());

UPDATE myfriends.user set password='{noop}admin' where id=1;

INSERT INTO myfriends.user_role (user_id,role_id) VALUES (1,1);