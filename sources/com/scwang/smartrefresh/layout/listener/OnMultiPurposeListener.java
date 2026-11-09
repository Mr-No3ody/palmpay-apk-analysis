package com.scwang.smartrefresh.layout.listener;

import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;

/* JADX INFO: loaded from: classes3.dex */
public interface OnMultiPurposeListener extends OnRefreshLoadMoreListener, OnStateChangedListener {
    void onFooterFinish(RefreshFooter refreshFooter, boolean z3);

    void onFooterMoving(RefreshFooter refreshFooter, boolean z3, float f10, int i7, int i10, int i11);

    void onFooterReleased(RefreshFooter refreshFooter, int i7, int i10);

    void onFooterStartAnimator(RefreshFooter refreshFooter, int i7, int i10);

    void onHeaderFinish(RefreshHeader refreshHeader, boolean z3);

    void onHeaderMoving(RefreshHeader refreshHeader, boolean z3, float f10, int i7, int i10, int i11);

    void onHeaderReleased(RefreshHeader refreshHeader, int i7, int i10);

    void onHeaderStartAnimator(RefreshHeader refreshHeader, int i7, int i10);
}
