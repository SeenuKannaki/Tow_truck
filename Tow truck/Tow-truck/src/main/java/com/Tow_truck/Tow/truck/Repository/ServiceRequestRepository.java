package com.Tow_truck.Tow.truck.Repository;

import com.Tow_truck.Tow.truck.Entity.ServiceRequest;

import java.util.List;

public interface ServiceRequestRepository {
    ServiceRequest save(ServiceRequest serviceRequest);
    ServiceRequest findById(Long id);
    List<ServiceRequest> findAll();
    ServiceRequest update(ServiceRequest serviceRequest);
    void deleteById(Long id);
}
