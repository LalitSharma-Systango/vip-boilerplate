package com.systango.vipboilerplate.scene.movie.list

import com.systango.vipboilerplate.common.Error
import com.systango.vipboilerplate.common.ErrorViewModel
import com.systango.vipboilerplate.common.base.BaseView
import com.systango.vipboilerplate.scene.movie.MovieModels
import io.reactivex.Observable

/**
 * Created by Lalit Sharma on 5/5/19.
 * Contains interfaces of VIP components
 */
class MovieListContract {
    interface View : BaseView {
        fun showMovies(viewModel: MovieModels.ViewModel)
        fun showError(viewModel: ErrorViewModel)
    }

    interface Router {
        fun goToMovieDetails(movie: MovieModels.MovieViewModel)
    }

    interface Presenter {
        fun presentMovies(movies: List<MovieModels.Movie>)
        fun presentError(error: Error)
    }

    interface Interactor {
        fun loadMovies()
        fun searchMovie(request: MovieModels.Request)
        fun clear()
    }

    interface Repository {
        fun loadMovies(): Observable<List<MovieModels.Movie>>
    }
}