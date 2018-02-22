package yncrea.pw06.web.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yncrea.pw06.core.entity.Event;
import yncrea.pw06.core.service.ServiceEvent;
import yncrea.pw06.web.controller.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Created by Emeric on 16/02/2018.
 */
@Named
@Path("/calevents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {

    private static final Logger logger = LoggerFactory.getLogger(RestControllerImpl.class);

    @Inject
    private ServiceEvent serviceEvent;

    @GET
    public List<Event> getAllEvent(){
        logger.info("get all events");
        return serviceEvent.findAll();
    }

    @GET
    @Path("/{id}")
    public Event getEventWithID(@PathParam("id") long id){
        logger.info("get event with id = {}", id);
        return serviceEvent.findById(id);
    }

    @POST
    public void saveEvent(Event event){
        logger.info("save event");
        serviceEvent.saveEvent(event);
    }

}
