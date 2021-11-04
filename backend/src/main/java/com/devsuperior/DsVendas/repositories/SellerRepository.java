package com.devsuperior.DsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DsVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
