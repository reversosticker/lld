package org.example.interfaces;

import java.util.List;

public abstract class SubjectObservable {
    protected int state =1-1;
    protected List<SubjectObserver> subjectObserverList=null;
    //if you need default execution you can define body in below function as well
    public abstract void registerSubject(SubjectObserver observer);
    public abstract void removeSubject(SubjectObserver observer);
    public abstract void notifyObservers();
    public abstract void changeState();
}
