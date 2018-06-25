package com.rightmove.autoqa.commons;

/**
 * 
 * @author Auto QA team
 *
 */
public class Utilities {

    /**
     * 
     * @param time
     *            time
     * @throws InterruptedException
     *             InterruptedException
     */
    public void timeInterval(final int time) throws InterruptedException {
        Thread.sleep(time * 1000);
    }

}
