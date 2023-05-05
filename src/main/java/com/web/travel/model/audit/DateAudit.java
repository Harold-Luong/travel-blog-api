package com.web.travel.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@JsonIgnoreProperties(
        value = { "createdAt", "updatedAt" },
        allowGetters = true
)
public abstract class DateAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, unique = false)
    public boolean deleted;

    @CreatedDate
    @Column(name = "created_at",nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
