package uy.edu.ort.devops.paymentsserviceexample.domain;

public class PaymentStatus {
    private String orderId;
    private boolean success;
    private String description;

    public PaymentStatus(String orderId, boolean success, String description) {
        this.orderId = orderId;
        this.success = success;
        this.description = description;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "orderId='" + orderId + '\'' +
                ", success=" + success +
                ", description='" + description + '\'' +
                '}';
    }
}
