package Ga;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Continuation continuation) {
        super(2, continuation);
        this.f3204b = kVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f3204b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f3203a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                k kVar = this.f3204b;
                this.f3203a = 1;
                obj = k.c(kVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
