package com.airbnb.lottie;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19895b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f19894a = i7;
        this.f19895b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19894a) {
            case 0:
                com.airbnb.lottie.utils.i.b((InputStream) this.f19895b);
                break;
            case 1:
                com.airbnb.lottie.utils.i.b((ZipInputStream) this.f19895b);
                break;
            default:
                ((D) this.f19895b).c();
                break;
        }
    }
}
