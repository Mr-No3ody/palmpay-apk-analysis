package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.A;
import com.airbnb.lottie.ImageAssetDelegate;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f19896e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageAssetDelegate f19899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19900d;

    public a(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f19898b = str;
        } else {
            this.f19898b = str.concat("/");
        }
        this.f19900d = map;
        this.f19899c = imageAssetDelegate;
        if (callback instanceof View) {
            this.f19897a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f19897a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f19896e) {
            ((A) this.f19900d.get(str)).f19555f = bitmap;
        }
    }
}
