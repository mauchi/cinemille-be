package it.mauchi.cinemille.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import it.mauchi.cinemille.entities.Screening;

@Repository
public interface ScreeningRepository
		extends PagingAndSortingRepository<Screening, Long>, JpaRepository<Screening, Long> {

}
