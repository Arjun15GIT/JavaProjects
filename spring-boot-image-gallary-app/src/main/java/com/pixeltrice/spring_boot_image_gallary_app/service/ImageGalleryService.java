/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pixeltrice.spring_boot_image_gallary_app.service;


import com.pixeltrice.spring_boot_image_gallary_app.entity.ImageGallary;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixeltrice.spring_boot_image_gallary_app.repository.ImageGallaryRepository;



@Service
public class ImageGalleryService {

	@Autowired
	private ImageGallaryRepository imageGalleryRepository;
	
	public void saveImage(ImageGallary imageGallary) {
		imageGalleryRepository.save(imageGallary);	
	}

	public List<ImageGallary> getAllActiveImages() {
		return imageGalleryRepository.findAll();
	}

	public Optional<ImageGallary> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}
}
