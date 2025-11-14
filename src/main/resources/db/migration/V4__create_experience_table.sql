CREATE TABLE experience (
    id BIGSERIAL PRIMARY KEY,
    profile_id BIGINT NOT NULL,

    company    VARCHAR(255) NOT NULL,
    position     VARCHAR(255) NOT NULL,
    location     VARCHAR(255),

    start_date   DATE NOT NULL,
    end_date    DATE,
    current      BOOLEAN NOT NULL DEFAULT FALSE,

    responsibilities JSONB NOT NULL DEFAULT '[]'::jsonb,
    tech_stack    JSONB NOT NULL DEFAULT '[]'::jsonb,

    CONSTRAINT fk_experience_profile
        FOREIGN KEY (profile_id)
            REFERENCES profile (id)
            ON DELETE CASCADE
);

-- good for performance if you later query JSONB
CREATE INDEX IF NOT EXISTS idx_experience_tech_stack_gin
    ON experience USING GIN (tech_stack);
CREATE INDEX IF NOT EXISTS idx_experience_responsibilities_gin
    ON experience USING GIN (responsibilities);
