package ru.denisnikolskiy.flexiblealarm.base

/**
 * Created by Denis Nikolskiy on 05.11.2017.
 */
interface MvpPresenter<View: MvpView>
{
    fun onAttach(V: MvpView)
    fun onDetach()
}