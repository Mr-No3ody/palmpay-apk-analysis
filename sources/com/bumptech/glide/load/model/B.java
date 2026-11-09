package com.bumptech.glide.load.model;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class B implements ModelLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f20811b = new B(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20812a;

    public /* synthetic */ B(int i7) {
        this.f20812a = i7;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        switch (this.f20812a) {
            case 0:
                return new t(new I1.d(obj), new A(obj));
            case 1:
                File file = (File) obj;
                return new t(new I1.d(file), new f(file));
            default:
                return null;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        switch (this.f20812a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
