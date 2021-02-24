package app.bo.com.ucb.loginappmvp

class LoginPresenter(val view: ILoginView) : ILoginPresenter {

    override fun login(name: String, password: String) {
        if (name.isEmpty()) {
            view.notifError("El campo nombre no puede estar vació")
        } else if ( password.isEmpty()) {
            view.notifError("El campo password no puede estar vacio")
        } else {
           view.gotToHome()
        }

    }
}