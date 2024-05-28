/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRequests;

/**
 *
 * @author Admin
 */
public class midPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct CreateRequest() {
        return new midPriorityConcrete();
    }

    @Override
    public requestProduct processRequest() {
        requestProduct request = CreateRequest();
        request.processRequest();
        return request;
    }
}
