package homework30.patterns_proxy;
import javax.swing.*;
import java.awt.image.BufferedImage;


// Класс RealImage (реальная загрузка и отображение из ресурсов)
class RealImage implements Image {
    private BufferedImage image;
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        // Замена: теперь используем загрузку из ресурсов
        image = ImageLoader.loadResourceImage(fileName);
        if (image != null) {
            System.out.println("Изображение " + fileName + " загружено из ресурсов.");
        } else {
            System.err.println("Не удалось загрузить изображение из ресурсов: " + fileName + "\n");
        }
    }

    @Override
    public void display() {
        if (image != null) {
            System.out.println("Отображение изображения " + fileName);
            // Создаем JFrame для показа изображения
            JFrame frame = new JFrame("Картинка: " + fileName);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        } else {
            System.out.println("Изображение не загружено.");
        }
    }
}