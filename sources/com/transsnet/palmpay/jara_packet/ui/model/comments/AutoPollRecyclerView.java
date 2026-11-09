package com.transsnet.palmpay.jara_packet.ui.model.comments;

import Ja.RunnableC0336i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class AutoPollRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f31981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31983c;

    public AutoPollRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f31981a = new RunnableC0336i(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3 || action == 4) && this.f31983c) {
                if (this.f31982b) {
                    this.f31982b = false;
                    removeCallbacks(this.f31981a);
                }
                this.f31983c = true;
                this.f31982b = true;
                postDelayed(this.f31981a, 16L);
            }
        } else if (this.f31982b) {
            this.f31982b = false;
            removeCallbacks(this.f31981a);
        }
        return super.onTouchEvent(motionEvent);
    }
}
