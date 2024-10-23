package de.tum.cit.ase;

public class Lecture {
    // TODO 1.1: Add attributes from the UML diagram
    private String lectureName;
    private int numberOfInscribedStudents;
    private int numberOfGuestStudents;
    private int numberOfLecturers;
    private int numberOfTutors;

    // TODO 1.2: Add the constructor
    public Lecture(String lectureName, int numberOfInscribedStudents, int numberOfGuestStudents, int numberOfLecturers, int numberOfTutors) {
        this.lectureName = lectureName;
        this.numberOfInscribedStudents = numberOfInscribedStudents;
        this.numberOfGuestStudents = numberOfGuestStudents;
        this.numberOfLecturers = numberOfLecturers;
        this.numberOfTutors = numberOfTutors;
    }

    // TODO 2.1, 2.2: Add the getters and setters
    public String getLectureName() {
        return lectureName;
    }
    public int getNumberOfInscribedStudents() {
        return numberOfInscribedStudents;
    }
    public int getNumberOfGuestStudents() {
        return numberOfGuestStudents;
    }
    public int getNumberOfLecturers() {
        return numberOfLecturers;
    }
    public int getNumberOfTutors() {
        return numberOfTutors;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
    public void setNumberOfInscribedStudents(int numberOfInscribedStudents) {
        this.numberOfInscribedStudents = numberOfInscribedStudents;
    }
    public void setNumberOfGuestStudents(int numberOfGuestStudents) {
        this.numberOfGuestStudents = numberOfGuestStudents;
    }
    public void setNumberOfLecturers(int numberOfLecturers) {
        this.numberOfLecturers = numberOfLecturers;
    }
    public void setNumberOfTutors(int numberOfTutors) {
        this.numberOfTutors = numberOfTutors;
    }

    // TODO 2.3: Add the custom toString method
    @Override
    public String toString() {
        return "Lecture: " + lectureName + "\n" +
                "Inscribed Students: " + numberOfInscribedStudents + "\n" +
                "Guest Students: " + numberOfGuestStudents + "\n" +
                "Lecturers: " + numberOfLecturers + "\n" +
                "Tutors: " + numberOfTutors;
    }

    // TODO 2.4: Add the getTotalNumberOfStudents method as specified in the task and the UML diagram
    public int getTotalNumberOfStudents() {
        return numberOfInscribedStudents + numberOfGuestStudents;
    }

    // TODO 2.5: Add the getNameAndTotalNumberOfStudents method as specified in the task and the UML diagram. HINT: Implement 2.4 first
    public String getNameAndTotalNumberOfStudents(){
        return lectureName+ " (" +getTotalNumberOfStudents() + ")";
    }

    // TODO 2.6: Add the getNumberOfStudentsPerTutor method as specified in the task and the UML diagram. HINT: Implement 2.4 first
    public int getNumberOfStudentsPerTutor() {
        return getTotalNumberOfStudents() / numberOfTutors;
    }

    // TODO 2.7: Add the addGuestStudents method as specified in the task and the UML diagram
    public void addGuestStudents(int additionalGuestStudents) {
        this.numberOfGuestStudents += additionalGuestStudents;
    }
}
