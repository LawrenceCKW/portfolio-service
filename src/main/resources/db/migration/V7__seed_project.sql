INSERT INTO project (
    profile_id, title, description, github_url, live_url, featured,
    tech_stack, highlights, metadata
) VALUES
      (
          1,
          'Portfolio Microservices Backend',
          'Spring Boot microservices backend powering my developer portfolio, using PostgreSQL JSONB and Docker.',
          'https://github.com/your-github/portfolio-service',
          NULL,
          TRUE,
          '[
            "Java",
            "Spring Boot",
            "PostgreSQL",
            "Flyway",
            "Docker"
          ]',
          '[
            "Implements clean layered architecture (controller-service-repository)",
            "Uses PostgreSQL JSONB for flexible fields like tech stacks and highlights",
            "Containerised with Docker and prepared for a future gateway and additional microservices"
          ]',
          '{
            "type": "Backend",
            "level": "Intermediate",
            "area": "Microservices"
          }'::jsonb
      ),
      (
          1,
          'Rust Microservice Experiment',
          'Experimental Rust-based microservice to explore high-performance APIs and async I/O.',
          'https://github.com/your-github/rust-microservice',
          NULL,
          FALSE,
          '[
            "Rust",
            "Actix / Warp",
            "PostgreSQL",
            "Docker"
          ]',
          '[
            "Demonstrates interest in systems-level programming",
            "Focus on performance and type safety"
          ]',
          '{
            "type": "Backend",
            "level": "Learning",
            "area": "Systems Programming"
          }'::jsonb
      );
