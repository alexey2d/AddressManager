package ua.levelup.AddressManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.levelup.AddressManager.service.AddressService;
import ua.levelup.AddressManager.service.PhoneService;

/**
 * Created by java on 15.05.2016.
 */
// Start page
@Controller
@RequestMapping("/hello") // то, что добавится к урлу localhost:8080/hello/
public class HelloController {
    @Autowired
    AddressService addressService; // ссылаться надо только на интерфейсы
    PhoneService phoneService;

}
