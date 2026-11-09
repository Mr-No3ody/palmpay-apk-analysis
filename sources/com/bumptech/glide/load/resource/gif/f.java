package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class f extends H1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f20994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f20997d;

    public f(Handler handler, int i7, long j6) {
        super(0);
        this.f20994a = handler;
        this.f20995b = i7;
        this.f20996c = j6;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
        this.f20997d = null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        this.f20997d = (Bitmap) obj;
        Handler handler = this.f20994a;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f20996c);
    }
}
