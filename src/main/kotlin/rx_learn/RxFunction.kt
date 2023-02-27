package rx_learn

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import ulti.AppConstant
import ulti.Logger

//Common operator in Rx

fun justOperator() {
    Observable.just(1, 2, 3, 4, 5).subscribe(observerObject())
}

fun observerObject(): Observer<Int> {
    return object : Observer<Int> {
        override fun onSubscribe(d: Disposable) {
            Logger.d(" onSubscribe : " + d.isDisposed)
        }

        override fun onError(e: Throwable) {
            Logger.e(" onError : " + e.message)
        }

        override fun onComplete() {
            Logger.d("onComplete")
        }

        override fun onNext(value: Int) {
            Logger.d(" onNext : value : $value")
        }
    }
}
