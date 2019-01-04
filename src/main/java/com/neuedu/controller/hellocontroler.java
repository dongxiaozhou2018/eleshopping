package com.neuedu.controller;

import com.neuedu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class hellocontroler {

    @RequestMapping(value = "/hello")
//    @ResponseBody
    public String hello()
    {
        return "hello";
    }

//    @RequestMapping(value = "/world",method = RequestMethod.POST)
    @GetMapping(value = "/hello1")
//    @PostMapping(value = "/hello2")
    @ResponseBody
    public Person product(@RequestParam(value = "username",required = false,defaultValue = "王二小")String name)
    {
        Person person = new Person();
        person.setAge(1);
        person.setName(name);
        return person;
    }

//    @ResponseBody
//    public Person product(String username)
//    {
//        Person person = new Person();
//        person.setAge(1);
//        person.setName(username);
//        return person;
//    }


    @RequestMapping(value = "/person/{personId}/{name}")
    @ResponseBody
    public Person findPerson(@PathVariable(value = "personId")Integer id,@PathVariable(value = "name")String name )
    {
        Person person = new Person();
        person.setAge(id);
        person.setName(name);
        return person;
    }

}
