import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Math;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * autor: Daniel De La Cruz.
 * github:
 */

public class Apuntes {
    public static void main(String[] args) throws Exception {
        System.out.println("Mi nombre es Daniel Gustavo");

        // JAVA CARACTERISTICAS
        /**
         * Java es un lenguaje orientado a objetos.
         * Distribuido Multihilos
         * Seguro e independiente de la plataforma (windows,linux, mac) con tener la JVM
         * (java virtual machine)
         */

        // VERSIONES DE JAVA
        /**
         * JAVA SE: PARA PROPOSITOS GENERALES UTILIZADA EN APLICACIONES DE ESCRITORIO Y
         * SERVIDORES.
         * JAVA EE: PARA EL DESARROLLO DE APLICACIONES DISTRIBUIDAS QUE TRABAJAN SOBRE
         * INTERNET.
         * JAVA ME: PARA DISPOSITIVOS CON RECURSOS LIMITADOS TALES COMO DISPOSITIVOS
         * MOBILES, TV, IMPRESORAS.
         */

        // JAVA CONCEPTOS
        /**
         * JDK (JAVA DEVELOPMENT KIT): INCLUYE UN COMPILADOR, UN ENTORNO DE EJECUCION
         * (RUNTIME ENVIRONMENT)Y OTRAS HERRAMIENTAS PARA EL DESARROLLO DE APLICACIONES.
         */

        // TIPOS DE DATOS EN JAVA (primitivos)
        /**
         * ENTEROS **
         * byte (–128 to 127)
         * short (–32,768 to 32,767)
         * int (–2,147,483,648 a 2,147,483,647)
         * long (–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
         * Caracteres **
         * char (cualquier caracter)
         * Deciales **
         * float (debemos de colocar f al final del valor)
         * double (valores decimales muy grandes)
         * Booleanos **
         * boolean (true o false)
         */

        /**
         * si declaramos:
         * char letra = 97;
         * me imprimira el caracter a, ya que el 97 hace referencia a la letra minuscula
         * a en el codigo ASCCI.
         */

        // CONSTANTES

        /**
         * Una constante es aquella variable que no cambia de valor a lo largo del
         * programa
         * para que sea una constante se le debe agregar la palabra final al principio.
         */

        final float pi = 3.1416f, euler = 2.8f;
        System.out.println("\n" + pi);
        System.out.println(euler + "\n");

        // CASTING

        int a = 5;
        int b = 2;
        float c = (float) a / (float) b;
        System.out.println(c);

        byte a1 = 8;
        byte b1 = 2;
        byte c1 = (byte) (a1 + b1);
        System.out.println(c1);

        float a2 = 8f;
        float b2 = 2.5f;
        float c2 = a2 + b2;
        System.out.println(c2 + "\n");

        // operador postIncremento preIncremento
        // preIncremento
        int PreIncremento = 0;
        System.out.println("PreIncremento " + ++PreIncremento);
        // postIncremento
        int PostIncremento = 0;
        System.out.println("PostIncremento " + PostIncremento++ + "\n");

        // ejemplo

        // preIncremento
        int preIncrementoa = 3;
        int preIncrementob = 2;
        int preIncrementoc = preIncrementoa * ++preIncrementob;
        System.out.println("preIncrementoa " + preIncrementoa); // 3
        System.out.println("preIncrementob " + preIncrementob); // 3
        System.out.println("preIncrementoc " + preIncrementoc + "\n"); // 9

        // postIncremento
        int postIncrementoa = 3;
        int postIncrementob = 2;
        int postIncrementoc = postIncrementoa * postIncrementob++;
        // primero multipica y luego suma la unidad a postIncrementob
        System.out.println("postIncrementoa " + postIncrementoa); // 3
        System.out.println("postIncrementob " + postIncrementob); // 3
        System.out.println("postIncrementoc " + postIncrementoc); // 9

        // RECOMENDACION: no utilices preIncremento ni postIncremento en una asignacion.
        // ejemplo: int postIncrementoc = postIncrementoa * postIncrementob++;

        // variable = variable + 1; === variable+=1; === variable++;

        /**
         * Operadores aritmeticos (+,-,*,/)
         * atento con las jeraquia de operaciones (con prioridad de izquierda a
         * derecha).
         */

        /**
         * Operadores logicos (AND, OR, NOT)
         * atento a las tablas de verdad de cada operador.
         */

        /**
         * Operadores relacionales (> mayor, < menor, >= mayor o igual, <= menor o
         * igual, == igual, != diferente)
         * siempre te dan un valor booleano.
         */

        /**
         * Operador Ternario (condicion : true ? false)
         * Dependiendo a la condicion, realizara el proceso del codigo true o false.
         */

        // String cadena = (8 > 9) ? "Verdadero" : "Falso";
        // System.out.println("\nOperador Ternario: " + cadena);

        // CLASE MATH
        /**
         * Sus metodos son estaticos, no es necesario hacer una instancia.
         * Solo escribe la clase y podras usar sus metodos.
         * Nos brinda componentes matematicos.
         * Necesitamos agregar el paquete java.lang.Math
         */
        System.out.println("\nClase Math");
        double numeroA = 3;
        double numeroB = 9;
        double numeroC = 9.6;
        double numeroD = 9.3;
        System.out.println("Raiz cuadrada de " + numeroB + " = " + Math.sqrt(numeroB));
        System.out.println("Maximo de dos numeros = " + Math.max(numeroA, numeroB));
        System.out.println("Potencia de " + numeroB + " a la " + numeroA + " = " + Math.pow(numeroB, numeroA));
        System.out.println("Numero aleatorio de 0 a 10 = " + (int) (Math.random() * 10 + 1));
        System.out.println("Redondeo del numero " + numeroC + " = " + Math.round(numeroC));
        System.out.println("Redondeo del numero " + numeroD + " = " + Math.round(numeroD));
        System.out.println("Hipotenusa, lado1: " + numeroA + " lado2: " + numeroB + " = "
                + Math.round(Math.hypot(numeroA, numeroB)));

        // CADENAS
        /**
         * String no es un dato de tipo primitivo, es una CLASE.
         * podemos declararla como una variable normal o haciendo uns instancia de la
         * clase String:
         * String variable = new String ("Texto");
         */

        // Algunos metodos de los String
        String name = "Daniel, ese es mi nombre";
        System.out.println("\nTexto: " + name);
        System.out.println("Nombre en mayusculas':" + name.toUpperCase());
        System.out.println("Nombre en mayusculas':" + name.toLowerCase());
        // el metodo .trim(), quita los espacios en blanco del final y del inicio
        System.out.println("Longitud: " + name.length());
        boolean contienePalabra = name.contains("Daniel");
        System.out.println("Contiene 'Daniel':" + contienePalabra);
        System.out.println("Empieza con 'Daniel':" + name.startsWith("Daniel"));
        System.out.println("Termina con 'nombre':" + name.endsWith("Nombre"));
        // con chartAt(indice) obtenemos el caracteren esa posición
        /**
         * Con indexof('letra') conoceremos donde empieza nuestro caracter o cadena.
         * Si no existe retorna -1.
         * Puedes pasarle un segundo argumento, indica el indice a partir del cual se
         * iniciara la busqueda.
         */
        String mensajeTexto = "Hola Mundo";
        String mensajeTexto2 = "";
        int indiceLetraM = mensajeTexto.indexOf("M");
        System.out.println("Indexof: " + indiceLetraM);
        /**
         * Con subString(indiceInicial,indiceFinal) nos retornara parte de la cadena
         * basado en los indices que le estamos mandando.
         * Puedes pasarle un segundo argumento, indica el indiceFinal de la cadena.
         */
        String subString = mensajeTexto.substring(indiceLetraM, indiceLetraM + 2);
        System.out.println("SubString: " + subString);
        // con isEmpty(), comprobamos si la cadena esta vacia, regresa un false or true
        System.out.println("isEmpty: " + mensajeTexto2.isEmpty());
        // con format, format(" %s",variable de tipo String en este caso);
        String name2 = String.format("2do name: %s", "Gustavo");
        System.out.println("Usando format:" + name2);
        // tambien sirve para dar formato a los numeros
        float valorPi = 3.14166666f;
        // solo nos muestra 2 decimales
        String mensaje = String.format("%.2f", valorPi);
        // retorna un nuevo String
        System.out.println(mensaje);
        // si vas a usar format solo para mandar a imprimir, es mejor usar
        // printf(format,valor)

        // validar 2 cadenas
        // usamos el metodo equals
        String cadena1 = "Daniel";
        String cadena2 = "daniel";
        System.out.println("\n" + cadena1.equals(cadena2));
        // usamos el metodo equalsIgnoreCase para que tome como iguales mayusculas como
        // minusculas
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        // Caracteres especiales en las cadenas
        /**
         * \n: salto de linea
         * \t: tabulación
         * \r: retorno de carro
         * \": dobles comillas
         * \\: backslash
         */

        // Ciclos como for, while, do while, for each
        /**
         * for(inicio, condicion, aumento-decremento){ codigo }
         * while(codicion){codigo aumento-decremento }, piensa luego procesa.
         * do {codigo aumento-decremento } while(codicion), procesa y luego piensa.
         */

        // for each
        System.out.println("\nFor each ejemplos:");
        int datos[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int elemento : datos) {
            System.out.print(elemento + " ");
        }
        System.out.printf("\n");
        String datos2[] = { "daniel", "ana", "veronica", "edgar", "lizbeth", "antonio", "luis" };
        for (String elemento : datos2) {
            System.out.print(elemento + " ");
        }

        System.out.println("\n\nFor Each con mapas");
        // for each en mapas
        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "daniel");
        nombres.put(2, "ana");
        nombres.put(3, "veronica");
        nombres.put(4, "edgar");
        nombres.put(5, "lizbeth");
        nombres.put(6, "antonio");
        nombres.put(7, "luis");

        // recorriendo e imprimiendo
        nombres.forEach((indice, valor) -> {
            System.out.println("ID: " + indice + " Nombre: " + valor);
        });
        System.out.println("");

        // Ademas tenemos sentencias como BREAK y CONTINUE
        /*
         * break: corta el proceso de un ciclo,se sale del programa sin importar si no
         * termino las iteraciones.
         * continue: pasa a la siguiente iteración
         */

        // ARREGLOS
        /**
         * Son una coleccion de datos del mismo tipo de valor, un arreglo debe de tener
         * un tamaño especifico.
         * Siempre necesitamos saber el tamaño para poder declarar un arreglo.
         * Puede almacenar tipos de datos primitivos o referencias de objetos.
         * Si almaceno enteros, solo podre almacenar enteros, si almaceno cadena
         * entonces solo seran cadenas.
         */

        // declaracion de un arreglo

        // arreglo lleno
        int numeros[] = { 10, 9, -8, 7, -6, 5, 14, 86 };

        // arreglo vacio con 6 espacios en memoria
        // int numeros1 [] = new int[6];

        // Para poder acceder a un valor del arreglo se necesita un indice, el indice
        // comienza desde 0.
        // Guardamos en numero1, el valor que hay en la posicion 0 del arreglo numeros.
        int numero1 = numeros[0];
        int numero2 = numeros[1];

        // Asignarle un nuevo valor a un elemento del arreglo
        numeros[1] = 69;

        // Mandando imprimir
        System.out.println("Numero [0]: " + numero1);
        System.out.println("Numero [1]: " + numero2);
        System.out.println("Cantidad de elementos en el arreglo Numero: " + numeros.length);
        System.out.println("Imprimiendo Arreglo: ");
        for (int elemento : numeros) {
            System.out.print(elemento + " ");
        }

        // ORDENACION BURBUJA

        /**
         * No es recomendado usarlo en producción, no son optimos.
         * Es el metodo de ordenación mas facil de implementar.
         * Adecuado para personas que empiezan a programar, entender como podemos
         * ordenar y buscar.
         */

        // llenado con valores aleatorios

        int valoresAleatorios[] = new int[10];
        for (int i = 0; i < valoresAleatorios.length; i++) {
            valoresAleatorios[i] = (int) ((Math.random() * 100) + 1);
        }
        // imprimiendo
        System.out.println("\n\nOrdenacion burbuja\n" + "Imprimiendo Arreglo: ");

        for (int valor : valoresAleatorios) {
            System.out.print(valor + " ");
        }

        // ordenación burbuja
        int aux = 0;
        for (int i = 0; i < valoresAleatorios.length - 1; i++) {
            for (int j = 0; j < valoresAleatorios.length - 1; j++) {
                if (valoresAleatorios[j] > valoresAleatorios[j + 1]) {
                    aux = valoresAleatorios[j + 1];
                    valoresAleatorios[j + 1] = valoresAleatorios[j];
                    valoresAleatorios[j] = aux;
                }
            }
        }

        // imprimiendo arreglo ordenado
        System.out.println("\nOrdenados: ");
        for (int valor : valoresAleatorios) {
            System.out.print(valor + " ");
        }

        // Busqueda lineal
        /**
         * Ineficiente, ya que recorre todo el arreglo hasta encontrar el dato a buscar.
         * Tenemos metodos mas eficientes como la busqueda binaria, pero el arreglo debe
         * estar ordenado.
         */
        System.out.println("\nBusqueda: ");
        valoresAleatorios[5] = 69;
        int x = 69;
        for (int i = 0; i < valoresAleatorios.length; i++) {
            if (valoresAleatorios[i] == x) {
                System.out.println("El numero " + x + " se encuentra en la posición " + i);
                break;
            }
        }

        // MATRICES O ARREGLO BIDIMENCIONALES

        /**
         * Arreglo en 2 o mas dimenciones
         * Sigue los mismos principios que los arreglos normales.
         */

        // declaración
        int matriz[][] = new int[3][3];
        // agregando valores desde teclado - consola
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // imprimiendo con un for normal
        System.out.println("Matriz de 3 x 3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        // imprimiendo con un for each
        System.out.println("Matriz con ForEach");
        for (int fila[] : matriz) {
            for (int columna : fila) {
                System.out.print(columna);
            }
            System.out.println("");
        }
        // matriz inicializada
        int matriz1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // imprimiendo
        System.out.println("Matriz inicializada: ");
        for (int[] item : matriz1) {
            for (int is : item) {
                System.out.print(is + " ");
            }
        }
        System.out.println();

        // EJERCICIO

        // Recibir una cadena de numeros separados por comas y mostrar los numeros de
        // tipo number.
        System.out.println("\nEjercicio con split");
        // declaración de arreglos y cadenas
        String cadenaNumeros = "1,2,3,4,5,6";
        // Metodo split que separa una cadena con lo que le pases como argumento y te
        // retorna un arreglo con esos valores.
        String cadenaNumerosNew[] = cadenaNumeros.split(",");
        System.out.println("Imprimiendo el arreglo de numeros de tipo String: ");
        for (String string : cadenaNumerosNew) {
            System.out.print((string) + " ");
        }
        System.out.println("\nLongitud del arreglo cadenaNumerosNew: " + cadenaNumerosNew.length);
        // ingresando en el arreglo numeros enteros del arreglo de numeros de tipo
        // string
        int cadenaEnteros[] = new int[cadenaNumerosNew.length];
        for (int i = 0; i < cadenaNumerosNew.length; i++) {
            cadenaEnteros[i] = Integer.parseInt(cadenaNumerosNew[i]);
        }
        System.out.println("Imprimiendo el arreglo de numeros: ");
        for (int i : cadenaEnteros) {
            System.out.print((i) + " ");
        }

        // CLASE ARRAYS

        System.out.println("\n");
        // declaración del arreglo e inicialización de valores
        int vector[] = { 2, 3, 4, 5, 1 };
        int vector2[] = { 100, 78, 2, 35, 10, 69 };
        System.out.println("Clase Array");
        System.out.println("Metodo Sort");
        // metodo sort, ordena valores por el metodo de ordenación quicksort
        Arrays.sort(vector);
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println("\nMetodo fill: ");
        // fill rellena el arreglo con un solo valor utilizando la clase arrays
        Arrays.fill(vector, 69);
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println("\nMetodo binarySearch: ");
        // busca si se encuentra el elemento, necesitas ordenarlo primero
        Arrays.sort(vector2);
        for (int i : vector2) {
            System.out.print(i + " ");
        }
        int index = Arrays.binarySearch(vector2, 69);
        System.out.println("\nEl numero 69 se encuentra en la posición: " + (index + 1));
        // toString nos regresa el arreglo en forma de String
        System.out.println("Metodo toString: ");
        String array = Arrays.toString(vector2);
        System.out.println(array);
        // equals nos regresa true si ambos arreglos son iguales en tamaño y elementos
        System.out.println("Metodo equals: ");
        int vector3[] = { 45, 46, 14, 12, 3 };
        int vector4[] = { 45, 46, 14, 12, 3 };
        boolean v = Arrays.equals(vector3, vector4);
        System.out.println(v);

        // Clases para cada tipo primitivo, "clases envolventes-envoltorio"
        /**
         * boolean -> Boolean
         * char -> Character
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * long -> Long
         * float -> Float
         * double -> Double
         * 
         * Cada clase tiene metodos interesantes para transformar valores primitivos en
         * cadenas de caracteres y viceversa.
         */

        System.out.println();
        // CLASE INTEGER
        // pasar una cadena de caracteres a un numero entero
        int entero = Integer.parseInt("12345");
        System.out.println("Entero: " + entero);
        // metodo max, obtener el maximo entre 2 numeros
        System.out.println("Maximo: " + Integer.max(69, 666));
        /*
         * Podemos obtener la representación binaria, hexadecima u octal de un numero
         * entero.
         */
        System.out.println("Binario de 15: " + Integer.toBinaryString(15));
        System.out.println("Octal de 15: " + Integer.toOctalString(15));
        System.out.println("Hexadecimal de 15: " + Integer.toHexString(15));

        // CLASE Character
        // Saber si un caracter es letra o número
        char $letra = 'a';
        System.out.println();
        System.out.println("Es letra?: " + Character.isAlphabetic($letra));
        System.out.println("Es número?: " + Character.isDigit($letra));

        // CLASE Boolean
        System.out.println();
        boolean verdadero1 = true;
        boolean verdadero2 = true;
        boolean false1 = false;
        System.out.println("Es AND?: " + Boolean.logicalAnd(verdadero1, false1));
        System.out.println("Es OR?: " + Boolean.logicalOr(verdadero1, false1));
        System.out.println("Es XOR?: " + Boolean.logicalXor(false1, verdadero2));

        // Entrada y salida de DATOS
        /**
         * Clase Scanner -> metodo no estatico.
         * Clase JoptionPane -> metodo estatico.
         * Para usar ambas clases necesitas agregar sus respectivos paquetes
         */

        /**
         * METODO-ATRIBUTO ESTATICO es aquel metodo que para ejecutarlo no es necesario
         * crear una instancia (objeto), basta con colocar la clase(punto) y llamar al
         * metodo-atributo.
         * Si modificas un atributo estatico afectara a todos los objetos de la clase.
         * Se puede usar en variables y en metodos como ya se menciono anteriormente.
         * Existe el contexto estatico y dinamico.
         * Contexto dinamico puede acceder al estatico, y el estatico no accede al
         * dinamico, esto quiere decir que si tengo mi metodo estatico, dentro de el no
         * puedo llamar metodos dinamicos, sin embargo en un metodo dinamico
         * si puedo llamar metodos estaticos.
         */

        // CLASE JOptionPane
        // String text = JOptionPane.showInputDialog("Mensaje");
        // Nos devuelve un texto, si quieres usarlo como numero tienes que usar la clase
        // envolvente Integer.
        // Conversion a entero:
        // int nume = Integer.parseInt(text);
        // Operación:
        // System.out.println(nume + 1); // 6

        // CLASE SCANNER
        // try (Scanner data = new Scanner(System.in)) {
        // System.out.println("Escribe un numero: ");
        // int number = data.nextInt();
        // System.out.println(number);
        // }

        // PROGRAMACION ORIENTADA A OBJETOS

        // Conceptos
        /**
         * POO: Es un paradigma de programacion, una forma de programar para resolver un
         * problema, se basa en la realidad haciendo enfasis en los objetos los cuales
         * contienen atributos - caracteristicas y metodos - funcionalidades.
         * CLASE: es la agrupación de objetos, una plantilla - un molde - un template en
         * el cual se declaran los metodos y atributos y que gracias a la clase es
         * posible crear objetos.
         * Tambien es posible usar clases anidadas, basta con definir una clase
         * dentro de otra clase, se trabajan como clases normales
         * pueden poseer atributos y metodos, contsructores, clases anidadas, etc.
         * OBJETO: es una instancia de una clase el cual contiene metodos y atributos.
         * INSTANCIA: creación de un objeto a partir de una clase (new).
         * PILARES DE LA POO: abstraccion, encapsulamiento, herencia y poliformismo.
         */

        // ABSTRACCION:
        System.out.println("\nPOO");
        // instancia - creación de un objeto de la clase Perro, objeto llamado lUCAS
        // haciendo uso del metodo constructor
        Perro Lucas = new Perro("Lucas", "Meztizo", 1);
        Perro peque = new Perro();
        System.out.println("Objeto sin instancia: " + peque);

        // imprimiendo sus datos
        // System.out.println("Nombre: " + Lucas.nombre + "\nEdad: " + Lucas.edad +
        // "\nRaza: " + Lucas.raza);
        // Ya que los declaramos como private los atributos, no podemos acceder
        // totalmente a ellos.
        // Podemos hacerlo de la manera anterior o usar el metodo toString que nos
        // devuelve los datos en forma de objeto.
        System.out.println(Lucas.toString());
        // llamando una serie de metodos
        Lucas.comer();
        Lucas.jugar();
        Lucas.ladrar();
        // Haciendo uso de metodos
        // metodo setter -> metodo setEdad para establecer un nuevo valor
        Lucas.setEdad(2);
        // volviendo a imprimir
        System.out.println(Lucas.toString());
        // obteniendo el nombre del objeto -> metodo getNombre
        String nameDog = Lucas.getNombre();
        System.out.println("Nombre del Perro: " + nameDog);
        // clase Triangulo
        System.out.println("\nArea Triangulo");

        // Utilizando la clase JOptionPane
        /*
         * AQUI FALTA QUITAR COMENTARIOS
         * float base =
         * Float.parseFloat(JOptionPane.showInputDialog("Coloca la base:"));
         * float altura =
         * Float.parseFloat(JOptionPane.showInputDialog("Coloca la altura: "));
         * Triangulo triangulo1 = new Triangulo(base, altura);
         * System.out.println("Triangulo1: " + triangulo1.mostrarDatos());
         */

        Triangulo triangulo2 = new Triangulo(3.7f, 20.6f);
        System.out.println("Triangulo2: " + triangulo2.mostrarDatos());
        // Si igualas un objeto a otro objeto y cambias un valor, el valor se vera
        // reflejando en ambos objetos, puesto que tienen la misma referencia.

        /**
         * ENCAPSULAMIENTO: un pilar de la POO, temas de seguridad practicamente, para
         * eso se utilizan los modificadores de acceso para restringir el acceso de
         * diferentes atributos y constructores, permite visibilidad de Atr y Me.
         * Modificadores de acceso: private, public, protected,por defecto.
         * 
         * PUBLIC: se puede acceder desde cualquier clase, consultados, modificados o
         * ejecutados por clases o objetos que se encuentren en el mismo paquete
         * o en paquetes diferentes, o bien por las clases heredadas.
         * PRIVATE: consultar, modificar y ejecutar elementos unicamente por la misma
         * clase, para acceder a estos valores ya sea modificarlos o obtenerlos se hace
         * uso de metodos setter y getter, NO puede acceder a otra clase del mismo
         * paquete, una clase heredada ni mucho menos una clase de otro paquete,
         * se pueden utilizar el modificador en atributos, metodos, constructores.
         * PROTECTED: puede ser accedido desde su clase, las clases del mismo paquete,
         * las clases que heredan en el mismo paquete, Y pueden acceder desde las
         * clases que heredan desde otro paquete, (muy parecido a default).
         * DEFAULT: puede ser accedido desde su clase, las clases del mismo paquete
         * y las clases que heredan en el mismo paquete, PERO NO pueden acceder desde
         * las clases que heredan desde otro paquete.
         */

        // modificador, clase, paquete, subclase(mismo paquete), subclase(dif paquete),
        // Mundo
        // public, si, si, si, si, si
        // private, si, no, no, no, no
        // default, si, si, si, no, no
        // protected, si, si, si, si, no

        /**
         * El metodo toString es un metodo que se hereda por defecto de object.
         * Nos muestra la referencia del objeto a menos que lo sobreescribamos.
         * Para llamarlo no es necesario colocar: nameObjeto.toString();
         * Basta con colocar el nombre del objeto y nos mostrara por defecto el
         * metodo toString.
         */

        // MIEMBROS ESTATICOS
        /**
         * Todos aquellos metodos o atributos que contengan la palabra STATIC
         * hacen que el atributo o metodo se conviertan en atributos o metodos de
         * la clase, no se necesita instanciar un objeto para poder acceder a
         * ese atributo o metodo.
         * Ejemplo de clase STATIC: Math: en el cual podemos acceder a diversos
         * metodos.
         * El metodo main es de tipo STATIC ya que no hay necesidad de instanciar,
         * el metodo main le pertenece a la clase y asi es mas eficaz llamar al metodo
         * main.
         * Dentro de un metodo STATIC no podemos hacer uso de atributos o metodos
         * que le pertenezcan a la instancia-objeto.
         */

        /*
         * AQUI FALTA QUITAR COMENTARIOS
         * // System.out.println("\nEjercicio con arreglos y POO");
         * // Arreglos alumno1 = new Arreglos(7);
         * // alumno1.calificacion();
         */

        // CONSTRUCTORES
        /**
         * Se utilizan para inicializar valores por defecto de un objeto instanciado
         * sintaxis: metodo_Acceso nombre_clase (parametros){}
         * Se pueden tener varios constructores (sobrecarga de constructores)
         */

        // Varargs
        /**
         * Sirve cuando no sabes la cantidad de arg – parámetros recibirá tu método.
         * Va a trabajar como si fuera un array.
         * (checa la funcion que se encuentra hasta abajo para ver la implementación)
         */

        // Overloading - SOBRECARGA DE CONSTRUCTORES - METODOS
        /**
         * Se utiliza para reutilizar el nombre de un metodo pero con diferentes
         * argumentos (opcionalmente de un tipo diferente de retorno).
         * Los metodos deben de cambiar la lista de argumentos.
         * Pueden cambiar el tipo de retorno.
         * Lo que define que metodo sera llamado es el num. de argumentos.
         * Se realiza en la misma clase.
         * Se ven más reflejados en constructores.
         */

        /**
         * HERENCIA: una clase padre puede heredar atributos y metodos a una clase hija.
         * Reutilización de codigo.
         * Java no soporta la herencia multiple, solo se puede heredar de 1 clase.
         * Java soporta n cantidad de clases hijas.
         * Nos permite crear nuevas clases a partir de clases ya existentes pero
         * con algunas adiciones o cambios (atributos y metodos propios).
         * Nos permite reducir el codigo.
         * Los constructores son utilizados pero no heredados.
         * Hay que tener en cuenta la relación que existe entre clases para que
         * lleguemos a una abstracción correcta, siguiendo la nomenclatura:
         * ? ES UN ?, hablando de jerarquia.
         * Se logra colocando la palabra extends a la clase hija.
         * Ejemplos:
         * Mascota es un perro y un gato, la clase Mascota es la clase Principal
         * por lo tanto Mascota es la clase padre, perro-gato son clases hijas.
         * Vehiculo es un taxi y un autobus, la clase Vehiculo es la principal
         * por lo tanto Vehiculo es la clase base-padre, taxi-autobus son clases hijas
         * o tambien llamadas clases derivadas.
         */

        // CLASES Y METODOS FINAL
        /**
         * Si un metodo es final, significa que no puede existir ningun otro metodo que
         * se llame igual
         * en las clases que heredan de esta misma.
         * Ejemplo: public final void dibujar(){}
         * Si una clase es final, significa que no puede haber ningun hijo heredado de
         * esa clase.
         * Ejemplo: final public class figura{}
         */

        // PALABRA RESERVADA SUPER
        /**
         * Sirve para reescribir metodos pero sin perder las funcionalidades de
         * la clase padre de tal manera que las clases hijas y sus metodos sean mucho
         * mas robustas.
         * Tambien lo podemos encontrar mucho en los constructores, llamando al
         * constructor de la clase padre y pasandole los parametros que serian los
         * valores a inicializar, *checar archivo "PASTOR.java" para el ejemplo.
         */

        System.out.println("\nHerencia:");
        Pastor pastor1 = new Pastor();
        pastor1.setNombre("Dug");
        pastor1.comer();
        pastor1.jugar();
        pastor1.dormir();
        pastor1.setEdad(2);
        System.out.println(pastor1.getNombre() + "\n" + pastor1.toString());

        // Override - sobreescritura de metodos
        /**
         * La implementación sucede cuando ciertos metodos no satisfagan las
         * necesidades fijas, más o menos acciones-código.
         * Tomar un metodo de la clase padre e implementar su comportamiento
         * en la clase hija.
         * Cambia el comportamiento de un metodo.
         * Se realiza sobre la herencia / poliformismo en diferentes clases.
         * No confundir con la sobrecarga de metodos.
         */

        Pastor pastor2 = new Pastor();
        // Salida: nombre = Sin Nombre, raza = Pastor, edad = -1
        // ya que llamo al constructor que no tiene parametros
        System.out.println("Pastor2: " + pastor2.toString());
        Pastor pastor3 = new Pastor("Dag", "Pastor", 3);
        // Salida: nombre = Dag, raza = Pastor, edad = 3
        // ya que llamo al constructor que tiene 3 parametros
        System.out.println("Pastor3: " + pastor3.toString());

        // Objeto de la clase Perro
        Lucas.comer();
        // El Perro esta comiendo croquetas...

        // Objeto de la clase Pastor
        pastor1.comer();
        // salida: El Perro esta comiendo carne, vegetales y croquetas...

        /**
         * POLIFORMISMO: Nos permite crear diferentes formas de una forma base, ligado a
         * la herencia.
         * Podemos comunicarnos con los objetos utilizando la misma sintaxis para darles
         * mensajes al objeto.
         */

        // CLASES ABSTRACTAS
        /**
         * Habra ocasiones en donde debamos crear una clase padre donde unicamente
         * coloquemos la estructura de una abstracción, una estructura muy general
         * dejando que las clases hijas sean las que definan los detalles.
         * Las clases A. son identicas en cuanto a estructura a una clase normal,
         * atributos, metodos, constructores.
         * DIFERENCIA ENTRE UNA C. ABSTRACTA Y UNA NORMAL:
         * Pose por lo menos un metodo abstracto.
         * Pueden ser heredadas pero NO INSTANCIADAS, solo pueden ser instanciadas por
         * las clases concretas (las clases que heredan de la CLASE ABSTRACTA).
         * ¿Que es un metodo abstracto?
         * R= Aquel que no pose un cuerpo, define que hacer pero no como.
         * Se utilizan sólo como super clases.
         * (Checar archivos SerVivo, Planta, Animal, AnimalCarnivoro y AnimalHerbivoro)
         */

        // POLIMORFISMO (INTERFACES)
        /**
         * Poli: muchos, morfismo: formas, = muchas formas
         * Es una colección de datos abstractos y propiedades constantes que se
         * especifica que se debe de hacer pero no el como.
         * Seran las clases hijas quienes definiran su comportamiento.
         * Los metodos A. pueden omitir la palabra "ABSTRAC", se da por entendido que
         * los metodos que se encuentren en una interfaz y no posean un cuerpo
         * seran metodos abstractos.
         * Una clase puede implementar n cantidad de interfaces que se necesite.
         * Las interfaces tambien tienen la posibilidad de herencia entre interfaces,
         * es la misma sintaxis que usabamos con clases normales.
         * Los metodos abstractos que posean nuestra clase padre no s eran
         * implementados en la interfaz hija, los metodos seran implementados hasta que
         * una clase implemente la interfaz hija.
         * //CHECA CLASE FIGURA2, CIRCULO Y RECTANGULO para visualizar la
         * implementación de las interfaces y ejemplos de lo antes mencionado.
         */

        System.out.println();
        Figura2 arrayFiguras[] = new Figura2[5];
        arrayFiguras[0] = new Rectangulo("Rectangulo1", 4, 5);
        arrayFiguras[1] = new Rectangulo("Rectangulo2", 6, 5);
        arrayFiguras[2] = new Circulo("Circulo1", 4);
        arrayFiguras[3] = new Circulo("Circulo2", 2);
        arrayFiguras[4] = new Rectangulo("Rectangulo3", 10, 5);

        for (Figura2 eachFigure : arrayFiguras) {
            System.out.println("Nombre: " + eachFigure.getNombre() + ", Area: " + eachFigure.getArea() +
                    ", Perimetro: " + eachFigure.getPerimetro());
        }

        // PAQUETES EN JAVA
        /**
         * Organiza nuestro codigo en paquetes - carpetas.
         * Nos permite clasificar y ordenar nuestro codigo.
         * En proyectos grandes se crean clases que tienden a tener el mismo nombre, que
         * puede ocasionar problemas si es que no estan divididos en paquetes.
         * Agrupacion de clases con caracteristicas comunes.
         * Mantenibilidad de codigo.
         * Para importar una clase de algun otro paquete necesitas colocar el paquete
         * y el nombre de la clase a importar, o en su caso colocar * para importar
         * todas las clases existentes.
         */

        // API DE JAVA
        /**
         * Cada version de JAVA tiene publicada una ayuda online
         * para consultar la documentación de cada una de sus clases
         * en formato HTML.
         * Es una biblioteca de clases ya definidas, las cuales podemos utilizar para
         * agilizar nuestro proceso de desarrollo.
         * Tambien se le conoce como la API JAVA DOCS.
         * https://docs.oracle.com/javase/8/docs/api/index.html
         * https://docs.oracle.com/javase/9/docs/api/index.html?overview-summary.html
         * 
         */

        // API DE COLECCIONES JAVA
        /*
         * Un alamacen de objetos dinamicos, no pueden almacenar datos primitivos como
         * lo hace un array.
         * Podemos usar cualuqier tipo de objeto y podemos usar una serie de metodos
         * comunes, añadir, eliminar, obtener tamaño, ordenar etc.
         * 
         * Ejemplos de Colecciones
         * Set: coleccion de objetos que no admite duplicados, ni ordenamiento, ejemplo:
         * HashSet.
         * Lista: coleccion de objetos que admite duplicados, cada uno lleva un indice
         * asociado.
         * Cola: coleccion de objetos que se comporta como lo haria un grupo de personas
         * en la cola de una caja de un supermercado.
         * Mapa (map): Relaciona una clave key con un valor.
         * 
         * Collections > List >
         * ArrayList: eficiente para acceder a elementos aleatorios, poca eficiencia al
         * insertar elementos en medio.
         * LinkedList: mucha eficiencia al insertar elementos en medio, no para acceder
         * a elementos aleatorios.
         * 
         * Collections > Set >
         * HasSet: elementos unicos, no acepta valores repetidos.
         * 
         * MAP
         * HasMap: Valores Key-value, key unica, acepta valores repetidos.
         * TreeMap: Valores Key-value, estructura jerarquica.
         */
        System.out.println("\nCOLLECTIONS");

        System.out.println("\nList");
        List listaMeses = new ArrayList<>();
        listaMeses.add("Enero");
        listaMeses.add("Febrero");
        listaMeses.add("Marzo");

        System.out.println("Tamaño: " + listaMeses.size());
        System.out.println("Ultimo elemento: " + listaMeses.get(listaMeses.size() - 1));
        System.out.println("Lista de meses: ");
        System.out.println(listaMeses);
        // agregando elementos en x posición
        listaMeses.add(0, "Octubre");
        // Podemos agregar repetidos
        listaMeses.add("Octubre");
        System.out.println(listaMeses);

        System.out.println("\nArrayList");
        ArrayList<String> persona = new ArrayList<>();
        persona.add("Daniel");
        persona.add("Pablo");
        persona.add("Veronica");

        System.out.println("Tamaño: " + persona.size());
        System.out.println("Uno: " + persona.get(0));

        // EXCEPCIONES
        /**
         * Son algunos errores que púeden surgir en nuestro programa al momento de estar
         * ejecutandolo.
         * Algunos errores por los que se genera una excepcion: desbordamiento de
         * memoria, un intento de dividir entre 0, ingresar una cadena en lugar de un
         * numero como se espera o intentar acceder a un vector fuera de sus limites.
         * Despues de generarse una excepcion, el codigo que se encuentra debajo ya no
         * se lee.
         * 
         * Excepcion verificada: (IO exception) Java te obliga de evadir el error -
         * verificarlas.
         * Excepcion no verificada: Java no me obliga a evadir o solucionar ese error
         * (error del programador).
         * 
         * Try - catch
         * Se utiliza cuando encontramos excepciones verificadas o
         * no verificadas.
         * try{
         * //codigo
         * }
         * catch (){
         * // mensaje de la excepcion
         * }
         */

        Apuntes.imprimeMensaje("hola", "soy", "daniel");
        Apuntes.imprimeMensaje("Mi", "perro", "se", "llama", "Lucas");
        Apuntes.sumaXelementos(2, 4, 6, 8, 20, 30, -30);

        /*
         * THREADS - Hilos
         * Es usado para trabajar con multiples tareas.
         * Java alterna las tareas para una ejecución mas eficiente.
         * CONSULTA LA CARPETA LLAMADA THREADS PARA MAYOR ENTENDIMIENTO
         */

        /*
         * DATE/TIME API
         * Disponible desde JAVA 8 en adelante.
         * Usa threads-safe
         * Intuitivo - muchos usan calendario gregoriano.
         * Java.time = LocalDate, LocalTime, LocalDateTime, TimeFormater
         */
        // NOW
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaYhoraActual = LocalDateTime.now();
        System.out.println("\nFecha actual: " + fechaActual);
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Fecha Y Hora actual: " + fechaYhoraActual);
        // OF
        LocalDate fechaActual2 = LocalDate.of(2002, 10, 14);
        LocalTime horaActual2 = LocalTime.of(22, 15, 32);
        LocalDateTime fechaYhoraActual2 = LocalDateTime.of(2002, 10, 14, 22, 15, 32);
        System.out.println("\n-------------------------");
        System.out.println("Fecha actual: " + fechaActual2);
        System.out.println("Hora actual: " + horaActual2);
        System.out.println("Fecha Y Hora actual: " + fechaYhoraActual2);
        // PARSE
        LocalDate fechaActual3 = LocalDate.parse("2011-04-11");
        LocalTime horaActual3 = LocalTime.parse("23:40:16");
        LocalDateTime fechaYhoraActual3 = LocalDateTime.parse("2011-04-11T23:40:16");
        System.out.println("\n-------------------------");
        System.out.println("Fecha actual: " + fechaActual3);
        System.out.println("Hora actual: " + horaActual3);
        System.out.println("Fecha Y Hora actual: " + fechaYhoraActual3);
        // ACCEDER A LOS PARAMETROS DE UNA VARIABLE
        System.out.println("\n-------------------------");
        LocalDateTime fechaYhoraActua4 = LocalDateTime.now();
        System.out.println("Fecha actual anio: " + fechaYhoraActua4.getYear());
        System.out.println("Fecha actual mes: " + fechaYhoraActua4.getMonth() + " " + fechaYhoraActua4.getMonthValue());
        System.out.println("Fecha actual dia: " + fechaYhoraActua4.getDayOfMonth());
        System.out.println("Hora actual: " + fechaYhoraActua4.getHour());
        System.out.println("Minuto actual: " + fechaYhoraActua4.getMinute());
        System.out.println("Segundo actual: " + fechaYhoraActua4.getSecond());
        // COMPARACION DE FECHAS
        System.out.println("\n-------------------------");
        System.out.println(fechaActual2 + " - " + fechaActual3);
        if (fechaActual2.isBefore(fechaActual3)) {
            System.out.println("La fecha 1 esta antes que la fecha 2");
        } else {
            System.out.println("La fecha 1 esta despues que la fecha 2");
        }

        /*
         * MODELO VISTA CONTROLADOR (MVC)
         * MVC es un patrón de arquitectura de software que uytiliza 3 componentes.
         * Separa la logica de la aplicación de la logica de la vista en una aplicación.
         * Se utiliza tanto en componentes graficos basicos hasta sistemas
         * empresariales.
         * 
         * Modelo: se encarga de los datos, generalmente consultando la base de datos,
         * actualizaciones, consultas, busquedas, etc.
         * 
         * Vista: representación visual de los datos, todo lo que tenga que ver con la
         * interfaz grafica va aqui.
         * 
         * Controller: controla, recibe las ordenes del usuario a traves de los eventos
         * de la interfaz grafica
         * y se encarga de solicitar los datos al modelo y de comunicarselos a la vista.
         */

        // JAVA WEB
        /*
         * Java Web es una parte, es una especificación de Java EE.
         */

        // CONCEPTOS - PALABRAS PARA JAVA WEB
        /**
         * Servlet: Web dinamicas, una especificacion, es una clase en java que nos
         * permite manejar
         * peticiones y las requiest mediante el protocolo HTTP.
         * JSP
         * JPA
         * Java Bean Validation
         * JSF 2
         * JTA
         * NO OLVIDAR QUE SIGUEN SIENDO PARTE DE JAVA EE
         */

        // APLICACION WEB
        /**
         * Es un conjunto de paginas web que son generadas en respuesta a peticiones de
         * un usuario.
         * Son accesibles a traves de un navegador web, PC, dispositivo movi.
         * Son de tipo cliente - servidor.
         * Las aplicaciones web modernas almacenan y recuperan los datos de un servidor
         * de base de datos.
         * 
         * SERVIDORES DE APLICACIONES
         * Contenedor Web: Capa Web MVC, SERVLETS -> JSP Y JSF -> MODEL
         * Contenedor EJB:
         * * Capa Servicio: EJBS SERVICIOS REST
         * * Capa Datos: REPOSITORIOS OBJETOS JPA JDBC
         */

        /*
         * SERVLET
         * Es una clase java que se ejecuta en el servidor que nos permite realizar
         * peticiones web y devolver una respuesta.
         * Utilizados para recibir parametros, ya sea GET (URL) o datos de un formulario
         * HTML (POST).
         * La respuesta que envia un servlet puede ser de tipo HTML, XML, JSON, archivos
         * PDD, IMG, MP4, MP3.
         * En una aplicacion MVC, los servlet juegan un papel de controlador.
         * Son la base de muchos frameworks como Structs, Spring, JSF, etc.
         * Si sabemos como funcionan los servelts, al utilizar cualquiera de los
         * frameworks antes mencionados sera mas rapido
         * el aprendizaje.
         * 
         * Un servlet no puede ejecutarse por si solo (RUN). La forma de ejecutarlo
         * siempre es mediante URL. "Servlet Maping".
         * La configuracion de un servlet se realiza en el archivo WEB-INF/web.xml
         * (deployment descriptor).
         * 
         * Puede ser ejecutado por medio de una URL (GET).
         * Puede ser ejecutado por medio de un link (GET). Cuando se ejecuta de esta
         * forma, en el servlet se ejecuta el metodo doGet().
         * Puede ser ejecutado por medio de un formulario HTML (POST). Cuando se ejecuta
         * de esta forma, en el servlet se ejecuta el metodo doPost().
         * 
         * Una de las potencias de los servlets es que podemos utilizar todo el codigo
         * JAVA que deseemos para manipular los datos que nos envio un cliente.
         * 
         * CICLO REQUEST - RESPONSE de un SERVLET
         * Client (Browser) -> Request for Servlet -> Web Server (TomCat) (Servlet
         * Container (Servlet (doGET, doPOST))) -> DATABASE -> Servlet Container ->
         * Response for Servlet (HTML DOCUMENT, JSON, IG, MP3, MP4, ERROR 404,
         * REDIRECTION) -> Cliente (Browser).
         */

        // CABECERA DE RESPUESTA CONTENT - TYPE
        /**
         * Indican al navegador web el tipo de respuesta por parte del navegador.
         * Diferentes tipos de contenido: EXCEL, HTML, XML, IMAGENES.
         * Se utiliza MIME (MULTIPURPOSE INTERNET MAIL EXTENSIONS).
         * Ejemplo: response.SetContentType("image/jpeg");
         */

        // ESTRUCTURA DE UNA APLICACION WEB
        /**
         * WEB PAGES: directorio root, archivos html, css, js, JPSs, imagenes.
         * META-INF: Directorio META-INF de una aplicacion en java EE.
         * WEB-INF: generalmente tiene el archivo web.xml
         * Source Packages: Aqui iran las clases java, incluso los Servlets.
         * Libraries: archivos JAR.
         */

        // JSPs - JAVA SERVER PAGES
        /**
         * Son archivos que son ejecutados en el servidor. Se especializan en manejar
         * codigo HTML, y ademas permiten insertar codigo
         * nativo Java por medio de JSP tags.
         * En una aplicacion MVC (Model, View, Controller), los JSPs juegan el papel de
         * la vista, es decir muestran informacion obtenida, o
         * procesada por los Servlets.
         * A pesar de que se puede incluir codigo JAVA en los JSPs, no es muy
         * recomendable, debido que en una aplicacion MVC, por lo general
         * en la vista solo es para mostrar informacion.
         * JSPs - Presentacion, Servlets - procesar información, permite darle
         * mantenimiento.
         *
         * ELEMENTOS DE UN JSP (Scriptlets)
         * JSP SCRIPTLET: inserta cualquier codigo de java valido. <% %>
         * Expresión JSP: <%=expresion%>, expresion se evalua y es renderizada, donde
         * esta el tag.
         * JSP Declaración: <%! campo, variable o metodo de declaración %>
         * <%-- --%> JSP Comentario
         * <%@ %> Apertura y cierre para directivas/atributos de configuración de JSP.
         * (Se coloca hasta arriba generalmente).
         */

        // JAVABEAN
        /**
         * Es una clase en java que:
         * Tiene un constructor con 0 argumentos.
         * Proporciona metodos get y set para todas las variables de instancia privadas
         * que siguen el estandar de java.
         * Para variables de instancia de tipo boolean se utiliza el metodo isProtected
         * en vez de getPropiedad.
         * Los JavaBean son accesados por los JSPs por medio de los metodos get y set
         * utilizando EL y JSTL.
         */

        // Patron de diseño MVC (Modelo Vista Controlador) en JAVA EE
        /**
         * Permite dividir la aplicación en 3 niveles.
         * Modelo = clases de negocio (JavaBeans) = y la clases de acceso a la Base de
         * Datos (DAO).
         * La vista es la presentación final mostrada al usuario, por lo general se
         * utilizan los JSPs y HTML.
         * Los Servlets hacen la función de controlador, es decir, permiten controlar el
         * flujo de las peticiones HTTP.
         * Los servlets comparten atributos a los JSPs, para que sean desplegados.
         */
        System.out.println("\nRESTAAA -----");
        restaXelementos(numeros);

        /*
         * CLASES ENU *******************************************/

        /*
         * ENUM SON TIPOS ESPECIALES DE DATOS QUE NOSPERMITE LIMITAR EL NUM DE
         * VALORESQUE UNA VARIABLE PUEDE TOMAR}
         * UTILES PARA COLECCIONES FINITAS DE VALORES
         *
         * EJEMPLOS, DIAS DE LA SEMANA, ESTADOS DE UNA MAQUINA ETC
         *
         * SON CONSTANTES, SIGUES SIN CONVENCIONES
         */

        System.out.println("CLASES ENU");
        CuentaBancaria cuenta1 = new CuentaBancaria(23_500,TipoDeCuenta.AHORRO,"Daniel De La Cruz");
        System.out.println("\n" + cuenta1.Datos());
        cuenta1.setTipodeCuenta(TipoDeCuenta.NOMINA);
        System.out.println("\n" + cuenta1.Datos());



    }

    public static void imprimeMensaje(String... mensajes) {
        System.out.println("\nNumeró de parametros: " + mensajes.length);
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }

    public static void sumaXelementos(int... numeros) {
        int suma = 0;
        System.out.println("\nNumeró de parametros: " + numeros.length);
        for (int numero : numeros)
            suma += numero;
        System.out.println(suma);
    }

    public static void restaXelementos(int... numeros) {
        int resta = 0;
        System.out.println("\nNumeró de parametros: " + numeros.length);
        for (int numero : numeros)
            resta -= numero;
        System.out.println(resta);
    }
}