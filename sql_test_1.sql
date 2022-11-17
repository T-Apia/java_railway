USE railways_schema;
CREATE TABLE station (
	station_id INT NOT NULL AUTO_INCREMENT,
    name varchar(150),
    PRIMARY KEY (station_id)
);
CREATE TABLE train (
	train_id INT NOT NULL AUTO_INCREMENT,
    train_number varchar(150) NOT NULL,
    seat_number INT NOT NULL,
    PRIMARY KEY (train_id)
);

CREATE TABLE passenger (
	passenger_id INT NOT NULL AUTO_INCREMENT,
    name varchar(150) NOT NULL,
    surname varchar(150) NOT NULL,
    birthday DATE NOT NULL,
    PRIMARY KEY (passenger_id)
);
CREATE TABLE ticket (
	ticket_id INT NOT NULL AUTO_INCREMENT,
    passenger_id INT,
    train_id INT,
    FOREIGN KEY (passenger_id)
        REFERENCES passenger(passenger_id),
    FOREIGN KEY (train_id)
        REFERENCES train(train_id),
    PRIMARY KEY (ticket_id)
);

