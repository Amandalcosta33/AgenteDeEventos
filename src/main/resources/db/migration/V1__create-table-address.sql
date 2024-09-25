CREATE TABLE address (
    address_id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    city VARCHAR(255) NOT NULL,
    cep VARCHAR(20) NOT NULL,
    complemento VARCHAR(255),
    address VARCHAR(255) NOT NULL,
    uf VARCHAR(2) NOT NULL
);
