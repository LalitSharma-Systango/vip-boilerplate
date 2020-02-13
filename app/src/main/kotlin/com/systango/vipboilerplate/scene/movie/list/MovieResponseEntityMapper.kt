package com.systango.vipboilerplate.scene.movie.list

import com.systango.vipboilerplate.common.base.Mapper
import com.systango.vipboilerplate.network.response.MovieResponse
import com.systango.vipboilerplate.scene.movie.MovieModels

/**
 * Created by Lalit Sharma on 5/5/19.
 */
class MovieResponseEntityMapper : Mapper<MovieResponse, List<MovieModels.Movie>?> {
    override fun mapFrom(from: MovieResponse): List<MovieModels.Movie>? {
        val POSTER_BASE_URL = "https://image.tmdb.org/t/p/w342";
        val movies = from.movies?.map {
            MovieModels.Movie(
                it.releaseDate,
                it.overview,
                it.adult,
                it.originalTitle,
                POSTER_BASE_URL + it.posterPath,
                it.popularity,
                it.title,
                it.voteAverage,
                it.id,
                it.voteCount
            )
        }
        return movies
    }
}