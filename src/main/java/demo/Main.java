package demo;

import manifold.params.Country;
import manifold.properties.Person;

class Main {
  public static void main(String[] args) {
    String test = null;
    if (test.isNullOrBlank()) {
      test.print();
    }

    if (test.isEmpty()) {
      System.out.println("Empty String");
    }

    Person person = new Person(email:"test@xyz.com", country:new Country("India"));
    person.name = "John Doe";
    person.age = 12;
    System.out.println(person.name);
    System.out.println(person.email);
    System.out.println(person.age);
    System.out.println(person.getCountry());

    Country USA = new Country("USA");
    System.out.println(USA.language());
    System.out.println(USA.timezone);
  }
}