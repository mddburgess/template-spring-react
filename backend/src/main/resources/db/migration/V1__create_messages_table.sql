CREATE TABLE messages (
    id INTEGER NOT NULL AUTO_INCREMENT,
    message TEXT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO messages (message)
VALUES ('Hello Database!');
