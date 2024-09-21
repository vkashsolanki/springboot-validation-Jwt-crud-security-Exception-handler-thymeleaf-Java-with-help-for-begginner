package com.dao.service;

public class UserServiceImplProxy implements com.dao.service.UserServiceImpl {
  private String _endpoint = null;
  private com.dao.service.UserServiceImpl userServiceImpl = null;
  
  public UserServiceImplProxy() {
    _initUserServiceImplProxy();
  }
  
  public UserServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceImplProxy();
  }
  
  private void _initUserServiceImplProxy() {
    try {
      userServiceImpl = (new com.dao.service.UserServiceImplServiceLocator()).getUserServiceImpl();
      if (userServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userServiceImpl != null)
      ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dao.service.UserServiceImpl getUserServiceImpl() {
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl;
  }
  
  public java.lang.String addUser(java.lang.Object user1) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.addUser(user1);
  }
  
  
}