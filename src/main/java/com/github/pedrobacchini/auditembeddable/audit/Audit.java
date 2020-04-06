package com.github.pedrobacchini.auditembeddable.audit;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Embeddable
public class Audit implements Serializable {

    private static final long serialVersionUID = 5280531102962142143L;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private LocalDateTime lastModifiedDate;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        createdDate = now;
        lastModifiedDate = now;
    }

    @PreUpdate
    public void preUpdate() {
        lastModifiedDate = LocalDateTime.now();
    }
}
