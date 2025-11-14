CREATE TABLE skill (
    id BIGSERIAL PRIMARY KEY,
    profile_id BIGINT NOT NULL,

    name VARCHAR(255) NOT NULL,
    level VARCHAR(50),
    category VARCHAR(100),

    tags JSONB NOT NULL DEFAULT '[]'::jsonb,

    CONSTRAINT fk_skill_profile
        FOREIGN KEY (profile_id)
            REFERENCES profile (id)
            ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_skill_name ON skill(name);
CREATE INDEX IF NOT EXISTS idx_skill_tags_gin ON skill USING GIN(tags);
