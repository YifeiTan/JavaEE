package yncrea.pw06.core.service.impl;

import org.springframework.transaction.annotation.Transactional;
import yncrea.pw06.core.dao.EventDAO;
import yncrea.pw06.core.entity.Event;
import yncrea.pw06.core.service.ServiceEvent;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Emeric on 16/02/2018.
 */
@Named
@Transactional
public class ServiceEventImpl implements ServiceEvent {

    @Inject
    private EventDAO eventDAO;

    @Override
    public List<Event> findAll() {
        return eventDAO.findAll();
    }

    @Override
    public void saveEvent(Event event) {
        eventDAO.save(event);
    }

    @Override
    public Event findById(long id) {
        return eventDAO.findOne(id);
    }

}
