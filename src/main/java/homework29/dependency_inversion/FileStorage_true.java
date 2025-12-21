package homework29.dependency_inversion;

class FileStorage_true implements Storage_true {
    @Override
    public void save(String data) {
        System.out.println("Saving to file: " + data);
    }
}