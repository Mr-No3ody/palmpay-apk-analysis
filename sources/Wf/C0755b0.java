package Wf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: renamed from: Wf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0755b0 extends CancellationException implements CopyableThrowable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient n0 f10838a;

    public C0755b0(String str, Throwable th, n0 n0Var) {
        super(str);
        this.f10838a = n0Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public final /* bridge */ /* synthetic */ Throwable createCopy() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0755b0)) {
            return false;
        }
        C0755b0 c0755b0 = (C0755b0) obj;
        if (!Intrinsics.c(c0755b0.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c0755b0.f10838a;
        if (obj2 == null) {
            obj2 = r0.f10895b;
        }
        Object obj3 = this.f10838a;
        if (obj3 == null) {
            obj3 = r0.f10895b;
        }
        return Intrinsics.c(obj2, obj3) && Intrinsics.c(c0755b0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.e(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f10838a;
        if (obj == null) {
            obj = r0.f10895b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f10838a;
        if (obj == null) {
            obj = r0.f10895b;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
