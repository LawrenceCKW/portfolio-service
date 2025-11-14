INSERT INTO experience (
    profile_id, company, position, location,
    start_date, end_date, current,
    responsibilities, tech_stack
) VALUES (
             1,
             'Avensys Consulting',
             'Associate Java Developer',
             'Singapore',
             DATE '2024-07-01',
             DATE '2025-03-31',
             FALSE,
             '[
               "Built Spring Boot microservices and REST APIs for internal platforms",
               "Integrated with PostgreSQL using JSONB for semi-structured data",
               "Containerised services with Docker and contributed to CI/CD pipelines"
             ]',
             '[
               "Java",
               "Spring Boot",
               "PostgreSQL",
               "Docker",
               "Git"
             ]'
         );
