package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String dimensions;
    private boolean canceled;

    public Stamp(String name, String dimensions, boolean canceled) {
        this.name = name;
        this.dimensions = dimensions;
        this.canceled = canceled;
    }

    public String getName() {
        return name;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean isCanceled() {
        return canceled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return canceled == stamp.canceled && Objects.equals(name, stamp.name) && Objects.equals(dimensions, stamp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensions, canceled);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", canceled=" + canceled +
                '}';
    }
}
