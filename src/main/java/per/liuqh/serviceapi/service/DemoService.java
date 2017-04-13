package per.liuqh.serviceapi.service;

import java.util.List;

import per.liuqh.serviceapi.entity.User;  

public interface DemoService {  
  
    String sayHello(String name);  
  
    public List<User> getUsers();

	void test3() throws Exception;

	void doTest() throws Exception;  
  
}  