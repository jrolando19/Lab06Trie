<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Trie</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>06</td><td>AÑO LECTIVO:</td><td>2023 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>26-May-2022</td><td>FECHA FIN:</td><td>28-May-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">INTEGRANTES:
    <ul>
        <li>Jordy Rolando Tejada Lazo</li>      
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Dra. Karim Guevara Puente de la Vega

Mg. Richart Smith Escobedo Quispe

Mg. Edith Giovanna Cano Mamani

Mg. Jeymi Valdivia Eguiluz</li>

</ul>
</td>
</<tr>
</tdbody>
</table>

# Revisión de elementos de programación

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

#

## OBJETIVOS TEMAS Y COMPETENCIAS

### OBJETIVOS

- Entender la estructura de datos Trie.

### TEMAS

- Trie

<details>
<summary>COMPETENCIAS</summary>

- C.m. Construye responsablemente soluciones haciendo uso de estructuras de datos y algoritmos, siguiendo un proceso adecuado para resolver problemas computacionales que se ajustan al uso de los recursos disponibles y a especificaciones concretas.

</details>

## CONTENIDO DE LA GUÍA

### MARCO CONCEPTUAL

- https://www.w3schools.com/java/
- https://docs.oracle.com/javase/7/docs/api/java/util/List.html

## EJERCICIOS PROPUESTOS

- TODO SE ENCUENTRA DETALLADO EN EL INFORME PDF ENVIADO RESPECTIVAMENTE A LA PROFESORA ENCARGADA

- Se te ha proporcionado un diccionario de palabras y tu tarea es construir un programa que
  pueda buscar eficientemente si una palabra dada está en el diccionario o no. Para esta tarea,
  usarás la estructura de datos del árbol Trie. Los requisitos son los siguientes:
- Implementa la estructura del nodo Trie : Crea una clase TrieNodeen Java. Cada nodo del Trie
  debe tener un arreglo de hijos (uno por cada letra del alfabeto) y un valor booleano que indica
  si el nodo representa el final de una palabra en el diccionario.
- Implementa la inserción en el Trie : Crea una clase Trieque tenga una TrieNoderaíz. Dentro de
  esta clase, implementa el método insert(String word), que debe insertar una palabra en el Trie.
  Recorre cada letra de la palabra, crea un nuevo nodo si la letra no está en el Trie y continúa al
  nodo correspondiente.
- Implementa la búsqueda en el Trie : Aún en la clase Trie, implementa el método search(String
  word), que debe devolver un valor booleano Indicando si la palabra dada está en el Trie o no.
  Recorre cada letra de la palabra y si la letra está en el Trie, continúa al siguiente nodo. Si no
  encuentras una letra o llegas al final de la palabra sin marcar el nodo como final, la palabra no
  está en el Trie.
- Prueba tu implementación del Trie : Finalmente, escribe un método mainpara probar tu
  implementación del Trie. Inserta algunas palabras en tu Trie y realiza algunas búsquedas,
  mostrando los resultados en la consola.
- Por favor, tenga en cuenta que este código debe tratar todas las palabras como si estuvieran en
  minúsculas y solo debe manejar letras de "a" a "z".

## RESULTADO

- El programa implementa un Trie (árbol Trie) en Java para construir un diccionario de palabras y realizar búsquedas eficientes para verificar si una palabra dada está en el diccionario o no. Se crea la clase TrieNode para representar los nodos del Trie, cada uno contiene un HashMap para almacenar los hijos correspondientes a cada letra del alfabeto y un booleano para indicar si es el final de una palabra.

- La clase Trie contiene un nodo raíz y se implementan los métodos de inserción (insert) y búsqueda (search). Durante la inserción, se recorre cada letra de la palabra y se crea un nuevo nodo si la letra no está presente en el Trie, avanzando al nodo correspondiente para el siguiente carácter. Al finalizar la inserción, se marca el último nodo del recorrido como el final de la palabra.

- En la búsqueda, también se recorre cada letra de la palabra, verificando si cada carácter está presente en los hijos del nodo actual. Si la palabra no se encuentra completa en el Trie, o el carácter no es válido, se lanza una excepción. Al finalizar la búsqueda, se retorna true si el último nodo del recorrido es el final de una palabra.

- Se realizan pruebas de inserción y búsqueda en el método main usando palabras en minúsculas o mayúsculas y validando que son palabras de la “a” a la “z” ya que son validadas en la implementación del programa , y así mostrando los resultados en la consola.
- El resultado de la prueba muestra que las palabras "Oracle", "JAVA" y "Estructura" están en el Trie, mientras que la palabra "eda" no se encuentra en el Trie, tal como se esperaba.

## REFERENCIAS

    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers

#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE
[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/
[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit
[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html
[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/
[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/
[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/
[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
