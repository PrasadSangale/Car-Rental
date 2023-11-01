//package com.carapplication.Service;
//
//import com.carapplication.Service.Controller.ServiceController;
//import com.carapplication.Service.Service.ServiceService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//@WebMvcTest(ServiceController.class)
//public class MyServiceTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ServiceService serviceService;
//
//    @Test
//    public void testGetCarService() throws Exception {
//        // Arrange
//        int id = 1;
//        String serviceName = "Oil Change";
//        double price = 50.00;
//        ServiceService serviceService = new ServiceService();
//        Mockito.when(this.serviceService.getServiceById((long) id)).thenReturn(serviceService);
//
//        // Act & Assert
//        mockMvc.perform(get("/cars/{id}", id))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value(id))
//                .andExpect(jsonPath("$.serviceName").value(serviceName))
//                .andExpect(jsonPath("$.price").value(price));
//    }
//}