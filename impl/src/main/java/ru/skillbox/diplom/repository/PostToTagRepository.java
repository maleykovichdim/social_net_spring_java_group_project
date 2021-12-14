package ru.skillbox.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.skillbox.diplom.model.PostToTag;

public interface PostToTagRepository extends JpaRepository<PostToTag, Long>, JpaSpecificationExecutor<PostToTag> {
}
