package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Order;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SuccesfulOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-12T12:36:09.273Z")


public class SuccesfulOrder   {
  @JsonProperty("order")
  private Order order = null;

  @JsonProperty("ordered_at")
  private OffsetDateTime orderedAt = null;

  @JsonProperty("delivery_time")
  private OffsetDateTime deliveryTime = null;

  public SuccesfulOrder order(Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public SuccesfulOrder orderedAt(OffsetDateTime orderedAt) {
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

  public SuccesfulOrder deliveryTime(OffsetDateTime deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  /**
   * Get deliveryTime
   * @return deliveryTime
  **/
  @ApiModelProperty(example = "2012-04-23T18:25:43.511Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(OffsetDateTime deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccesfulOrder succesfulOrder = (SuccesfulOrder) o;
    return Objects.equals(this.order, succesfulOrder.order) &&
        Objects.equals(this.orderedAt, succesfulOrder.orderedAt) &&
        Objects.equals(this.deliveryTime, succesfulOrder.deliveryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, orderedAt, deliveryTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccesfulOrder {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderedAt: ").append(toIndentedString(orderedAt)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
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

