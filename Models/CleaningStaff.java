package Models;

public class CleaningStaff extends Staff {
    private double wage;
    private String shiftHours;
    private int experience;

    public CleaningStaff(int id, String name, String contactInfo, String role, String status, double wage, String shiftHours, int experience) {
        super(id, name, contactInfo, role, status);
        this.wage = wage;
        this.shiftHours = shiftHours;
        this.experience = experience;
    }
    public CleaningStaff() {
        super();
    }

    // Getters and setters
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getShiftHours() {
        return shiftHours;
    }

    public void setShiftHours(String shiftHours) {
        this.shiftHours = shiftHours;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}