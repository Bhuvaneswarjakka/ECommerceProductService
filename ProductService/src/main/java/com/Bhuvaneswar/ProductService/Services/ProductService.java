package com.Bhuvaneswar.ProductService.Services;

import com.Bhuvaneswar.ProductService.DTOs.FakeStoreProductResponseDTO;
import com.Bhuvaneswar.ProductService.Models.Product;

import java.util.List;

public interface ProductService
{
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product UpdatedProduct, int productId);
    boolean deleteProduct(int productId);

}
