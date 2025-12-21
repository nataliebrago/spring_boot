package homework29.dependency_inversion;

class DataBaseStorage_true implements Storage_true {
    @Override
    public void save(String data) {
        System.out.println("Saving to DB: " + data);
    }
}
