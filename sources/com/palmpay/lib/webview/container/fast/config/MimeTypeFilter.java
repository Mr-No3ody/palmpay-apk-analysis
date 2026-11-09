package com.palmpay.lib.webview.container.fast.config;

/* JADX INFO: loaded from: classes3.dex */
public interface MimeTypeFilter {
    void addMimeType(String str);

    void clear();

    boolean isFilter(String str);

    void removeMimeType(String str);
}
