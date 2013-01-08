package com.share.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-06T10:55:57.281+08:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://webservice.share.com/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "say", targetNamespace = "http://webservice.share.com/", className = "com.share.webservice.Say")
    @WebMethod
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://webservice.share.com/", className = "com.share.webservice.SayResponse")
    public java.lang.String say(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayUserName", targetNamespace = "http://webservice.share.com/", className = "com.share.webservice.SayUserName")
    @WebMethod
    @ResponseWrapper(localName = "sayUserNameResponse", targetNamespace = "http://webservice.share.com/", className = "com.share.webservice.SayUserNameResponse")
    public java.lang.String sayUserName(
        @WebParam(name = "user", targetNamespace = "")
        com.share.webservice.client.User user
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findUsers", targetNamespace = "http://webservice.share.com/", className = "com.share.webservice.FindUsers")
    @WebMethod
    @ResponseWrapper(localName = "findUsersResponse", targetNamespace = "http://webservice.share.com/", className = "com.share.webservice.FindUsersResponse")
    public com.share.webservice.ListObject findUsers();
}
