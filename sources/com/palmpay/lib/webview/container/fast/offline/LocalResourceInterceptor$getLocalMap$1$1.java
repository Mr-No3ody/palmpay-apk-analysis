package com.palmpay.lib.webview.container.fast.offline;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.y0;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalResp;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor$getLocalMap$1$1", f = "LocalResourceInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLocalResourceInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor$getLocalMap$1$1\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,175:1\n9#2,4:176\n9#2,4:180\n9#2,4:184\n*S KotlinDebug\n*F\n+ 1 LocalResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor$getLocalMap$1$1\n*L\n130#1:176,4\n135#1:180,4\n138#1:184,4\n*E\n"})
public final class LocalResourceInterceptor$getLocalMap$1$1 extends h implements Function2<CoroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>>, Object> {
    int label;
    final /* synthetic */ LocalResourceInterceptor this$0;

    /* JADX INFO: renamed from: com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor$getLocalMap$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor$getLocalMap$1$1$2", f = "LocalResourceInterceptor.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>>, Object> {
        int label;
        final /* synthetic */ LocalResourceInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LocalResourceInterceptor localResourceInterceptor, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = localResourceInterceptor;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                Channel channel = this.this$0.waitingChannel;
                if (channel == null) {
                    return null;
                }
                this.label = 1;
                obj = channel.receive(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return (ConcurrentHashMap) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalResourceInterceptor$getLocalMap$1$1(LocalResourceInterceptor localResourceInterceptor, Continuation<? super LocalResourceInterceptor$getLocalMap$1$1> continuation) {
        super(2, continuation);
        this.this$0 = localResourceInterceptor;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalResourceInterceptor$getLocalMap$1$1(this.this$0, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                g.M(obj);
                LocalResourceInterceptor localResourceInterceptor = this.this$0;
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.d(localResourceInterceptor.getName(), "Waiting for receiving localResp.");
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                obj = AbstractC0780y.t(1000L, anonymousClass2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return (ConcurrentHashMap) obj;
        } catch (y0 unused) {
            LocalResourceInterceptor localResourceInterceptor2 = this.this$0;
            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
            if (webCacheLog2.getCanLog()) {
                webCacheLog2.d(localResourceInterceptor2.getName(), "Timeout in receiving localResp.");
            }
            return null;
        } catch (Exception e10) {
            LocalResourceInterceptor localResourceInterceptor3 = this.this$0;
            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
            if (webCacheLog3.getCanLog()) {
                webCacheLog3.e(localResourceInterceptor3.getName(), "Error in receiving localResp, e = " + e10);
            }
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>> continuation) {
        return ((LocalResourceInterceptor$getLocalMap$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
