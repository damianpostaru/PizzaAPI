package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-12T12:36:09.273Z")


public class Order   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("customer_id")
  private Integer customerId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("ordered_at")
  private OffsetDateTime orderedAt = null;

  @JsonProperty("takeaway")
  private Boolean takeaway = null;

  @JsonProperty("payment_type")
  private String paymentType = null;

  @JsonProperty("delivery_address")
  private Object deliveryAddress = null;

  @JsonProperty("pizzas")
  @Valid
  private List<Integer> pizzas = new ArrayList<Integer>();

  @JsonProperty("note")
  private String note = null;

  public Order id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Order customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "123456", required = true, value = "")
  @NotNull


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Order status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "In Progress", required = true, value = "")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Order orderedAt(OffsetDateTime orderedAt) {
    this.orderedAt = orderedAt;
    return this;
  }

  /**
   * Get orderedAt
   * @return orderedAt
  **/
  @ApiModelProperty(example = "2012-04-23T18:05:32.511Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getOrderedAt() {
    return orderedAt;
  }

  public void setOrderedAt(OffsetDateTime orderedAt) {
    this.orderedAt = orderedAt;
  }

  public Order takeaway(Boolean takeaway) {
    this.takeaway = takeaway;
    return this;
  }

  /**
   * Get takeaway
   * @return takeaway
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull


  public Boolean isTakeaway() {
    return takeaway;
  }

  public void setTakeaway(Boolean takeaway) {
    this.takeaway = takeaway;
  }

  public Order paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(example = "cash", required = true, value = "")
  @NotNull


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Order deliveryAddress(Object deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Object deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public Order pizzas(List<Integer> pizzas) {
    this.pizzas = pizzas;
    return this;
  }

  public Order addPizzasItem(Integer pizzasItem) {
    this.pizzas.add(pizzasItem);
    return this;
  }

  /**
   * Get pizzas
   * @return pizzas
  **/
  @ApiModelProperty(example = "[5,3,3,7,2]", required = true, value = "")
  @NotNull


  public List<Integer> getPizzas() {
    return pizzas;
  }

  public void setPizzas(List<Integer> pizzas) {
    this.pizzas = pizzas;
  }

  public Order note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(example = "No Onions", required = true, value = "")
  @NotNull


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.customerId, order.customerId) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.orderedAt, order.orderedAt) &&
        Objects.equals(this.takeaway, order.takeaway) &&
        Objects.equals(this.paymentType, order.paymentType) &&
        Objects.equals(this.deliveryAddress, order.deliveryAddress) &&
        Objects.equals(this.pizzas, order.pizzas) &&
        Objects.equals(this.note, order.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, status, orderedAt, takeaway, paymentType, deliveryAddress, pizzas, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderedAt: ").append(toIndentedString(orderedAt)).append("\n");
    sb.append("    takeaway: ").append(toIndentedString(takeaway)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    pizzas: ").append(toIndentedString(pizzas)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

