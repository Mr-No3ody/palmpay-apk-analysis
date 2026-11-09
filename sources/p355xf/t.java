package p355xf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f43982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f43983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43984c;

    public t(Function0 initializer, Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i7 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f43982a = initializer;
        this.f43983b = F.f43951a;
        this.f43984c = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f43983b;
        F f10 = F.f43951a;
        if (obj != f10) {
            return obj;
        }
        synchronized (this.f43984c) {
            objInvoke = this.f43983b;
            if (objInvoke == f10) {
                Function0 function0 = this.f43982a;
                Intrinsics.e(function0);
                objInvoke = function0.invoke();
                this.f43983b = objInvoke;
                this.f43982a = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f43983b != F.f43951a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
