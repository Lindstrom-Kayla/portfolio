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
public class Delegate {
    private int delegatedId;
    private String delegateName;
    private List<Event> events = new ArrayList<Event>();
    private List<Delegate> delegates;
    private String delegatename;
    
    @Id
    @GeneratedValue
    public int getDelegatedId() {
        return delegatedId;
    }
    public void setDelegatedId(int delegatedId) {
        this.delegatedId = delegatedId;
    }
    public String getDelegatename() {
        return delegatename;
    }
    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }
    
    @ManyToMany
    public List<Event> getEvents() {
        return events;
    }
    public void setDelegates(List<Delegate> delegates) {
        this.delegates = delegates;
    }
}
