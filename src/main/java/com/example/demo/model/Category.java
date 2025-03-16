package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "category")
@SQLDelete(sql = "UPDATE category SET is_deleted = 1 WHERE id = ?")
@SQLRestriction("is_deleted = false")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isDeleted;

    public Category() {
    }

    public Category(Long id) {
        this.id = id;
    }
}
