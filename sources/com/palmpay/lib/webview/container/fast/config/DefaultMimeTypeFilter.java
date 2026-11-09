package com.palmpay.lib.webview.container.fast.config;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultMimeTypeFilter implements MimeTypeFilter {
    private Set<String> mFilterMimeTypes = new HashSet();

    public DefaultMimeTypeFilter() {
        addMimeType("application/javascript");
        addMimeType("application/ecmascript");
        addMimeType("application/x-ecmascript");
        addMimeType("application/x-javascript");
        addMimeType("text/ecmascript");
        addMimeType("text/javascript");
        addMimeType("text/javascript1.0");
        addMimeType("text/javascript1.1");
        addMimeType("text/javascript1.2");
        addMimeType("text/javascript1.3");
        addMimeType("text/javascript1.4");
        addMimeType("text/javascript1.5");
        addMimeType("text/jscript");
        addMimeType("text/livescript");
        addMimeType("text/x-ecmascript");
        addMimeType("text/x-javascript");
        addMimeType("image/gif");
        addMimeType("image/jpeg");
        addMimeType("image/png");
        addMimeType("image/svg+xml");
        addMimeType("image/bmp");
        addMimeType(ClipboardModule.MIMETYPE_WEBP);
        addMimeType("image/tiff");
        addMimeType("image/vnd.microsoft.icon");
        addMimeType("image/x-icon");
        addMimeType("text/css");
        addMimeType("application/octet-stream");
        addMimeType("text/html");
    }

    @Override // com.palmpay.lib.webview.container.fast.config.MimeTypeFilter
    public void addMimeType(String str) {
        this.mFilterMimeTypes.add(str);
    }

    @Override // com.palmpay.lib.webview.container.fast.config.MimeTypeFilter
    public void clear() {
        this.mFilterMimeTypes.clear();
    }

    @Override // com.palmpay.lib.webview.container.fast.config.MimeTypeFilter
    public boolean isFilter(String str) {
        return !this.mFilterMimeTypes.contains(str);
    }

    @Override // com.palmpay.lib.webview.container.fast.config.MimeTypeFilter
    public void removeMimeType(String str) {
        this.mFilterMimeTypes.remove(str);
    }
}
