package com.example.ajaym.callbackinterface;

import com.example.ajaym.callbackinterface.interfaces.LoginInterface;
import com.example.ajaym.callbackinterface.interfaces.LoginView;

public class LoginPresenter {


    LoginInterface loginInterface;

    LoginView loginViewx;

    LoginPresenter(LoginView loginView) {


// here we putting class object into interface because ..coz we have to send data (user ,pass) to class but we recieve data on interface ..so we have to follow this approach
        loginInterface = new LoginModel();   //getting loginModel object here so we could send send data username ,pass to it n a interface to talk to (jisme hume data daal kar milega)

        loginViewx =  loginView;    // getting the lovginView  here so that we could send result back to it

    }


    public void login(String username , String passwrod) {
        // we using this interface to communication with LoginModel n  the inteface below we sending we will get data on it
            loginInterface.login(username, passwrod, new LoginInterface.LoginCallBack() {
                @Override
                public void onLoginSuccess(Object object) {

                    loginViewx.onLoginSucess(object);    // we have to send data to Login View interface n data will be recieved interface in implemented


                }

                @Override
                public void onLoginFailed(String message) {

                    loginViewx.onLoginFailed(message);

                }
            });
    }


}
