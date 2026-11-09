package p055de;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f35910b = str;
        this.f35911c = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f35910b, this.f35911c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f35909a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        f fVar = I.f10809a;
        p042cg.e eVar = p042cg.e.f19009c;
        d dVar = new d(this.f35910b, this.f35911c, null);
        this.f35909a = 1;
        Object objS = AbstractC0780y.s(eVar, dVar, this);
        return objS == aVar ? aVar : objS;
    }
}
