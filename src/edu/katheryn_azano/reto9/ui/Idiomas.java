package edu.katheryn_azano.reto9.ui;

public class Idiomas {
    /**
     * Variables estáticas para almacenar los textos en diferentes idiomas
      */
    public static String MENU;
    public static String LIBRO_SELECCIONADO;
    public static String LISTA_PALABRAS;
    public static String VECES;
    public static String GATO_CON_BOTAS;
    public static String TRES_CERDITOS;
    public static String PINOCHO;
    public static String GANSO_DE_ORO;
    public static String RICITOS;
    public static String ERROR_LIBRO;
    public static String VOCALES;
    public static String INICIO_VOCALES;
    public static String IMPARES;
    public static String PALABRA_CORTA;
    public static String PALABRA_LARGA;
    public static String CRITERIO_VOCAL;
    public static String CRITERIO_ERROR;

    /**
     * Método estático para obtener la instancia de los textos en un idioma específico
     * @param idioma
     * @return
     */
    public static Idiomas getInstance(String idioma) {
        // Obtiene la instancia del idioma según el parámetro recibido
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            // Español
            case Textos.español, spanish:
                // Define los textos en español
                MENU = "Favor de escoger un libro: \n1.El ganso de oro \n2.El gato con botas \n3.Los 3 cerditos " +
                        "\n4.Pinocho \n5.Ricitos de oro";
                LIBRO_SELECCIONADO = "El libro seleccionado fue: ";
                LISTA_PALABRAS = "Las 10 palabras mas repetidas son: ";
                VECES = "veces";
                GANSO_DE_ORO = "El ganso de oro";
                GATO_CON_BOTAS = "El gato con botas";
                TRES_CERDITOS = "Los 3 cerditos";
                PINOCHO = "Pinocho";
                RICITOS = "Ricitos de oro";
                ERROR_LIBRO = "Libro no disponible";
                VOCALES = "Total de vocales en el libro: ";
                CRITERIO_VOCAL = "¿Hay alguna palabra que cumpla el criterio de comenzar con vocal y terminar " +
                        "con una, que contenga al menos 5 letras?: ";
                INICIO_VOCALES="---Palabras que empiezan con vocal alfabeticamente---:";
                IMPARES ="---Palabras que contienen un número impar de letras---:" ;
                PALABRA_LARGA = "---La palabra mas larga es---: ";
                PALABRA_CORTA = "---La palabra mas corta es---: ";
                CRITERIO_ERROR = "No se encuentra una palabra con ese criterio";
                break;
            // Ingles
            case Textos.ingles, english:
                // Define los textos en inglés
                MENU = "Please choose a book: \n1.Golden goose \n2.Puss in Boots \n3.The 3 little pigs \n4.Pinocchio \n5.Goldilocks";
                LIBRO_SELECCIONADO = "The selected book is: ";
                LISTA_PALABRAS = "The top 10 repeated words are: ";
                VECES = "times";
                GANSO_DE_ORO = "Golden goose";
                GATO_CON_BOTAS = "Puss in Boots";
                TRES_CERDITOS = "The 3 little pigs";
                PINOCHO = "Pinocchio";
                RICITOS = "Goldilocks";
                ERROR_LIBRO = "Book not available";
                VOCALES = "Total vowels in the book: ";
                CRITERIO_VOCAL = "Is there any word that meets the criteria of beginning with a vowel and ending " +
                        "with one, containing at least 5 letters?: ";
                INICIO_VOCALES="---Words that begin with a vowel alphabetically---:";
                IMPARES ="---Words that contain an odd number of letters---:" ;
                PALABRA_LARGA = "---The longest word is---: ";
                PALABRA_CORTA = "---The smallest word is---: ";
                CRITERIO_ERROR = "I can't find a word with that criteria.";
                break;
            default:
                // Lanza una excepción si el idioma no está disponible
                throw new IllegalArgumentException("Idioma no disponible / Language not available");
        }
        // Retorna null ya que el método no tiene un tipo de retorno específico
        return null;
    }
}

// Enumeración para representar los textos disponibles
enum Textos {
    español, spanish, ingles, english
}
