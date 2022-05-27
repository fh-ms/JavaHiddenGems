package com.examples.autoservice;

import com.google.auto.service.AutoService;

@AutoService(CarService.class)
public class PaganiCarService implements CarService {
    @Override
    public String retrieveBrand() {
        return "Pagani";
    }
}
