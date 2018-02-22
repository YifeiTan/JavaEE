package yncrea.pw06.core.service;

import yncrea.pw06.core.entity.Event;

import java.util.List;

/**
 * Created by Emeric on 16/02/2018.
 */

public interface ServiceEvent {

    List<Event> findAll();

    void saveEvent(Event event);

    Event findById(long id);

}
