package yncrea.pw06.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.pw06.core.entity.Event;

/**
 * Created by Emeric on 16/02/2018.
 */
public interface EventDAO extends JpaRepository<Event, Long>{

}
