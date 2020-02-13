package com.systango.vipboilerplate.common.base

/**
 * Created by Lalit Sharma on 5/5/19.
 * Parent configurator interface
 */
interface Configurator<T : BaseView> {
    fun configure(view: T)
}