CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255)
    );


INSERT INTO users (id, username, password) VALUES (1, 'nikos', '1234');
INSERT INTO users (id, username, password) VALUES (2, 'kaparos', 'qwer');

