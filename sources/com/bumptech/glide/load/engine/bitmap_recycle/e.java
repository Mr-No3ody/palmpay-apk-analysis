package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public final class e extends D4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7) {
        super(6);
        this.f20583c = i7;
    }

    public final Poolable w() {
        switch (this.f20583c) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
