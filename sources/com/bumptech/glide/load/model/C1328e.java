package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1328e implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20829b;

    public /* synthetic */ C1328e(Object obj, int i7) {
        this.f20828a = i7;
        this.f20829b = obj;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        Uri uriFromFile;
        switch (this.f20828a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new t(new I1.d(bArr), new C1327d(bArr, (ByteArrayLoader$Converter) this.f20829b));
            case 1:
                return new t(new I1.d(obj), new g(obj.toString(), (C1326c) this.f20829b));
            case 2:
                File file = (File) obj;
                return new t(new I1.d(file), new k(file, (FileLoader$FileOpener) this.f20829b));
            case 3:
                Uri uri = (Uri) obj;
                return new t(new I1.d(uri), new p((Context) this.f20829b, uri));
            default:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri2 = Uri.parse(str);
                    uriFromFile = uri2.getScheme() == null ? Uri.fromFile(new File(str)) : uri2;
                }
                if (uriFromFile == null) {
                    return null;
                }
                ModelLoader modelLoader = (ModelLoader) this.f20829b;
                if (modelLoader.handles(uriFromFile)) {
                    return modelLoader.buildLoadData(uriFromFile, i7, i10, hVar);
                }
                return null;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        switch (this.f20828a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            case 2:
                return true;
            case 3:
                return androidx.camera.core.impl.utils.executor.g.y((Uri) obj);
            default:
                return true;
        }
    }
}
