package homework29.interface_segregation;

class Programmer_false implements Worker_false {
    @Override
    public void code() { System.out.println("Coding"); }
    @Override
    public void manageProject() { /* Ничего */ }
}