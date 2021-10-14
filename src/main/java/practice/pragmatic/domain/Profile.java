package practice.pragmatic.domain;

import lombok.Getter;

import javax.persistence.*;


@Entity
@Getter
public class Profile {

    @Id
    @GeneratedValue
    @Column(name = "profile_id")
    private Long id;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    private Member member;

    private String image;
    private String nickname;
    private String message;
}
