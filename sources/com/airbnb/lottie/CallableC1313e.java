package com.airbnb.lottie;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: com.airbnb.lottie.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1313e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19861c;

    public /* synthetic */ CallableC1313e(Object obj, String str, int i7) {
        this.f19859a = i7;
        this.f19861c = obj;
        this.f19860b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f19860b;
        Object obj = this.f19861c;
        switch (this.f19859a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                if (!lottieAnimationView.f19584o) {
                    return p.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = p.f20122a;
                return p.b(context, str, "asset_" + str);
            case 1:
                return p.d((InputStream) obj, str);
            default:
                return p.i(null, (ZipInputStream) obj, str);
        }
    }
}
