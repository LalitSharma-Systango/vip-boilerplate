package com.systango.vipboilerplate.scene.movie.list

import android.content.Intent
import com.systango.vipboilerplate.common.Constants
import com.systango.vipboilerplate.scene.movie.MovieModels
import com.systango.vipboilerplate.scene.movie.details.MovieDetailsActivity

/**
 * Created by Lalit Sharma on 5/5/19.
 */
class MovieListRouter(private val activity: MovieListActivity) : MovieListContract.Router {
    override fun goToMovieDetails(movie: MovieModels.MovieViewModel) {
        val intent = Intent(activity, MovieDetailsActivity::class.java)
        intent.putExtra(Constants.IntentExtras.MOVIE, movie)
        activity.startActivity(intent)
    }
}
