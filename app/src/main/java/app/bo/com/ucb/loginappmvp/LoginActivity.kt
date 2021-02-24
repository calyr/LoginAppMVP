package app.bo.com.ucb.loginappmvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), ILoginView {

    lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginPresenter = LoginPresenter(this)

        btnLogin.setOnClickListener {
            sendData(userName.text.toString(), userPassword.text.toString())
        }
    }

    override fun notifError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    override fun sendData(name: String, password: String) {
        loginPresenter.login(name, password)
    }

    override fun gotToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}