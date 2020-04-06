package com.github.pedrobacchini.auditembeddable.entity;

import com.github.pedrobacchini.auditembeddable.audit.Audit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity(name = "Post")
@Table(name = "post")
@NoArgsConstructor
public class Post {

    @Id
    private Long id;

    @Embedded
    private Audit audit = new Audit();

    @Setter
    private String title;

    public Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}