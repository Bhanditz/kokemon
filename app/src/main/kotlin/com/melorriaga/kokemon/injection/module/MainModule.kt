package com.melorriaga.kokemon.injection.module

import com.melorriaga.kokemon.injection.scope.FragmentScope
import com.melorriaga.kokemon.interactor.main.MainInteractor
import com.melorriaga.kokemon.interactor.main.MainInteractorImpl
import com.melorriaga.kokemon.model.api.PokemonService
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    @FragmentScope
    fun provideMainInteractor(pokemonService: PokemonService): MainInteractor {
        return MainInteractorImpl(pokemonService)
    }

}
