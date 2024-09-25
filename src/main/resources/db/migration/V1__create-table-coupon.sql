CREATE TABLE coupon (
    coupon_id SERIAL PRIMARY KEY,
    code VARCHAR(255) NOT NULL,
    event INTEGER REFERENCES event(event_id) ON DELETE CASCADE,
    valid BOOLEAN NOT NULL,
    discount DECIMAL(5, 2) NOT NULL
);
