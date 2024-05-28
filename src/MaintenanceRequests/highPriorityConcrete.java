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

    @Override
    public void setPriority(String priority) {
        priority = "Emergency";
    }

    @Override
    public void setExpire(String expireDay) {
        expireDay = "28-05-2024";
    }

    @Override
    public void setStatus(String status) {
        status = "Accept";
    }

    protected void processRequest(Request request) {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }

}
