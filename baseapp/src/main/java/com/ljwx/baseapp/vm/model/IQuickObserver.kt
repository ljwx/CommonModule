package com.ljwx.baseapp.vm.model

interface IQuickObserver<T> {

    fun onResponse(response: T)

    fun onResponseSuccess(response: T)

    fun onResponseFail(code: Int?, message: String? = null, data: Any? = null)

    fun onResponseFailGlobal(code: Int?, message: String? = null)

    fun onErrorGlobal(code: Int?, e: Throwable? = null)

}