package com.google.firebase.perf;

import com.google.firebase.Firebase;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001a4\u0010\u0005\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\f2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\u000b0\t¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a8\u0010\u0005\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\u000b0\t¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"performance", "Lcom/google/firebase/perf/FirebasePerformance;", "Lcom/google/firebase/Firebase;", "getPerformance", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/perf/FirebasePerformance;", "trace", "", "Lcom/google/firebase/perf/metrics/HttpMetric;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "T", "Lcom/google/firebase/perf/metrics/Trace;", "(Lcom/google/firebase/perf/metrics/Trace;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "name", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "com.google.firebase-firebase-perf"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPerformance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/PerformanceKt\n*L\n1#1,68:1\n49#1,5:69\n*S KotlinDebug\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/PerformanceKt\n*L\n61#1:69,5\n*E\n"})
public final class PerformanceKt {
    @NotNull
    public static final FirebasePerformance getPerformance(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebasePerformance, "getInstance(...)");
        return firebasePerformance;
    }

    public static final void trace(@NotNull HttpMetric httpMetric, @NotNull Function1<? super HttpMetric, Unit> block) {
        Intrinsics.checkNotNullParameter(httpMetric, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpMetric.start();
        try {
            block.invoke(httpMetric);
        } finally {
            httpMetric.stop();
        }
    }

    public static final <T> T trace(@NotNull Trace trace, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(trace, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        trace.start();
        try {
            return block.invoke(trace);
        } finally {
            trace.stop();
        }
    }

    public static final <T> T trace(@NotNull String name, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace traceCreate = Trace.create(name);
        Intrinsics.checkNotNullExpressionValue(traceCreate, "create(...)");
        traceCreate.start();
        try {
            return block.invoke(traceCreate);
        } finally {
            traceCreate.stop();
        }
    }
}
