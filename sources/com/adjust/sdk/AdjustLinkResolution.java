package com.adjust.sdk;

import android.net.Uri;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AdjustLinkResolution {
    private static volatile ExecutorService executor = null;
    private static final String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link", "adjust.net.in", "adjust.cn", "adjust.world", "adjust.io"};
    private static final int maxRecursions = 10;

    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(Uri uri);
    }

    private AdjustLinkResolution() {
    }

    private static URL convertToHttps(URL url) {
        String externalForm;
        if (url != null && (externalForm = url.toExternalForm()) != null && externalForm.startsWith("http:")) {
            try {
                return new URL("https:".concat(externalForm.substring(5)));
            } catch (MalformedURLException unused) {
            }
        }
        return url;
    }

    private static Uri convertToUri(URL url) {
        if (url == null) {
            return null;
        }
        return Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestAndResolve(URL url, int i7, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        HttpURLConnection httpURLConnection;
        URL urlConvertToHttps = convertToHttps(url);
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(urlConvertToHttps.openConnection()));
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.connect();
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                URL url2 = headerField != null ? new URL(headerField) : null;
                httpURLConnection.disconnect();
                resolveLink(url2, urlConvertToHttps, i7 + 1, adjustLinkResolutionCallback);
            } catch (Throwable unused) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                resolveLink(null, urlConvertToHttps, i7 + 1, adjustLinkResolutionCallback);
            }
        } catch (Throwable unused2) {
            httpURLConnection = null;
        }
    }

    public static void resolveLink(String str, String[] strArr, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            return;
        }
        if (executor == null) {
            synchronized (expectedUrlHostSuffixArray) {
                try {
                    if (executor == null) {
                        executor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.adjust.sdk.AdjustLinkResolution");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        executor.execute(new K(url, adjustLinkResolutionCallback));
    }

    private static boolean urlMatchesSuffix(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(URL url, URL url2, int i7, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url2));
            return;
        }
        if (isTerminalUrl(url.getHost())) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else if (i7 > 10) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else {
            requestAndResolve(url, i7, adjustLinkResolutionCallback);
        }
    }
}
