package androidx.activity;

import N8.q0;
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0812c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12023d;

    static {
        new C0811b(null);
    }

    public C0812c(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C0810a c0810a = C0810a.f12019a;
        float fD = c0810a.d(backEvent);
        float fE = c0810a.e(backEvent);
        float fB = c0810a.b(backEvent);
        int iC = c0810a.c(backEvent);
        this.f12020a = fD;
        this.f12021b = fE;
        this.f12022c = fB;
        this.f12023d = iC;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f12020a);
        sb2.append(", touchY=");
        sb2.append(this.f12021b);
        sb2.append(", progress=");
        sb2.append(this.f12022c);
        sb2.append(", swipeEdge=");
        return q0.m(sb2, this.f12023d, '}');
    }
}
