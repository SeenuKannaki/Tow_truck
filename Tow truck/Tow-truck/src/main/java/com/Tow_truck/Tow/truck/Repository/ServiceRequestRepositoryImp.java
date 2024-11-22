package com.Tow_truck.Tow.truck.Repository;

import com.Tow_truck.Tow.truck.Entity.ServiceRequest;
import com.Tow_truck.Tow.truck.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class ServiceRequestRepositoryImp implements ServiceRequestRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ServiceRequest save(ServiceRequest serviceRequest) {
        entityManager.persist(serviceRequest);
        return serviceRequest;
    }

    @Override
    public ServiceRequest findById(Long id) {
        return entityManager.find(ServiceRequest.class, id);
    }

    @Override
    public List<ServiceRequest> findAll() {
        return entityManager.createQuery("SELECT sr FROM ServiceRequest sr", ServiceRequest.class).getResultList();
    }

    @Override
    public ServiceRequest update(ServiceRequest serviceRequest) {
        return entityManager.merge(serviceRequest);
    }

    @Override
    public void deleteById(Long id) {
        ServiceRequest serviceRequest = findById(id);
        if(serviceRequest != null){
            entityManager.remove(serviceRequest);
        }
    }

}
