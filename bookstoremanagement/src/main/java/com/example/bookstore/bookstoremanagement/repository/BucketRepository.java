package com.example.bookstore.bookstoremanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.bookstoremanagement.entity.Bucket;

public interface BucketRepository extends JpaRepository<Bucket,Integer>
{

}
