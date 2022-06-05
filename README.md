In this assignment we would like to realize a variety of exceptions that are useful for checking passwords. Thereby, we are going to implement the following class hierarchy where Exception from the Java standard library is used as the root class.



For a password, the following minimal requirements may be enforced which, when absent, result in throwing an appropriate exception:

The password should have a minimal length, otherwise NotLongEnough exception is thrown.
The password should contain a minimal number of upper case letters, otherwise the exception NotEnoughUpperCase is thrown.
The password should contain a minimal number of lower case letters, otherwise the exception NotEnoughLowerCase is thrown.
The password should contain a minimal number of special characters, otherwise the exception NotEnoughspecial is thrown.
The password should contain a minimal number of digits, otherwise the exception NotEnoughNumber is thrown.
The password must not contain specific special characters, otherwise the exception IllegalCharException is thrown.
Here, we consider all characters between 'a' and 'z' as lower case, all characters between 'A' and 'Z' as upper case, all characters between '0' and '9' as digits and everything else as special.

For the concrete implementation the following requirements should hold:

The class NotEnoughException has the two attributes should and is. These represent the minimal number of characters of a given category which should be present in a password, and the strictly smaller number in the passward for which the exception is thrown. These attributes should be set by the constructor public NotEnoughException(int should, int is).
If is is not strictly less than should, an [IllegalArgumentException](https://docs.oracle.com/javase/7/docs/api/java/lang/ IllegalArgumentException.html) should be thrown.

Each subclass of NotEnoughException accepts in its constructor the same parameters which initialize the attributes of the superclass accordingly.
Each class should provide its own toString method and thereby return an error message which provides all relevant information (in particular, the known attribute values). For the class IllegalCharException use the provided method escapeSpecial.
Finally, implement a method checkFormat(String pwd) in Password which checks the passed argument for the for the criteria fixed in the constructor and, possibly, throws the appropriate exception.

Avoid code duplicates as much as possible by using the keyword super. All pre-existing member variables must be declared as final.
