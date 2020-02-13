package com.systango.vipboilerplate.scene.splash

import com.systango.vipboilerplate.common.base.Configurator
import com.systango.vipboilerplate.network.ApiClient

/**
 * Created by Lalit Sharma on 7/5/19.
 */
class SplashConfigurator : Configurator<SplashActivity> {
    override fun configure(view: SplashActivity) {
        val router = SplashRouter(view)
        view.router = router
    }
}