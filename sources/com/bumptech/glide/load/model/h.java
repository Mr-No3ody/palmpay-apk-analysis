package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ModelLoaderFactory, DirectResourceLoader$ResourceOpener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20835b;

    public /* synthetic */ h(Context context, int i7) {
        this.f20834a = i7;
        this.f20835b = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f20834a) {
            case 0:
                return new C1325b(this.f20835b, this);
            case 1:
                return new C1325b(this.f20835b, this);
            case 2:
                return new C1325b(this.f20835b, this);
            case 3:
                return new C1328e(this.f20835b, 3);
            case 4:
                return new C1325b(this.f20835b, xVar.c(Integer.class, AssetFileDescriptor.class));
            default:
                return new C1325b(this.f20835b, xVar.c(Integer.class, InputStream.class));
        }
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public void close(Object obj) throws IOException {
        switch (this.f20834a) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            case 1:
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Class getDataClass() {
        switch (this.f20834a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Object open(Resources.Theme theme, Resources resources, int i7) {
        switch (this.f20834a) {
            case 0:
                return resources.openRawResourceFd(i7);
            case 1:
                Context context = this.f20835b;
                return androidx.camera.core.impl.utils.executor.g.n(context, context, i7, theme);
            default:
                return resources.openRawResource(i7);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        int i7 = this.f20834a;
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
}
