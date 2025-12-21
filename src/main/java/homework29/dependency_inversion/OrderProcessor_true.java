package homework29.dependency_inversion;

class OrderProcessor_true {
    private Storage_true storage;  // Зависит от абстракции
    public OrderProcessor_true(Storage_true storage) {
        this.storage = storage;
    }
    public void process(String order) {
        storage.save(order);
    }
}
