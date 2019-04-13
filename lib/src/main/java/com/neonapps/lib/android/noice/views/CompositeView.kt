package com.neonapps.lib.android.noice.views

import android.view.View
import com.neonapps.lib.android.noice.xface.LifecycleObservable

interface CompositeView : LifecycleObservable {
    fun composeWith(root : View)
}