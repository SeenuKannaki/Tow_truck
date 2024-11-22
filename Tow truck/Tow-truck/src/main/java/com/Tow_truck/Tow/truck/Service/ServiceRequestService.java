package com.Tow_truck.Tow.truck.Service;


import com.Tow_truck.Tow.truck.Dto.ServiceRequestDto;
import com.Tow_truck.Tow.truck.Entity.ServiceRequest;
import com.Tow_truck.Tow.truck.MapperUtil.MapperUtil;
import com.Tow_truck.Tow.truck.Repository.ServiceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestRepository repository;

    @Autowired
    private MapperUtil mapperUtil;

    // Get all service requests
    public List<ServiceRequestDto> getAllRequests() {
        return repository.findAll().stream()
                .map(mapperUtil::mapToDto)
                .collect(Collectors.toList());
    }

    // Get a specific service request
    public ServiceRequestDto getRequestById(Long id) {
        ServiceRequest request = repository.findById(id);
        if (request == null) {
            throw new IllegalArgumentException("Service Request not found for ID: " + id);
        }
        return mapperUtil.mapToDto(request);
    }

    // Create a new service request
    public ServiceRequestDto createRequest(ServiceRequestDto requestDto) {
        ServiceRequest request = mapperUtil.mapToEntity(requestDto);
        request.setStatus("Pending");
        repository.save(request);
        return mapperUtil.mapToDto(request);
    }

    // Update a service request
    public ServiceRequestDto updateRequest(Long id, ServiceRequestDto requestDto) {
        ServiceRequest existingRequest = repository.findById(id);
        if (existingRequest == null) {
            throw new IllegalArgumentException("Service Request not found for ID: " + id);
        }
        existingRequest.setServiceType(requestDto.getServiceType());
        existingRequest.setVehicleDetails(requestDto.getVehicleDetails());
        existingRequest.setLocation(requestDto.getLocation());
        existingRequest.setStatus(requestDto.getStatus());
        repository.update(existingRequest);
        return mapperUtil.mapToDto(existingRequest);
    }

    // Delete a service request
    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }
}
