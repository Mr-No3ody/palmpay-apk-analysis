package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class ObservableScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ScrollViewListener f31038y0;

    public interface ScrollViewListener {
        void onOverScrolled(int i7, int i10, boolean z3, boolean z8);

        void onScrollChanged(ObservableScrollView observableScrollView, int i7, int i10, int i11, int i12);
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        super.onOverScrolled(i7, i10, z3, z8);
        ScrollViewListener scrollViewListener = this.f31038y0;
        if (scrollViewListener != null) {
            scrollViewListener.onOverScrolled(i7, i10, z3, z8);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        ScrollViewListener scrollViewListener = this.f31038y0;
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, i7, i10, i11, i12);
        }
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.f31038y0 = scrollViewListener;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
