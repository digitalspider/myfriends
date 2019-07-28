CREATE DATABASE myfriends CHARACTER SET utf8 COLLATE utf8_bin;
CREATE USER 'myfriends'@'%' IDENTIFIED BY 'myfriends';
GRANT ALL PRIVILEGES on myfriends.* to 'myfriends'@'%';
FLUSH PRIVILEGES;