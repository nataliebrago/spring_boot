package homework29.interface_segregation;

class ProjectManager_true implements Manager_true {
    @Override
    public void manageProject() { System.out.println("Managing"); }
}