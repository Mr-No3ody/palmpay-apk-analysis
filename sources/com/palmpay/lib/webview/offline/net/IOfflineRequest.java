package com.palmpay.lib.webview.offline.net;

import com.palmpay.lib.webview.offline.info.OfflinePackageInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface IOfflineRequest {
    void requestPackageInfo(String str, String str2, RequestCallback<OfflinePackageInfo> requestCallback);
}
