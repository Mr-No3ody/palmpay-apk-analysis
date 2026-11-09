package p355xf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f43955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43956b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.f43956b == F.f43951a) {
            Function0 function0 = this.f43955a;
            Intrinsics.e(function0);
            this.f43956b = function0.invoke();
            this.f43955a = null;
        }
        return this.f43956b;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f43956b != F.f43951a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
