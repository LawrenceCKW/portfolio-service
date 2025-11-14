package com.ckws.portfolioservice.domain;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "github_url", length = 255)
    private String githubUrl;

    @Column(name = "live_url", length = 255)
    private String liveUrl;

    @Column(nullable = false)
    private boolean featured = false;

    @Type(JsonType.class)
    @Column(name = "tech_stack", columnDefinition = "jsonb", nullable = false)
    @Builder.Default
    private List<String> techStack = new ArrayList<>();

    @Type(JsonType.class)
    @Column(name = "highlights", columnDefinition = "jsonb", nullable = false)
    @Builder.Default
    private List<String> highlights = new ArrayList<>();

    @Type(JsonType.class)
    @Column(name = "metadata", columnDefinition = "jsonb", nullable = false)
    @Builder.Default
    private Map<String, Object> metadata = new HashMap<>();
}