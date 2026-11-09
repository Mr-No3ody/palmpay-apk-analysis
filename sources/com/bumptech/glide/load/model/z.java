package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class z implements ModelLoaderFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f20889b = new z(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20890a;

    public /* synthetic */ z(int i7) {
        this.f20890a = i7;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f20890a) {
            case 0:
                return B.f20811b;
            case 1:
                return new C1328e(new C1326c(0), 0);
            case 2:
                return new C1328e(new C1326c(1), 0);
            case 3:
                return new B(1);
            case 4:
                return new C1328e(xVar.c(Uri.class, AssetFileDescriptor.class), 4);
            case 5:
                return new C1328e(xVar.c(Uri.class, ParcelFileDescriptor.class), 4);
            case 6:
                return new C1328e(xVar.c(Uri.class, InputStream.class), 4);
            default:
                return new E(xVar.c(l.class, InputStream.class));
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        int i7 = this.f20890a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
