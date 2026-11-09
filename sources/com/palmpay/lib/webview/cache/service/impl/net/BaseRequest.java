package com.palmpay.lib.webview.cache.service.impl.net;

import C0.G;
import Ef.a;
import Ff.h;
import Wf.AbstractC0774s;
import android.net.Uri;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import com.palmpay.lib.webview.cache.service.base.NetState;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 m*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001mB¥\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0015\u001a\u00020\u00102\u001e\u0010\u0017\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0016\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH¤@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0084@¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0$¢\u0006\u0004\b%\u0010&J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0004\u001a\u00020'H\u0084@¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020!¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020,H\u0004¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b2\u00103J!\u00106\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020,H\u0002¢\u0006\u0004\b8\u00107J!\u00109\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b;\u0010<R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010=\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR2\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010H\u001a\u0004\bM\u0010J\"\u0004\bN\u0010LR0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u00101\"\u0004\bS\u0010TR$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010=\u001a\u0004\bU\u0010?\"\u0004\bV\u0010AR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010W\u001a\u0004\b\\\u0010Y\"\u0004\b]\u0010[R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010/R$\u0010c\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u0010=\u001a\u0004\bd\u0010?R$\u0010f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010?¨\u0006n"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/BaseRequest;", "T", "", "", "url", FirebaseAnalytics.Param.METHOD, "userAgent", "cookies", "", "header", "", "params", "body", "", "allowRedirect", "referer", "", "connectTimeout", "readTimeout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;II)V", "responseCode", "", "responseHeaders", "", "contentLength", "Ljava/io/InputStream;", "inputStream", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "parseData", "(ILjava/util/Map;JLjava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ReactProgressBarViewManager.PROP_PROGRESS, "length", "", "notifyProgress", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "connectFlow", "()Lkotlinx/coroutines/flow/Flow;", "Ljava/net/URL;", "connect", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "()V", "Ljava/net/HttpURLConnection;", "connection", "writeBody", "(Ljava/net/HttpURLConnection;)V", "isAllowBody", "()Z", "getServerStream", "(ILjava/net/HttpURLConnection;)Ljava/io/InputStream;", "contentEncoding", "urlConnection", "getInputStream", "(Ljava/lang/String;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "getErrorStream", "gzipInputStream", "(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;", "isGzipContent", "(Ljava/lang/String;)Z", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getMethod", "setMethod", "getUserAgent", "setUserAgent", "getCookies", "setCookies", "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "setHeader", "(Ljava/util/Map;)V", "getParams", "setParams", "getBody", "setBody", "Z", "getAllowRedirect", "setAllowRedirect", "(Z)V", "getReferer", "setReferer", "I", "getConnectTimeout", "()I", "setConnectTimeout", "(I)V", "getReadTimeout", "setReadTimeout", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "setConnection", "value", "requestUrl", "getRequestUrl", "Lkotlinx/coroutines/flow/FlowCollector;", "flowCollector", "Lkotlinx/coroutines/flow/FlowCollector;", "LWf/s;", "ioDispatcher", "LWf/s;", "getTAG", "TAG", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/BaseRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,280:1\n1#2:281\n9#3,4:282\n*S KotlinDebug\n*F\n+ 1 BaseRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/BaseRequest\n*L\n174#1:282,4\n*E\n"})
public abstract class BaseRequest<T> {

    @NotNull
    public static final String HEAD_KEY_CONNECTION = "Connection";

    @NotNull
    public static final String HEAD_KEY_CONTENT_ENCODING = "Content-Encoding";

    @NotNull
    public static final String HEAD_KEY_COOKIE = "Cookie";

    @NotNull
    public static final String HEAD_KEY_REFERER = "Referer";

    @NotNull
    public static final String HEAD_KEY_USER_AGENT = "User-Agent";

    @NotNull
    public static final String HEAD_VALUE_CONNECTION_CLOSE = "close";

    @NotNull
    public static final String HEAD_VALUE_CONNECTION_KEEP_ALIVE = "keep-alive";
    private boolean allowRedirect;

    @Nullable
    private Map<String, String> body;
    private int connectTimeout;

    @Nullable
    private HttpURLConnection connection;

    @Nullable
    private String cookies;

    @Nullable
    private FlowCollector<? super NetState<T>> flowCollector;

    @Nullable
    private Map<String, String> header;

    @NotNull
    private final AbstractC0774s ioDispatcher;

    @NotNull
    private String method;

    @Nullable
    private Map<String, String> params;
    private int readTimeout;

    @Nullable
    private String referer;

    @NotNull
    private String requestUrl;

    @NotNull
    private String url;

    @Nullable
    private String userAgent;

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.net.BaseRequest$connectFlow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/palmpay/lib/webview/cache/service/base/NetState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.net.BaseRequest$connectFlow$1", f = "BaseRequest.kt", i = {}, l = {HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG, HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<FlowCollector<? super NetState<T>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRequest<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseRequest<T> baseRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseRequest;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // Ff.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Exception {
            /*
                r5 = this;
                Ef.a r0 = Ef.a.f2423a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                androidx.camera.core.impl.utils.executor.g.M(r6)
                goto L51
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                androidx.camera.core.impl.utils.executor.g.M(r6)
                goto L45
            L20:
                androidx.camera.core.impl.utils.executor.g.M(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.palmpay.lib.webview.cache.service.impl.net.BaseRequest<T> r6 = r5.this$0
                com.palmpay.lib.webview.cache.service.impl.net.BaseRequest.access$setFlowCollector$p(r6, r1)
                java.net.URL r6 = new java.net.URL
                com.palmpay.lib.webview.cache.service.impl.net.BaseRequest<T> r4 = r5.this$0
                java.lang.String r4 = r4.getRequestUrl()
                r6.<init>(r4)
                com.palmpay.lib.webview.cache.service.impl.net.BaseRequest<T> r4 = r5.this$0
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.connect(r6, r5)
                if (r6 != r0) goto L45
                goto L50
            L45:
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                kotlin.Unit r6 = kotlin.Unit.f38893a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.webview.cache.service.impl.net.BaseRequest.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super NetState<T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.net.BaseRequest$connectFlow$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/palmpay/lib/webview/cache/service/base/NetState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.net.BaseRequest$connectFlow$2", f = "BaseRequest.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends h implements Function2<FlowCollector<? super NetState<T>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRequest<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BaseRequest<T> baseRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = baseRequest;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                NetState.OnStart onStart = new NetState.OnStart(this.this$0.getRequestUrl());
                this.label = 1;
                if (flowCollector.emit(onStart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super NetState<T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.net.BaseRequest$connectFlow$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "e", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.net.BaseRequest$connectFlow$3", f = "BaseRequest.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBaseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/BaseRequest$connectFlow$3\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,280:1\n9#2,4:281\n*S KotlinDebug\n*F\n+ 1 BaseRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/BaseRequest$connectFlow$3\n*L\n96#1:281,4\n*E\n"})
    public static final class AnonymousClass3 extends h implements Function3<FlowCollector<? super NetState<T>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ BaseRequest<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BaseRequest<T> baseRequest, Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
            this.this$0 = baseRequest;
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                BaseRequest<T> baseRequest = this.this$0;
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.e(baseRequest.getTAG(), th);
                }
                NetState.Error error = new NetState.Error(-1, th);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(error, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super NetState<T>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = flowCollector;
            anonymousClass3.L$1 = th;
            return anonymousClass3.invokeSuspend(Unit.f38893a);
        }
    }

    public BaseRequest(@NotNull String url, @NotNull String method, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, boolean z3, @Nullable String str3, int i7, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.url = url;
        this.method = method;
        this.userAgent = str;
        this.cookies = str2;
        this.header = map;
        this.params = map2;
        this.body = map3;
        this.allowRedirect = z3;
        this.referer = str3;
        this.connectTimeout = i7;
        this.readTimeout = i10;
        this.requestUrl = url;
        this.ioDispatcher = WebCacheConstant.INSTANCE.getIoDispatcher$lib_webview_release();
    }

    private final InputStream getErrorStream(String contentEncoding, HttpURLConnection urlConnection) throws IOException {
        InputStream errorStream = urlConnection.getErrorStream();
        Intrinsics.e(errorStream);
        return gzipInputStream(contentEncoding, errorStream);
    }

    private final InputStream getInputStream(String contentEncoding, HttpURLConnection urlConnection) throws IOException {
        InputStream inputStream = urlConnection.getInputStream();
        Intrinsics.e(inputStream);
        return gzipInputStream(contentEncoding, inputStream);
    }

    private final InputStream getServerStream(int responseCode, HttpURLConnection connection) throws IOException {
        String headerField = connection.getHeaderField("Content-Encoding");
        return responseCode >= 400 ? getErrorStream(headerField, connection) : getInputStream(headerField, connection);
    }

    private final InputStream gzipInputStream(String contentEncoding, InputStream inputStream) throws IOException {
        return isGzipContent(contentEncoding) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private final boolean isAllowBody() {
        String str = this.method;
        switch (str.hashCode()) {
            case 79599:
                return str.equals("PUT");
            case 2461856:
                return str.equals("POST");
            case 75900968:
                return str.equals("PATCH");
            case 2012838315:
                return str.equals("DELETE");
            default:
                return false;
        }
    }

    private final boolean isGzipContent(String contentEncoding) {
        return contentEncoding != null && StringsKt.A(contentEncoding, "gzip", false);
    }

    @Nullable
    public final Object connect(@NotNull URL url, @NotNull Continuation<? super NetState<T>> continuation) throws Exception {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.connection = httpURLConnection;
        httpURLConnection.setConnectTimeout(this.connectTimeout);
        httpURLConnection.setReadTimeout(this.readTimeout);
        httpURLConnection.setInstanceFollowRedirects(this.allowRedirect);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLUtils sSLUtils = SSLUtils.INSTANCE;
            httpsURLConnection.setSSLSocketFactory(sSLUtils.defaultSSLSocketFactory());
            httpsURLConnection.setHostnameVerifier(sSLUtils.defaultHostnameVerifier(url));
        }
        httpURLConnection.setRequestMethod(this.method);
        httpURLConnection.setDoInput(true);
        if (isAllowBody()) {
            httpURLConnection.setDoOutput(true);
            writeBody(httpURLConnection);
        }
        Map map = this.header;
        if (map == null) {
            map = new HashMap();
        }
        map.put("Connection", HEAD_VALUE_CONNECTION_KEEP_ALIVE);
        for (String str : map.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) map.get(str));
        }
        String str2 = this.cookies;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("Cookie", str2);
        }
        String str3 = this.userAgent;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        String str4 = this.referer;
        if (str4 != null) {
            httpURLConnection.setRequestProperty("Referer", str4);
        }
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308) {
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
            return new NetState.Redirect(responseCode, httpURLConnection.getHeaderFields(), headerField);
        }
        if ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 205 || (300 <= responseCode && responseCode < 400)) {
            return new NetState.Error(responseCode, new Exception(G.o("Http Error: ", httpURLConnection.getResponseMessage())));
        }
        return parseData(responseCode, httpURLConnection.getHeaderFields(), httpURLConnection.getContentLengthLong(), !Intrinsics.c(this.method, "HEAD") ? getServerStream(responseCode, httpURLConnection) : null, continuation);
    }

    @NotNull
    public final Flow<NetState<T>> connectFlow() {
        return X.n(new C1888u(new C1888u(new AnonymousClass2(this, null), new T(new AnonymousClass1(this, null))), new AnonymousClass3(this, null)), this.ioDispatcher);
    }

    public final void disconnect() {
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            webCacheLog.d(getTAG(), "connection.disconnect() called");
        }
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final boolean getAllowRedirect() {
        return this.allowRedirect;
    }

    @Nullable
    public final Map<String, String> getBody() {
        return this.body;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    @Nullable
    public final String getCookies() {
        return this.cookies;
    }

    @Nullable
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @Nullable
    public final String getReferer() {
        return this.referer;
    }

    @NotNull
    public final String getRequestUrl() {
        Map<String, String> map = this.params;
        if (map == null || !(!map.isEmpty())) {
            return this.url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(this.url).buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, URLEncoder.encode(map.get(str), Constants.ENCODING));
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public abstract String getTAG();

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public final Object notifyProgress(long j6, long j10, @NotNull Continuation<? super Unit> continuation) {
        FlowCollector<? super NetState<T>> flowCollector = this.flowCollector;
        if (flowCollector == null) {
            return Unit.f38893a;
        }
        Object objEmit = flowCollector.emit(new NetState.OnProgress(j6, j10), continuation);
        return objEmit == a.f2423a ? objEmit : Unit.f38893a;
    }

    @Nullable
    public abstract Object parseData(int i7, @Nullable Map<String, ? extends List<String>> map, long j6, @Nullable InputStream inputStream, @NotNull Continuation<? super NetState<T>> continuation);

    public final void setAllowRedirect(boolean z3) {
        this.allowRedirect = z3;
    }

    public final void setBody(@Nullable Map<String, String> map) {
        this.body = map;
    }

    public final void setConnectTimeout(int i7) {
        this.connectTimeout = i7;
    }

    public final void setConnection(@Nullable HttpURLConnection httpURLConnection) {
        this.connection = httpURLConnection;
    }

    public final void setCookies(@Nullable String str) {
        this.cookies = str;
    }

    public final void setHeader(@Nullable Map<String, String> map) {
        this.header = map;
    }

    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.method = str;
    }

    public final void setParams(@Nullable Map<String, String> map) {
        this.params = map;
    }

    public final void setReadTimeout(int i7) {
        this.readTimeout = i7;
    }

    public final void setReferer(@Nullable String str) {
        this.referer = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setUserAgent(@Nullable String str) {
        this.userAgent = str;
    }

    public final void writeBody(@NotNull HttpURLConnection connection) throws IOException {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Map<String, String> map = this.body;
        if (map == null || !(!map.isEmpty())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : map.keySet()) {
            u.w(sb2, "&", str, "=");
            sb2.append(URLEncoder.encode(map.get(str), Constants.ENCODING));
        }
        sb2.deleteCharAt(0);
        OutputStream outputStream = connection.getOutputStream();
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }

    public /* synthetic */ BaseRequest(String str, String str2, String str3, String str4, Map map, Map map2, Map map3, boolean z3, String str5, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "GET" : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : map2, (i11 & 64) != 0 ? null : map3, (i11 & 128) != 0 ? true : z3, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 ? str5 : null, (i11 & 512) != 0 ? 5000 : i7, (i11 & 1024) != 0 ? 5000 : i10);
    }
}
