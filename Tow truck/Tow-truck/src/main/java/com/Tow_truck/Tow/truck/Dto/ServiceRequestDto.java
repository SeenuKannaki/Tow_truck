package com.Tow_truck.Tow.truck.Dto;

import lombok.Data;

@Data
public class ServiceRequestDto {

    private Long id;
    private String serviceType;
    private String vehicleDetails;
    private String location;
    private String status;

}
