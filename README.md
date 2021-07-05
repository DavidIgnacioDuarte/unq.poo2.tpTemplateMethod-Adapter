# unq.poo2.tpTemplateMethod-Adapter
Presentaci�n de los patrones de dise�o **Template Method** y **Adapter** junto a sus diferentes implementaciones y usos dentro de un programa.


## Template Method

* El esqueleto del algoritmo se define en la superclase, de modo que las subclases puedan sobreescribir pasos del algoritmo sin cambiar su estructura general.


* El esqueleto que define la estructura en la superclase no cambia.


* Se pueden redefinir aquellos m�todos que cumplen con cada paso del **m�todo plantilla** (esqueleto) sobreescribiendo su comportamiento.


* Un **hook method** es un paso opcional con un cuerpo vac�o. Un m�todo plantilla funcionar� aunque el gancho no se sobrescriba. Normalmente, los ganchos se colocan antes y despu�s de pasos cruciales de los algoritmos, suministrando a las subclases puntos adicionales de extensi�n para un algoritmo.



## Adapter

* Existen 2 tipos de adaptadores: Por un lado, la **Clase Adaptadora** que utiliza la herencia m�ltiple, al heredar la clase adaptadora, interfaces de ambos objetos al mismo tiempo. JAVA no soporta herencia m�ltiple. Por el otro, el **Adaptador de Objetos** que utiliza el principio de composici�n de objetos: el adaptador implementa la interfaz de un objeto y envuelve el otro. Puede implementarse en todos los lenguajes de programaci�n populares.


* La **Clase Adaptadora** hereda comportamientos tanto de la clase Cliente como de la clase del servicio a adaptar. La adaptaci�n tiene lugar dentro de los m�todos sobrescritos. La clase adaptadora resultante puede utilizarse en lugar de una clase cliente existente. 


* El **Adaptador de Objetos** extiende del objeto con el que se comunica el Cliente y cuenta con el objeto adaptado como composici�n, sobreescribiendo el m�todo que llama el cliente y llama al objeto adaptado para ejecutar este mismo m�todo.


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

Puedo notar que al momento de recorrer un Vector, la interfaz Enumeration adapta a los elementos del primero a una misma Enumeration, de modo que esta �ltima pueda acceder al siguiente elemento internamente. Se usa la implementaci�n del **Objeto Adaptador**, �nica disponible en JAVA.







