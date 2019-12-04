package com.haitao.msscbeerservice.web.model;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BearPagedList extends PageImpl<BeerDto> {
    public BearPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BearPagedList(List<BeerDto> content) {
        super(content);
    }
}
