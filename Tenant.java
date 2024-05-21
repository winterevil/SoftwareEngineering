/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Tenant {
    private User user;
    private RentalContract rentalContract;

    public Tenant() {
    }

    public Tenant(User user, RentalContract rentalContract) {
        this.user = user;
        this.rentalContract = rentalContract;
    }

    public boolean requestCreateRentalContract(String contractId, String propertyId, String userId, float rentAmount) {
        if (rentalContract == null) {
            rentalContract = new RentalContract(contractId, propertyId, userId, rentAmount);
            return true;
        }
        return false;
    }

    public boolean requestTerminateRentalContract() {
        if (rentalContract != null) {
            rentalContract = null;
            return true;
        }
        return false;
    }
}
