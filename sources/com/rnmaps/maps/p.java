package com.rnmaps.maps;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.maps.GoogleMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements GoogleMap.SnapshotReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f24961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f24962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f24963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f24966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bitmap.CompressFormat f24967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f24968h;

    public p(Promise promise, Integer num, Integer num2, String str, String str2, ReactApplicationContext reactApplicationContext, Bitmap.CompressFormat compressFormat, double d2) {
        this.f24961a = promise;
        this.f24962b = num;
        this.f24963c = num2;
        this.f24964d = str;
        this.f24965e = str2;
        this.f24966f = reactApplicationContext;
        this.f24967g = compressFormat;
        this.f24968h = d2;
    }

    @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
    public final void onSnapshotReady(Bitmap bitmap) {
        Promise promise = this.f24961a;
        if (bitmap == null) {
            promise.reject("Failed to generate bitmap, snapshot = null");
            return;
        }
        Integer num = this.f24962b;
        if (num.intValue() != 0) {
            Integer num2 = this.f24963c;
            if (num2.intValue() != 0 && (num.intValue() != bitmap.getWidth() || num2.intValue() != bitmap.getHeight())) {
                bitmap = Bitmap.createScaledBitmap(bitmap, num.intValue(), num2.intValue(), true);
            }
        }
        String str = this.f24964d;
        boolean zEquals = str.equals("file");
        double d2 = this.f24968h;
        Bitmap.CompressFormat compressFormat = this.f24967g;
        if (!zEquals) {
            if (str.equals(MapModule.SNAPSHOT_RESULT_BASE64)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, (int) (d2 * 100.0d), byteArrayOutputStream);
                MapModule.closeQuietly(byteArrayOutputStream);
                promise.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                return;
            }
            return;
        }
        try {
            File fileCreateTempFile = File.createTempFile("AirMapSnapshot", Consts.DOT + this.f24965e, this.f24966f.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            bitmap.compress(compressFormat, (int) (d2 * 100.0d), fileOutputStream);
            MapModule.closeQuietly(fileOutputStream);
            promise.resolve(Uri.fromFile(fileCreateTempFile).toString());
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }
}
