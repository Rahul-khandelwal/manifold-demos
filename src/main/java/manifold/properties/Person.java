package manifold.properties;

import manifold.ext.props.rt.api.var;
import manifold.ext.props.rt.api.val;
import manifold.ext.props.rt.api.get;
import manifold.ext.props.rt.api.set;
import manifold.params.Country;

public class Person {
  @var
  String name;

  @val
  String email;

  @get
  @set
  int age;

  Country country;

  public Person(String email = "N/A", Country country) {
    this.email = email;
    this.country = country;
  }

  public void setCountry(Country country = new Country("N/A")) {
    this.country = country;
  }

  public Country getCountry() {
    return country;
  }
}
