package com.github.chrisbanes.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f22336a;

    public c(e eVar) {
        this.f22336a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[Catch: ArrayIndexOutOfBoundsException -> 0x002c, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002c, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x001d, B:10:0x0023, B:11:0x0027), top: B:15:0x0003 }] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        e eVar = this.f22336a;
        try {
            float fE = eVar.e();
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            float f10 = eVar.f22351d;
            if (fE < f10) {
                eVar.f(f10, x3, y8, true);
            } else if (fE >= f10) {
                float f11 = eVar.f22352e;
                if (fE < f11) {
                    eVar.f(f11, x3, y8, true);
                } else {
                    eVar.f(eVar.f22350c, x3, y8, true);
                }
            } else {
                eVar.f(eVar.f22350c, x3, y8, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        e eVar = this.f22336a;
        View.OnClickListener onClickListener = eVar.f22343M;
        if (onClickListener != null) {
            onClickListener.onClick(eVar.f22355i);
        }
        eVar.b();
        RectF rectFC = eVar.c(eVar.d());
        float x3 = motionEvent.getX();
        float y8 = motionEvent.getY();
        OnViewTapListener onViewTapListener = eVar.f22342L;
        if (onViewTapListener != null) {
            onViewTapListener.onViewTap(eVar.f22355i, x3, y8);
        }
        if (rectFC == null) {
            return false;
        }
        if (!rectFC.contains(x3, y8)) {
            OnOutsidePhotoTapListener onOutsidePhotoTapListener = eVar.f22341H;
            if (onOutsidePhotoTapListener == null) {
                return false;
            }
            onOutsidePhotoTapListener.onOutsidePhotoTap(eVar.f22355i);
            return false;
        }
        float fWidth = (x3 - rectFC.left) / rectFC.width();
        float fHeight = (y8 - rectFC.top) / rectFC.height();
        OnPhotoTapListener onPhotoTapListener = eVar.f22340C;
        if (onPhotoTapListener == null) {
            return true;
        }
        onPhotoTapListener.onPhotoTap(eVar.f22355i, fWidth, fHeight);
        return true;
    }
}
