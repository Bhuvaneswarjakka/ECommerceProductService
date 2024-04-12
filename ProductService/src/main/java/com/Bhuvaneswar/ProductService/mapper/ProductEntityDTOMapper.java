package com.Bhuvaneswar.ProductService.mapper;

import com.Bhuvaneswar.ProductService.DTOs.ProductResponseDTO;
import com.Bhuvaneswar.ProductService.Models.Product;

public class ProductEntityDTOMapper
{
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product)
    {
        ProductResponseDTO responseDTO=new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setRating(product.getRating());
        return responseDTO;
    }
}
