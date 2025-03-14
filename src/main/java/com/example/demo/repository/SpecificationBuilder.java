package com.example.demo.repository;

import com.example.demo.dto.book.BookSearchParametersDto;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification build(BookSearchParametersDto searchParametersDto);
}
