package com.squaretrade.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "keyword")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KeyWord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyword;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private CategoryProduct keywords;

}
