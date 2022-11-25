package com.squaretrade.entity;

import javax.persistence.*;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;


@Entity
@Table(name = "category")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parent_category")
    private Long parentCategory;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy = "keywords")
    private List<KeyWord> keywords;

}
