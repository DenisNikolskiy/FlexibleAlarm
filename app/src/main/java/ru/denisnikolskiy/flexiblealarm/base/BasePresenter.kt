package ru.denisnikolskiy.flexiblealarm.base

/**
 * Created by Denis Nikolskiy on 05.11.2017.
 */
class BasePresenter<View: MvpView>: MvpPresenter<View>
{
    var mvpView: MvpView? = null

    override fun onAttach(mvpView: MvpView) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        mvpView = null
    }
}