package androidx.core.view;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: renamed from: androidx.core.view.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1060l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f16258a;

    public C1060l(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f16258a = new GestureDetector(context, onGestureListener, null);
    }
}
