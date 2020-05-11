package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void createJobs() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5  = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(job1.getId()+1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(job2.getId()+1, job3.getId());
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job3.equals(job4));
    }

    @Test
    public void testToStringBlankLines() {
        assertEquals(job3.toString().charAt(0), '\n');
        assertEquals(job3.toString().charAt(job3.toString().length()-1), '\n');
    }

    @Test
    public void testToStringLabelAndData() {
        assertTrue(job3.toString().contains("ID: " + job3.getId() + "\n"));
        assertTrue(job3.toString().contains("Name: Product tester\n"));
        assertTrue(job3.toString().contains("Employer: ACME\n"));
        assertTrue(job3.toString().contains("Location: Desert\n"));
        assertTrue(job3.toString().contains("Position Type: Quality control\n"));
        assertTrue(job3.toString().contains("Core Competency: Persistence\n"));
    }

    @Test
    public void testToStringEmptyField() {
        assertTrue(job5.toString().contains("Employer: Data not available\n"));
    }

    @Test
    public void testToStringForEmptyJob() {
        assertEquals(job1.toString(), "OOPS! This job does not seem to exist.");
    }


}
