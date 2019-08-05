CREATE EXTENSION "uuid-ossp";

CREATE TABLE tasks (
    id UUID PRIMARY KEY NOT NULL DEFAULT uuid_generate_v4(),
    order_number VARCHAR(255) NOT NULL,
    created_date TIMESTAMP WITH TIME ZONE DEFAULT now()
);
