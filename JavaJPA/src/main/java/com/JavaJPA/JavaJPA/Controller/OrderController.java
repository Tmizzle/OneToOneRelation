package com.JavaJPA.JavaJPA.Controller;

import com.JavaJPA.JavaJPA.Repo.AccountSettingsRepo;
import com.JavaJPA.JavaJPA.Repo.CountryRepo;
import com.JavaJPA.JavaJPA.dto.orderRequest;
import com.JavaJPA.JavaJPA.entity.AccountSettings;
import com.JavaJPA.JavaJPA.entity.Country;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private AccountSettingsRepo accountSettingsRepo;
    @Autowired
    private CountryRepo countryRepo;

    @PostMapping(path = "/placeOrder")
    public AccountSettings placeOrder(@RequestBody orderRequest request){
        return accountSettingsRepo.save(request.getAccountSettings());
    }
    @GetMapping(path = "/findAllOrders")
    public List<AccountSettings> findAllOrders(){
        return accountSettingsRepo.findAll();
    }
}
