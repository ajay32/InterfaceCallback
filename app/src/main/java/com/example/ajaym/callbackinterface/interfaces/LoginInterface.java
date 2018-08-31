package com.example.ajaym.callbackinterface.interfaces;

public interface LoginInterface {

    String username = "ajaym";
    String password = "123456";


    void login(String username, String password, LoginCallBack loginCallBack);


    interface LoginCallBack {  // we have to create same sub interface as LoginView here

        void onLoginSuccess(Object object);

        void onLoginFailed(String message);

    }

}
