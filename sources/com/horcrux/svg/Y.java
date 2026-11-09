package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadableMap f23414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callback f23415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23416d;

    public Y(int i7, ReadableMap readableMap, Callback callback, int i10) {
        this.f23413a = i7;
        this.f23414b = readableMap;
        this.f23415c = callback;
        this.f23416d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f23413a;
        SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(i7);
        if (svgViewByTag == null) {
            SvgViewManager.runWhenViewIsAvailable(i7, new X(this, 0));
            return;
        }
        if (svgViewByTag.notRendered()) {
            svgViewByTag.setToDataUrlTask(new X(this, 1));
            return;
        }
        Callback callback = this.f23415c;
        ReadableMap readableMap = this.f23414b;
        if (readableMap != null) {
            callback.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), readableMap.getInt("height")));
        } else {
            callback.invoke(svgViewByTag.toDataURL());
        }
    }
}
