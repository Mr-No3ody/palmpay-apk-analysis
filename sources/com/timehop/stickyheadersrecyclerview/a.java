package com.timehop.stickyheadersrecyclerview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StickyRecyclerHeadersTouchListener f25557a;

    public a(StickyRecyclerHeadersTouchListener stickyRecyclerHeadersTouchListener) {
        this.f25557a = stickyRecyclerHeadersTouchListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        StickyRecyclerHeadersTouchListener stickyRecyclerHeadersTouchListener = this.f25557a;
        int iFindHeaderPositionUnder = stickyRecyclerHeadersTouchListener.f25555c.findHeaderPositionUnder((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iFindHeaderPositionUnder == -1) {
            return false;
        }
        View headerView = stickyRecyclerHeadersTouchListener.f25555c.getHeaderView(stickyRecyclerHeadersTouchListener.f25554b, iFindHeaderPositionUnder);
        stickyRecyclerHeadersTouchListener.f25556d.onHeaderClick(headerView, iFindHeaderPositionUnder, stickyRecyclerHeadersTouchListener.getAdapter().getHeaderId(iFindHeaderPositionUnder));
        stickyRecyclerHeadersTouchListener.f25554b.playSoundEffect(0);
        headerView.onTouchEvent(motionEvent);
        return true;
    }
}
