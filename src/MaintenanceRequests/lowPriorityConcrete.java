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

    protected void processRequest(Request request) {
        System.out.println("Request denied");
    }

    @Override
    public void setPriority(String priority) {
        priority = "Ignore";
    }

    @Override
    public void setExpire(String expireDay) {
        expireDay = "28-05-2024";
    }

    @Override
    public void setStatus(String status) {
        status = "Done";
    }

}
