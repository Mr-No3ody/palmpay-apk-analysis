package retrofit2;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: retrofit2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1995m extends AbstractC1997o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CallAdapter f41936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41937e;

    public C1995m(J j6, okhttp3.Call.Factory factory, Converter converter, CallAdapter callAdapter, boolean z3) {
        super(j6, factory, converter);
        this.f41936d = callAdapter;
        this.f41937e = z3;
    }

    @Override // retrofit2.AbstractC1997o
    public final Object b(C2002u c2002u, Object[] objArr) {
        Call call = (Call) this.f41936d.adapt(c2002u);
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            if (!this.f41937e) {
                return U.b(call, continuation);
            }
            Intrinsics.f(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return U.c(call, continuation);
        } catch (LinkageError e10) {
            throw e10;
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (VirtualMachineError e12) {
            throw e12;
        } catch (Throwable th) {
            U.r(continuation, th);
            return Ef.a.f2423a;
        }
    }
}
