package com.systango.vipboilerplate.common.base

/**
 * Created by Lalit Sharma on 5/5/19.
 */
interface Mapper<E, T> {
    fun mapFrom(from: E): T
}