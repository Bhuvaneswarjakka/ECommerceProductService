package com.Bhuvaneswar.ProductService.DTOs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductRatingDTO
{
    private double rate;
    private int count;
}


/*
"rating": {
      "rate": 3.9,
      "count": 120
    }
 */