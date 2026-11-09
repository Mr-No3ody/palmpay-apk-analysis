package com.palmpay.lib.webview.cache.match.impl;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalResp;
import com.palmpay.lib.webview.cache.service.base.FileState;
import com.palmpay.lib.webview.cache.util.UrlHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/palmpay/lib/webview/cache/service/base/FileState$Complete;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$flow$2", f = "PreloadHtmlMatcher.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
public final class PreloadHtmlMatcher$downloadHtmlFile$flow$2 extends h implements Function2<Pair<? extends Boolean, ? extends FileState.Complete>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PreloadHtmlMatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadHtmlMatcher$downloadHtmlFile$flow$2(PreloadHtmlMatcher preloadHtmlMatcher, String str, Continuation<? super PreloadHtmlMatcher$downloadHtmlFile$flow$2> continuation) {
        super(2, continuation);
        this.this$0 = preloadHtmlMatcher;
        this.$url = str;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PreloadHtmlMatcher$downloadHtmlFile$flow$2 preloadHtmlMatcher$downloadHtmlFile$flow$2 = new PreloadHtmlMatcher$downloadHtmlFile$flow$2(this.this$0, this.$url, continuation);
        preloadHtmlMatcher$downloadHtmlFile$flow$2.L$0 = obj;
        return preloadHtmlMatcher$downloadHtmlFile$flow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends FileState.Complete> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<Boolean, FileState.Complete>) pair, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapConvertHeader;
        a aVar = a.f2423a;
        int i7 = this.label;
        if (i7 == 0) {
            g.M(obj);
            Pair pair = (Pair) this.L$0;
            boolean zBooleanValue = ((Boolean) pair.f38891a).booleanValue();
            FileState.Complete complete = (FileState.Complete) pair.f38892b;
            LinkedHashMap linkedHashMapL = null;
            if (zBooleanValue) {
                this.this$0.setDownloadTask(null);
            }
            if (complete != null) {
                this.this$0.saveCookieFromRespHeaders(this.$url, complete.getHeaders());
                WebCacheLocalResp webCacheLocalResp = new WebCacheLocalResp(this.$url, "html", null, null, null, false, 60, null);
                webCacheLocalResp.setFilename(complete.getData().getAbsolutePath());
                Map<String, List<String>> headers = complete.getHeaders();
                if (headers != null && (mapConvertHeader = UrlHelper.INSTANCE.convertHeader(headers)) != null) {
                    linkedHashMapL = G.l(mapConvertHeader);
                }
                webCacheLocalResp.header = linkedHashMapL;
                Channel<WebCacheLocalResp> waitingChannel = this.this$0.getWaitingChannel();
                if (waitingChannel != null) {
                    this.label = 1;
                    if (waitingChannel.send(webCacheLocalResp, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<Boolean, FileState.Complete> pair, Continuation<? super Unit> continuation) {
        return ((PreloadHtmlMatcher$downloadHtmlFile$flow$2) create(pair, continuation)).invokeSuspend(Unit.f38893a);
    }
}
