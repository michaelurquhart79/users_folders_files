package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {


}
