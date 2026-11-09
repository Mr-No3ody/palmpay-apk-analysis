package p337w8;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f43321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f43321a = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f43321a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        int i7 = l.f43326m;
        l lVar = this.f43321a;
        Set setKeySet = ((c) lVar.f43332g.getValue()).f43304a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "cache.keys");
        for (String it : new HashSet(setKeySet)) {
            if (lVar.f43328c) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                lVar.c(it);
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                l.f(it);
            }
        }
        return Unit.f38893a;
    }
}
