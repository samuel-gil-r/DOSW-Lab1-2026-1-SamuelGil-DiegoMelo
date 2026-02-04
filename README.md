#Maratón Git 2026-1
## Integrantes
 - Juan Diego Melo Suarez
 - Samuel Antonio Gil

---
## hojas de vida
Samuel Antonio Gil Romero 
<img width="1189" height="1600" alt="image" src="https://github.com/user-attachments/assets/70f82ba7-901f-4ea0-99ac-1ad80e9f821f" />

## Retos completados

### Reto 1: 
 La Bienvenida
Para este reto debes utilizar una expresión lambda para imprimir un saludo de bienvenida con los nombres de los integrantes de la pareja junto a su edad, correo y semestre.
Requisitos:

● Cree el objeto Estudiante y Mensaje Bienvenida para su solución.

● Los estudiantes deben ser almacenados en la estructura de datos List.

● Use stream(), map() y collect().

**Evidencia:**
<img width="1047" height="818" alt="image" src="https://github.com/user-attachments/assets/d083e7d1-b51d-4599-8b2e-9a85fef61ba7" />

### Reto 2: 
Carrera en Paralelo
**Evidencia:**
<img width="877" height="613" alt="image" src="https://github.com/user-attachments/assets/f9bf5540-308c-4d2d-89da-4764a306f430" />

**Descripción:**
Se trabajó en carriles separados (dos ramas feature distintas) y luego se unieron en la rama del reto. Se implementó una función que calcula el mínimo y la cantidad usando stream() y una lambda (Function<List<Integer>, Resultado>). Después se integraron los cambios con merge y se subieron a la rama del reto.

### Reto 3: El Eco Misterioso
**Evidencia:**
<img width="942" height="861" alt="image" src="https://github.com/user-attachments/assets/37c37cc5-507b-4def-8f3b-a80f6c59e350" />

**Descripción:**
Implementamos un eco usando StringBuilder para repetir y StringBuffer para invertir el texto.


### Reto 4: El Tesoro de las Llaves
<img width="1020" height="590" alt="image" src="https://github.com/user-attachments/assets/ce50bd91-fff2-4306-aad0-16d1a3e2d65e" />

**Descripción:**
Unificamos un HashMap y un Hashtable, manejando colisiones y convirtiendo las claves a mayúsculas ordenadas.

### Reto 5: Batalla de Conjuntos
<img width="968" height="866" alt="image" src="https://github.com/user-attachments/assets/6bf6d78c-467a-4352-ab55-39c8fb8e4083" />
**Descripción:**
Se implementaron dos métodos:
Parte A (HashSet): guardar números (sin orden) y eliminar múltiplos de 3 usando stream().filter().
Parte B (TreeSet): guardar números ordenados ascendentemente y eliminar múltiplos de 5 con stream().filter().
Después se unieron ambas colecciones en una estructura ordenada final (TreeSet) eliminando duplicados automáticamente y se imprimió con una lambda

### Reto 6: La Máquina de Decisiones
<img width="893" height="771" alt="image" src="https://github.com/user-attachments/assets/c9bbb2f0-6133-46c6-93ce-0166dc4846c8" />

El código se estructuró usando un Map<String, Runnable> para asociar cada comando con una acción.
El switch decide qué acción ejecutar y las lambdas permiten ejecutar el comportamiento sin parámetros.

## Preguntas teóricas
1.	¿Cuál es la diferencia entre git merge y git rebase?  
git merge: une dos ramas y crea un commit de merge. No borra el historial.
git rebase: mueve los commits de una rama encima de otra. Deja el historial más limpio.
2.	Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge? 
Git no sabe cuál elegir y genera un conflicto.
3.	¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?  
4.	Explica la diferencia entre un commit y un push. 
commit: guarda cambios localmente.
push: envía esos commits al repositorio remoto (GitHub)
5.	¿Para qué sirven git stash y git pop?
git stash: guarda cambios sin hacer commit.
git pop: recupera esos cambios guardados.
6.	¿Qué diferencia hay entre HashMap y HashTable? 
HashMap: más rápido, no es seguro para hilos.
Hashtable: más lento, sí es seguro para hilos.
7.	¿Qué ventajas Fene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Código más corto y legible
Funciona bien con streams y lambdas
Evita bucles largos y repetitivos
8.	Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?  
Convierte cada elemento en otro tipo o valor
9.	¿Qué hace el método stream().filter() y qué retorna? 
Filtra elementos según una condición.
Retorna un Stream con los elementos que cumplen la condición
10.	Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
- ir al develop 
git checkout develop
-actualizar
git pull 
-Crear rama nueva
git checkout -b feature/y poner la nueva rama 
11.	¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
git branch nombre: crea la rama, no cambia a ella
git checkout -b nombre: crea la rama y cambia a ella
