package androidx.slidingpanelayout.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.customview.widget.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SlidingPaneLayout f17864a;

    public f(SlidingPaneLayout slidingPaneLayout) {
        this.f17864a = slidingPaneLayout;
    }

    public final boolean a() {
        SlidingPaneLayout slidingPaneLayout = this.f17864a;
        if (slidingPaneLayout.f17837o || slidingPaneLayout.getLockMode() == 3) {
            return false;
        }
        if (slidingPaneLayout.isOpen() && slidingPaneLayout.getLockMode() == 1) {
            return false;
        }
        return slidingPaneLayout.isOpen() || slidingPaneLayout.getLockMode() != 2;
    }

    @Override // androidx.customview.widget.f
    public final int clampViewPositionHorizontal(View view, int i7, int i10) {
        SlidingPaneLayout slidingPaneLayout = this.f17864a;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f17832f.getLayoutParams();
        if (!slidingPaneLayout.c()) {
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i7, paddingLeft), slidingPaneLayout.f17835j + paddingLeft);
        }
        int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f17832f.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        return Math.max(Math.min(i7, width), width - slidingPaneLayout.f17835j);
    }

    @Override // androidx.customview.widget.f
    public final int clampViewPositionVertical(View view, int i7, int i10) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.f
    public final int getViewHorizontalDragRange(View view) {
        return this.f17864a.f17835j;
    }

    @Override // androidx.customview.widget.f
    public final void onEdgeDragStarted(int i7, int i10) {
        if (a()) {
            SlidingPaneLayout slidingPaneLayout = this.f17864a;
            slidingPaneLayout.f17821B.c(i10, slidingPaneLayout.f17832f);
        }
    }

    @Override // androidx.customview.widget.f
    public final void onEdgeTouched(int i7, int i10) {
        if (a()) {
            SlidingPaneLayout slidingPaneLayout = this.f17864a;
            slidingPaneLayout.f17821B.c(i10, slidingPaneLayout.f17832f);
        }
    }

    @Override // androidx.customview.widget.f
    public final void onViewCaptured(View view, int i7) {
        SlidingPaneLayout slidingPaneLayout = this.f17864a;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = slidingPaneLayout.getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // androidx.customview.widget.f
    public final void onViewDragStateChanged(int i7) {
        SlidingPaneLayout slidingPaneLayout = this.f17864a;
        if (slidingPaneLayout.f17821B.f16391a == 0) {
            float f10 = slidingPaneLayout.f17833g;
            CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f17842w;
            if (f10 != 1.0f) {
                View view = slidingPaneLayout.f17832f;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((SlidingPaneLayout.PanelSlideListener) it.next()).onPanelOpened(view);
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f17822C = true;
                return;
            }
            slidingPaneLayout.f(slidingPaneLayout.f17832f);
            View view2 = slidingPaneLayout.f17832f;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((SlidingPaneLayout.PanelSlideListener) it2.next()).onPanelClosed(view2);
            }
            slidingPaneLayout.sendAccessibilityEvent(32);
            slidingPaneLayout.f17822C = false;
        }
    }

    @Override // androidx.customview.widget.f
    public final void onViewPositionChanged(View view, int i7, int i10, int i11, int i12) {
        SlidingPaneLayout slidingPaneLayout = this.f17864a;
        if (slidingPaneLayout.f17832f == null) {
            slidingPaneLayout.f17833g = 0.0f;
        } else {
            boolean zC = slidingPaneLayout.c();
            SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f17832f.getLayoutParams();
            int width = slidingPaneLayout.f17832f.getWidth();
            if (zC) {
                i7 = (slidingPaneLayout.getWidth() - i7) - width;
            }
            float paddingRight = (i7 - ((zC ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zC ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f17835j;
            slidingPaneLayout.f17833g = paddingRight;
            if (slidingPaneLayout.f17838p != 0) {
                slidingPaneLayout.d(paddingRight);
            }
            View view2 = slidingPaneLayout.f17832f;
            Iterator it = slidingPaneLayout.f17842w.iterator();
            while (it.hasNext()) {
                ((SlidingPaneLayout.PanelSlideListener) it.next()).onPanelSlide(view2, slidingPaneLayout.f17833g);
            }
        }
        slidingPaneLayout.invalidate();
    }

    @Override // androidx.customview.widget.f
    public final void onViewReleased(View view, float f10, float f11) {
        int paddingLeft;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.f17864a;
        if (slidingPaneLayout.c()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (f10 < 0.0f || (f10 == 0.0f && slidingPaneLayout.f17833g > 0.5f)) {
                paddingRight += slidingPaneLayout.f17835j;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f17832f.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f10 > 0.0f || (f10 == 0.0f && slidingPaneLayout.f17833g > 0.5f)) {
                paddingLeft += slidingPaneLayout.f17835j;
            }
        }
        slidingPaneLayout.f17821B.t(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    @Override // androidx.customview.widget.f
    public final boolean tryCaptureView(View view, int i7) {
        if (a()) {
            return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f17845b;
        }
        return false;
    }
}
