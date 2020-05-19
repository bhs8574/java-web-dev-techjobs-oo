package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    /**
     * give each JobField a unique id like each job, so they can be compared easily.
     */
    public JobField() {
        id = nextId;
        nextId++;
    }

    /**
     *
     * @param value a String to hold the data for the field.
     */
    public JobField(String value) {
        this();
        this.value = value;
    }

    /**
     *
     * @return either the value String with the field data, or the string
     * "Data not available" if value is empty or null.
     */
    @Override
    public String toString() {
        if (value == null || value.trim().equals("")) {
            return "Data not available";
        }
        return value;
    }

    /*
    Two JobFields are equal if they hold the same id.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     *
     * @return the int id of this JobField
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the String value holding the data for this JobField
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value the String to set value to for this JobField.
     */
    public void setValue(String value) {
        this.value = value;
    }
}
