/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class RentalContract {
    private String contractId;
    private String propertyId;
    private String userId;
    private float rentAmount;

    public RentalContract() {
    }

    public RentalContract(String contractId, String propertyId, String userId, float rentAmount) {
        this.contractId = contractId;
        this.propertyId = propertyId;
        this.userId = userId;
        this.rentAmount = rentAmount;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(float rentAmount) {
        this.rentAmount = rentAmount;
    }
}
