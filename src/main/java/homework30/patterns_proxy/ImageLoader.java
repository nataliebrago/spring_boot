package homework30.patterns_proxy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

// Вспомогательный класс для загрузки изображений из ресурсов
class ImageLoader {
    public static BufferedImage loadResourceImage(String fileName) {
        BufferedImage image = null;
        // Use try-with-resources to ensure the InputStream is closed automatically
        try (InputStream is = ImageLoader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (is == null) {
                throw new IllegalArgumentException(fileName + " is not found in the classpath");
            }
            image = ImageIO.read(is);
        } catch (IOException e) {
            System.err.println("Error reading image file: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        return image;
    }
}