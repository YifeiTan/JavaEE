package yncrea.pw06.core.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


/**
 * Created by Emeric on 16/02/2018.
 */
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date start;
    private Date end;
    private String title;
    private String color;
    private String description;
    private Boolean allDay;

    public Event(){}


    public Event(Date start_date, Date end_date, String title, String color, String description, Boolean allDay) {
        this.start = start_date;
        this.end = end_date;
        this.title = title;
        this.color = color;
        this.description = description;
        this.allDay = allDay;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStart_date() {
        return start;
    }

    public void setStart_date(Date start_date) {
        this.start = start_date;
    }

    public Date getEnd_date() {
        return end;
    }

    public void setEnd_date(Date end_date) {
        this.end = end_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAllDay() { return allDay; }

    public void setAllDay(Boolean allDay) { this.allDay = allDay; }
}
