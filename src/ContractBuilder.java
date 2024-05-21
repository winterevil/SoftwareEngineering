/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public interface ContractBuilder {

    public ContractBuilder BuildContractId(int ContractID);

    public ContractBuilder BuildPropertyId(int PropertyID);

    public ContractBuilder BuildTenantId(int TenantID);

    public ContractBuilder BuildRentAmount(double RentAmount);

    public Contract SignContract();

    Contract build();
}
