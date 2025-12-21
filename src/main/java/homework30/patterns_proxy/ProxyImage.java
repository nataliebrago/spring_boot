package homework30.patterns_proxy;

// Класс ProxyImage (прокси с ленивой загрузкой)
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Создание RealImage и загрузка для: " + fileName);
            realImage = new RealImage(fileName);
        } else {
            System.out.println("RealImage уже создано, отображаем напрямую: " + fileName);
        }
        realImage.display();
    }
}