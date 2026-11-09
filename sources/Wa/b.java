package Wa;

import M3.f;
import android.app.Application;
import android.webkit.MimeTypeMap;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.offline.CacheRequest;
import com.palmpay.lib.webview.container.fast.offline.CacheResourceInterceptor;
import com.palmpay.lib.webview.container.fast.offline.Chain;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends CacheResourceInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f10657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f10659c;

    static {
        new a(null);
    }

    public b(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("web_asset_mapping.json", "mappingFile");
        this.f10657a = context;
        this.f10658b = "web_asset_mapping.json";
        this.f10659c = C2131j.b(new f(this, 26));
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
        String str = (String) ((Map) this.f10659c.getValue()).get(url);
        if (str == null || str.length() == 0) {
            F6.d.h("AssetResInterceptor", 3, "[MISS] no mapping for: ".concat(url));
            return chain.process(request);
        }
        try {
            InputStream inputStreamOpen = this.f10657a.getAssets().open(str);
            try {
                Intrinsics.e(inputStreamOpen);
                byte[] bArrY = p140j8.f.y(inputStreamOpen);
                inputStreamOpen.close();
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if (fileExtensionFromUrl == null) {
                    fileExtensionFromUrl = StringsKt.Q(str, "");
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = "application/octet-stream";
                }
                WebResource webResourceA = a(mimeTypeFromExtension, bArrY);
                F6.d.h("AssetResInterceptor", 3, "[HIT] assets/" + str + "  size=" + bArrY.length + "B  mime=" + mimeTypeFromExtension + "  url=" + url);
                return webResourceA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            F6.d.h("AssetResInterceptor", 5, C0.G.p("[ERROR] mapping found but asset missing: assets/", str, "  url=", url));
            return chain.process(request);
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public final void prepare(String str, boolean z3) {
    }
}
