import java.util.*;

public class Dictionary {
    HashMap<String, String> translatedWords = new HashMap<>();

    public Dictionary(){
    // Add words with their translations (Spanish, English)
    translatedWords.put("Sobreescribir", "Override");
    translatedWords.put("Abstracción", "Abstraction");
    translatedWords.put("Encapsulación", "Encapsulation");
    translatedWords.put("Herencia", "Inheritance");
    translatedWords.put("Polimorfismo", "Polymorphism");
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

    public List<Map.Entry<String, String>> selectRandomWords(){
        ArrayList<Map.Entry<String, String>> wordsPairs = new ArrayList<>(translatedWords.entrySet()); // Creates ArrayList using the values of the dictionary
        Collections.shuffle(wordsPairs); // Randomly rearranges order of ArrayList elements every time the method gets called

        return wordsPairs.subList(0,5); // Returns first five pairs of randomly shuffled list
    }
}


