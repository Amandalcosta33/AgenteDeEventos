CREATE TABLE ticket_email (
    tickets_email_id DEFAULT gen_random_uuid() PRIMARY KEY UNIQUE,
    email TEXT NOT NULL,
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_updated DATE,
    ticket_id UUID REFERENCES ticket(ticket_id) ON DELETE CASCADE
);
