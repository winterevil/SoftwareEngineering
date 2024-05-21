public class Client {
    public static void main(String[] args) {
        requestCreateRentalContract();
    }

    public static void requestCreateRentalContract() {
        // Implement logic to prepare and submit a request
        Contract contract = new Permanent().BuildContractId(1).BuildTenantId(1).BuildPropertyId(1).BuildRentAmount(1).SignContract();
    }
}