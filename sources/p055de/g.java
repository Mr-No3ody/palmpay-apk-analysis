package p055de;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f35915b = str;
        this.f35916c = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f35915b, this.f35916c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f35914a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        f fVar = I.f10809a;
        e eVar = e.f19009c;
        f fVar2 = new f(this.f35915b, this.f35916c, null);
        this.f35914a = 1;
        Object objS = AbstractC0780y.s(eVar, fVar2, this);
        return objS == aVar ? aVar : objS;
    }
}
