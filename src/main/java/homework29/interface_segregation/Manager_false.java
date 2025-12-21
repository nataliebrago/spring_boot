package homework29.interface_segregation;

class Manager_false implements Worker_false {
    @Override
    public void code() { /* Ничего */ }
    @Override
    public void manageProject() { System.out.println("Managing"); }
}