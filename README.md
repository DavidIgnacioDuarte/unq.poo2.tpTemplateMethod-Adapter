# unq.poo2.tpTemplateMethod-Adapter
Presentación de los patrones de diseño **Template Method** y **Adapter** junto a sus diferentes implementaciones y usos dentro de un programa.


## Template Method

* El esqueleto del algoritmo se define en la superclase, de modo que las subclases puedan sobreescribir pasos del algoritmo sin cambiar su estructura general.


* El esqueleto que define la estructura en la superclase no cambia.


* Se pueden redefinir aquellos métodos que cumplen con cada paso del **método plantilla** (esqueleto) sobreescribiendo su comportamiento.


* Un **hook method** es un paso opcional con un cuerpo vacío. Un método plantilla funcionará aunque el gancho no se sobrescriba. Normalmente, los ganchos se colocan antes y después de pasos cruciales de los algoritmos, suministrando a las subclases puntos adicionales de extensión para un algoritmo.



## Adapter

* Existen 2 tipos de adaptadores: Por un lado, la **Clase Adaptadora** que utiliza la herencia múltiple, al heredar la clase adaptadora, interfaces de ambos objetos al mismo tiempo. JAVA no soporta herencia múltiple. Por el otro, el **Adaptador de Objetos** que utiliza el principio de composición de objetos: el adaptador implementa la interfaz de un objeto y envuelve el otro. Puede implementarse en todos los lenguajes de programación populares.


* La **Clase Adaptadora** hereda comportamientos tanto de la clase Cliente como de la clase del servicio a adaptar. La adaptación tiene lugar dentro de los métodos sobrescritos. La clase adaptadora resultante puede utilizarse en lugar de una clase cliente existente. 


* El **Adaptador de Objetos** extiende del objeto con el que se comunica el Cliente y cuenta con el objeto adaptado como composición, sobreescribiendo el método que llama el cliente y llama al objeto adaptado para ejecutar este mismo método.


* Explicar Adapter:

```java
/*

	Enumeration<E>

	default Iterator<E> 	asIterator() 	
		//Returns an Iterator that traverses the remaining elements covered by this enumeration.
	boolean 	hasMoreElements() 	
		//Tests if this enumeration contains more elements.
	E 	nextElement() 	
		//Returns the next element of this enumeration if this enumeration object has at least one more element to provide.


	Vector

	Enumeration<E> 	elements() 	
		//Returns an enumeration of the components of this vector.

-------------------------------------------------

For example, to print all elements of a Vector<E> v:

   for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
       System.out.println(e.nextElement());
       

*/
```

Puedo notar que al momento de recorrer un Vector, la interfaz Enumeration adapta a los elementos del primero a una misma Enumeration, de modo que esta última pueda acceder al siguiente elemento internamente. Se usa la implementación del **Objeto Adaptador**, única disponible en JAVA.







