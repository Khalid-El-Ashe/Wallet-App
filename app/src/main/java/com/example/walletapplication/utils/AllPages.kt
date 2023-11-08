package com.example.walletapplication.utils

sealed class AllPages(val title: String, val rout: String) {
    object Splash : AllPages(title = "Splash", rout = "Splash")
    object Start1 : AllPages(title = "Start1", rout = "Start1")
    object Start2 : AllPages(title = "Start2", rout = "Start2")
    object Start3 : AllPages(title = "Start3", rout = "Start3")
    object Login : AllPages(title = "Login", rout = "Login")
    object Register : AllPages(title = "Register", rout = "Register")
    object OTP : AllPages(title = "OTP", rout = "OTP")
    object Fingerprint : AllPages(title = "Fingerprint", rout = "Fingerprint")
    object PasswordRecovery : AllPages(title = "PasswordRecovery", rout = "PasswordRecovery")
    object VerifyCode : AllPages(title = "VerifyCode", rout = "VerifyCode")
    object ResetPassword : AllPages(title = "ResetPassword", rout = "ResetPassword")
    object ChoiceCard : AllPages(title = "ChoiceCard", rout = "ChoiceCard")
    object CardInfo : AllPages(title = "CardInfo", rout = "CardInfo")
    object CardInfoCVV : AllPages(title = "CardCVV", rout = "CardCVV")
    object CardAddedSuccessfully : AllPages(title = "CardAddedSuccessfully", rout = "CardAddedSuccessfully")
    object Home : AllPages(title = "Home", rout = "Home")
    object Profile : AllPages(title = "Profile", rout = "Profile")
}
