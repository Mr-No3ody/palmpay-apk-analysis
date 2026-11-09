package com.transsnet.palmpay.custom_view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1544b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoinRainNewView f31192a;

    public C1544b(CoinRainNewView coinRainNewView) {
        this.f31192a = coinRainNewView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CoinRainNewView coinRainNewView = this.f31192a;
        super.onAnimationEnd(animator);
        try {
            for (Bitmap bitmap : coinRainNewView.f30971v.values()) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            coinRainNewView.f30971v.clear();
            coinRainNewView.f30963d.clear();
            Iterator it = coinRainNewView.f30964e.iterator();
            while (it.hasNext()) {
                ((C1545c) it.next()).f31193a.recycle();
            }
            coinRainNewView.f30964e.clear();
            coinRainNewView.postInvalidate();
            CoinRainNewView.Callback callback = coinRainNewView.f30972w;
            if (callback != null) {
                callback.onAnimEnd();
            }
        } catch (Exception unused) {
        }
    }
}
