package com.timehop.stickyheadersrecyclerview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class StickyRecyclerHeadersTouchListener implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f25553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f25554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StickyRecyclerHeadersDecoration f25555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnHeaderClickListener f25556d;

    public interface OnHeaderClickListener {
        void onHeaderClick(View view, int i7, long j6);
    }

    public StickyRecyclerHeadersTouchListener(RecyclerView recyclerView, StickyRecyclerHeadersDecoration stickyRecyclerHeadersDecoration) {
        this.f25553a = new GestureDetector(recyclerView.getContext(), new a(this));
        this.f25554b = recyclerView;
        this.f25555c = stickyRecyclerHeadersDecoration;
    }

    public StickyRecyclerHeadersAdapter getAdapter() {
        RecyclerView recyclerView = this.f25554b;
        if (recyclerView.getAdapter() instanceof StickyRecyclerHeadersAdapter) {
            return (StickyRecyclerHeadersAdapter) recyclerView.getAdapter();
        }
        throw new IllegalStateException("A RecyclerView with StickyRecyclerHeadersTouchListener requires a StickyRecyclerHeadersAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f25556d != null) {
            if (this.f25553a.onTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() == 0) {
                if (this.f25555c.findHeaderPositionUnder((int) motionEvent.getX(), (int) motionEvent.getY()) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onHeaderClickListener) {
        this.f25556d = onHeaderClickListener;
    }
}
