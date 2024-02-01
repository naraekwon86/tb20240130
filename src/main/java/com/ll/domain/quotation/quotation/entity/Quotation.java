package com.ll.domain.quotation.quotation.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Quotation {
    @Setter
    private final long id;
    @Setter
    @NonNull
    private String authorName;
    @Setter
    @NonNull
    private String content;



}
