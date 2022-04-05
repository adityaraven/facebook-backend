package com.fbclone.facebookbackbend.repository;

import com.fbclone.facebookbackbend.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity , String> {
}
