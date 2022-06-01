package com.mapper.mapstructFieldMapping.dto;

import java.util.List;

public class CustomerDto {
    public Long id;
    public String customerName;
    public List<OrderItemDto> orders;
}
