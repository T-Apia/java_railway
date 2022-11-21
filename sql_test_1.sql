USE railways_schema;
CREATE TABLE station (
	id INT NOT NULL AUTO_INCREMENT,
    name varchar(150),
    PRIMARY KEY (id)
);

CREATE TABLE segment (
	id INT NOT NULL AUTO_INCREMENT,
    segment_name varchar(50) NOT NULL,
    origin_station_id INT, 
    destination_station_id INT, 
    distance FLOAT,
    PRIMARY KEY (id),
	FOREIGN KEY (origin_station_id)
        REFERENCES station(id),
	FOREIGN KEY (destination_station_id)
        REFERENCES station(id)
);

CREATE TABLE route (
	id INT NOT NULL AUTO_INCREMENT,
	route_name varchar(100) NOT NULL,
    segment INT,
    PRIMARY KEY (id),
	FOREIGN KEY (segment)
        REFERENCES segment(id)
);

CREATE TABLE train (
	id INT NOT NULL AUTO_INCREMENT,
    route_id INT NOT NULL,
    seat_number INT NOT NULL,
    train_status BOOL,
    FOREIGN KEY (route_id)
        REFERENCES route(id),
    PRIMARY KEY (id)
);

CREATE TABLE passenger (
	id INT NOT NULL AUTO_INCREMENT,
    name varchar(200) NOT NULL,
    surname varchar(200) NOT NULL,
    birthday DATE NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE ticket (
	id INT NOT NULL AUTO_INCREMENT,
    passenger_id INT,
    train_id INT,
    FOREIGN KEY (passenger_id)
        REFERENCES passenger(id),
    FOREIGN KEY (train_id)
        REFERENCES train(id),
    PRIMARY KEY (id)
);

