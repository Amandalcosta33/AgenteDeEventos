CREATE TABLE event (
    event_id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    date DATE NOT NULL,
    status SMALLINT NOT NULL,
    address INTEGER REFERENCES address(address_id) ON DELETE CASCADE,
);
