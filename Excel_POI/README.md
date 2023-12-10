create table album (
   id int,
   title varchar(50),
   author varchar(50),
   price float,
   qty int,
    releasedate DATE,
   primary key (id));



INSERT INTO `album`(`id`, `title`, `author`, `price`, `qty`, `releasedate`) VALUES (1,"title1", "author1", 100, 10, "2017-01-26");
INSERT INTO `album`(`id`, `title`, `author`, `price`, `qty`, `releasedate`) VALUES (2,"title2", "author2", 200, 20, "2017-02-26");
INSERT INTO `album`(`id`, `title`, `author`, `price`, `qty`, `releasedate`) VALUES (3,"title3", "author3", 300, 30, "2017-03-26");
INSERT INTO `album`(`id`, `title`, `author`, `price`, `qty`, `releasedate`) VALUES (4,"title4", "author4", 400, 40, "2017-04-26");
INSERT INTO `album`(`id`, `title`, `author`, `price`, `qty`, `releasedate`) VALUES (5,"title5", "author5", 500, 50, "2017-05-26");