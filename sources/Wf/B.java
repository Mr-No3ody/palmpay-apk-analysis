package Wf;

import Yf.AbstractC0790b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes4.dex */
public class B extends AbstractC0752a implements Deferred {
    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) throws Throwable {
        Object objC = c(continuation);
        Ef.a aVar = Ef.a.f2423a;
        return objC;
    }

    @Override // kotlinx.coroutines.Deferred
    public final SelectClause1 getOnAwait() {
        k0 k0Var = k0.f10879a;
        kotlin.jvm.internal.K.d(3, k0Var);
        l0 l0Var = l0.f10881a;
        kotlin.jvm.internal.K.d(3, l0Var);
        return new androidx.camera.video.internal.c(this, k0Var, l0Var, (AbstractC0790b) null);
    }
}
