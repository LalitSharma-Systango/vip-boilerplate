package com.systango.vipboilerplate.common.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.sentry.Sentry

/**
 * Created by Lalit Sharma on 5/5/19.
 * Parent activity of all other activities which can be used for generic purpose
 * i.e. tracking screen events
 */
abstract class BaseActivity : AppCompatActivity() {
    protected lateinit var TAG: String
    protected lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = localClassName
        context = this
    }

    override fun onStart() {
        super.onStart()
        Sentry.capture("$TAG started")
    }

    override fun onStop() {
        super.onStop()
        Sentry.capture("$TAG stopped")
    }
}