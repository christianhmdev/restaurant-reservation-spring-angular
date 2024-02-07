package com.restaurant.services.customer;

import com.restaurant.dto.CategoryDto;
import com.restaurant.dto.ProductDto;
import com.restaurant.dto.TableReservationDto;

import java.util.List;

public interface CustomerService {

    List<CategoryDto> getAllCategories();

    List<CategoryDto> searchCategoryByTitle(String title);

    List<ProductDto> getProductsByCategory(Long categoryId);

    List<ProductDto> searchProductByCategoryAndTitle(Long categoryId, String title);

    TableReservationDto applyForReservation(TableReservationDto tableReservationDto);

    List<TableReservationDto> getAllReservationByUserId(Long userId);

}
