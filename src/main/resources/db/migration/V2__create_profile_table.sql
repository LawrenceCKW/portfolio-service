CREATE TABLE profile (
    id BIGSERIAL PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
    summary TEXT,
    email VARCHAR(255),
    location VARCHAR(255),
    years_of_experience INT,
    github VARCHAR(255),
    linkedin VARCHAR(255),
    website VARCHAR(255)
);
