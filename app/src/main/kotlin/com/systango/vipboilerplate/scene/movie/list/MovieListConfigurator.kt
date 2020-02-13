package com.systango.vipboilerplate.scene.movie.list

import com.systango.vipboilerplate.common.base.Configurator
import com.systango.vipboilerplate.network.ApiClient

/**
 * Created by Lalit Sharma on 6/5/19.
 */
class MovieListConfigurator : Configurator<MovieListActivity> {
    override fun configure(view: MovieListActivity) {
        val presenter = MovieListPresenter(view)
        val repository = MovieListRepository(ApiClient.movieApiService)
        val interactor = MovieListInteractor(presenter, repository)
        val router = MovieListRouter(view)
        view.interactor = interactor
        view.router = router
    }
}