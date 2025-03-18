package com.restfulapi.Bookstore.repository;

import com.restfulapi.Bookstore.entity.bookstore;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface bookstorerepo extends JpaRepository<bookstore, Long> {

    @Query(value = "SELECT * FROM bookstore WHERE price > :price", nativeQuery = true)
    List<bookstore> findbookaboveprice(@Param("price") int price);

    @Modifying
    @Transactional
    @Query(value = "UPDATE bookstore SET price = :newprice WHERE id = :bookId", nativeQuery = true)
    int updateprice(@Param("newprice") int newprice, @Param("bookId") int bookId);

    @Query(value = "SELECT * FROM bookstore WHERE LOWER(bookname) LIKE LOWER(CONCAT('%', :bookname, '%'))", nativeQuery = true)
    List<bookstore> findbookfromtitle(@Param("bookname") String bookname);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM bookstore WHERE id = :bookId AND stock <= 0", nativeQuery = true)
    int deletebookoutofstock(@Param("bookId") int bookId);
}
