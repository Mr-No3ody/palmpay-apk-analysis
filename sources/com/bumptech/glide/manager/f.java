package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements FrameWaiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f21041a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f21042b;

    @Override // com.bumptech.glide.manager.FrameWaiter
    public final void registerSelf(Activity activity) {
        if (!this.f21042b && this.f21041a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new e(this, decorView));
        }
    }
}
