/**
 * Una pila para almacenar datos de cualquier tipo
 * @param T el tipo de datos que se acepta en la pila
 * @property pila
 * @author Ignacio Jiménez Cerpa
 */


class pila<T>{
    private var pila:MutableList<T> = mutableListOf<T>()
    fun top():T?{
        return pila.lastOrNull()
    }
    fun push(elemento:T){
        pila.add(elemento)
    }
    fun pop():T?{
        return pila.removeLastOrNull()
    }
    fun vacia():Boolean{
        return pila.isEmpty()
    }

    override fun toString(): String {
        return "$pila"
    }

}

/**
 * Invierte los elementos de una lista de cualquier tipo
 * @param list<T> Se requiere de la lista que queramos invertir los elementos
 * @return una lista con los elementos de la lista original con el orden invertido
 */
fun <T>reverse(list: List<T>):MutableList<T>{
    /*hacer los for para llenar la pila y llenar la lista inversa*/
    val pila = pila<T>()
    val listaInversa = mutableListOf<T>()
    for (elemento in list.iterator()){ //llenar al pila
        pila.push(elemento)
    }
    while (pila.vacia() != true){ // un bucle while para vaciar la pilla y llenar la lista inversa
        pila.pop()?.let { listaInversa.add(it) }
    }
    return listaInversa
}
fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

}