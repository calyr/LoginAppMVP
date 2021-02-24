package app.bo.com.ucb.loginappmvp

interface ILoginView {
    fun notifError(error: String)
    fun sendData(name: String, password: String)
    fun gotToHome()
}