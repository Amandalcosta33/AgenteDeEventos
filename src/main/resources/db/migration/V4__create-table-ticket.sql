CREATE TABLE ticket (
    ticket_id UUID PRIMARY KEY,
    qrcode_token VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    status SMALLINT NOT NULL,
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_updated DATE,
    event UUID REFERENCES event(event_id) ON DELETE CASCADE
);
