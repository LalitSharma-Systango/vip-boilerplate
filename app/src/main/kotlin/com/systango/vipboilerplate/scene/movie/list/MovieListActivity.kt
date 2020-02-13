package com.systango.vipboilerplate.scene.movie.list

import android.content.res.Resources
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.systango.vipboilerplate.R
import com.systango.vipboilerplate.common.ErrorViewModel
import com.systango.vipboilerplate.common.base.BaseActivity
import com.systango.vipboilerplate.scene.movie.MovieModels
import com.systango.vipboilerplate.utils.SpacesItemDecoration
import com.systango.vipboilerplate.utils.ToastUtils
import kotlinx.android.synthetic.main.activity_movie_list.*


class MovieListActivity : BaseActivity(), MovieListContract.View, OnMovieItemClickedListener {
    internal lateinit var interactor: MovieListContract.Interactor
    internal lateinit var router: MovieListContract.Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)
        init()
    }

    private fun init() {
        MovieListConfigurator().configure(this)
        interactor.loadMovies()
    }

    private fun initRecyclerView(movies: List<MovieModels.MovieViewModel>) {
        val movieAdapter = MovieAdapter(context, movies)
        movieAdapter.setOnMovieItemClickedListener(this)
        val spacingInPixels = resources.getDimensionPixelSize(R.dimen.item_spacing)
        val spacesItemDecoration = SpacesItemDecoration(spacingInPixels)
        rvMovies.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = movieAdapter
        }
        rvMovies.addItemDecoration(spacesItemDecoration)
    }

    override fun showMovies(viewModel: MovieModels.ViewModel) {
        initRecyclerView(viewModel.movies)
    }

    override fun showError(viewModel: ErrorViewModel) {
        ToastUtils.showLongToast(context, viewModel.errorMessage)
    }

    override fun getResourcesInstance(): Resources {
        return resources
    }

    override fun onMovieItemClicked(movie: MovieModels.MovieViewModel) {
        router.goToMovieDetails(movie)
    }

    override fun onDestroy() {
        interactor.clear()
        super.onDestroy()
    }
}