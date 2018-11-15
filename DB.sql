
CREATE TABLE product (
  productID int NOT NULL,
  productName varchar(70) NOT NULL,
  productDescription clob NOT NULL,
  productType varchar(150) NOT NULL,
  productPrice int NOT NULL,
  productPhoto varchar(300) NOT NULL,
  PRIMARY KEY (productCode),
) ;

insert  into product(productID,productName,productDescription,productType,productPrice,productPhoto) values 
(1,'birth day set 1','','birth',,'images/birth1'),



CREATE TABLE account(
  accID int NOT NULL,
  userName varchar(50) NOT NULL,
  passWord varchar(50) NOT NULL,
  email varchar(100) NOT NULL,
  PRIMARY KEY (accID),
) ;


insert into account(accID,userName,passWord,email) values
(1,'test','test','test@mail.kmutt.ac.th');




CREATE TABLE favorite(
  favID int NOT NULL,
  accID int NOT NULL,
  productID int NOT NULL,
  PRIMARY KEY (favID),
  CONSTRAINT favorite_idfk_1 FOREIGN KEY (accID) REFERENCES account (accID),
  CONSTRAINT favorite_pidfk_2 FOREIGN KEY (productID) REFERENCES product (productID),
) ;

CREATE TABLE cart(
  cartID int NOT NULL,
  accID int NOT NULL,
  productID int NOT NULL,
  PRIMARY KEY (cartID),
  CONSTRAINT cart_idfk_1 FOREIGN KEY (accID) REFERENCES account (accID),
  CONSTRAINT cart_pidfk_2 FOREIGN KEY (productID) REFERENCES product (productID),
);





