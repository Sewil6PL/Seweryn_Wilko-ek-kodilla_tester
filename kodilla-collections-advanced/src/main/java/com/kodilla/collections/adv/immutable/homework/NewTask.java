package com.kodilla.collections.adv.immutable.homework;

public final class NewTask {
    private final String title;
    private final int duration;

    public NewTask(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
