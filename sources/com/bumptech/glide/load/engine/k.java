package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f20703b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f20704c = new k(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f20705d = new k(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f20706e = new k(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20707a;

    public /* synthetic */ k(int i7) {
        this.f20707a = i7;
    }

    public final boolean a(com.bumptech.glide.load.a aVar) {
        switch (this.f20707a) {
            case 0:
                return aVar == com.bumptech.glide.load.a.f20509b;
            case 1:
                return false;
            case 2:
                return (aVar == com.bumptech.glide.load.a.f20510c || aVar == com.bumptech.glide.load.a.f20512e) ? false : true;
            default:
                return aVar == com.bumptech.glide.load.a.f20509b;
        }
    }
}
