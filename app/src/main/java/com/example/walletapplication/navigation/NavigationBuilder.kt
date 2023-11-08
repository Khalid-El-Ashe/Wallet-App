package com.example.walletapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.walletapplication.ui.compose.CardAddedSuccessfullyScreen
import com.example.walletapplication.ui.compose.CardCVVScreen
import com.example.walletapplication.ui.compose.CardIntoScreen
import com.example.walletapplication.ui.compose.ChoiceCardScreen
import com.example.walletapplication.ui.compose.HomeScreen
import com.example.walletapplication.ui.compose.SplashScreen
import com.example.walletapplication.ui.compose.authentication.FingerprintScreen
import com.example.walletapplication.ui.compose.authentication.OTPScreen
import com.example.walletapplication.ui.compose.authentication.PasswordRecoveryScreen
import com.example.walletapplication.ui.compose.authentication.ResetPasswordScreen
import com.example.walletapplication.ui.compose.authentication.VerifyCodeScreen
import com.example.walletapplication.ui.compose.loingAndRegister.LoginScreen
import com.example.walletapplication.ui.compose.loingAndRegister.RegisterScreen
import com.example.walletapplication.ui.compose.starts.StartOneScreen
import com.example.walletapplication.ui.compose.starts.StartThreeScreen
import com.example.walletapplication.ui.compose.starts.StartTowScreen
import com.example.walletapplication.utils.AllPages

@Composable
fun NavigationBuilder(controller: NavHostController) {
    NavHost(navController = controller, startDestination = AllPages.Home.rout) {
        composable(AllPages.Splash.rout) {
            SplashScreen(navController = controller)
        }
        composable(AllPages.Start1.rout) {
            StartOneScreen(navController = controller)
        }
        composable(AllPages.Start2.rout) {
            StartTowScreen(navController = controller)
        }
        composable(AllPages.Start3.rout) {
            StartThreeScreen(navController = controller)
        }
        composable(AllPages.Login.rout) {
            LoginScreen(navController = controller)
        }
        composable(AllPages.Register.rout) {
            RegisterScreen(navController = controller)
        }
        composable(AllPages.OTP.rout) {
            OTPScreen()
        }
        composable(AllPages.Fingerprint.rout) {
            FingerprintScreen()
        }
        composable(AllPages.PasswordRecovery.rout) {
            PasswordRecoveryScreen()
        }
        composable(AllPages.VerifyCode.rout) {
            VerifyCodeScreen()
        }
        composable(AllPages.ResetPassword.rout) {
            ResetPasswordScreen()
        }
        composable(AllPages.ChoiceCard.rout) {
            ChoiceCardScreen(navController = controller)
        }
        composable(AllPages.CardInfo.rout) {
            CardIntoScreen(navController = controller)
        }
        composable(AllPages.CardInfoCVV.rout) {
            CardCVVScreen(navController = controller)
        }
        composable(AllPages.CardAddedSuccessfully.rout) {
            CardAddedSuccessfullyScreen(navController = controller)
        }
        composable(AllPages.Home.rout) {
            HomeScreen(navController = controller)
        }
    }
}