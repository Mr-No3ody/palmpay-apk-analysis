package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public enum G {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13870a;

    G(boolean z3) {
        this.f13870a = z3;
    }
}
