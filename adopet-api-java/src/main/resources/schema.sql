CREATE TABLE user (
        id  INTEGER     NOT NULL AUTO_INCREMENT,
        name    VARCHAR(128)    NOT NULL,
        last_name   VARCHAR(128)    NOT NULL,
        age INTEGER NOT NULL,
        address VARCHAR(128)    NOT NULL,
        neighbourhood   VARCHAR(128)    NOT NULL,
        city    VARCHAR(128)    NOT NULL,
        state   VARCHAR(128)    NOT NULL,
        rg  INT(9)    NOT NULL,
        cpf BIGINT  (11) NOT NULL,
        profission  VARCHAR(128)    NOT NULL,
        marital_status  VARCHAR(128) NOT NULL,
        phone   VARCHAR(128)    NOT NULL,
        cell_phone  VARCHAR(128),
        PRIMARY KEY (id),
        FOREIGN KEY (adopter_id) REFERENCES adopter(adopter_id)
);

CREATE TABLE adopter (
        id  INTEGER     NOT NULL AUTO_INCREMENT,
        name    VARCHAR(128)    NOT NULL,
        last_name   VARCHAR(128)    NOT NULL,
        age INTEGER NOT NULL,
        address VARCHAR(128)    NOT NULL,
        neighbourhood   VARCHAR(128)    NOT NULL,
        city    VARCHAR(128)    NOT NULL,
        state   VARCHAR(128)    NOT NULL,
        rg  INT(9)    NOT NULL,
        cpf BIGINT  (11) NOT NULL,
        profission  VARCHAR(128)    NOT NULL,
        marital_status  VARCHAR(128) NOT NULL,
        phone   VARCHAR(128)    NOT NULL,
        cell_phone  VARCHAR(128),
        PRIMARY KEY (adopter_id)
);
