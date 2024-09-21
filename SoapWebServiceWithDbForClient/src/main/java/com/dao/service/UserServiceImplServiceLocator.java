/**
 * UserServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dao.service;

public class UserServiceImplServiceLocator extends org.apache.axis.client.Service implements com.dao.service.UserServiceImplService {

    public UserServiceImplServiceLocator() {
    }


    public UserServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserServiceImpl
    private java.lang.String UserServiceImpl_address = "http://localhost:8080/SoapWebServiceWithDb/services/UserServiceImpl";

    public java.lang.String getUserServiceImplAddress() {
        return UserServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserServiceImplWSDDServiceName = "UserServiceImpl";

    public java.lang.String getUserServiceImplWSDDServiceName() {
        return UserServiceImplWSDDServiceName;
    }

    public void setUserServiceImplWSDDServiceName(java.lang.String name) {
        UserServiceImplWSDDServiceName = name;
    }

    public com.dao.service.UserServiceImpl getUserServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserServiceImpl(endpoint);
    }

    public com.dao.service.UserServiceImpl getUserServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dao.service.UserServiceImplSoapBindingStub _stub = new com.dao.service.UserServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserServiceImplEndpointAddress(java.lang.String address) {
        UserServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dao.service.UserServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dao.service.UserServiceImplSoapBindingStub _stub = new com.dao.service.UserServiceImplSoapBindingStub(new java.net.URL(UserServiceImpl_address), this);
                _stub.setPortName(getUserServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserServiceImpl".equals(inputPortName)) {
            return getUserServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.dao.com", "UserServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.dao.com", "UserServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserServiceImpl".equals(portName)) {
            setUserServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
