package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.arch.core.util.Function;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1187w extends AbstractC1189y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function f17222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p177m.b f17224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityResultCallback f17225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f17226e;

    public C1187w(Fragment fragment, Function function, AtomicReference atomicReference, p177m.b bVar, ActivityResultCallback activityResultCallback) {
        this.f17226e = fragment;
        this.f17222a = function;
        this.f17223b = atomicReference;
        this.f17224c = bVar;
        this.f17225d = activityResultCallback;
    }

    @Override // androidx.fragment.app.AbstractC1189y
    public final void a() {
        Fragment fragment = this.f17226e;
        this.f17223b.set(((androidx.activity.result.h) this.f17222a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f17224c, this.f17225d));
    }
}
