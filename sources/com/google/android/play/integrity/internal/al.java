package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class al implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final al f22766a = new al(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22767b;

    private al(Object obj) {
        this.f22767b = obj;
    }

    public static ak b(Object obj) {
        if (obj != null) {
            return new al(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        return this.f22767b;
    }
}
