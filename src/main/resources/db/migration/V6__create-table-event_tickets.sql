CREATE TABLE event_tickets (
    event_tickets_id UUID PRIMARY KEY UNIQUE,
    total_tickets INT NOT NULL,
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_updated DATE,
    event UUID REFERENCES event(id) ON DELETE CASCADE, 
);
