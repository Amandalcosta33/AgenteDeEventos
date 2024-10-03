CREATE TABLE ticket_status (
    ticket_status_id DEFAULT gen_random_uuid() PRIMARY KEY UNIQUE,
    description TEXT NOT NULL,
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);