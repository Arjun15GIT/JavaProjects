/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pixeltrice.spring_boot_image_gallary_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pixeltrice.spring_boot_image_gallary_app.entity.ImageGallary;

@Repository
public interface ImageGallaryRepository extends JpaRepository<ImageGallary, Long> {

}
