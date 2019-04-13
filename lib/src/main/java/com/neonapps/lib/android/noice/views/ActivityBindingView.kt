package com.neonapps.lib.android.noice.views

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import com.neonapps.lib.android.noice.xface.LifecycleObservable

interface ActivityBindingView<out T : ViewDataBinding> : LifecycleObservable {
    fun initActivityBinding(activity : AppCompatActivity) : T
}