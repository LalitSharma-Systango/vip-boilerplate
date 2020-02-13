package com.systango.vipboilerplate.scene.movie.list

import com.systango.vipboilerplate.R
import com.systango.vipboilerplate.common.Error
import com.systango.vipboilerplate.common.ErrorViewModel
import com.systango.vipboilerplate.scene.movie.MovieModels

/**
 * Created by Lalit Sharma on 5/5/19.
 */
class MovieListPresenter(private val view: MovieListContract.View) : MovieListContract.Presenter {
    override fun presentMovies(movies: List<MovieModels.Movie>) {
        val isError = movies.isEmpty()
        if (isError) {
            val viewModel =
                ErrorViewModel(view.getResourcesInstance().getString(R.string.no_movie_found))
            view.showError(viewModel)
        } else {
            val movieViewModels =
                movies.map { MovieModels.MovieViewModel(it.id, it.title, it.posterPath, it.overview, false) }
            val instruction = view.getResourcesInstance().getString(R.string.tap_to_view_details)
            val viewModel = MovieModels.ViewModel(instruction, movieViewModels)
            view.showMovies(viewModel)
        }
    }

    override fun presentError(error: Error) {
        val viewModel =
            ErrorViewModel(error.message)
        view.showError(viewModel)
    }
}