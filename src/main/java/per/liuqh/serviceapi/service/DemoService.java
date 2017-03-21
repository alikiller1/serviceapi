package per.liuqh.serviceapi.service;

import java.util.List;

import per.liuqh.serviceapi.entity.User;


public interface DemoService {  
  
    String sayHello(String name);  
  
    public List<User> getUsers();  
    
    public void test3()throws Exception;
    
    public void doTest()throws Exception;
  
}  