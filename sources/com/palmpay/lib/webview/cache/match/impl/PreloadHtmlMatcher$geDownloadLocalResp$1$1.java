package com.palmpay.lib.webview.cache.match.impl;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.y0;
import androidx.camera.core.impl.utils.executor.g;
import com.facebook.imageutils.JfifUtil;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalResp;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$geDownloadLocalResp$1$1", f = "PreloadHtmlMatcher.kt", i = {}, l = {JfifUtil.MARKER_EOI}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher$geDownloadLocalResp$1$1\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,240:1\n9#2,4:241\n9#2,4:245\n9#2,4:249\n9#2,4:253\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher$geDownloadLocalResp$1$1\n*L\n214#1:241,4\n216#1:245,4\n222#1:249,4\n225#1:253,4\n*E\n"})
public final class PreloadHtmlMatcher$geDownloadLocalResp$1$1 extends h implements Function2<CoroutineScope, Continuation<? super WebCacheLocalResp>, Object> {
    int label;
    final /* synthetic */ PreloadHtmlMatcher this$0;

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$geDownloadLocalResp$1$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$geDownloadLocalResp$1$1$3", f = "PreloadHtmlMatcher.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher$geDownloadLocalResp$1$1$3\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,240:1\n9#2,4:241\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher$geDownloadLocalResp$1$1$3\n*L\n218#1:241,4\n*E\n"})
    public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation<? super WebCacheLocalResp>, Object> {
        int label;
        final /* synthetic */ PreloadHtmlMatcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PreloadHtmlMatcher preloadHtmlMatcher, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = preloadHtmlMatcher;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                PreloadHtmlMatcher preloadHtmlMatcher = this.this$0;
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.d(preloadHtmlMatcher.getName(), "receive--------");
                }
                Channel<WebCacheLocalResp> waitingChannel = this.this$0.getWaitingChannel();
                if (waitingChannel == null) {
                    return null;
                }
                this.label = 1;
                obj = waitingChannel.receive(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return (WebCacheLocalResp) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WebCacheLocalResp> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadHtmlMatcher$geDownloadLocalResp$1$1(PreloadHtmlMatcher preloadHtmlMatcher, Continuation<? super PreloadHtmlMatcher$geDownloadLocalResp$1$1> continuation) {
        super(2, continuation);
        this.this$0 = preloadHtmlMatcher;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreloadHtmlMatcher$geDownloadLocalResp$1$1(this.this$0, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                g.M(obj);
                PreloadHtmlMatcher preloadHtmlMatcher = this.this$0;
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.d(preloadHtmlMatcher.getName(), "Waiting for receiving pre-download html file.");
                }
                if (webCacheLog.getCanLog()) {
                    webCacheLog.d("", "receive++++++++++");
                }
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                obj = AbstractC0780y.t(2000L, anonymousClass3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return (WebCacheLocalResp) obj;
        } catch (y0 unused) {
            PreloadHtmlMatcher preloadHtmlMatcher2 = this.this$0;
            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
            if (webCacheLog2.getCanLog()) {
                webCacheLog2.d(preloadHtmlMatcher2.getName(), "Timeout in receiving pre-download html file.");
            }
            return null;
        } catch (Exception e10) {
            PreloadHtmlMatcher preloadHtmlMatcher3 = this.this$0;
            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
            if (webCacheLog3.getCanLog()) {
                webCacheLog3.e(preloadHtmlMatcher3.getName(), "Error in receiving pre-download html file, e = " + e10);
            }
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WebCacheLocalResp> continuation) {
        return ((PreloadHtmlMatcher$geDownloadLocalResp$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
