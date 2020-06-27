CREATE TABLE messages (
    id INTEGER NOT NULL AUTO_INCREMENT,
    message VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO messages (message)
VALUES ('Hello Database!');
