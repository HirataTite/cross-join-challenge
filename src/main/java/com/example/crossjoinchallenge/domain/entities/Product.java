package com.example.crossjoinchallenge.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "product")
@SequenceGenerator(name = Product.GENERATOR_NAME, sequenceName = Product.SEQUENCE_NAME, allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
@ToString
public class Product implements Serializable {

    private static final long serialVersionUID = -3098783002471057458L;
    public static final String GENERATOR_NAME = "product_gen";
    public static final String SEQUENCE_NAME = "product_seq";

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = SEQUENCE, generator = GENERATOR_NAME)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "store_id")
    @ToString.Exclude
    private Store store;
}
