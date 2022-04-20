# Information-Encryption

Programa para codificiar un mensaje ingresado en un archivo de texto, los tipos de codificación validos son Cesar y Reverso 

### Ejecución del proyecto. 

Para ejecutar el programa  el tipo de codificación y mensaje a codificar debe ser ingresado en el archivo de texto con nombre Information.txt, El formato debe ser primero el tipo de codificación y despues el mensaje separado por un -. Ejemplo: Cesar-Hola. 
El resultado de la codificación será guardado en un archivo txt con nombre result.txt

### Patrones de diseño. 

#### Patrón de diseño Singleton 

El patrón de diseño singleton fue aplicado en la clase OpenTxtMessage, con el objetivo de que solo se pueda crear una vez la instancia. La funcionalidad de la clase es obtener la información del archivo de texto. 

#### Patrón de diseño Factory. 

Otro patrón de diseño aplicado es  Factory, la interface es Encryption, las clases concretas que implementan la interfaz son: Cesar, InvalidTypeEncryption y Reverse, la clase de fabrica es EncryptionFactory y la clase de demostración/main es FactoryPatternInformationEncryption. 

