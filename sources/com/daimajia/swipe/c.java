package com.daimajia.swipe;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeLayout f21122a;

    public c(SwipeLayout swipeLayout) {
        this.f21122a = swipeLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        SwipeLayout swipeLayout = this.f21122a;
        if (swipeLayout.f21118v != null) {
            View currentBottomView = swipeLayout.getCurrentBottomView();
            View surfaceView = swipeLayout.getSurfaceView();
            if (currentBottomView == null || motionEvent.getX() <= currentBottomView.getLeft() || motionEvent.getX() >= currentBottomView.getRight() || motionEvent.getY() <= currentBottomView.getTop() || motionEvent.getY() >= currentBottomView.getBottom()) {
                currentBottomView = surfaceView;
            }
            swipeLayout.f21118v.onDoubleClick(swipeLayout, currentBottomView == surfaceView);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        SwipeLayout swipeLayout = this.f21122a;
        if (swipeLayout.f21095B && swipeLayout.h(motionEvent)) {
            swipeLayout.b(true, true);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
