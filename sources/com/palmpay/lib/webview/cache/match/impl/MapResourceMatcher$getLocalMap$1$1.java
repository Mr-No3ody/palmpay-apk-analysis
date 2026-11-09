package com.palmpay.lib.webview.cache.match.impl;

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
@DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.MapResourceMatcher$getLocalMap$1$1", f = "MapResourceMatcher.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMapResourceMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapResourceMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/MapResourceMatcher$getLocalMap$1$1\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,164:1\n9#2,4:165\n9#2,4:169\n9#2,4:173\n*S KotlinDebug\n*F\n+ 1 MapResourceMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/MapResourceMatcher$getLocalMap$1$1\n*L\n136#1:165,4\n141#1:169,4\n144#1:173,4\n*E\n"})
public final class MapResourceMatcher$getLocalMap$1$1 extends h implements Function2<CoroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>>, Object> {
    int label;
    final /* synthetic */ MapResourceMatcher this$0;

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.match.impl.MapResourceMatcher$getLocalMap$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.MapResourceMatcher$getLocalMap$1$1$2", f = "MapResourceMatcher.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>>, Object> {
        int label;
        final /* synthetic */ MapResourceMatcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapResourceMatcher mapResourceMatcher, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = mapResourceMatcher;
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
                Channel<ConcurrentHashMap<String, WebCacheLocalResp>> waitingChannel = this.this$0.getWaitingChannel();
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
            return (ConcurrentHashMap) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapResourceMatcher$getLocalMap$1$1(MapResourceMatcher mapResourceMatcher, Continuation<? super MapResourceMatcher$getLocalMap$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mapResourceMatcher;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapResourceMatcher$getLocalMap$1$1(this.this$0, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                g.M(obj);
                MapResourceMatcher mapResourceMatcher = this.this$0;
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.d(mapResourceMatcher.getName(), "Waiting for receiving localResp.");
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
            MapResourceMatcher mapResourceMatcher2 = this.this$0;
            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
            if (webCacheLog2.getCanLog()) {
                webCacheLog2.d(mapResourceMatcher2.getName(), "Timeout in receiving localResp.");
            }
            return null;
        } catch (Exception e10) {
            MapResourceMatcher mapResourceMatcher3 = this.this$0;
            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
            if (webCacheLog3.getCanLog()) {
                webCacheLog3.e(mapResourceMatcher3.getName(), "Error in receiving localResp, e = " + e10);
            }
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConcurrentHashMap<String, WebCacheLocalResp>> continuation) {
        return ((MapResourceMatcher$getLocalMap$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
