use ssafydb;

drop table qna;

create table qna(
    num int NOT NULL AUTO_INCREMENT primary key,	# 번호
    id varchar(30) NOT NULL, # 아이디
    title varchar(50) NOT NULL, # 제목
    content varchar(200) NOT NULL,		# 내용
    wdate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, # 작성날짜
    reply varchar(200) # 답변
    
);

insert into qna
values(1, '김싸피', '가격문의', '얼만가요', now(), '');

select * from qna;

