package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.core.graphics.e f16185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.core.graphics.e f16186b;

    public V(androidx.core.graphics.e eVar, androidx.core.graphics.e eVar2) {
        this.f16185a = eVar;
        this.f16186b = eVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f16185a + " upper=" + this.f16186b + "}";
    }

    public V(WindowInsetsAnimation.Bounds bounds) {
        this.f16185a = androidx.core.graphics.e.c(bounds.getLowerBound());
        this.f16186b = androidx.core.graphics.e.c(bounds.getUpperBound());
    }
}
