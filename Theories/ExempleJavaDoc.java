/*Calcula a árae de um retaâgulo.
 * 
 * @param Width: A largura do retângulo em metros.
 * @param Height: A altura do retângulo em metros.
 * @return A área do retângulo em metros quadrados.
 * @throws IllegalArgumentException Se a largura ou altura forem negativas.
 * @author Lucas Stocco
 * @version 1.0
 * @since 2025 */

public class ExempleJavaDoc {
    public double calculateArea(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("<<ERROR>> A Largura e a altura não podem ser negativas.");
        }
        return width * height;
    }   
}