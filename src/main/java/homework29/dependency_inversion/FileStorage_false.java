package homework29.dependency_inversion;

class FileStorage_false {
    public void save(String order) {
        System.out.println("Saving to file: " + order);
    }
}
