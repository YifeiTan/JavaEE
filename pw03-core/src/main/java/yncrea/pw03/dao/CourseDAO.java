package yncrea.pw03.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.pw03.entity.Course;

import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
public interface CourseDAO extends JpaRepository<Course, Long> {
    public List<Course> findByLastname(String name);
}
