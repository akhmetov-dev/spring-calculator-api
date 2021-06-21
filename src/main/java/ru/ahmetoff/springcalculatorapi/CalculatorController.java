package ru.ahmetoff.springcalculatorapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculator")
    public Result calculation(@RequestParam(value = "operation", defaultValue = "sum") String operation, @RequestParam(value = "a", defaultValue = "0") String a, @RequestParam(value = "b", defaultValue = "0") String b) {
        if (operation.equals("sum")) {
            return new Result(Float.parseFloat(a) + Float.parseFloat(b));
        } else if (operation.equals("sub")) {
            return new Result(Float.parseFloat(a) - Float.parseFloat(b));
        } else if (operation.equals("mul")) {
            return new Result(Float.parseFloat(a) * Float.parseFloat(b));
        } else if (operation.equals("div")) {
            return new Result(Float.parseFloat(a) / Float.parseFloat(b));
        }
        return new Result(0);
    }
}
