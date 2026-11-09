package com.palmpay.lib.webview.cache.service.base;

import Ef.a;
import Ff.c;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.DescriptorProtos;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.X;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J|\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J|\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0012J~\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J~\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0012Jb\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0006\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H&Jb\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/WebCacheNetDelegate;", "Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "<init>", "()V", "requestFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "", "url", FirebaseAnalytics.Param.METHOD, "header", "", "userAgent", "cookie", "body", "followRedirect", "", "request", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectFlow", "Ljava/io/InputStream;", "connect", "downloadFlow", "Ljava/io/File;", "savePath", "download", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheNetDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheNetDelegate.kt\ncom/palmpay/lib/webview/cache/service/base/WebCacheNetDelegate\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,226:1\n9#2,4:227\n9#2,4:231\n9#2,4:235\n*S KotlinDebug\n*F\n+ 1 WebCacheNetDelegate.kt\ncom/palmpay/lib/webview/cache/service/base/WebCacheNetDelegate\n*L\n44#1:227,4\n77#1:231,4\n108#1:235,4\n*E\n"})
public abstract class WebCacheNetDelegate extends AbstractDelegate {

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate$connect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate", f = "WebCacheNetDelegate.kt", i = {0}, l = {75}, m = "connect$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebCacheNetDelegate.connect$suspendImpl(WebCacheNetDelegate.this, null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate$download$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate", f = "WebCacheNetDelegate.kt", i = {0}, l = {106}, m = "download$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C14441 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14441(Continuation<? super C14441> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebCacheNetDelegate.download$suspendImpl(WebCacheNetDelegate.this, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate$request$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate", f = "WebCacheNetDelegate.kt", i = {0}, l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "request$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C14451 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14451(Continuation<? super C14451> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebCacheNetDelegate.request$suspendImpl(WebCacheNetDelegate.this, null, null, null, null, null, null, false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object connect$default(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z3, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
        }
        if ((i7 & 2) != 0) {
            str2 = "GET";
        }
        return webCacheNetDelegate.connect(str, str2, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : map2, (i7 & 64) != 0 ? true : z3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object connect$suspendImpl(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, Map<String, String> map, String str3, String str4, Map<String, String> map2, boolean z3, Continuation<? super NetState<InputStream>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = webCacheNetDelegate.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = webCacheNetDelegate.new AnonymousClass1(continuation);
        }
        Object objR = anonymousClass1.result;
        a aVar = a.f2423a;
        int i10 = anonymousClass1.label;
        try {
            if (i10 == 0) {
                g.M(objR);
                Flow<NetState<InputStream>> flowConnectFlow = webCacheNetDelegate.connectFlow(str, str2, map, str3, str4, map2, z3);
                if (flowConnectFlow == null) {
                    return null;
                }
                anonymousClass1.L$0 = webCacheNetDelegate;
                anonymousClass1.label = 1;
                objR = X.r(flowConnectFlow, anonymousClass1);
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webCacheNetDelegate = (WebCacheNetDelegate) anonymousClass1.L$0;
                g.M(objR);
            }
            List list = (List) objR;
            if (list != null) {
                return (NetState) CollectionsKt.K(list);
            }
            return null;
        } catch (Exception e10) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(webCacheNetDelegate.getName(), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow connectFlow$default(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z3, int i7, Object obj) {
        if (obj == null) {
            return webCacheNetDelegate.connectFlow(str, (i7 & 2) != 0 ? "GET" : str2, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) == 0 ? map2 : null, (i7 & 64) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectFlow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object download$default(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, String str3, Map map, String str4, String str5, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
        if ((i7 & 4) != 0) {
            str3 = "GET";
        }
        return webCacheNetDelegate.download(str, str2, str3, (i7 & 8) != 0 ? null : map, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object download$suspendImpl(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, String str3, Map<String, String> map, String str4, String str5, Continuation<? super NetState<File>> continuation) {
        C14441 c14441;
        if (continuation instanceof C14441) {
            c14441 = (C14441) continuation;
            int i7 = c14441.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14441.label = i7 - Integer.MIN_VALUE;
            } else {
                c14441 = webCacheNetDelegate.new C14441(continuation);
            }
        } else {
            c14441 = webCacheNetDelegate.new C14441(continuation);
        }
        Object objR = c14441.result;
        a aVar = a.f2423a;
        int i10 = c14441.label;
        try {
            if (i10 == 0) {
                g.M(objR);
                Flow<NetState<File>> flowDownloadFlow = webCacheNetDelegate.downloadFlow(str, str2, str3, map, str4, str5);
                if (flowDownloadFlow == null) {
                    return null;
                }
                c14441.L$0 = webCacheNetDelegate;
                c14441.label = 1;
                objR = X.r(flowDownloadFlow, c14441);
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webCacheNetDelegate = (WebCacheNetDelegate) c14441.L$0;
                g.M(objR);
            }
            List list = (List) objR;
            if (list != null) {
                return (NetState) CollectionsKt.K(list);
            }
            return null;
        } catch (Exception e10) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(webCacheNetDelegate.getName(), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow downloadFlow$default(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, String str3, Map map, String str4, String str5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadFlow");
        }
        if ((i7 & 4) != 0) {
            str3 = "GET";
        }
        return webCacheNetDelegate.downloadFlow(str, str2, str3, (i7 & 8) != 0 ? null : map, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object request$default(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z3, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i7 & 2) != 0) {
            str2 = "GET";
        }
        return webCacheNetDelegate.request(str, str2, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : map2, (i7 & 64) != 0 ? true : z3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object request$suspendImpl(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, Map<String, String> map, String str3, String str4, Map<String, String> map2, boolean z3, Continuation<? super NetState<String>> continuation) {
        C14451 c14451;
        if (continuation instanceof C14451) {
            c14451 = (C14451) continuation;
            int i7 = c14451.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14451.label = i7 - Integer.MIN_VALUE;
            } else {
                c14451 = webCacheNetDelegate.new C14451(continuation);
            }
        } else {
            c14451 = webCacheNetDelegate.new C14451(continuation);
        }
        Object objR = c14451.result;
        a aVar = a.f2423a;
        int i10 = c14451.label;
        try {
            if (i10 == 0) {
                g.M(objR);
                Flow<NetState<String>> flowRequestFlow = webCacheNetDelegate.requestFlow(str, str2, map, str3, str4, map2, z3);
                if (flowRequestFlow == null) {
                    return null;
                }
                c14451.L$0 = webCacheNetDelegate;
                c14451.label = 1;
                objR = X.r(flowRequestFlow, c14451);
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webCacheNetDelegate = (WebCacheNetDelegate) c14451.L$0;
                g.M(objR);
            }
            List list = (List) objR;
            if (list != null) {
                return (NetState) CollectionsKt.K(list);
            }
            return null;
        } catch (Exception e10) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(webCacheNetDelegate.getName(), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow requestFlow$default(WebCacheNetDelegate webCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z3, int i7, Object obj) {
        if (obj == null) {
            return webCacheNetDelegate.requestFlow(str, (i7 & 2) != 0 ? "GET" : str2, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) == 0 ? map2 : null, (i7 & 64) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFlow");
    }

    @Nullable
    public Object connect(@NotNull String str, @NotNull String str2, @Nullable Map<String, String> map, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map2, boolean z3, @NotNull Continuation<? super NetState<InputStream>> continuation) {
        return connect$suspendImpl(this, str, str2, map, str3, str4, map2, z3, continuation);
    }

    @Nullable
    public abstract Flow<NetState<InputStream>> connectFlow(@NotNull String url, @NotNull String method, @Nullable Map<String, String> header, @Nullable String userAgent, @Nullable String cookie, @Nullable Map<String, String> body, boolean followRedirect);

    @Nullable
    public Object download(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Map<String, String> map, @Nullable String str4, @Nullable String str5, @NotNull Continuation<? super NetState<File>> continuation) {
        return download$suspendImpl(this, str, str2, str3, map, str4, str5, continuation);
    }

    @Nullable
    public abstract Flow<NetState<File>> downloadFlow(@NotNull String url, @NotNull String savePath, @NotNull String method, @Nullable Map<String, String> header, @Nullable String userAgent, @Nullable String cookie);

    @Nullable
    public Object request(@NotNull String str, @NotNull String str2, @Nullable Map<String, String> map, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map2, boolean z3, @NotNull Continuation<? super NetState<String>> continuation) {
        return request$suspendImpl(this, str, str2, map, str3, str4, map2, z3, continuation);
    }

    @Nullable
    public abstract Flow<NetState<String>> requestFlow(@NotNull String url, @NotNull String method, @Nullable Map<String, String> header, @Nullable String userAgent, @Nullable String cookie, @Nullable Map<String, String> body, boolean followRedirect);
}
