/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Risina
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(store.service.StoreBookingFacadeREST.class);
        resources.add(store.service.StoreCustomerFacadeREST.class);
        resources.add(store.service.StoreDvdCopyFacadeREST.class);
        resources.add(store.service.StoreDvdFacadeREST.class);
        resources.add(store.service.StoreEmployeeFacadeREST.class);
    }
    
}
