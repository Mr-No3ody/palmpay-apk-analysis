package com.palmpay.lib.webview.offline.monitor.impl;

import N8.q0;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.monitor.OfflineWebMonitorUtils;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceErrorAdapter;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceResponseAdapter;
import com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus;
import com.palmpay.lib.webview.offline.utils.OfflineStringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class OfflineWebPageStatus implements IWebPageStatus {
    private static final String TAG = "OfflineWebPageStatus";
    private boolean mIsLoadFail;
    private boolean mIsLoadFinish;
    private boolean mIsLoadSuccess;
    private String mOriginUrl;
    private long mStartTime;
    private int mRequestCount = 0;
    private int mCacheHit = 0;

    private final boolean checkMonitorDisable() {
        return false;
    }

    private final boolean checkStatus() {
        return checkMonitorDisable() || this.mStartTime == 0 || this.mIsLoadFinish;
    }

    private String getSimpleUrl() {
        try {
            Uri uri = Uri.parse(this.mOriginUrl);
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    private boolean isEquals(String str, String str2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && str2.equals(str);
    }

    private boolean isHttpUrl(String str) {
        return str.startsWith("http") || str.startsWith(Constants.SCHEME);
    }

    private final boolean isLoadErrorMonitor() {
        return (this.mIsLoadFail || this.mIsLoadSuccess) ? false : true;
    }

    private final void loadFailStatus() {
        this.mIsLoadFail = true;
        this.mIsLoadSuccess = false;
    }

    private final void loadSuccessStatus() {
        this.mIsLoadFail = false;
        this.mIsLoadSuccess = true;
        this.mIsLoadFinish = true;
    }

    private final void offlineErrorMonitor(String str, int i7) {
        if (isLoadErrorMonitor()) {
            OfflineWebMonitorUtils.reportLoadError(this.mOriginUrl, this.mStartTime, str, i7);
        }
    }

    public String getCacheHitRate() {
        return getCacheHitRate(this.mCacheHit, this.mRequestCount);
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onCacheHit(int i7) {
        this.mRequestCount++;
        if (i7 > 0) {
            this.mCacheHit++;
        }
        if (OfflineWebLog.loggable()) {
            StringBuilder sb2 = new StringBuilder("onCacheHit -> hit cache:");
            sb2.append(i7 > 0);
            OfflineWebLog.d(TAG, sb2.toString());
        }
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadError(@Nullable IEnhWebResourceRequestAdapter iEnhWebResourceRequestAdapter, @Nullable IEnhWebResourceErrorAdapter iEnhWebResourceErrorAdapter) {
        if (checkStatus() || iEnhWebResourceRequestAdapter == null || iEnhWebResourceErrorAdapter == null) {
            return;
        }
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.d(TAG, "onLoadError -> startTime --" + this.mStartTime + " WebResourceError --> " + iEnhWebResourceErrorAdapter.getErrorCode() + "  " + iEnhWebResourceErrorAdapter.getDescription() + " url --> " + iEnhWebResourceRequestAdapter.getUrl());
        }
        Uri url = iEnhWebResourceRequestAdapter.getUrl();
        if (url == null) {
            return;
        }
        String str = "code = " + iEnhWebResourceErrorAdapter.getErrorCode() + ", desc = " + iEnhWebResourceErrorAdapter.getDescription();
        if (isEquals(this.mOriginUrl, url.toString())) {
            OfflineWebMonitorUtils.reportLoadError(this.mOriginUrl, this.mStartTime, str, iEnhWebResourceErrorAdapter.getErrorCode());
        } else {
            offlineErrorMonitor(str, iEnhWebResourceErrorAdapter.getErrorCode());
        }
        loadFailStatus();
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadUrl(@Nullable String str) {
        if (checkMonitorDisable()) {
            return;
        }
        if (isHttpUrl(str == null ? "" : str)) {
            this.mOriginUrl = str;
            this.mStartTime = System.currentTimeMillis();
            this.mIsLoadFail = false;
            this.mIsLoadSuccess = false;
            this.mIsLoadFinish = false;
        }
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onPageLoadFinish(@Nullable String str, int i7) {
        String cacheHitRate = getCacheHitRate();
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.d(TAG, "onPageLoadFinish -> startTime --" + this.mStartTime + "  progress --" + i7 + "  cacheHitRate -- " + cacheHitRate);
        }
        if (checkStatus() || i7 != 100) {
            return;
        }
        try {
            if (isEquals(this.mOriginUrl, str)) {
                OfflineWebMonitorUtils.reportLoadFinish(this.mOriginUrl, cacheHitRate, this.mStartTime);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        loadSuccessStatus();
    }

    public void reset() {
        this.mRequestCount = 0;
        this.mCacheHit = 0;
        this.mStartTime = System.currentTimeMillis();
        this.mIsLoadFail = false;
        this.mIsLoadSuccess = false;
        this.mIsLoadFinish = false;
    }

    public static String getCacheHitRate(int i7, int i10) {
        int i11 = (i10 <= 0 || i7 <= 0 || i7 > i10) ? 0 : (i7 * 100) / i10;
        if (OfflineWebLog.loggable()) {
            StringBuilder sbP = q0.p(i11, "cacheHitRate -> ", i7, " ", "/");
            sbP.append(i10);
            OfflineWebLog.d(TAG, sbP.toString());
        }
        if (i11 >= 0 && i11 < 20) {
            return "1(0-20))";
        }
        if (i11 >= 20 && i11 < 40) {
            return "2(20-40))";
        }
        if (i11 < 40 || i11 >= 60) {
            return (i11 < 60 || i11 >= 80) ? "5(80-100))" : "4(60-80))";
        }
        return "3(40-60))";
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadError(@Nullable IEnhWebResourceRequestAdapter iEnhWebResourceRequestAdapter, @Nullable IEnhWebResourceResponseAdapter iEnhWebResourceResponseAdapter) {
        if (checkStatus() || iEnhWebResourceRequestAdapter == null || iEnhWebResourceResponseAdapter == null) {
            return;
        }
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.d(TAG, "onLoadError -> startTime --" + this.mStartTime + " WebResourceResponse --> " + iEnhWebResourceResponseAdapter.getStatusCode() + "  " + iEnhWebResourceResponseAdapter.getReasonPhrase() + " url --> " + iEnhWebResourceRequestAdapter.getUrl());
        }
        Uri url = iEnhWebResourceRequestAdapter.getUrl();
        if (url == null) {
            return;
        }
        String str = "code = " + iEnhWebResourceResponseAdapter.getStatusCode() + ", desc = " + iEnhWebResourceResponseAdapter.getReasonPhrase();
        if (isEquals(this.mOriginUrl, url.toString())) {
            OfflineWebMonitorUtils.reportLoadError(this.mOriginUrl, this.mStartTime, str, iEnhWebResourceResponseAdapter.getStatusCode());
        } else {
            offlineErrorMonitor(str, iEnhWebResourceResponseAdapter.getStatusCode());
        }
        loadFailStatus();
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadError(@Nullable String str, @Nullable String str2) {
        if (checkStatus() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.d(TAG, "onLoadError -> startTime --" + this.mStartTime + " error --> " + str2 + " url --> " + str);
        }
        try {
            Uri uri = Uri.parse(str.trim());
            if (uri == null) {
                return;
            }
            if (isEquals(this.mOriginUrl, uri.toString())) {
                OfflineWebMonitorUtils.reportLoadError(this.mOriginUrl, this.mStartTime, str2, -1);
            } else {
                offlineErrorMonitor(str2, -1);
            }
            loadFailStatus();
        } catch (Exception e10) {
            OfflineWebLog.e(TAG, OfflineStringUtils.getErrorString(e10));
        }
    }
}
