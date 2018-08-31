package com.example.ajaym.callbackinterface;

import android.util.Log;

import com.example.ajaym.callbackinterface.interfaces.LoginInterface;

public class LoginModel implements LoginInterface{


    @Override
    public void login(String username, String password, LoginCallBack loginCallBack) {

        Log.d("ajaymehta",username +" "+password);

        loginCallBack.onLoginSuccess(new Integer(10));
        loginCallBack.onLoginFailed("Hello hello hello");



    }
}
