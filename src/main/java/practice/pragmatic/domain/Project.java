package practice.pragmatic.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Project {

    @Id
    @GeneratedValue
    @Column(name = "project_id")
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String image;
    private LocalDateTime createdAt;
}
