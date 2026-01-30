#Maratón Git 2026-1
## Integrantes
 - Juan Diego Melo Suarez
 - Samuel Antonio Gil

---
## Retos completados

### Reto 1: Configuración y creación de rama
**Evidencia:**
![img.png](images/img.png)
**Descripción:**
creamos branches desde develop con el formato feature/nombre_integrante

---

### Reto 2: Commit colaborativo
**Evidencia:**
Captura de imagen
**Descripción:**


---

### Reto 3: El Eco Misterioso
**Evidencia:**
(Poner captura aquí)
**Descripción:**
Implementamos un eco usando StringBuilder para repetir y StringBuffer para invertir el texto.

### Reto 4: El Tesoro de las Llaves
**Evidencia:**
(Poner captura aquí)
**Descripción:**
Unificamos un HashMap y un Hashtable, manejando colisiones y convirtiendo las claves a mayúsculas ordenadas.
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
12.	¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
Evita dañar código estable
Permite trabajar en equipo sin conflictos
Facilita pruebas
