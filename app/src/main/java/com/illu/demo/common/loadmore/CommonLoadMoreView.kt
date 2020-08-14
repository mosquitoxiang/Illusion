package com.illu.demo.common.loadmore

import com.chad.library.adapter.base.loadmore.LoadMoreView
import com.illu.demo.R

class CommonLoadMoreView : LoadMoreView() {
    override fun getLayoutId() = R.layout.view_load_more_common

    override fun getLoadingViewId() = R.id.load_more_loading_view

    override fun getLoadFailViewId() = R.id.load_more_load_fail_view

    override fun getLoadEndViewId() = R.id.load_more_load_end_view
}