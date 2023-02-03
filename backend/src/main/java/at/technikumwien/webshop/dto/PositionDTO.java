package at.technikumwien.webshop.dto;

import at.technikumwien.webshop.model.Position;

/**
 * DTO for {@link Position}
 */
public class PositionDTO {

    private Long id;
    private Long productId;
    private Integer quantity;

    // /////////////////////////////////////////////////////////////////////////
    // Getters and Setters
    // /////////////////////////////////////////////////////////////////////////

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
