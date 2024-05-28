/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRequests;

/**
 *
 * @author Admin
 */
public class highPriorityConcrete extends requestProduct {

    public highPriorityConcrete() {
        super("Emergency", "28-05-2024", "Accept");
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }

}
