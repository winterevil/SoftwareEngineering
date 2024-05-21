public class Permanent implements ContractBuilder {
    private int ContractID;
    private double RentAmount;
    private int TenantID;
    private int PropertyID;

    @Override
    public ContractBuilder BuildContractId(int ContractID) {
        // TODO Auto-generated method stub
        this.ContractID = ContractID;
        return this;
    }

    @Override
    public ContractBuilder BuildTenantId(int TenantID) {
        // TODO Auto-generated method stub
        this.TenantID = TenantID;
        return this;
    }

    @Override
    public ContractBuilder BuildPropertyId(int PropertyID) {
        // TODO Auto-generated method stub
        this.PropertyID = PropertyID;
        return this;
    }

    @Override
    public ContractBuilder BuildRentAmount(double RentAmount) {
        // TODO Auto-generated method stub
        this.RentAmount = RentAmount;
        return this;
    }

    @Override
    public Contract SignContract() {
        // TODO Auto-generated method stub
        System.out.println(ContractID + " " + RentAmount);
        throw new UnsupportedOperationException("Unimplemented method 'SignContract'");
    }

    @Override
    public Contract build() {
        // TODO Auto-generated method stub
        return null;
    }

}