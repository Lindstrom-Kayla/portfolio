/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SexyMama
 */
@Entity
public class Event {

    private int eventId;
    private String eventName;
    private List<Delegate> delegates = new ArrayList<Delegate>();

    @Id
    @GeneratedValue
    public int getEvenId() {
        return eventId;
    }

    public void setEventId(int eveentId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    @ManyToMany
    @JoinTable(name="JOIN_DELEGATE_EVENT",
            joinColumns={@JoinColumn(name="eventId")},
            inverseJoinColumns={@JoinColumn(name="delegatedId"))
    public List<Delegate> getDelegates() {
        return delegates;
    }

    public void setDelegates(List<Delegate> delegates) {
        this.delegates = delegates;
    }
}
