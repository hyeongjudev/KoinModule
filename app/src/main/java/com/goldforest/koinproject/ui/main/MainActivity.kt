package com.goldforest.koinproject.ui.main

import android.util.Log
import com.goldforest.koinproject.R
import com.goldforest.koinproject.base.BaseActivity
import com.goldforest.koinproject.databinding.ActivityMainBinding
import com.goldforest.koinproject.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.activity_main

    override val viewModel: MainViewModel by viewModel()

    private var testCount = 0


    override fun initStartView() {

    }

    override fun initDataBinding() {
        viewDataBinding.vm = viewModel

    }

    override fun initAfterBinding() {
        btTest.setOnClickListener {
            Log.e("Click", "[HJ]Click !!!!!")
            viewModel.setValues("Click Test : $testCount")
            testCount++
        }
    }

}
