CREATE TABLE movie (
    id bigserial PRIMARY KEY,
    title varchar(255) NOT NULL,
    description text,
    release_date date,
    rating double precision,
    created_at timestamp,
    updated_at timestamp
);