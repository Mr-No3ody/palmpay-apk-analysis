package androidx.camera.core.impl;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0 f13949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UseCaseConfig f13950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0993n f13951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13953e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13954f = false;

    public R0(H0 h7, UseCaseConfig useCaseConfig, C0993n c0993n, List list) {
        this.f13949a = h7;
        this.f13950b = useCaseConfig;
        this.f13951c = c0993n;
        this.f13952d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.f13949a + ", mUseCaseConfig=" + this.f13950b + ", mStreamSpec=" + this.f13951c + ", mCaptureTypes=" + this.f13952d + ", mAttached=" + this.f13953e + ", mActive=" + this.f13954f + '}';
    }
}
