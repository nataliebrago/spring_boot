package homework29.dependency_inversion;

class OrderProcessor_false {
    private FileStorage_false storage = new FileStorage_false();  // Зависит от конкретного класса
    public void process(String order) {
        storage.save(order);
    }
}