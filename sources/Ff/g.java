package Ff;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends f implements FunctionBase, SuspendFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2834a;

    public g(int i7, Continuation continuation) {
        super(continuation);
        this.f2834a = i7;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return this.f2834a;
    }

    @Override // Ff.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        G.f38952a.getClass();
        String strA = H.a(this);
        Intrinsics.checkNotNullExpressionValue(strA, "renderLambdaToString(...)");
        return strA;
    }
}
