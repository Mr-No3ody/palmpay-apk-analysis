package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i7, AssetManager assetManager) {
        super(assetManager, str);
        this.f20538d = i7;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void a(Object obj) throws IOException {
        switch (this.f20538d) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object b(AssetManager assetManager, String str) {
        switch (this.f20538d) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        switch (this.f20538d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }
}
