package p355xf;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Lazy, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r f43978c = new r(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f43979d = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Function0 f43980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f43981b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.f43981b;
        F f10 = F.f43951a;
        if (obj != f10) {
            return obj;
        }
        Function0 function0 = this.f43980a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43979d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, f10, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != f10) {
                }
            }
            this.f43980a = null;
            return objInvoke;
        }
        return this.f43981b;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f43981b != F.f43951a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
