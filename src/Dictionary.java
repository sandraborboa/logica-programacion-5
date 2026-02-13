import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> translatedWords = new HashMap<>();

    public Dictionary(){
    // Add words with their translations (Spanish, English)
    translatedWords.put("Sobreescribir", "Override");
    translatedWords.put("Abstraction", "Abstracción");
    translatedWords.put("Encapsulación", "Encapsulation");
    translatedWords.put("Herencia", "Inheritance");
    translatedWords.put("Polimorfismo", "Polymorphism"); // Duplicate
    translatedWords.put("Clase", "Class");
    translatedWords.put("Objeto", "Object");
    translatedWords.put("Método", "Method");
    translatedWords.put("Atributo", "Attribute");
    translatedWords.put("Interfaz", "Interface");
    translatedWords.put("Constructor", "Constructor");
    translatedWords.put("Paquete", "Package");
    translatedWords.put("Variable", "Variable");
    translatedWords.put("Constante", "Constant");
    translatedWords.put("Parámetro", "Parameter");
    translatedWords.put("Argumento", "Argument");
    translatedWords.put("Excepción", "Exception");
    translatedWords.put("Compilador", "Compiler");
    translatedWords.put("Depuración", "Debugging");
    translatedWords.put("Biblioteca", "Library");
    }
}
