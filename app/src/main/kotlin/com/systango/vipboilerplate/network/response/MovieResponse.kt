package com.systango.vipboilerplate.network.response

import com.google.gson.annotations.SerializedName
import com.systango.vipboilerplate.data.MovieData

/**
 * Created by Lalit Sharma on 5/5/19.
 */
data class MovieResponse(
    @SerializedName("page")
    val page: Int = 0,

    @SerializedName("total_results")
    val totalResults: Int = 0,

    @SerializedName("total_pages")
    val totalPages: Int = 0,

    @SerializedName("results")
    val movies: List<MovieData>? = null
)