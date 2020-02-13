package com.systango.vipboilerplate.scene.splash

import com.systango.vipboilerplate.common.base.BaseView

/**
 * Created by Lalit Sharma on 7/5/19.
 * Contains interfaces of VIP components
 */
class SplashContract {

    interface View : BaseView {

    }

    interface Router {
        fun goToMovieList()
    }
}