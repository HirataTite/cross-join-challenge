package com.example.crossjoinchallenge.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "store")
@SequenceGenerator(name = Store.GENERATOR_NAME, sequenceName = Store.SEQUENCE_NAME, allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
@ToString
public class Store implements Serializable {

    private static final long serialVersionUID = 3269988999640551491L;
    public static final String GENERATOR_NAME = "store_gen";
    public static final String SEQUENCE_NAME = "store_seq";

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = SEQUENCE, generator = GENERATOR_NAME)
    private Long id;

    @Column(name = "store_name", nullable = false)
    private String storeName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "product", nullable = false)
    @Builder.Default
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private Set<Product> products = new TreeSet<>();


}