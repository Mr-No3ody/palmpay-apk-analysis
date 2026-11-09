package com.palmpay.lib.webview.offline.monitor.base;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IEnhWebResourceRequestAdapter {
    String getMethod();

    Map<String, String> getRequestHeaders();

    Uri getUrl();

    boolean hasGesture();

    boolean isForMainFrame();
}
