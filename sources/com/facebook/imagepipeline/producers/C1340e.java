package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.core.ImagePipelineConfigInterface;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1340e implements ProducerContext {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f21549A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.facebook.soloader.q f21550w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.request.d f21551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProducerListener2 f21554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f21555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.facebook.imagepipeline.request.c f21556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f21557g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.facebook.imagepipeline.common.e f21559j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21561p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImagePipelineConfigInterface f21562v;

    static {
        int i7 = com.facebook.soloader.q.f21903a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, "id", "uri_source");
        f21550w = new com.facebook.soloader.q(hashSet);
        f21549A = new Object();
    }

    public C1340e(com.facebook.imagepipeline.request.d dVar, String str, String str2, ProducerListener2 producerListener2, Object obj, com.facebook.imagepipeline.request.c cVar, boolean z3, boolean z8, com.facebook.imagepipeline.common.e eVar, ImagePipelineConfigInterface imagePipelineConfigInterface) {
        this.f21551a = dVar;
        this.f21552b = str;
        HashMap map = new HashMap();
        this.f21557g = map;
        map.put("id", str);
        map.put("uri_source", dVar == null ? "null-request" : dVar.getSourceUri());
        this.f21553c = str2;
        this.f21554d = producerListener2;
        this.f21555e = obj == null ? f21549A : obj;
        this.f21556f = cVar;
        this.f21558i = z3;
        this.f21559j = eVar;
        this.f21560o = z8;
        this.f21561p = false;
        this.t = new ArrayList();
        this.f21562v = imagePipelineConfigInterface;
    }

    public static void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ProducerContextCallbacks) it.next()).onIsIntermediateResultExpectedChanged();
        }
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ProducerContextCallbacks) it.next()).onIsPrefetchChanged();
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ProducerContextCallbacks) it.next()).onPriorityChanged();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final void addCallbacks(ProducerContextCallbacks producerContextCallbacks) {
        boolean z3;
        synchronized (this) {
            this.t.add(producerContextCallbacks);
            z3 = this.f21561p;
        }
        if (z3) {
            producerContextCallbacks.onCancellationRequested();
        }
    }

    public final void d() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.f21561p) {
                arrayList = null;
            } else {
                this.f21561p = true;
                arrayList = new ArrayList(this.t);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ProducerContextCallbacks) it.next()).onCancellationRequested();
        }
    }

    public final synchronized ArrayList e(com.facebook.imagepipeline.common.e eVar) {
        if (eVar == this.f21559j) {
            return null;
        }
        this.f21559j = eVar;
        return new ArrayList(this.t);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final Object getCallerContext() {
        return this.f21555e;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return this.f21557g.get(str);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.f21557g;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final String getId() {
        return this.f21552b;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final ImagePipelineConfigInterface getImagePipelineConfig() {
        return this.f21562v;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final com.facebook.imagepipeline.request.d getImageRequest() {
        return this.f21551a;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final com.facebook.imagepipeline.request.c getLowestPermittedRequestLevel() {
        return this.f21556f;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final synchronized com.facebook.imagepipeline.common.e getPriority() {
        return this.f21559j;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final ProducerListener2 getProducerListener() {
        return this.f21554d;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final String getUiComponentId() {
        return this.f21553c;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final synchronized boolean isIntermediateResultExpected() {
        return this.f21560o;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final synchronized boolean isPrefetch() {
        return this.f21558i;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (f21550w.contains(str)) {
            return;
        }
        this.f21557g.put(str, obj);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            putExtra((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final void putOriginExtra(String str, String str2) {
        HashMap map = this.f21557g;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.f21557g.get(str);
        return obj2 == null ? obj : obj2;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final void putOriginExtra(String str) {
        putOriginExtra(str, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT);
    }
}
