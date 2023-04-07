package com.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "category")
@Getter
@Setter
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "name")
    private String categoryName;

    @Column(name = "description")
    private String categoryDescription;

    @Column(name = "is_visible")
    private boolean isVisible;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Override
    public String toString()
    {
        return "CategoryEntity{" + "categoryId='" + categoryId + '\'' + ", categoryName='" + categoryName + '\''
              + ", categoryDescription='" + categoryDescription + '\'' + ", isVisible=" + isVisible + ", isDeleted=" + isDeleted
              + ", imageUrl='" + imageUrl + '\'' + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }

}
