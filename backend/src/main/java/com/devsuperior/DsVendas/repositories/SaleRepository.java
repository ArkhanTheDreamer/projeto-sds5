package com.devsuperior.DsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DsVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
