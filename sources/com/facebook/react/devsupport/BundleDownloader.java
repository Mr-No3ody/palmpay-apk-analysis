package com.facebook.react.devsupport;

import C0.G;
import N8.q0;
import Pg.AbstractC0555b;
import Pg.C0557d;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.s;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.F;
import okhttp3.U;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.h0;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader;", "", "Lokhttp3/U;", "client", "<init>", "(Lokhttp3/U;)V", "", "url", "Lokhttp3/e0;", "response", "boundary", "Ljava/io/File;", "outputFile", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "callback", "", "processMultipartResponse", "(Ljava/lang/String;Lokhttp3/e0;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V", "", "statusCode", "Lokhttp3/F;", "headers", "Lokio/BufferedSource;", "body", "processBundleResult", "(Ljava/lang/String;ILokhttp3/F;Lokio/BufferedSource;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V", "bundleURL", "Lokhttp3/X;", "requestBuilder", "downloadBundleFromURL", "(Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lokhttp3/X;)V", "Lokhttp3/U;", "Lokhttp3/Call;", "downloadBundleFromURLCall", "Lokhttp3/Call;", "Companion", "BundleInfo", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BundleDownloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;

    @NotNull
    private static final String TAG = "BundleDownloader";

    @NotNull
    private final U client;

    @Nullable
    private Call downloadBundleFromURLCall;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "", "<init>", "()V", "_url", "", "get_url$ReactAndroid_release", "()Ljava/lang/String;", "set_url$ReactAndroid_release", "(Ljava/lang/String;)V", "url", "getUrl", "value", "", "filesChangedCount", "getFilesChangedCount", "()I", "setFilesChangedCount$ReactAndroid_release", "(I)V", "toJSONString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String _url;
        private int filesChangedCount;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo$Companion;", "", "<init>", "()V", "fromJSONString", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "jsonStr", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            public final BundleInfo fromJSONString(@Nullable String jsonStr) {
                if (jsonStr == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(jsonStr);
                    BundleInfo bundleInfo = new BundleInfo();
                    bundleInfo.set_url$ReactAndroid_release(jSONObject.getString("url"));
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(jSONObject.getInt("filesChangedCount"));
                    return bundleInfo;
                } catch (JSONException e10) {
                    p229p2.a.i(BundleDownloader.TAG, "Invalid bundle info: ", e10);
                    return null;
                }
            }

            private Companion() {
            }
        }

        @JvmStatic
        @Nullable
        public static final BundleInfo fromJSONString(@Nullable String str) {
            return INSTANCE.fromJSONString(str);
        }

        public final int getFilesChangedCount() {
            return this.filesChangedCount;
        }

        @NotNull
        public final String getUrl() {
            String str = this._url;
            return str == null ? "unknown" : str;
        }

        @Nullable
        /* JADX INFO: renamed from: get_url$ReactAndroid_release, reason: from getter */
        public final String get_url() {
            return this._url;
        }

        public final void setFilesChangedCount$ReactAndroid_release(int i7) {
            this.filesChangedCount = i7;
        }

        public final void set_url$ReactAndroid_release(@Nullable String str) {
            this._url = str;
        }

        @Nullable
        public final String toJSONString() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", this._url);
                jSONObject.put("filesChangedCount", this.filesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e10) {
                p229p2.a.i(BundleDownloader.TAG, "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$Companion;", "", "<init>", "()V", "Lokio/BufferedSource;", "body", "Ljava/io/File;", "outputFile", "", "storePlainJSInFile", "(Lokio/BufferedSource;Ljava/io/File;)Z", "", "url", "Lokhttp3/F;", "headers", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "", "populateBundleInfo", "(Ljava/lang/String;Lokhttp3/F;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V", "TAG", "Ljava/lang/String;", "", "FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER", "I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBundleDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleDownloader.kt\ncom/facebook/react/devsupport/BundleDownloader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1#2:325\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void populateBundleInfo(String url, F headers, BundleInfo bundleInfo) {
            bundleInfo.set_url$ReactAndroid_release(url);
            String strA = headers.a("X-Metro-Files-Changed-Count");
            if (strA != null) {
                try {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(Integer.parseInt(strA));
                } catch (NumberFormatException e10) {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(-2);
                    p229p2.a.i(BundleDownloader.TAG, "Can't populate bundle info: ", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean storePlainJSInFile(BufferedSource body, File outputFile) throws IOException {
            Intrinsics.checkNotNullParameter(outputFile, "file");
            C0557d c0557dJ = AbstractC0555b.j(outputFile);
            try {
                body.readAll(c0557dJ);
                c0557dJ.close();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(c0557dJ, th);
                    throw th2;
                }
            }
        }

        private Companion() {
        }
    }

    public BundleDownloader(@NotNull U client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    public static /* synthetic */ void downloadBundleFromURL$default(BundleDownloader bundleDownloader, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, X x3, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            x3 = new X();
        }
        bundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, x3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBundleResult(String url, int statusCode, F headers, BufferedSource body, File outputFile, BundleInfo bundleInfo, DevBundleDownloadListener callback) throws IOException {
        if (statusCode == 200) {
            if (bundleInfo != null) {
                INSTANCE.populateBundleInfo(url, headers, bundleInfo);
            }
            File file = new File(q0.j(outputFile.getPath(), ".tmp"));
            if (!INSTANCE.storePlainJSInFile(body, file) || file.renameTo(outputFile)) {
                callback.onSuccess();
                return;
            }
            throw new IOException("Couldn't rename " + file + " to " + outputFile);
        }
        String utf8 = body.readUtf8();
        DebugServerException debugServerException = DebugServerException.INSTANCE.parse(url, utf8);
        if (debugServerException != null) {
            callback.onFailure(debugServerException);
            return;
        }
        String str = "The development server returned response error code: " + statusCode + "\n\nURL: " + url + "\n\nBody:\n" + utf8;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        callback.onFailure(new DebugServerException(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMultipartResponse(final String url, final e0 response, String boundary, final File outputFile, final BundleInfo bundleInfo, final DevBundleDownloadListener callback) throws IOException {
        h0 h0Var = response.f40734g;
        int i7 = response.f40731d;
        if (h0Var == null) {
            callback.onFailure(new DebugServerException(s.b("\n                    Error while reading multipart response.\n                    \n                    Response body was empty: " + i7 + "\n                    \n                    URL: " + url + "\n                    \n                    \n                    ")));
            return;
        }
        BufferedSource bufferedSourceSource = h0Var.source();
        if (bufferedSourceSource == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (new MultipartStreamReader(bufferedSourceSource, boundary).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader$processMultipartResponse$completed$1
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> headers, Pg.k body, boolean isLastChunk) throws IOException {
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(body, "body");
                if (isLastChunk) {
                    int i10 = response.f40731d;
                    if (headers.containsKey("X-Http-Status")) {
                        i10 = Integer.parseInt(headers.getOrDefault("X-Http-Status", "0"));
                    }
                    this.processBundleResult(url, i10, F.f40566b.m128deprecated_of(headers), body, outputFile, bundleInfo, callback);
                    return;
                }
                if (headers.containsKey(HttpHeaders.CONTENT_TYPE) && Intrinsics.c(headers.get(HttpHeaders.CONTENT_TYPE), "application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(body.readUtf8());
                        callback.onProgress(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                    } catch (JSONException e10) {
                        p229p2.a.h("ReactNative", "Error parsing progress JSON. " + e10);
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> headers, long loaded, long total) {
                Intrinsics.checkNotNullParameter(headers, "headers");
                if ("application/javascript".equals(headers.get(HttpHeaders.CONTENT_TYPE))) {
                    long j6 = 1024;
                    callback.onProgress("Downloading", Integer.valueOf((int) (loaded / j6)), Integer.valueOf((int) (total / j6)));
                }
            }
        })) {
            return;
        }
        callback.onFailure(new DebugServerException(s.b("\n                    Error while reading multipart response.\n                    \n                    Response code: " + i7 + "\n                    \n                    URL: " + url + "\n                    \n                    \n                    ")));
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, @Nullable String str, @Nullable BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull final DevBundleDownloadListener callback, @NotNull final File outputFile, @Nullable String bundleURL, @Nullable final BundleInfo bundleInfo, @NotNull X requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        if (bundleURL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        requestBuilder.k(bundleURL);
        requestBuilder.a(HttpHeaders.ACCEPT, "multipart/mixed");
        Call callNewCall = this.client.newCall(requestBuilder.b());
        this.downloadBundleFromURLCall = callNewCall;
        FirebasePerfOkHttpClient.enqueue(callNewCall, new Callback() { // from class: com.facebook.react.devsupport.BundleDownloader.downloadBundleFromURL.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e10) {
                Call call2;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                if (BundleDownloader.this.downloadBundleFromURLCall == null || ((call2 = BundleDownloader.this.downloadBundleFromURLCall) != null && call2.isCanceled())) {
                    BundleDownloader.this.downloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.downloadBundleFromURLCall = null;
                String str = call.request().f40685a.f40587i;
                callback.onFailure(DebugServerException.INSTANCE.makeGeneric(str, "Could not connect to development server.", G.o("URL: ", str), e10));
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r11.isCanceled() == true) goto L10;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v10 */
            /* JADX WARN: Type inference failed for: r11v15, types: [okhttp3.e0] */
            /* JADX WARN: Type inference failed for: r11v16, types: [okhttp3.e0] */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v18 */
            /* JADX WARN: Type inference failed for: r11v19 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5, types: [okhttp3.Call] */
            /* JADX WARN: Type inference failed for: r11v6 */
            @Override // okhttp3.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResponse(okhttp3.Call r11, okhttp3.e0 r12) throws java.io.IOException {
                /*
                    r10 = this;
                    java.lang.String r0 = "call"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                    java.lang.String r11 = "response"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r11)
                    com.facebook.react.devsupport.BundleDownloader r0 = com.facebook.react.devsupport.BundleDownloader.this
                    java.io.File r4 = r3
                    com.facebook.react.devsupport.BundleDownloader$BundleInfo r5 = r4
                    com.facebook.react.devsupport.interfaces.DevBundleDownloadListener r6 = r2
                    okhttp3.Call r11 = com.facebook.react.devsupport.BundleDownloader.access$getDownloadBundleFromURLCall$p(r0)     // Catch: java.lang.Throwable -> L6b
                    r8 = 0
                    if (r11 == 0) goto L26
                    okhttp3.Call r11 = com.facebook.react.devsupport.BundleDownloader.access$getDownloadBundleFromURLCall$p(r0)     // Catch: java.lang.Throwable -> L6b
                    r1 = 1
                    if (r11 == 0) goto L30
                    boolean r11 = r11.isCanceled()     // Catch: java.lang.Throwable -> L29
                    if (r11 != r1) goto L30
                L26:
                    r11 = r12
                    goto L99
                L29:
                    r0 = move-exception
                    r11 = r0
                    r9 = r12
                    r12 = r11
                    r11 = r9
                    goto La0
                L30:
                    com.facebook.react.devsupport.BundleDownloader.access$setDownloadBundleFromURLCall$p(r0, r8)     // Catch: java.lang.Throwable -> L6b
                    okhttp3.Y r11 = r12.f40728a     // Catch: java.lang.Throwable -> L6b
                    okhttp3.J r11 = r11.f40685a     // Catch: java.lang.Throwable -> L6b
                    java.lang.String r11 = r11.f40587i     // Catch: java.lang.Throwable -> L6b
                    java.lang.String r2 = "content-type"
                    java.lang.String r2 = r12.b(r2, r8)     // Catch: java.lang.Throwable -> L6b
                    if (r2 != 0) goto L43
                    java.lang.String r2 = ""
                L43:
                    java.lang.String r3 = "multipart/mixed;.*boundary=\"([^\"]+)\""
                    java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L6b
                    java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch: java.lang.Throwable -> L6b
                    int r2 = r2.length()     // Catch: java.lang.Throwable -> L6b
                    if (r2 <= 0) goto L6e
                    boolean r2 = r3.find()     // Catch: java.lang.Throwable -> L6b
                    if (r2 == 0) goto L6e
                    java.lang.String r3 = r3.group(r1)     // Catch: java.lang.Throwable -> L6b
                    p059e1.a.f(r3)     // Catch: java.lang.Throwable -> L6b
                    r1 = r11
                    r2 = r12
                    com.facebook.react.devsupport.BundleDownloader.access$processMultipartResponse(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
                    r11 = r2
                    goto L8b
                L67:
                    r0 = move-exception
                    r11 = r2
                L69:
                    r12 = r0
                    goto La0
                L6b:
                    r0 = move-exception
                    r11 = r12
                    goto L69
                L6e:
                    r1 = r11
                    r11 = r12
                    okhttp3.h0 r12 = r11.f40734g     // Catch: java.lang.Throwable -> L91
                    if (r12 == 0) goto L86
                    int r2 = r11.f40731d     // Catch: java.lang.Throwable -> L83
                    okhttp3.F r3 = r11.f40733f     // Catch: java.lang.Throwable -> L83
                    r7 = r6
                    r6 = r5
                    r5 = r4
                    okio.BufferedSource r4 = r12.source()     // Catch: java.lang.Throwable -> L83
                    com.facebook.react.devsupport.BundleDownloader.access$processBundleResult(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L83
                    goto L86
                L83:
                    r0 = move-exception
                    r1 = r0
                    goto L93
                L86:
                    kotlin.Unit r0 = kotlin.Unit.f38893a     // Catch: java.lang.Throwable -> L83
                    org.chromium.support_lib_boundary.util.b.o(r12, r8)     // Catch: java.lang.Throwable -> L91
                L8b:
                    kotlin.Unit r12 = kotlin.Unit.f38893a     // Catch: java.lang.Throwable -> L91
                    r11.close()
                    return
                L91:
                    r0 = move-exception
                    goto L69
                L93:
                    throw r1     // Catch: java.lang.Throwable -> L94
                L94:
                    r0 = move-exception
                    org.chromium.support_lib_boundary.util.b.o(r12, r1)     // Catch: java.lang.Throwable -> L91
                    throw r0     // Catch: java.lang.Throwable -> L91
                L99:
                    com.facebook.react.devsupport.BundleDownloader.access$setDownloadBundleFromURLCall$p(r0, r8)     // Catch: java.lang.Throwable -> L91
                    org.chromium.support_lib_boundary.util.b.o(r11, r8)
                    return
                La0:
                    throw r12     // Catch: java.lang.Throwable -> La1
                La1:
                    r0 = move-exception
                    org.chromium.support_lib_boundary.util.b.o(r11, r12)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.e0):void");
            }
        });
    }
}
