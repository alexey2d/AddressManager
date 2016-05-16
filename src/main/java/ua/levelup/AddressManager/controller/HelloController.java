package ua.levelup.AddressManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.levelup.AddressManager.dto.AddressDto;
import ua.levelup.AddressManager.model.Address;
import ua.levelup.AddressManager.model.Phone;
import ua.levelup.AddressManager.service.AddressService;
import ua.levelup.AddressManager.service.PhoneService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
// Start page
@Controller
@RequestMapping("/address")
public class HelloController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private PhoneService phoneService;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showMainPage() {
        return "inex";
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/create")
//    public String showForm() {
//        return "create";
//    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createAddress(@ModelAttribute AddressDto addressDto, Model model) {

        Address address = new Address();
        address.setContent(addressDto.getAdressContent());
//        address.setCountry(addressDto.getCountry());
        addressService.save(address);
        Phone phone = new Phone();
        phone.setPhoneNumber(addressDto.getPhoneNumber());
        phone.setPhoneNumber(addressDto.getPhoneNumber());
        phone.setAddress(address);
        phoneService.save(phone);
        List<Phone> list = new ArrayList<Phone>();

        address.setPhones(list);
        addressService.save(address);

        model.addAttribute("content", address.getContent());
//        model.addAttribute("country", address.getCountry());
        model.addAttribute("phones", address.getPhones());
        return "index";
    }

//        @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
//        @ResponseBody
//        public ResponseEntity deleteUser(@PathVariable long id) {
//            userService.deleteById(id);
//            return new ResponseEntity(HttpStatus.OK);
//        }
//
//        @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
//        @ResponseBody
//        public ResponseEntity findUser(@PathVariable long id) {
//            User user = userService.findById(id);
//            if (user == null) {
//                return new ResponseEntity(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity(user, HttpStatus.OK);
//        }
//
//
//        @RequestMapping(value = "/getAll", method = RequestMethod.GET)
//        public ResponseEntity getAllUsers() {
//            List<User> users = userService.getAllUsers();
//            if (CollectionUtils.isEmpty(users)) {
//                return new ResponseEntity(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity(users, HttpStatus.OK);
//        }

}
