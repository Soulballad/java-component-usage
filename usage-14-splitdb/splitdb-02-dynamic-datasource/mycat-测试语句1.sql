CREATE TABLE `customer` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_info` (
  `order_id` int(11) NOT NULL COMMENT '订单ID',
  `uid` int(11) DEFAULT NULL COMMENT '用户ID',
  `nums` int(11) DEFAULT NULL COMMENT '商品数量',
  `state` int(2) DEFAULT NULL COMMENT '订单状态',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_detail` (
  `order_id` int(11) NOT NULL COMMENT '订单号',
  `id` int(11) NOT NULL COMMENT '订单详情',
  `goods_id` int(11) DEFAULT NULL COMMENT '货品ID',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `is_pay` int(2) DEFAULT NULL COMMENT '支付状态',
  `is_ship` int(2) DEFAULT NULL COMMENT '是否发货',
  `status` int(2) DEFAULT NULL COMMENT '订单详情状态',
  PRIMARY KEY (`order_id`,`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `student` (
  `sid` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


truncate table customer;
truncate table order_info;
truncate table order_detail;
truncate table student;

--------------------------------------------------------------------------

INSERT INTO `customer` (`id`, `name`) VALUES (6666, '赵先生');
INSERT INTO `customer` (`id`, `name`) VALUES (7777, '钱先生');
INSERT INTO `customer` (`id`, `name`) VALUES (16666, '孙先生');
INSERT INTO `customer` (`id`, `name`) VALUES (17777, '李先生');
INSERT INTO `customer` (`id`, `name`) VALUES (26666, '周先生');
INSERT INTO `customer` (`id`, `name`) VALUES (27777, '吴先生');

--------------------------------------------------------------------------

INSERT INTO `order_info` (`order_id`, `uid`, `nums`, `state`, `create_time`, `update_time`) VALUES (1, 1000001, 1, 2, '2019-9-23 14:35:37', '2019-9-23 14:35:37');
INSERT INTO `order_info` (`order_id`, `uid`, `nums`, `state`, `create_time`, `update_time`) VALUES (2, 1000002, 1, 2, '2019-9-24 14:35:37', '2019-9-24 14:35:37');
INSERT INTO `order_info` (`order_id`, `uid`, `nums`, `state`, `create_time`, `update_time`) VALUES (3, 1000003, 3, 1, '2019-9-25 11:35:49', '2019-9-25 11:35:49');

--------------------------------------------------------------------------

INSERT INTO `order_detail` (`order_id`, `id`, `goods_id`, `price`, `is_pay`, `is_ship`, `status`) VALUES (3, 20180001, 85114752, 19.99, 1, 1, 1);
INSERT INTO `order_detail` (`order_id`, `id`, `goods_id`, `price`, `is_pay`, `is_ship`, `status`) VALUES (1, 20180002, 25411251, 1280.00, 1, 1, 0);
INSERT INTO `order_detail` (`order_id`, `id`, `goods_id`, `price`, `is_pay`, `is_ship`, `status`) VALUES (1, 20180003, 62145412, 288.00, 1, 1, 2);
INSERT INTO `order_detail` (`order_id`, `id`, `goods_id`, `price`, `is_pay`, `is_ship`, `status`) VALUES (2, 20180004, 21456985, 399.00, 1, 1, 2);
INSERT INTO `order_detail` (`order_id`, `id`, `goods_id`, `price`, `is_pay`, `is_ship`, `status`) VALUES (2, 20180005, 21457452, 1680.00, 1, 1, 2);
INSERT INTO `order_detail` (`order_id`, `id`, `goods_id`, `price`, `is_pay`, `is_ship`, `status`) VALUES (2, 20180006, 65214789, 9999.00, 1, 1, 3);


--------------------------------------------------------------------------

INSERT INTO `student` (`sid`, `name`, `qq`) VALUES (1, '黑白', '166669999');
INSERT INTO `student` (`sid`, `name`, `qq`) VALUES (2, 'AV哥', '466669999');
INSERT INTO `student` (`sid`, `name`, `qq`) VALUES (3, '地表最强菜鸟', '368828888');
INSERT INTO `student` (`sid`, `name`, `qq`) VALUES (4, '加载中', '655556666');
INSERT INTO `student` (`sid`, `name`, `qq`) VALUES (5, '猫老公', '265286999');
INSERT INTO `student` (`sid`, `name`, `qq`) VALUES (6, '一个人的精彩', '516895555');
