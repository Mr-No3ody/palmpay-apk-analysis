package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements FunctionBase, Serializable {
    private final int arity;

    public o(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        G.f38952a.getClass();
        String strA = H.a(this);
        Intrinsics.checkNotNullExpressionValue(strA, "renderLambdaToString(...)");
        return strA;
    }
}
