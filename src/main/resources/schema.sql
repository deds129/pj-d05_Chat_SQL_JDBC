CREATE TABLE users(
    user_id BIGSERIAL NOT NULL PRIMARY KEY,
    user_login VARCHAR(50) NOT NULL,
    user_password VARCHAR(50) NOT NULL
);

CREATE TABLE chatrooms(
    chatroom_id BIGSERIAL NOT NULL PRIMARY KEY,
    chatroom_name VARCHAR(50) NOT NULL,
    /*Chatroom owner*/
    chatroom_owner_id INTEGER REFERENCES users(user_id)
);

CREATE TABLE user_chats(
    chat_id INTEGER REFERENCES chatrooms(chatroom_id),
    user_in_chat_id INTEGER REFERENCES users(user_id),
    PRIMARY KEY(chat_id,user_in_chat_id)
);

CREATE TABLE messages(
    message_id BIGSERIAL NOT NULL PRIMARY KEY,
    /*Message author*/
    message_author INTEGER REFERENCES users(user_id),
     /*List of messages in a chatroom*/
    message_room INTEGER REFERENCES chatrooms(chatroom_id),
    message_text VARCHAR (350),
    message_date DATE
);

