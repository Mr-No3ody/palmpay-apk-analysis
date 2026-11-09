package com.palmpay.lib.webview.container.fast.offline;

import com.palmpay.lib.webview.container.fast.WebResource;

/* JADX INFO: loaded from: classes3.dex */
public interface ResourceInterceptor {
    WebResource load(Chain chain);

    void prepare(String str, boolean z3);
}
