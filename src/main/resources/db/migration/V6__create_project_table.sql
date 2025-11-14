CREATE TABLE project (
    id BIGSERIAL PRIMARY KEY,
    profile_id BIGINT NOT NULL,

    title       VARCHAR(255) NOT NULL,
    description TEXT,
    github_url  VARCHAR(255),
    live_url    VARCHAR(255),
    featured    BOOLEAN NOT NULL DEFAULT FALSE,

    tech_stack JSONB NOT NULL DEFAULT '[]'::jsonb,
    highlights JSONB NOT NULL DEFAULT '[]'::jsonb,
    metadata   JSONB NOT NULL DEFAULT '{}'::jsonb,

    CONSTRAINT fk_project_profile
        FOREIGN KEY (profile_id)
            REFERENCES profile (id)
            ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_project_featured ON project (featured);
CREATE INDEX IF NOT EXISTS idx_project_tech_stack_gin ON project USING GIN (tech_stack);
