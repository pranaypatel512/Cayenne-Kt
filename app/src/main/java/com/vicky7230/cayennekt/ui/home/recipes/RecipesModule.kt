package com.vicky7230.cayennekt.ui.home.recipes

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.vicky7230.cayennekt.di.ApplicationContext
import com.vicky7230.cayennekt.ui.home.ItemOffsetDecoration
import dagger.Module
import dagger.Provides


/**
 * Created by vicky on 13/2/18.
 */
@Module
class RecipesModule {

    @Provides
    fun provideRecipesMvpPresenter(presenter: RecipesPresenter<RecipesMvpView>): RecipesMvpPresenter<RecipesMvpView> {
        return presenter
    }

    @Provides
    fun provideLinearLayoutManager(@ApplicationContext context: Context): LinearLayoutManager {
        return LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    @Provides
    fun provideItemOffsetDecoration(): ItemOffsetDecoration {
        return ItemOffsetDecoration(40)
    }

    @Provides
    fun provideRecipesItemAnimator(): RecipesItemAnimator {
        return RecipesItemAnimator()
    }

    @Provides
    fun provideRecipesAdapter(): RecipesAdapter {
        return RecipesAdapter(ArrayList())
    }
}