create database `payment_order`;

CREATE TABLE `payment_order`.`payment_order` (
  `id` int NOT NULL,
  `amount` float DEFAULT NULL,
  `transaction_id` int DEFAULT NULL,
  `payment_type` varchar(45) DEFAULT NULL,
  `debit_credit_detail` int DEFAULT NULL,
  PRIMARY KEY (`id`));
  
  
CREATE TABLE `payment_order`.`debit_credit_detail` (
  `id` int NOT NULL,
  `account_no` int DEFAULT NULL,
  `bank_name` varchar(45) DEFAULT NULL,
  `ifsc_code` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `payment_order` int DEFAULT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `payment_order`.`payment_order` add CONSTRAINT fk_dcdetails FOREIGN KEY (debit_credit_detail) REFERENCES debit_credit_detail(id);

ALTER TABLE `payment_order`.`debit_credit_detail` add CONSTRAINT fk_porder FOREIGN KEY (payment_order) REFERENCES payment_order(id);

CREATE TABLE `payment_order`.`hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ;