import java.util.HashMap;

// Definición de la clase TrieNode que representa un nodo en el Trie
class TrieNode {
    HashMap<Character, TrieNode> children; // HashMap para almacenar los hijos de cada nodo
    boolean isEndOfWord; // Variable para indicar si el nodo representa el final de una palabra

    // Constructor de la clase TrieNode
    public TrieNode() {
        children = new HashMap<>(); // Inicializa el HashMap de hijos
        isEndOfWord = false; // Inicializa la variable de final de palabra como falso
    }
}

// Clase Trie que implementa el Trie con los métodos de inserción y búsqueda
public class Trie {
    private TrieNode root; // Nodo raíz del Trie

    // Constructor de la clase Trie
    public Trie() {
        root = new TrieNode(); // Crea un nuevo nodo TrieNode como raíz del Trie
    }

    // Método para insertar una palabra en el Trie
    public void insert(String word) {
        TrieNode current = root; // Inicia el recorrido del Trie desde la raíz
        String wordlower = word.toLowerCase(); // Convierte la palabra a minúsculas
        for (char c : wordlower.toCharArray()) { // Recorre cada caracter de la palabra
            if (!Character.isLetter(c) || c < 'a' || c > 'z') {
                // Verifica si el caracter no es una letra minúscula (a-z)
                throw new IllegalArgumentException("Solo letras minusculas (a-z) están permitidas.");
            }

            // Si el caracter no está presente en los hijos del nodo actual, se crea un
            // nuevo nodo para el caracter
            current.children.putIfAbsent(c, new TrieNode());

            // Avanza al nodo correspondiente al caracter actual
            current = current.children.get(c);
        }
        // Marca el último nodo del recorrido como el final de la palabra
        current.isEndOfWord = true;
    }

    // Método para buscar una palabra en el Trie
    public boolean search(String word) {
        TrieNode current = root; // Inicia el recorrido del Trie desde la raíz
        String wordlower = word.toLowerCase(); // Convierte la palabra a minúsculas
        for (char c : wordlower.toCharArray()) { // Recorre cada caracter de la palabra
            if (!Character.isLetter(c) || c < 'a' || c > 'z') {
                // Verifica si el caracter no es una letra minúscula (a-z)
                throw new IllegalArgumentException("Solo letras minusculas (a-z) están permitidas.");
            }

            // Si el caracter no está presente en los hijos del nodo actual, la palabra no
            // existe en el Trie
            if (!current.children.containsKey(c)) {
                return false;
            }
            // Avanza al nodo correspondiente al caracter actual
            current = current.children.get(c);
        }
        // Retorna true si el último nodo del recorrido es el final de una palabra
        return current.isEndOfWord;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        // Todas las palabras ingresadas o buscadas se tratarán como minúsculas de la
        // "a" a "z"
        // Insertar Palabras en el Trie
        trie.insert("Oracle");
        trie.insert("JAVA");
        trie.insert("Estructura");

        // Buscar Palabras en el Trie
        System.out.println(trie.search("Oracle")); // true
        System.out.println(trie.search("java")); // true
        System.out.println(trie.search("estructura")); // true
        System.out.println(trie.search("eda")); // false
    }
}