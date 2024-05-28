/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRequests;

/**
 *
 * @author Admin
 */
public class lowPriorityConcrete extends requestProduct {

    public lowPriorityConcrete() {
        super("Ignore", "28-05-2024", "Done");
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }

}
