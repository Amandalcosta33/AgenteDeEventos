CREATE TABLE ticket_email (
    ticket_email_id DEFAULT gen_random_uuid() PRIMARY KEY UNIQUE,
    email TEXT NOT NULL,
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     ticket_id UUID REFERENCES ticket(ticket_id) ON DELETE CASCADE
);
