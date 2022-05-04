package com.example.studit.domain.study;

import com.example.studit.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class MyStudy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "my_study_id")
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    //내가 방장인 스터디
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id")
    private Study study;

    public void setStudy(Study study){
        this.study = study;
    }
    public void setUser(User user){
        this.user = user;
    }
}