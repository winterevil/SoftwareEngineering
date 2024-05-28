/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRequests;

/**
 *
 * @author Admin
 */
public class highPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct CreateRequest() {
        return new highPriorityConcrete();
    }

    @Override
    public requestProduct processRequest() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
