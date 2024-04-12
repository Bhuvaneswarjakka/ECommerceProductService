package com.Bhuvaneswar.ProductService.Services;

import com.Bhuvaneswar.ProductService.Client.FakeStoreClient;
import com.Bhuvaneswar.ProductService.DTOs.FakeStoreProductResponseDTO;
import com.Bhuvaneswar.ProductService.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService
{
    @Autowired
    private FakeStoreClient fakeStoreClient;

    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreResponseDTOS=fakeStoreClient.getAllProducts();
        return fakeStoreResponseDTOS;
    }

    @Override
    public Product getProduct(int productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product UpdatedProduct, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int product) {
        return false;
    }
}
