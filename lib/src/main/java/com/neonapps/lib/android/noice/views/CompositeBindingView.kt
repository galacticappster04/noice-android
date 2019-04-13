package com.neonapps.lib.android.noice.views

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import com.neonapps.lib.android.noice.xface.LifecycleObservable

interface CompositeBindingView<T : ViewDataBinding> : LifecycleObservable {
    fun composeWith(activity : AppCompatActivity, binding : T)
}