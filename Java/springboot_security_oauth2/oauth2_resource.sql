CREATE TABLE `tb_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '������ĿID',
  `title` varchar(200) DEFAULT NULL COMMENT '���ݱ���',
  `sub_title` varchar(100) DEFAULT NULL COMMENT '�ӱ���',
  `title_desc` varchar(500) DEFAULT NULL COMMENT '��������',
  `url` varchar(500) DEFAULT NULL COMMENT '����',
  `pic` varchar(300) DEFAULT NULL COMMENT 'ͼƬ����·��',
  `pic2` varchar(300) DEFAULT NULL COMMENT 'ͼƬ2',
  `content` text COMMENT '����',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
insert  into `tb_content`(`id`,`category_id`,`title`,`sub_title`,`title_desc`,`url`,`pic`,`pic2`,`content`,`created`,`updated`) values 
(28,89,'����','�ӱ���','����˵��','http://www.jd.com',NULL,NULL,NULL,'2019-04-07 00:56:09','2019-04-07 00:56:11'),
(29,89,'ad2','ad2','ad2','http://www.baidu.com',NULL,NULL,NULL,'2019-04-07 00:56:13','2019-04-07 00:56:15'),
(30,89,'ad3','ad3','ad3','http://www.sina.com.cn',NULL,NULL,NULL,'2019-04-07 00:56:17','2019-04-07 00:56:19'),
(31,89,'ad4','ad4','ad4','http://www.funtl.com',NULL,NULL,NULL,'2019-04-07 00:56:22','2019-04-07 00:56:25');

CREATE TABLE `tb_content_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '��ĿID',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '����ĿID=0ʱ���������һ������Ŀ',
  `name` varchar(50) DEFAULT NULL COMMENT '��������',
  `status` int(1) DEFAULT '1' COMMENT '״̬����ѡֵ:1(����),2(ɾ��)',
  `sort_order` int(4) DEFAULT NULL COMMENT '������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������',
  `is_parent` tinyint(1) DEFAULT '1' COMMENT '����Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse',
  `created` datetime DEFAULT NULL COMMENT '����ʱ��',
  `updated` datetime DEFAULT NULL COMMENT '����ʱ��',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`status`) USING BTREE,
  KEY `sort_order` (`sort_order`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8 COMMENT='���ݷ���';
insert  into `tb_content_category`(`id`,`parent_id`,`name`,`status`,`sort_order`,`is_parent`,`created`,`updated`) values 
(30,0,'LeeShop',1,1,1,'2015-04-03 16:51:38','2015-04-03 16:51:40'),
(86,30,'��ҳ',1,1,1,'2015-06-07 15:36:07','2015-06-07 15:36:07'),
(87,30,'�б�ҳ��',1,1,1,'2015-06-07 15:36:16','2015-06-07 15:36:16'),
(88,30,'��ϸҳ��',1,1,1,'2015-06-07 15:36:27','2015-06-07 15:36:27'),
(89,86,'����',1,1,0,'2015-06-07 15:36:38','2015-06-07 15:36:38'),
(90,86,'С���',1,1,0,'2015-06-07 15:36:45','2015-06-07 15:36:45'),
(91,86,'�̳ǿ챨',1,1,0,'2015-06-07 15:36:55','2015-06-07 15:36:55'),
(92,87,'�������',1,1,0,'2015-06-07 15:37:07','2015-06-07 15:37:07'),
(93,87,'ҳͷ���',1,1,0,'2015-06-07 15:37:17','2015-06-07 15:37:17'),
(94,87,'ҳ�Ź��',1,1,0,'2015-06-07 15:37:31','2015-06-07 15:37:31'),
(95,88,'�������',1,1,0,'2015-06-07 15:37:56','2015-06-07 15:37:56'),
(96,86,'�й��',1,1,1,'2015-07-25 18:58:52','2015-07-25 18:58:52'),
(97,96,'�й��1',1,1,0,'2015-07-25 18:59:43','2015-07-25 18:59:43');