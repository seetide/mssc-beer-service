package com.haitao.msscbeerservice.domain;

import lombok.*;

import javax.persistance.Entity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Bear {
    private UUID id;
    private Long version;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
    private String beerName;
    private String beerStyle;
    private Long upc;
    private BigDecimal price;

    private Integer minOnHand;
    private Integer quantityToBrew;

}
