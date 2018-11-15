
CREATE TABLE product (
  productID int NOT NULL,
  productName varchar(70) NOT NULL,
  productDescription clob NOT NULL,
  productType varchar(150) NOT NULL,
  productPrice int NOT NULL,
  productPhoto varchar(300) NOT NULL,
  PRIMARY KEY (productID)
) ;

insert  into product(productID,productName,productDescription,productType,productPrice,productPhoto) values 
(1,'birth day set 1','','birth',,'images/birth/birth1.jpg'),
(2,'birth day set 2','','birth',,'images/birth/birth2.jpg'),
(3,'birth day set 3','','birth',,'images/birth/birth3.jpg'),
(4,'birth day set 4','','birth',,'images/birth/birth4.jpg'),
(5,'birth day set 5','','birth',,'images/birth/birth5.jpg'),
(6,'birth day set 6','','birth',,'images/birth/birth6.jpg'),
(7,'birth day set 7','','birth',,'images/birth/birth7.jpg'),
(8,'party set 1','','party',,'images/party/p1.jpg'),
(9,'party set 2','','party',,'images/party/p2.jpg'),
(10,'party set 3','','party',,'images/party/p3.jpg'),
(11,'party set 4','','party',,'images/party/p4.jpg'),
(12,'party set 5','','party',,'images/party/p5.jpg'),
(13,'party set 6','','party',,'images/party/p6.jpg'),
(14,'party set 7','','party',,'images/party/p7.jpg'),
(15,'party set 8','','party',,'images/party/p8.jpg'),
(16,'party set 9','','party',,'images/party/p9.jpg'),
(17,'party set 10','','party',,'images/party/p10.jpg'),
(18,'party set 11','','party',,'images/party/p11.jpg'),
(19,'party set 12','','party',,'images/party/p12.jpg'),
(20,'party set 13','','party',,'images/party/p13.jpg'),
(21,'party set 14','','party',,'images/party/p14.jpg'),
(22,'celebrate set 1','','celebrate',,'images/celebrate/cele1.jpg'),
(23,'celebrate set 2','','celebrate',,'images/celebrate/cele2.jpg'),
(24,'celebrate set 3','','celebrate',,'images/celebrate/cele3.jpg'),
(25,'celebrate set 4','','celebrate',,'images/celebrate/cele4.jpg'),
(26,'celebrate set 5','','celebrate',,'images/celebrate/cele5.jpg'),
(27,'celebrate set 6','','celebrate',,'images/celebrate/cele6.jpg'),
(28,'celebrate set 7','','celebrate',,'images/celebrate/cele7.jpg'),
(29,'celebrate set 8','','celebrate',,'images/celebrate/cele8.jpg');




CREATE TABLE account(
  accID int NOT NULL,
  userName varchar(50) NOT NULL,
  passWord varchar(50) NOT NULL,
  email varchar(100) NOT NULL,
  PRIMARY KEY (accID)
) ;


insert into account(accID,userName,passWord,email) values
(1,'test','test','test@mail.kmutt.ac.th');




CREATE TABLE favorite(
  favID int NOT NULL,
  accID int NOT NULL,
  productID int NOT NULL,
  PRIMARY KEY (favID),
  CONSTRAINT favorite_idfk_1 FOREIGN KEY (accID) REFERENCES account (accID),
  CONSTRAINT favorite_pidfk_2 FOREIGN KEY (productID) REFERENCES product (productID)
) ;

CREATE TABLE cart(
  cartID int NOT NULL,
  accID int NOT NULL,
  productID int NOT NULL,
  PRIMARY KEY (cartID),
  CONSTRAINT cart_idfk_1 FOREIGN KEY (accID) REFERENCES account (accID),
  CONSTRAINT cart_pidfk_2 FOREIGN KEY (productID) REFERENCES product (productID)
);





