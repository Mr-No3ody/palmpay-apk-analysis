package Ed;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: Ed.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0238s extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2399a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0238s(int i7, Continuation continuation, int i10) {
        super(i7, continuation);
        this.f2399a = i10;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.f2399a) {
            case 0:
                return new C0238s(3, continuation, 0).invokeSuspend(Unit.f38893a);
            case 1:
                return new C0238s(3, continuation, 1).invokeSuspend(Unit.f38893a);
            case 2:
                return new C0238s(3, continuation, 2).invokeSuspend(Unit.f38893a);
            case 3:
                return new C0238s(3, continuation, 3).invokeSuspend(Unit.f38893a);
            case 4:
                return new C0238s(3, continuation, 4).invokeSuspend(Unit.f38893a);
            case 5:
                return new C0238s(3, continuation, 5).invokeSuspend(Unit.f38893a);
            case 6:
                return new C0238s(3, continuation, 6).invokeSuspend(Unit.f38893a);
            case 7:
                return new C0238s(3, continuation, 7).invokeSuspend(Unit.f38893a);
            case 8:
                return new C0238s(3, continuation, 8).invokeSuspend(Unit.f38893a);
            case 9:
                return new C0238s(3, continuation, 9).invokeSuspend(Unit.f38893a);
            case 10:
                return new C0238s(3, continuation, 10).invokeSuspend(Unit.f38893a);
            default:
                return new C0238s(3, continuation, 11).invokeSuspend(Unit.f38893a);
        }
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2399a) {
            case 0:
                Ef.a aVar = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 1:
                Ef.a aVar2 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 2:
                Ef.a aVar3 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 3:
                Ef.a aVar4 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 4:
                Ef.a aVar5 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 5:
                Ef.a aVar6 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 6:
                Ef.a aVar7 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 7:
                Ef.a aVar8 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 8:
                Ef.a aVar9 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 9:
                Ef.a aVar10 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            case 10:
                Ef.a aVar11 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
            default:
                Ef.a aVar12 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                break;
        }
        return Unit.f38893a;
    }
}
