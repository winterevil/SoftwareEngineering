/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRequests;

/**
 *
 * @author Admin
 */
public class lowPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct CreateRequest() {
        return new lowPriorityConcrete();
    }

    @Override
    public requestProduct processRequest() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
