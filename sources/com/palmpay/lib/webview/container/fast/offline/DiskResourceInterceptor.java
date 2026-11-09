package com.palmpay.lib.webview.container.fast.offline;

import F1.b;
import Pg.AbstractC0555b;
import Pg.w;
import Pg.x;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;
import com.palmpay.lib.webview.container.fast.utils.StreamUtils;
import com.palmpay.lib.webview.container.fast.utils.lru.DiskLruCache;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DiskResourceInterceptor implements Destroyable, ResourceInterceptor {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_META = 0;
    private CacheConfig mCacheConfig;
    private DiskLruCache mDiskLruCache;

    public DiskResourceInterceptor(CacheConfig cacheConfig) {
        this.mCacheConfig = cacheConfig;
    }

    private void cacheToDisk(String str, WebResource webResource) {
        if (webResource == null || !webResource.isCacheable() || this.mDiskLruCache.isClosed()) {
            return;
        }
        try {
            DiskLruCache.Editor editorEdit = this.mDiskLruCache.edit(str);
            if (editorEdit == null) {
                LogUtils.d("Another edit is in progress!");
                return;
            }
            w wVarB = AbstractC0555b.b(AbstractC0555b.h(editorEdit.newOutputStream(0)));
            wVarB.writeUtf8(String.valueOf(webResource.getResponseCode()));
            wVarB.writeByte(10);
            wVarB.writeUtf8(webResource.getReasonPhrase());
            wVarB.writeByte(10);
            Map<String, String> responseHeaders = webResource.getResponseHeaders();
            wVarB.writeDecimalLong(responseHeaders.size());
            wVarB.writeByte(10);
            for (Map.Entry<String, String> entry : responseHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                wVarB.writeUtf8(key);
                wVarB.writeUtf8(": ");
                wVarB.writeUtf8(value);
                wVarB.writeByte(10);
            }
            wVarB.flush();
            wVarB.close();
            w wVarB2 = AbstractC0555b.b(AbstractC0555b.h(editorEdit.newOutputStream(1)));
            byte[] originBytes = webResource.getOriginBytes();
            if (originBytes != null && originBytes.length > 0) {
                wVarB2.write(originBytes);
                wVarB2.flush();
                editorEdit.commit();
            }
            wVarB2.close();
        } catch (IOException e10) {
            LogUtils.e("cache to disk failed. cause by: " + e10.getMessage());
            try {
                this.mDiskLruCache.remove(str);
            } catch (IOException unused) {
            }
        } catch (Exception e11) {
            LogUtils.e(e11.getMessage());
        }
    }

    private synchronized void ensureDiskLruCacheCreate() {
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if (diskLruCache == null || diskLruCache.isClosed()) {
            String cacheDir = this.mCacheConfig.getCacheDir();
            try {
                this.mDiskLruCache = DiskLruCache.open(new File(cacheDir), this.mCacheConfig.getVersion(), 2, this.mCacheConfig.getDiskCacheSize());
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    private WebResource getFromDiskCache(String str) {
        DiskLruCache.Snapshot snapshot;
        try {
            if (!this.mDiskLruCache.isClosed() && (snapshot = this.mDiskLruCache.get(str)) != null) {
                x xVarC = AbstractC0555b.c(AbstractC0555b.l(snapshot.getInputStream(0)));
                String utf8LineStrict = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
                String utf8LineStrict2 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
                long decimalLong = xVarC.readDecimalLong();
                b bVar = new b(3);
                String utf8LineStrict3 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
                if (!TextUtils.isEmpty(utf8LineStrict3.trim())) {
                    bVar.a(utf8LineStrict3);
                    decimalLong--;
                }
                for (int i7 = 0; i7 < decimalLong; i7++) {
                    String utf8LineStrict4 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
                    if (!TextUtils.isEmpty(utf8LineStrict4)) {
                        bVar.a(utf8LineStrict4);
                    }
                }
                Map<String, String> mapGenerateHeadersMap = HeaderUtils.generateHeadersMap(bVar.h(), "file");
                InputStream inputStream = snapshot.getInputStream(1);
                if (inputStream == null) {
                    snapshot.close();
                    return null;
                }
                WebResource webResource = new WebResource();
                webResource.setReasonPhrase(utf8LineStrict2);
                webResource.setResponseCode(Integer.valueOf(utf8LineStrict).intValue());
                webResource.setOriginBytes(StreamUtils.streamToBytes(inputStream));
                webResource.setResponseHeaders(mapGenerateHeadersMap);
                webResource.setModified(false);
                return webResource;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    private boolean isRealMimeTypeCacheable(WebResource webResource) {
        String str;
        if (webResource == null) {
            return false;
        }
        Map<String, String> responseHeaders = webResource.getResponseHeaders();
        if (responseHeaders != null) {
            String str2 = responseHeaders.containsKey(HttpHeaders.CONTENT_TYPE) ? responseHeaders.get(HttpHeaders.CONTENT_TYPE) : responseHeaders.get(HttpHeaders.CONTENT_TYPE.toLowerCase());
            if (TextUtils.isEmpty(str2)) {
                str = null;
            } else {
                String[] strArrSplit = str2.split(";");
                if (strArrSplit.length >= 1) {
                    str = strArrSplit[0];
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
        }
        return (str == null || this.mCacheConfig.getFilter().isFilter(str)) ? false : true;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if (diskLruCache == null || diskLruCache.isClosed()) {
            return;
        }
        try {
            this.mDiskLruCache.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public WebResource load(Chain chain) {
        CacheRequest request = chain.getRequest();
        ensureDiskLruCacheCreate();
        WebResource fromDiskCache = getFromDiskCache(request.getKey());
        if (isRealMimeTypeCacheable(fromDiskCache)) {
            LogUtils.d("disk cache hit: " + request.getUrl());
            return fromDiskCache;
        }
        WebResource webResourceProcess = chain.process(request);
        if (webResourceProcess != null && (webResourceProcess.isCacheByOurselves() || isRealMimeTypeCacheable(webResourceProcess))) {
            cacheToDisk(request.getKey(), webResourceProcess);
        }
        return webResourceProcess;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public void prepare(String str, boolean z3) {
    }
}
