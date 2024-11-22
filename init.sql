CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255)
    );

INSERT INTO users (id, username, password, role) VALUES (0, 'nikos', '1234', 'admin');
INSERT INTO users (id, username, password, role) VALUES (1, 'kaparos', 'qwer', 'system');

