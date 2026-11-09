package com.scwang.smartrefresh.layout.impl;

import android.graphics.PointF;
import android.view.View;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollBoundaryDeciderAdapter implements ScrollBoundaryDecider {
    public ScrollBoundaryDecider boundary;
    public PointF mActionEvent;
    public boolean mEnableLoadMoreWhenContentNotFull = true;

    @Override // com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider
    public boolean canLoadMore(View view) {
        ScrollBoundaryDecider scrollBoundaryDecider = this.boundary;
        return scrollBoundaryDecider != null ? scrollBoundaryDecider.canLoadMore(view) : ScrollBoundaryUtil.canLoadMore(view, this.mActionEvent, this.mEnableLoadMoreWhenContentNotFull);
    }

    @Override // com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider
    public boolean canRefresh(View view) {
        ScrollBoundaryDecider scrollBoundaryDecider = this.boundary;
        return scrollBoundaryDecider != null ? scrollBoundaryDecider.canRefresh(view) : ScrollBoundaryUtil.canRefresh(view, this.mActionEvent);
    }
}
