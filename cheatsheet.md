#Java 1O1

### O que é POO?

// TODO

## Entidades

### Tipos Primitivos

`byte`, `boolean`, `char`, `double`, `float`,  `int`,  `long`, `short`, `void` 

### Classes

Representam conceitos. 

Por exemplo, a receita de um bolo.

```java
class Cake {
  // corpo da classe
}
```

### Objectos

São instâncias de uma classe, i.e., uma concretização dos conceitos descritos pela classe.

Por exemplo, os bolos feitos a partir da receita.

**Como criar um novo objecto?**

```java
new Cake(); // cria uma nova instância da classe Bolo
```

### Referências

Permitem aceder aos objectos.

```java
Cake c = new Cake(); //c é uma referência para uma instância (objecto) da classe Cake
```

## Métodos e atributos

As classes representam conceitos e como tal, têm comportamento (definidos nos **métodos**) e um conjunto de características próprias (**atributos**).

**Como declarar um atributo?**

No corpo de uma classe:

```java
//[acessor] <tipo> nomeDoAtributo [= valorInicial];
private int sugar = 100;
```

**Como declarar um método?**

```java
//[acessor] <tipo de retorno> nomeDoMétodo([lista de argumentos]) {
  //corpo do método
//}
public int getSugarQuantity() {
  return sugar;
}
```

**Exemplo:**

Um bolo é composto por um conjunto de ingredientes (açúcar, ovos, etc.) - os atributos - e pode ser fatiado, comido, etc. - os métodos.

```java
class Cake {
  int sugar; //quantidade de acucar
  int eggs;   //quantidade de ovos
  // ... outros ingredientes
  
  // Construtores
  Sugar(int sugarQuantity, int amountOfEggs) {
     sugar = sugarQuantity;
     eggs = amountOfEggs;
  }
  
  // Getters e Setters
  int getSugarQuantity() {
    return acucar;
  }
  
  void setSugarQuantity(int newSugarQuantity) {
     sugar = newSugarQuantity;
  }
  
  // ... outros getters e setters
  
  // ... outros métodos
  int divide() {
     // divide o bolo em fatias e retorna o número total de fatias
  }

}
```

## Herança e Composição

Existem *n* tipos diferentes de bolos. E apesar de todos terem um conjunto de atributos e métodos em comum, eles também têm diferenças. Para evitarmos repetir código, se quisermos criar um bolo de chocolate, podemos extender o código da classe bolo. A isto chama-se **herança**.

Assim, podemos dizer que um `ChocolateCake` é um `Cake`, ou seja, `Cake` é a superclasse de `ChocolateCake` e `ChocolateCake` é a subclasse de `Cake`.

Adicionalmente, podemos combinar tipos mais simples para obtermos um tipo mais complexo - **composição**.

```java
class ChocolateCake extends Cake { // herança: ChocolateCake **é um** Cake
  Chocolate chocolate; // composição: ChocolateCake **tem** Chocolate 
  // ...
}
```

## Polimorfismo, Interfaces e Classes Abstractas

// TODO

## Packages e Controlo de Acessos

Têm como função agrupar um conjunto de código relaccionado, melhorando a sua organização e reduzindo colisão de nomes.

Controlo de acessos:

|             | classe | outra classe (mesmo package) | subclass (outro package) | outra classe (outro package) |
| ----------: | :----: | :--------------------------: | :----------------------: | :--------------------------: |
|    `public` |  sim   |             sim              |           sim            |             sim              |
| `protected` |  sim   |             sim              |           sim            |             não              |
|   `private` |  sim   |             não              |           não            |             não              |
|   (package) |  sim   |             sim              |           não            |             não              |

```java
package pastry;

// O caminho completo da classe Cake passa a ser pastry.Cake
public abstract class Cake {
  // corpo da classe
}
```

