package com.Tow_truck.Tow.truck.Controller;

import com.Tow_truck.Tow.truck.Dto.ServiceRequestDto;
import com.Tow_truck.Tow.truck.Service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/api/service-requests")
    public class ServiceRequestController {

        @Autowired
        private ServiceRequestService service;

        // Get all service requests
        @GetMapping
        public ResponseEntity<List<ServiceRequestDto>> getAllRequests() {
            List<ServiceRequestDto> requests = service.getAllRequests();
            return ResponseEntity.ok(requests);
        }

        // Get a single service request by ID
        @GetMapping("/{id}")
        public ResponseEntity<ServiceRequestDto> getRequestById(@PathVariable Long id) {
            ServiceRequestDto request = service.getRequestById(id);
            return ResponseEntity.ok(request);
        }

        // Create a new service request
        @PostMapping
        public ResponseEntity<ServiceRequestDto> createRequest(@RequestBody ServiceRequestDto requestDto) {
            ServiceRequestDto createdRequest = service.createRequest(requestDto);
            return ResponseEntity.ok(createdRequest);
        }

        // Update an existing service request
        @PutMapping("/{id}")
        public ResponseEntity<ServiceRequestDto> updateRequest(@PathVariable Long id, @RequestBody ServiceRequestDto updatedDto) {
            ServiceRequestDto updatedRequest = service.updateRequest(id, updatedDto);
            return ResponseEntity.ok(updatedRequest);
        }

        // Delete a service request
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteRequest(@PathVariable Long id) {
            service.deleteRequest(id);
            return ResponseEntity.noContent().build();
        }
    }
