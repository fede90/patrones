# Repositorio de patrones de diseño

## Strategy
El escenario es un juego en donde hay diferentes tipos de patos (Criollo, Mallard, etc). Cada uno puede volar y emitir sonidos de forma diferente. Además se espera que los patos pueda evolucionar (cambiar la forma en que vuelan o emiten sonidos) de forma dinámica.

Con esta implementación la clase Duck no se encarga de implementar el comportamiento, lo delega en FlyBehavior/QuackBehavior. En Duck no nos interesa cómo vuele/emita sonido, solo importa que entienda el mensaje (método) correspondiente.

Si varias subclases de Duck implementan el mismo comportamiento y es necesario modificarlo solo vamos a estar alterando una clase, evitando duplicidad de código. 

Usando strategy podemos cambiar el comportamiento en forma dinámica. Podemos pasar de FlyWithWings a FlyNoWay fácilmente.

