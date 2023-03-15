package org.example;

import org.example.interfaces.SubjectObservable;
import org.example.interfaces.impl.CsSubjectObserver;
import org.example.interfaces.impl.EnglishSubjectObserver;
import org.example.interfaces.impl.MathSubjectObserver;
import org.example.interfaces.impl.SubjectObservableImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Observer design Pattern" );
        //register different observer
        SubjectObservable subjectObservable = new SubjectObservableImpl();
        subjectObservable.registerSubject(new MathSubjectObserver());
        subjectObservable.registerSubject(new CsSubjectObserver());
        subjectObservable.registerSubject(new EnglishSubjectObserver());


        //change state function call then notify all subjectObserver..
        subjectObservable.changeState();

    }
}
