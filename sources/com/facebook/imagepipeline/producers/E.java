package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E implements RequestListener2, ProducerListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestListener f21471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestListener2 f21472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p122i3.d f21473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p122i3.c f21474d;

    public E(p122i3.d dVar, p122i3.c cVar) {
        this.f21471a = dVar;
        this.f21472b = cVar;
        this.f21473c = dVar;
        this.f21474d = cVar;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerEvent(ProducerContext context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        if (requestListener != null) {
            requestListener.onProducerEvent(context.getId(), str, str2);
        }
        RequestListener2 requestListener2 = this.f21472b;
        if (requestListener2 != null) {
            requestListener2.onProducerEvent(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerFinishWithCancellation(ProducerContext context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        if (requestListener != null) {
            requestListener.onProducerFinishWithCancellation(context.getId(), str, map);
        }
        RequestListener2 requestListener2 = this.f21472b;
        if (requestListener2 != null) {
            requestListener2.onProducerFinishWithCancellation(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerFinishWithFailure(ProducerContext context, String str, Throwable th, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        if (requestListener != null) {
            requestListener.onProducerFinishWithFailure(context.getId(), str, th, map);
        }
        RequestListener2 requestListener2 = this.f21472b;
        if (requestListener2 != null) {
            requestListener2.onProducerFinishWithFailure(context, str, th, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerFinishWithSuccess(ProducerContext context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        if (requestListener != null) {
            requestListener.onProducerFinishWithSuccess(context.getId(), str, map);
        }
        RequestListener2 requestListener2 = this.f21472b;
        if (requestListener2 != null) {
            requestListener2.onProducerFinishWithSuccess(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerStart(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        if (requestListener != null) {
            requestListener.onProducerStart(context.getId(), str);
        }
        RequestListener2 requestListener2 = this.f21472b;
        if (requestListener2 != null) {
            requestListener2.onProducerStart(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestCancellation(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p122i3.d dVar = this.f21473c;
        if (dVar != null) {
            dVar.onRequestCancellation(producerContext.getId());
        }
        p122i3.c cVar = this.f21474d;
        if (cVar != null) {
            cVar.onRequestCancellation(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestFailure(ProducerContext producerContext, Throwable th) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p122i3.d dVar = this.f21473c;
        if (dVar != null) {
            dVar.onRequestFailure(producerContext.getImageRequest(), producerContext.getId(), th, producerContext.isPrefetch());
        }
        p122i3.c cVar = this.f21474d;
        if (cVar != null) {
            cVar.onRequestFailure(producerContext, th);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestStart(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p122i3.d dVar = this.f21473c;
        if (dVar != null) {
            dVar.onRequestStart(producerContext.getImageRequest(), producerContext.getCallerContext(), producerContext.getId(), producerContext.isPrefetch());
        }
        p122i3.c cVar = this.f21474d;
        if (cVar != null) {
            cVar.onRequestStart(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestSuccess(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p122i3.d dVar = this.f21473c;
        if (dVar != null) {
            dVar.onRequestSuccess(producerContext.getImageRequest(), producerContext.getId(), producerContext.isPrefetch());
        }
        p122i3.c cVar = this.f21474d;
        if (cVar != null) {
            cVar.onRequestSuccess(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onUltimateProducerReached(ProducerContext context, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        if (requestListener != null) {
            requestListener.onUltimateProducerReached(context.getId(), str, z3);
        }
        RequestListener2 requestListener2 = this.f21472b;
        if (requestListener2 != null) {
            requestListener2.onUltimateProducerReached(context, str, z3);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final boolean requiresExtraMap(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f21471a;
        Boolean boolValueOf = requestListener != null ? Boolean.valueOf(requestListener.requiresExtraMap(context.getId())) : null;
        if (!Intrinsics.c(boolValueOf, Boolean.TRUE)) {
            RequestListener2 requestListener2 = this.f21472b;
            boolValueOf = requestListener2 != null ? Boolean.valueOf(requestListener2.requiresExtraMap(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
