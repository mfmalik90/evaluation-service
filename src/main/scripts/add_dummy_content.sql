drop table `answer_option`;
drop table `question`;
drop table `chapter_topic`;
drop table `subject`;
drop table `chapter`;


insert INTO question (`problem_statement`, `subject_id`) values ('test1',1);
insert INTO `answer_option` (`question_id`, `answer`, `created_at`, `updated_at`) values ('1','a1', now(), now());
insert INTO `answer_option` (`question_id`, `answer`, `created_at`, `updated_at`) values ('1','a2', now(), now());
insert INTO `answer_option` (`question_id`, `answer`, `created_at`, `updated_at`) values ('1','a3', now(), now());
insert INTO `answer_option` (`question_id`, `answer`, `created_at`, `updated_at`) values ('1','a4', now(), now());

insert INTO `subject` (`name`, `created_at`, `updated_at`) values ('maths', now(), now());
insert INTO `chapter` (`name`, `created_at`, `updated_at`) values ('maths1', now(), now());
insert INTO `chapter_topic` (`name`, `created_at`, `updated_at`, `chapter_id`) values ('maths1', now(), now(),1);
insert INTO `chapter_topic` (`name`, `created_at`, `updated_at`, `chapter_id`) values ('maths2', now(), now(),1);



CREATE TABLE `subject` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `chapter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `chapter_topic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `chapter_id` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `ct_chapter_id_key` (`chapter_id`),
  CONSTRAINT `ct_chapter_id_key` FOREIGN KEY (`chapter_id`) REFERENCES `chapter` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `problem_statement` varchar(255) DEFAULT NULL,
  `subject_id` bigint(20) NOT NULL,
  `difficulty_level` int(11) DEFAULT NULL,
  `is_multi_option_correct` bit(1) DEFAULT NULL,
  `standard` int(11) DEFAULT NULL,
  `chapter_id` bigint(20) DEFAULT NULL,
  `chapter_topic_id` bigint(20) DEFAULT NULL,
  `added_by_user_id` bigint(20) DEFAULT NULL,
  `contributor_id` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `q_chapter_id_key` (`chapter_id`),
  KEY `q_chapter_topic_id_key` (`chapter_topic_id`),
  KEY `q_subject_id_key` (`subject_id`),
  CONSTRAINT `q_chapter_topic_id_key` FOREIGN KEY (`chapter_topic_id`) REFERENCES `chapter_topic` (`id`),
  CONSTRAINT `q_subject_id_key` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`id`),
  CONSTRAINT `q_chapter_id_key` FOREIGN KEY (`chapter_id`) REFERENCES `chapter` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `answer_option` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `answer` varchar(255) DEFAULT NULL,
  `is_correct` bit(1) DEFAULT NULL,
  `question_id` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `ao_question_id_key` (`question_id`),
  CONSTRAINT `ao_question_id_key` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;