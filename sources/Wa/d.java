package Wa;

import Kf.m;
import android.app.Application;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.offline.CacheRequest;
import com.palmpay.lib.webview.container.fast.offline.CacheResourceInterceptor;
import com.palmpay.lib.webview.container.fast.offline.Chain;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends CacheResourceInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f10660a;

    static {
        new c(null);
    }

    public d(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10660a = context;
    }

    public static WebResource a(String str, byte[] bArr) {
        LinkedHashMap linkedHashMapH = G.h(new Pair(HttpHeaders.CONTENT_TYPE, str), new Pair(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length)), new Pair(HttpHeaders.CACHE_CONTROL, "max-age=31536000"));
        WebResource webResource = new WebResource();
        webResource.setOriginBytes(bArr);
        webResource.setResponseCode(200);
        webResource.setReasonPhrase("OK");
        webResource.setResponseHeaders(linkedHashMapH);
        if (!y.m(str, "text/javascript", false) && !y.m(str, "application/javascript", false) && !y.m(str, "text/css", false) && !y.m(str, "image/", false) && !y.m(str, "font/", false) && !StringsKt.A(str, "woff", false) && !y.m(str, "application/json", false)) {
            return webResource;
        }
        linkedHashMapH.put(HeaderUtils.HEADER_CACHE_SOURCE, "file");
        webResource.setCacheMode(2);
        return webResource;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public final WebResource load(Chain chain) {
        CacheRequest request;
        String path;
        if (chain == null || (request = chain.getRequest()) == null) {
            return null;
        }
        String url = request.getUrl();
        if (url == null) {
            return chain.process(request);
        }
        if (!SPUtils.getInstance().getBoolean("web_interceptor_use_interceptor", true)) {
            return chain.process(request);
        }
        File filesDir = this.f10660a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        File fileC = p118hf.a.C(filesDir, url);
        if (fileC == null || !fileC.exists() || !fileC.isFile() || !fileC.canRead()) {
            F6.d.h("LocalCacheResInterceptor", 3, C0.G.p("[MISS] not found in local cache: ", fileC != null ? fileC.getAbsolutePath() : null, "  url=", url));
            return chain.process(request);
        }
        try {
            path = Uri.parse(url).getPath();
            if (path == null) {
                path = "";
            }
        } catch (Exception unused) {
        }
        try {
            byte[] bArrA = m.a(fileC);
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
            if (fileExtensionFromUrl == null) {
                fileExtensionFromUrl = StringsKt.Q(path, "");
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            WebResource webResourceA = a(mimeTypeFromExtension, bArrA);
            F6.d.h("LocalCacheResInterceptor", 3, "[HIT] " + fileC.getAbsolutePath() + "  size=" + bArrA.length + "B  mime=" + mimeTypeFromExtension + "  url=" + url);
            return webResourceA;
        } catch (Exception e10) {
            F6.d.c("LocalCacheResInterceptor", C0.G.p("[ERROR] read local cache failed: ", fileC.getAbsolutePath(), "  url=", url), e10);
            return chain.process(request);
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public final void prepare(String str, boolean z3) {
    }
}
