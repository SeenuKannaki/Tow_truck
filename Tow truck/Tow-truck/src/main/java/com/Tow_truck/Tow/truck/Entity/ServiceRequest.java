package com.Tow_truck.Tow.truck.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "service_request")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String serviceType;

    @Column(nullable = false)
    private String vehicleDetails;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Timestamp requestTime;

    @Column(nullable = false)
    private String status;

    public ServiceRequest() {
        // Automatically set the request time when the object is created
        this.requestTime = new Timestamp(System.currentTimeMillis());
    }
}
