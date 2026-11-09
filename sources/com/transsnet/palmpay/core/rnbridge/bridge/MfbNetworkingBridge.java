package com.transsnet.palmpay.core.rnbridge.bridge;

import android.app.Activity;
import androidx.camera.video.u;
import androidx.lifecycle.LifecycleOwner;
import com.didi.drouter.annotation.Service;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.H;
import okhttp3.J;
import okhttp3.L;
import okhttp3.X;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p077f4.n;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/mfb/MFBNetworking"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&J#\u0010*\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/MfbNetworkingBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/MfbRequestParams;", "<init>", "()V", "Lokhttp3/Call;", "call", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "handleRequestFailure", "(Lokhttp3/Call;Ljava/lang/Exception;)V", "", "path", "", "isAbsolutePath", "(Ljava/lang/String;)Z", "Lokhttp3/J;", "url", "rawParams", "buildGetUrl", "(Lokhttp3/J;Ljava/lang/String;)Lokhttp3/J;", "rawBody", "buildPostBody", "(Ljava/lang/String;)Ljava/lang/String;", "rawJson", "fieldName", "Lcom/google/gson/JsonObject;", "parseJsonObject", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonObject;", "Lcom/google/gson/JsonElement;", "value", "jsonValueToQueryValue", "(Lcom/google/gson/JsonElement;)Ljava/lang/String;", "body", "", "parseResponseEntry", "(Ljava/lang/String;)Ljava/lang/Object;", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/transsnet/palmpay/core/rnbridge/bridge/MfbRequestParams;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "activeCall", "Ljava/util/concurrent/atomic/AtomicReference;", "destroyed", "Z", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMfbNetworkingBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MfbNetworkingBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/MfbNetworkingBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1869#2,2:245\n*S KotlinDebug\n*F\n+ 1 MfbNetworkingBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/MfbNetworkingBridge\n*L\n166#1:245,2\n*E\n"})
public final class MfbNetworkingBridge extends AsyncBridge<MfbRequestParams> {

    @NotNull
    private static final String ACTION_REQUEST = "request";

    @NotNull
    private static final String EMPTY_JSON_OBJECT = "{}";

    @NotNull
    private static final String METHOD_GET = "get";

    @NotNull
    private static final String METHOD_POST = "post";

    @NotNull
    private final AtomicReference<Call> activeCall = new AtomicReference<>(null);
    private volatile boolean destroyed;

    @NotNull
    private static final L JSON_MEDIA_TYPE = L.f40589e.get("application/json; charset=utf-8");

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.rnbridge.bridge.MfbNetworkingBridge$onHandle$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/transsnet/palmpay/core/rnbridge/bridge/MfbNetworkingBridge$onHandle$1", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/e0;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/e0;)V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements Callback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResponse$lambda$1$lambda$0(MfbNetworkingBridge mfbNetworkingBridge) {
            p252qa.a.a(mfbNetworkingBridge.getActivity());
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            try {
                MfbNetworkingBridge.this.handleRequestFailure(call, e10);
                AtomicReference atomicReference = MfbNetworkingBridge.this.activeCall;
                while (!atomicReference.compareAndSet(call, null) && atomicReference.get() == call) {
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = MfbNetworkingBridge.this.activeCall;
                while (!atomicReference2.compareAndSet(call, null) && atomicReference2.get() == call) {
                }
                throw th;
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, e0 response) {
            String strB;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                try {
                    MfbNetworkingBridge mfbNetworkingBridge = MfbNetworkingBridge.this;
                    try {
                        h0 h0Var = response.f40734g;
                        String body = h0Var != null ? h0Var.string() : null;
                        if (body == null) {
                            body = "";
                        }
                        if (!response.isSuccessful() && body.length() == 0) {
                            mfbNetworkingBridge.handleFail(new IOException("HTTP " + response.f40731d));
                            response.close();
                            AtomicReference atomicReference = MfbNetworkingBridge.this.activeCall;
                            while (!atomicReference.compareAndSet(call, null) && atomicReference.get() == call) {
                            }
                            return;
                        }
                        Object responseEntry = mfbNetworkingBridge.parseResponseEntry(body);
                        Set set = p252qa.a.f41468a;
                        Intrinsics.checkNotNullParameter(body, "body");
                        if (StringsKt.F(body)) {
                            strB = null;
                        } else {
                            try {
                                strB = p252qa.a.b(JsonParser.parseString(body));
                            } catch (Exception unused) {
                                strB = null;
                            }
                        }
                        if (strB == null) {
                            strB = p252qa.a.b(responseEntry);
                        }
                        if ((strB == null || StringsKt.F(strB) || !p252qa.a.f41468a.contains(strB)) ? false : true) {
                            Activity activity = mfbNetworkingBridge.getActivity();
                            if (activity != null) {
                                activity.runOnUiThread(new b(mfbNetworkingBridge, 4));
                            } else {
                                p252qa.a.a(null);
                            }
                        }
                        BaseBridge.handleSuccess$default(mfbNetworkingBridge, responseEntry, null, 2, null);
                        Unit unit = Unit.f38893a;
                        response.close();
                        AtomicReference atomicReference2 = MfbNetworkingBridge.this.activeCall;
                        while (!atomicReference2.compareAndSet(call, null) && atomicReference2.get() == call) {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            org.chromium.support_lib_boundary.util.b.o(response, th);
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    MfbNetworkingBridge.this.handleRequestFailure(call, e10);
                    AtomicReference atomicReference3 = MfbNetworkingBridge.this.activeCall;
                    while (!atomicReference3.compareAndSet(call, null) && atomicReference3.get() == call) {
                    }
                }
            } catch (Throwable th3) {
                AtomicReference atomicReference4 = MfbNetworkingBridge.this.activeCall;
                while (!atomicReference4.compareAndSet(call, null) && atomicReference4.get() == call) {
                }
                throw th3;
            }
        }
    }

    private final J buildGetUrl(J url, String rawParams) {
        if (rawParams == null || StringsKt.F(rawParams)) {
            return url;
        }
        JsonObject jsonObject = parseJsonObject(rawParams, "params");
        if (jsonObject == null) {
            return null;
        }
        H hF = url.f();
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonObject.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "entrySet(...)");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.e(entry);
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            Intrinsics.e(str);
            Intrinsics.e(jsonElement);
            hF.a(str, jsonValueToQueryValue(jsonElement));
        }
        return hF.b();
    }

    private final String buildPostBody(String rawBody) {
        if (rawBody == null || StringsKt.F(rawBody)) {
            return EMPTY_JSON_OBJECT;
        }
        try {
            JsonParser.parseString(rawBody);
            return rawBody;
        } catch (Exception unused) {
            handleIllegalArgument("body must be valid json");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRequestFailure(Call call, Exception error) {
        if (call.isCanceled()) {
            handleCancel("request canceled");
        } else {
            handleFail(error);
        }
    }

    private final boolean isAbsolutePath(String path) {
        return y.m(path, "http://", true) || y.m(path, "https://", true) || y.m(path, "//", false);
    }

    private final String jsonValueToQueryValue(JsonElement value) {
        String string;
        String str;
        if (value.isJsonNull()) {
            return "";
        }
        if (value.isJsonPrimitive()) {
            string = value.getAsString();
            str = "getAsString(...)";
        } else {
            string = value.toString();
            str = "toString(...)";
        }
        Intrinsics.checkNotNullExpressionValue(string, str);
        return string;
    }

    private final JsonObject parseJsonObject(String rawJson, String fieldName) {
        try {
            JsonElement string = JsonParser.parseString(rawJson);
            if (string.isJsonObject()) {
                return string.getAsJsonObject();
            }
            handleIllegalArgument(fieldName + " must be a json object");
            return null;
        } catch (Exception unused) {
            handleIllegalArgument(fieldName + " must be valid json");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseResponseEntry(String body) {
        if (StringsKt.F(body)) {
            return null;
        }
        try {
            return JsonParser.parseString(body);
        } catch (Exception unused) {
            return body;
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.destroyed = true;
        Call andSet = this.activeCall.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
        super.onDestroy(owner);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable MfbRequestParams params, @Nullable IBridgeCallback callback) {
        String strQ;
        String string;
        if (!Intrinsics.c(params != null ? params.getKey() : null, ACTION_REQUEST)) {
            handleIllegalArgument("key must be request");
            return;
        }
        String path = params.getPath();
        String string2 = path != null ? StringsKt.V(path).toString() : null;
        if (string2 == null || string2.length() == 0) {
            handleIllegalArgument("path is required");
            return;
        }
        if (isAbsolutePath(string2)) {
            handleReject("absolute url is not allowed");
            return;
        }
        String method = params.getMethod();
        if (method == null || (string = StringsKt.V(method).toString()) == null) {
            strQ = null;
        } else {
            Locale locale = Locale.US;
            strQ = u.q(locale, "US", string, locale, "toLowerCase(...)");
        }
        if (!Intrinsics.c(strQ, METHOD_GET) && !Intrinsics.c(strQ, METHOD_POST)) {
            handleIllegalArgument("method must be get or post");
            return;
        }
        n mVar = n.f36398b.getInstance();
        J url = mVar.f36400a.f41885c.j(string2);
        if (url == null) {
            handleIllegalArgument("invalid path");
            return;
        }
        X x3 = new X();
        if (Intrinsics.c(strQ, METHOD_GET)) {
            J url2 = buildGetUrl(url, params.getParams());
            if (url2 == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(url2, "url");
            x3.f40680a = url2;
            x3.d();
        } else if (Intrinsics.c(strQ, METHOD_POST)) {
            String strBuildPostBody = buildPostBody(params.getBody());
            if (strBuildPostBody == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(url, "url");
            x3.f40680a = url;
            x3.h(c0.Companion.create(strBuildPostBody, JSON_MEDIA_TYPE));
        }
        Call callNewCall = mVar.f36400a.f41884b.newCall(x3.b());
        this.activeCall.set(callNewCall);
        if (this.destroyed) {
            AtomicReference<Call> atomicReference = this.activeCall;
            while (!atomicReference.compareAndSet(callNewCall, null) && atomicReference.get() == callNewCall) {
            }
            callNewCall.cancel();
            handleCancel("request canceled");
            return;
        }
        try {
            FirebasePerfOkHttpClient.enqueue(callNewCall, new AnonymousClass1());
        } catch (Exception e10) {
            AtomicReference<Call> atomicReference2 = this.activeCall;
            while (!atomicReference2.compareAndSet(callNewCall, null) && atomicReference2.get() == callNewCall) {
            }
            handleRequestFailure(callNewCall, e10);
        }
    }
}
