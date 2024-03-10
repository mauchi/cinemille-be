package it.mauchi.cinemille.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import it.mauchi.cinemille.entities.MovieTheater;

@Repository
public interface MovieTheaterRepository
		extends PagingAndSortingRepository<MovieTheater, Long>, JpaRepository<MovieTheater, Long> {

}
