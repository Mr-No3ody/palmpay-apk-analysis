package com.palmpay.lib.webview.offline.download;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public interface IDownLoader {

    public interface DownloadCallback {
        void fail(Throwable th);

        void success(File file, boolean z3);
    }

    void download(String str, String str2, String str3, DownloadCallback downloadCallback);
}
