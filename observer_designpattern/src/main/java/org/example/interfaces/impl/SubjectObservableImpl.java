package org.example.interfaces.impl;

import org.example.interfaces.SubjectObservable;
import org.example.interfaces.SubjectObserver;
import java.util.ArrayList;


public class SubjectObservableImpl extends SubjectObservable {

    //need to initialize attribute default value
    public SubjectObservableImpl(){
        this.subjectObserverList = new ArrayList<>();
        state =0;
    }


    public void registerSubject(SubjectObserver observer) {
        System.out.println("Start registering subject observer");
        subjectObserverList.add(observer);
        System.out.println("End registering subject observer");
    }

    public void removeSubject(SubjectObserver observer) {
        subjectObserverList.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("Start notify all subject observer");
        //for all registered observer call study notification
        for(SubjectObserver subject : subjectObserverList){
            subject.study();
        }
        System.out.println("End notify all subject observer");
    }

    public void changeState() {
        System.out.println("Increase state value ");
        state++;
        notifyObservers();
    }
}
