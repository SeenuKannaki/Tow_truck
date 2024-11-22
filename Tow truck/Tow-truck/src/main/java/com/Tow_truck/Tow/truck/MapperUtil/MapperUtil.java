package com.Tow_truck.Tow.truck.MapperUtil;

import com.Tow_truck.Tow.truck.Dto.ServiceRequestDto;
import com.Tow_truck.Tow.truck.Entity.ServiceRequest;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {
    public ServiceRequestDto mapToDto(ServiceRequest request) {
        ServiceRequestDto dto = new ServiceRequestDto();
        dto.setId(request.getId());
        dto.setServiceType(request.getServiceType());
        dto.setVehicleDetails(request.getVehicleDetails());
        dto.setLocation(request.getLocation());
        dto.setStatus(request.getStatus());
        return dto;
    }

    public ServiceRequest mapToEntity(ServiceRequestDto dto) {
        ServiceRequest request = new ServiceRequest();
        request.setId(dto.getId());
        request.setServiceType(dto.getServiceType());
        request.setVehicleDetails(dto.getVehicleDetails());
        request.setLocation(dto.getLocation());
        request.setStatus(dto.getStatus());
        return request;
    }
}
