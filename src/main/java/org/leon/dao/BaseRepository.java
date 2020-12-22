package org.leon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface BaseRepository<T> extends JpaRepository<T, Long>{

}
