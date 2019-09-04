package com.android.cgwx.testrvanimater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.support.v7.widget.RecyclerView
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = OrientationHelper.VERTICAL
        mRecyclerview.layoutManager = layoutManager
        var mAdapter = AAdapter(this)
        mRecyclerview.adapter = mAdapter
        mRecyclerview.itemAnimator = SlideInLeftAnimator() as RecyclerView.ItemAnimator

        btn.setOnClickListener {
            mAdapter.notifyItemMoved(0,3)
        }
    }
}
