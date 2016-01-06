package org.zebranotorious.uno;

import java.util.ArrayList;

/**
 * Created by andrew on 06.01.16.
 */
public class Worker implements Runnable {
    ArrayList entries;
    MainActivity activity;
    Worker( ArrayList e, MainActivity a ) {
        entries = e;
        activity = a;
    }
    public void run() {
        for( int i = 1; i < 100000; i++ ) {
            Boolean prime = true;
            for( int j = 2; j < i; j ++ ) {
                if( i % j == 0 ) {
                    prime = false;
                    break;
                }
            }
            if( prime ) {
                //entries.add( Integer.toString( i ) );
                activity.workerPing( i );
            }
        }
    }
}
