package com.systango.vipboilerplate.scene.movie.list


import com.systango.vipboilerplate.scene.movie.MovieModels

/**
 * Created by Lalit Sharma on 6/5/19.
 */
interface OnMovieItemClickedListener {
    fun onMovieItemClicked(movie: MovieModels.MovieViewModel)
}
