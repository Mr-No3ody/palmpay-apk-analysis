package Wf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;

/* JADX INFO: renamed from: Wf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0770n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancelHandler f10884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f10885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f10887e;

    public C0770n(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        this.f10883a = obj;
        this.f10884b = cancelHandler;
        this.f10885c = function3;
        this.f10886d = obj2;
        this.f10887e = th;
    }

    public static C0770n a(C0770n c0770n, CancelHandler cancelHandler, CancellationException cancellationException, int i7) {
        Object obj = c0770n.f10883a;
        if ((i7 & 2) != 0) {
            cancelHandler = c0770n.f10884b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        Function3 function3 = c0770n.f10885c;
        Object obj2 = c0770n.f10886d;
        Throwable th = cancellationException;
        if ((i7 & 16) != 0) {
            th = c0770n.f10887e;
        }
        c0770n.getClass();
        return new C0770n(obj, cancelHandler2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0770n)) {
            return false;
        }
        C0770n c0770n = (C0770n) obj;
        return Intrinsics.c(this.f10883a, c0770n.f10883a) && Intrinsics.c(this.f10884b, c0770n.f10884b) && Intrinsics.c(this.f10885c, c0770n.f10885c) && Intrinsics.c(this.f10886d, c0770n.f10886d) && Intrinsics.c(this.f10887e, c0770n.f10887e);
    }

    public final int hashCode() {
        Object obj = this.f10883a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.f10884b;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function3 function3 = this.f10885c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f10886d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10887e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f10883a + ", cancelHandler=" + this.f10884b + ", onCancellation=" + this.f10885c + ", idempotentResume=" + this.f10886d + ", cancelCause=" + this.f10887e + ')';
    }

    public /* synthetic */ C0770n(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : cancelHandler, (i7 & 4) != 0 ? null : function3, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : cancellationException);
    }
}
