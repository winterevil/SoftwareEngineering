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

    @Override
    public void setPriority(String priority) {
        priority = "Medium";
    }

    @Override
    public void setExpire(String expireDay) {
        expireDay = "28-06-2024";
    }

    @Override
    public void setStatus(String status) {
        status = "Accepted";
    }

    public void processRequest(Request request) {
        System.out.println("Request accept, estimated completion date is 28-05-2024");
    }

}
