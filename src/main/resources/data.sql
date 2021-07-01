insert into users (user_login, user_password) values ('hatterley0', 'ekm9H1');
insert into users (user_login, user_password) values ('sbrocklesby1', 'OBWE5mi5Kx');
insert into users (user_login, user_password) values ('falldre2', 'Sagr32');
insert into users (user_login, user_password) values ('rwickwarth3', 'oqvm1LkEsi');
insert into users (user_login, user_password) values ('msmallpeice4', 'gIQpHeU9s3');
insert into users (user_login, user_password) values ('mcuvley5', 'aPH9Ni');
insert into users (user_login, user_password) values ('aitzkovich6', '5KwZExVo');
insert into users (user_login, user_password) values ('sduplan7', 'jP4u7QNdua');
insert into users (user_login, user_password) values ('qharradine8', 'Df5Vbya');
insert into users (user_login, user_password) values ('mgraalman9', 'nom06wqZG');


insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #1',1);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #2',2);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #3',3);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #4',6);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #5',1);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #6',1);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #7',1);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #8',1);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #9',1);
insert into chatrooms (chatroom_name, chatroom_owner_id) values ('chat #10',10);

insert into user_chats(chat_id, user_in_chat_id)  values (2,1);
insert into user_chats(chat_id, user_in_chat_id)  values (2,2);

insert into user_chats(chat_id, user_in_chat_id)  values (1,1);
insert into user_chats(chat_id, user_in_chat_id)  values (1,2);
insert into user_chats(chat_id, user_in_chat_id)  values (1,3);
insert into user_chats(chat_id, user_in_chat_id)  values (1,4);
insert into user_chats(chat_id, user_in_chat_id)  values (1,5);

insert into user_chats(chat_id, user_in_chat_id)  values (3,1);
insert into user_chats(chat_id, user_in_chat_id)  values (3,2);
insert into user_chats(chat_id, user_in_chat_id)  values (3,3);

/*test*/
insert into user_chats(chat_id, user_in_chat_id)  values (4,3);

insert into messages (message_author, message_room,  message_text, message_date) values (1,2,'HELLO!', '3/11/2021');
insert into messages (message_author, message_room, message_text, message_date) values (1,2,'How are you?', '8/5/2021');
insert into messages (message_author, message_room, message_text, message_date) values (2,2,'Fine! Thx! What about u?', '6/5/2021');
insert into messages (message_author, message_room, message_text, message_date) values (2,2,'Where are u?', '8/10/2021');
insert into messages (message_author, message_room, message_text, message_date) values (1,2,'Ama here! I am good', '5/12/2021');

insert into messages (message_author, message_room, message_text, message_date) values (1,1,'Enterprise-wide coherent local area network', '20/1/2020');
insert into messages (message_author, message_room, message_text, message_date) values (2,1,'Cross-group 3rd generation algorithm', '12/1/2020');
insert into messages (message_author, message_room, message_text, message_date) values (3,1,'Horizontal 3rd generation intranet', '5/1/2020');
insert into messages (message_author, message_room, message_text, message_date) values (4,1,'Up-sized discrete open architecture', '5/1/2020');
insert into messages (message_author, message_room, message_text, message_date) values (5,1,'Secured dedicated throughput', '6/1/2020');

insert into messages (message_author, message_room, message_text, message_date) values (1,3,'Optimized interactive service-desk', '1/2/2021');
insert into messages (message_author, message_room, message_text, message_date) values (2,3,'Business-focused hybrid initiative', '1/2/2021');
insert into messages (message_author, message_room, message_text, message_date) values (3,3,'Digitized background policy', '8/3/2020');
insert into messages (message_author, message_room, message_text, message_date) values (1,3,'Integrated systematic firmware', '3/4/2021');
insert into messages (message_author, message_room, message_text, message_date) values (2,3,'Progressive value-added secured line', '8/4/2020');

/*test*/
insert into messages (message_author, message_room, message_text, message_date) values (1,4,'Optimized coherent info-mediaries', '3/11/2021');
insert into messages (message_author, message_room, message_text, message_date) values (1,4,'Sharable motivating toolset', '11/11/2020');
insert into messages (message_author, message_room, message_text, message_date) values (2,4,'Intuitive transitional emulation', '8/12/2020');
insert into messages (message_author, message_room, message_text, message_date) values (3,4,'Sharable didactic local area network', '3/12/2021');
insert into messages (message_author, message_room, message_text, message_date) values (5,4,'Distributed context-sensitive projection', '7/12/2020');
