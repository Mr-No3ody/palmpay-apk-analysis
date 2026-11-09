package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f21585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f21586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerListener2 f21587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProducerContext f21588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21589e;

    public j0(Consumer consumer, ProducerListener2 producerListener, ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.f21585a = new AtomicInteger(0);
        this.f21586b = consumer;
        this.f21587c = producerListener;
        this.f21588d = producerContext;
        this.f21589e = producerName;
        producerListener.onProducerStart(producerContext, producerName);
    }

    public final void a() {
        if (this.f21585a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        ProducerListener2 producerListener2 = this.f21587c;
        ProducerContext producerContext = this.f21588d;
        String str = this.f21589e;
        producerListener2.requiresExtraMap(producerContext, str);
        producerListener2.onProducerFinishWithCancellation(producerContext, str, null);
        this.f21586b.onCancellation();
    }

    public void f(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        ProducerListener2 producerListener2 = this.f21587c;
        ProducerContext producerContext = this.f21588d;
        String str = this.f21589e;
        producerListener2.requiresExtraMap(producerContext, str);
        producerListener2.onProducerFinishWithFailure(producerContext, str, e10, null);
        this.f21586b.onFailure(e10);
    }

    public void g(Object obj) {
        ProducerListener2 producerListener2 = this.f21587c;
        ProducerContext producerContext = this.f21588d;
        String str = this.f21589e;
        producerListener2.onProducerFinishWithSuccess(producerContext, str, producerListener2.requiresExtraMap(producerContext, str) ? c(obj) : null);
        this.f21586b.onNewResult(obj, 1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f21585a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e10) {
                atomicInteger.set(4);
                f(e10);
            }
        }
    }
}
