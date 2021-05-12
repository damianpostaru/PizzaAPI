package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pizza
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-12T12:36:09.273Z")


public class Pizza   {
  @JsonProperty("pizza_id")
  private Integer pizzaId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("vegetarian")
  private Boolean vegetarian = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("toppings")
  @Valid
  private List<String> toppings = new ArrayList<String>();

  public Pizza pizzaId(Integer pizzaId) {
    this.pizzaId = pizzaId;
    return this;
  }

  /**
   * Get pizzaId
   * @return pizzaId
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  @NotNull


  public Integer getPizzaId() {
    return pizzaId;
  }

  public void setPizzaId(Integer pizzaId) {
    this.pizzaId = pizzaId;
  }

  public Pizza name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "margarita", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pizza vegetarian(Boolean vegetarian) {
    this.vegetarian = vegetarian;
    return this;
  }

  /**
   * Get vegetarian
   * @return vegetarian
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull


  public Boolean isVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(Boolean vegetarian) {
    this.vegetarian = vegetarian;
  }

  public Pizza price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "12.5", required = true, value = "")
  @NotNull


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Pizza toppings(List<String> toppings) {
    this.toppings = toppings;
    return this;
  }

  public Pizza addToppingsItem(String toppingsItem) {
    this.toppings.add(toppingsItem);
    return this;
  }

  /**
   * Get toppings
   * @return toppings
  **/
  @ApiModelProperty(example = "[\"Mozzarella\",\"Tomatoes\",\"Basil\"]", required = true, value = "")
  @NotNull


  public List<String> getToppings() {
    return toppings;
  }

  public void setToppings(List<String> toppings) {
    this.toppings = toppings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pizza pizza = (Pizza) o;
    return Objects.equals(this.pizzaId, pizza.pizzaId) &&
        Objects.equals(this.name, pizza.name) &&
        Objects.equals(this.vegetarian, pizza.vegetarian) &&
        Objects.equals(this.price, pizza.price) &&
        Objects.equals(this.toppings, pizza.toppings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pizzaId, name, vegetarian, price, toppings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pizza {\n");
    
    sb.append("    pizzaId: ").append(toIndentedString(pizzaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    toppings: ").append(toIndentedString(toppings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

