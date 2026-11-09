package p337w8;

import Ef.a;
import Ff.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f43315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f43315a = lVar;
        this.f43316b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f43315a, this.f43316b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        l.a(this.f43315a, this.f43316b);
        return z.f38935a;
    }
}
