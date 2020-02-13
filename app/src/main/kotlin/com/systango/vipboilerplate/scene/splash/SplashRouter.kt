package com.systango.vipboilerplate.scene.splash

import android.content.Intent
import com.systango.vipboilerplate.scene.movie.list.MovieListActivity

/**
 * Created by Lalit Sharma on 5/5/19.
 */
class SplashRouter(private val activity: SplashActivity) : SplashContract.Router {
    override fun goToMovieList() {
        val intent = Intent(activity, MovieListActivity::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
}
