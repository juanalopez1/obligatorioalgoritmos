# Estructura de datos utilizadas
Optamos por la utilización de **listas enlazadas** como estructura de datos primaria en nuestro proyecto. En ese sentido, hemos desarrollado la clase "Lista", la cual implementa la interfaz "ILista", proporcionando así un conjunto de métodos para operar sobre dicha estructura.

La clase "Lista" representa una lista enlazada genérica, una estructura de datos lineal en la cual los elementos están dispuestos en forma de nodos, y cada nodo apunta al siguiente nodo en la secuencia. La utilización de genéricos nos permite que la lista enlazada pueda contener elementos de cualquier tipo.

## Propiedades:
- primero: Es un puntero al primer nodo de la lista.
- Largo: Representa el número de elementos en la lista.

## Métodos:
- Constructor: Dos constructores, uno sin parámetros que inicializa el primer nodo como nulo, y otro con un nodo inicial.
- getLargo(): Devuelve el número de elementos en la lista.
- setLargo(Integer Largo): Establece el número de elementos en la lista.
- imprimirLista(): Recorre la lista y devuelve una cadena de texto con la información de cada nodo (específicamente, en este caso, los - identificadores y descripciones de los farmacos).
- esVacia(): Comprueba si la lista está vacía.
- getPrimero(): Devuelve el primer nodo de la lista.
- insertar(INodo<E> nodo): Inserta un nodo al final de la lista.
- buscar(Comparable clave): Busca un nodo con una etiqueta (clave) específica en la lista y devuelve el nodo encontrado.
