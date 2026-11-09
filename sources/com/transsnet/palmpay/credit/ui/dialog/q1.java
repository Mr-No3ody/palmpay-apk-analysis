package com.transsnet.palmpay.credit.ui.dialog;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f30186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanSheet f30187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HorizontalScrollView f30189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30190e;

    public q1(LinearLayout linearLayout, TransferByLoanSheet transferByLoanSheet, int i7, HorizontalScrollView horizontalScrollView, int i10) {
        this.f30186a = linearLayout;
        this.f30187b = transferByLoanSheet;
        this.f30188c = i7;
        this.f30189d = horizontalScrollView;
        this.f30190e = i10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i7;
        View childAt;
        LinearLayout linearLayout = this.f30186a;
        linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.f30187b.isAdded() && (childAt = linearLayout.getChildAt((i7 = this.f30188c))) != null) {
            int dp = CommonViewExtKt.getDp(16);
            HorizontalScrollView horizontalScrollView = this.f30189d;
            int width = horizontalScrollView.getWidth();
            if (width <= 0) {
                return;
            }
            int width2 = linearLayout.getWidth() - width;
            if (width2 < 0) {
                width2 = 0;
            }
            if (i7 != this.f30190e - 1) {
                int scrollX = horizontalScrollView.getScrollX();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (left < scrollX + dp) {
                    scrollX = left - dp;
                }
                if (right > (scrollX + width) - dp) {
                    scrollX = (right - width) + dp;
                }
                width2 = kotlin.ranges.b.c(scrollX, 0, width2);
            }
            horizontalScrollView.smoothScrollTo(width2, 0);
        }
    }
}
