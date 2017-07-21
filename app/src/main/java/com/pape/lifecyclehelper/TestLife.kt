package com.pape.lifecyclehelper

import android.util.Log
import com.pape.klifecycle.Lifecycle
import com.pape.klifecycle.LifecycleObserver
import com.pape.klifecycle.LifecycleOwner

/**
 * @project: LifecycleHelper
 * @description: //一个观察者
 * @author zzy05 zhangzhanyong@feinno.com
 * @date 2017/7/21 11:38
 * @updateUser zzy05
 * @update 2017/7/21 11:38
 * @version V1.0
 */
class TestLife : LifecycleObserver {
    override fun onStateChanged(lifecycleOwner: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("TestLife", event.name)
    }
}
