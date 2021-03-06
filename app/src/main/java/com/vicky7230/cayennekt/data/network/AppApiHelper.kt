package com.vicky7230.cayennekt.data.network

import com.vicky7230.cayennekt.data.network.model.recipes.Recipes
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by vicky on 31/12/17.
 */
class AppApiHelper @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override fun getRecipe(key: String, rId: String) =
        apiService.getRecipe(key, rId)

    override fun getRecipes(key: String, page: String, count: String) =
        apiService.getRecipes(key, page, count)

    override fun searchRecipes(key: String, query: String, page: String) =
        apiService.searchRecipes(key, query, page)
}