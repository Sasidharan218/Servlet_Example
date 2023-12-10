CREATE TABLE `ebarter`.`user` ( `username` VARCHAR(50) NOT NULL , `password` VARCHAR(50) NOT NULL ) ENGINE = InnoDB;

CREATE TABLE `trade` ( `Id` int(4), `Ucccode` varchar(50), `Scrip` varchar(50), `TradeDate` varchar(50), `TradeType` varchar(50), `Quantity` int(10) , `TradePrice` int(10));

INSERT INTO `user`(`username`, `password`) VALUES ('krishnan','123')

select * from user where username='krishnan' and password='123'

INSERT INTO user(username, password) VALUES ('gowtham','456')

INSERT INTO user(Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (1,'ucc1','axis','2019-05-24','Sell',525,125)