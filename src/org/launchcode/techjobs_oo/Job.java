package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    /**
     Constructor to assign the current "nextId" to the id field and
     increment the nextId variable by 1 so the next question created
     receives the correct id.
     */
    public Job() {
        this.id = nextId;
        nextId++;
    }


    /**
     * Constructor to set the rest of the fields in each job. Also calls the above constructor to
     * handle id initialization.
     * @param aName a String for the job's name.
     * @param aEmployer an Employer object
     * @param aLocation a Location object
     * @param aPositionType a PositionType object
     * @param aCoreCompetency a CoreCompetency object
     */
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }


    /**
     * Converts a Job object to a formatted block of text with one line per field, or if each field is null,
     * returns a message that the job does not exist.
     * @return a formatted String of the data in this job.
     */
    @Override
    public String toString() {
        String tempName = this.getName();

        //If all Job fields are null, then return the does not exist string.
        if (this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        }
        //Checks to see if Name is missing or empty, and if so, assigns "Data not available" to tempName to be returned
        if (this.getName() == null || this.getName().trim().equals("")) {
            tempName = "Data not available";
        }
        // returns the formatted block of code using each field's toString() when possible.
        return "\n" +
                "ID: " + this.getId() + "\n" +
                "Name: " + tempName + "\n" +
                "Employer: " + this.getEmployer().toString() + "\n" +
                "Location: " + this.getLocation().toString() + "\n" +
                "Position Type: " + this.getPositionType().toString() + "\n" +
                "Core Competency: " + this.getCoreCompetency().toString() + "\n" +
                "\n";
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    // match.

    // IntelliJ generated equals method that compares the id field only.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    /**
    @return this job's int id
     */
    public int getId() {
        return id;
    }

    /**
    @return name String for this job
     */
    public String getName() {
        return name;
    }

    /**
    @param name String to set as this job's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the Employer object for this job
     */
    public Employer getEmployer() {
        return employer;
    }

    /**
     *
     * @param employer the Employer object to assign the employer field for this job
     */
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    /**
     *
     * @return the location object for this job
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location the Location object to assign the location field for this job
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return the PositionType object for this job
     */
    public PositionType getPositionType() {
        return positionType;
    }

    /**
     *
     * @param positionType the PositionType object to assign the positionType field for this job
     */
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    /**
     *
     * @return the CoreCompetency object for this job
     */
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    /**
     *
     * @param coreCompetency the CoreCompetency object to assign the coreCompetency field for this job.
     */
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
