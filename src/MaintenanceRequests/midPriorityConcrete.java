/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRequests;

/**
 *
 * @author Admin
 */
public class midPriorityConcrete extends requestProduct {

    public midPriorityConcrete() {
        super("Medium", "28-06-2024", "Accepted");
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is 28-05-2024");
    }

}
