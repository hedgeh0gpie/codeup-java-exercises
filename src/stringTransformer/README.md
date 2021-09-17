================================= WARM UP
Create an abstract class, StringTransformer:
- add a protected string variable called ‘str’
- add a constructor to set the variable
- add public add getters and setters for this variable
- add an abstract method called ‘transform()’ that returns a string
  Create a subclass, UpperCaseStringTransformer, that extends StringTransformer:
- define a constructor that accepts a string and sets the str variable to that value using the parent constructor
- override the transform method to return an output of the string in all uppercase
  Create a subclass, ReverseStringTransformer, that extends StringTransformer:
- define a constructor that accepts a string and sets the str variable to that value using the parent constructor
- override the transform method to return an output of the characters of the ‘str’ property in reverse order
  Create a class, StringTransformerTest, with a main method:
- add a main method to create a instances of both subclasses of the parent type with test strings
- use a loop to print out the transformed versions of the strings