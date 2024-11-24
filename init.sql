CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255),
    enabled BOOLEAN
    );

INSERT INTO users (id, username, password, role, enabled) VALUES (0, 'nikos', '1234', 'admin', TRUE);


