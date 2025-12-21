package homework29.interface_segregation;

class TechLead_true implements Coder_true, Manager_true {
    @Override
    public void code() { System.out.println("Coding"); }
    @Override
    public void manageProject() { System.out.println("Managing"); }
}