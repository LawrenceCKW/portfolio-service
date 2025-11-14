package com.ckws.portfolioservice.domain;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skill")
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(length = 50)
    private String level;

    @Column(length = 100)
    private String category;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb", nullable = false)
    @Builder.Default
    private List<String> tags = new ArrayList<>();
}