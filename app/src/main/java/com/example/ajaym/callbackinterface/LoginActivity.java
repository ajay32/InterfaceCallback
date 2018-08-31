package com.example.ajaym.callbackinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ajaym.callbackinterface.interfaces.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // this is the one way to send inteface from one class to another... other is using abstract class (generic way)
        presenter = new LoginPresenter(this);   // here this is the implemented interface

        init();

    }

    private void init() {   //sending data coming from edittext

        presenter.login("ajaymn","123456");
    }

    // login view interface implemented we get result in a class where interface in implemented

    @Override
    public void onLoginSucess(Object object) {  //recieving data coming from  LoginModel through model  in LoginView interace object
        Log.d("ajamehta1", object +"  ");
    }

    @Override
    public void onLoginFailed(String msg) {

        Log.d("ajamehta2", msg +"  ");


    }
}
