package com.neonapps.lib.android.noice.views

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.neonapps.lib.android.noice.xface.LifecycleObservable

interface ActivityView : LifecycleObservable {
    fun initView(activity : AppCompatActivity) : View
}