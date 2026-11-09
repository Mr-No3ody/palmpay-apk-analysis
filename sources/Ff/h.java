package Ff;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends c implements FunctionBase, SuspendFunction {
    private final int arity;

    public h(int i7, Continuation continuation) {
        super(continuation);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // Ff.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        G.f38952a.getClass();
        String strA = H.a(this);
        Intrinsics.checkNotNullExpressionValue(strA, "renderLambdaToString(...)");
        return strA;
    }
}
