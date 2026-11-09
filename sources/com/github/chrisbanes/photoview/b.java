package com.github.chrisbanes.photoview;

import android.graphics.RectF;
import android.view.ViewParent;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
public final class b implements OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f22335a;

    public b(e eVar) {
        this.f22335a = eVar;
    }

    @Override // com.github.chrisbanes.photoview.OnGestureListener
    public final void onDrag(float f10, float f11) {
        int i7;
        e eVar = this.f22335a;
        if (eVar.f22358o.f11888c.isInProgress()) {
            return;
        }
        OnViewDragListener onViewDragListener = eVar.f22347Z;
        if (onViewDragListener != null) {
            onViewDragListener.onDrag(f10, f11);
        }
        eVar.f22365v.postTranslate(f10, f11);
        eVar.a();
        ViewParent parent = eVar.f22355i.getParent();
        if (!eVar.f22353f || eVar.f22358o.f11888c.isInProgress() || eVar.f22354g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i10 = eVar.f22360p0;
        if ((i10 == 2 || ((i10 == 0 && f10 >= 1.0f) || ((i10 == 1 && f10 <= -1.0f) || (((i7 = eVar.f22361q0) == 0 && f11 >= 1.0f) || (i7 == 1 && f11 <= -1.0f))))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // com.github.chrisbanes.photoview.OnGestureListener
    public final void onFling(float f10, float f11, float f12, float f13) {
        int i7;
        int iRound;
        int i10;
        int iRound2;
        e eVar = this.f22335a;
        p012ad.c cVar = new p012ad.c(eVar, eVar.f22355i.getContext());
        eVar.f22357k0 = cVar;
        PhotoView photoView = eVar.f22355i;
        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        PhotoView photoView2 = eVar.f22355i;
        int height = (photoView2.getHeight() - photoView2.getPaddingTop()) - photoView2.getPaddingBottom();
        int i11 = (int) f12;
        int i12 = (int) f13;
        eVar.b();
        RectF rectFC = eVar.c(eVar.d());
        if (rectFC != null) {
            int iRound3 = Math.round(-rectFC.left);
            float f14 = width;
            if (f14 < rectFC.width()) {
                iRound = Math.round(rectFC.width() - f14);
                i7 = 0;
            } else {
                i7 = iRound3;
                iRound = i7;
            }
            int iRound4 = Math.round(-rectFC.top);
            float f15 = height;
            if (f15 < rectFC.height()) {
                iRound2 = Math.round(rectFC.height() - f15);
                i10 = 0;
            } else {
                i10 = iRound4;
                iRound2 = i10;
            }
            cVar.f11881b = iRound3;
            cVar.f11882c = iRound4;
            if (iRound3 != iRound || iRound4 != iRound2) {
                ((OverScroller) cVar.f11883d).fling(iRound3, iRound4, i11, i12, i7, iRound, i10, iRound2, 0, 0);
            }
        }
        eVar.f22355i.post(eVar.f22357k0);
    }

    @Override // com.github.chrisbanes.photoview.OnGestureListener
    public final void onScale(float f10, float f11, float f12) {
        e eVar = this.f22335a;
        if (eVar.e() < eVar.f22352e || f10 < 1.0f) {
            OnScaleChangedListener onScaleChangedListener = eVar.f22345X;
            if (onScaleChangedListener != null) {
                onScaleChangedListener.onScaleChange(f10, f11, f12);
            }
            eVar.f22365v.postScale(f10, f10, f11, f12);
            eVar.a();
        }
    }
}
