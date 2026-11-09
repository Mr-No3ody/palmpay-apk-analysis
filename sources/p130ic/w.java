package p130ic;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f37560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f37561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(l lVar, Continuation continuation, int i7) {
        super(3, continuation);
        this.f37559a = i7;
        this.f37561c = lVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.f37559a) {
            case 0:
                w wVar = new w(this.f37561c, continuation, 0);
                wVar.f37560b = th;
                return wVar.invokeSuspend(Unit.f38893a);
            case 1:
                w wVar2 = new w(this.f37561c, continuation, 1);
                wVar2.f37560b = th;
                return wVar2.invokeSuspend(Unit.f38893a);
            case 2:
                w wVar3 = new w(this.f37561c, continuation, 2);
                wVar3.f37560b = th;
                return wVar3.invokeSuspend(Unit.f38893a);
            case 3:
                w wVar4 = new w(this.f37561c, continuation, 3);
                wVar4.f37560b = th;
                return wVar4.invokeSuspend(Unit.f38893a);
            case 4:
                w wVar5 = new w(this.f37561c, continuation, 4);
                wVar5.f37560b = th;
                return wVar5.invokeSuspend(Unit.f38893a);
            case 5:
                w wVar6 = new w(this.f37561c, continuation, 5);
                wVar6.f37560b = th;
                return wVar6.invokeSuspend(Unit.f38893a);
            case 6:
                w wVar7 = new w(this.f37561c, continuation, 6);
                wVar7.f37560b = th;
                return wVar7.invokeSuspend(Unit.f38893a);
            case 7:
                w wVar8 = new w(this.f37561c, continuation, 7);
                wVar8.f37560b = th;
                return wVar8.invokeSuspend(Unit.f38893a);
            case 8:
                w wVar9 = new w(this.f37561c, continuation, 8);
                wVar9.f37560b = th;
                return wVar9.invokeSuspend(Unit.f38893a);
            case 9:
                w wVar10 = new w(this.f37561c, continuation, 9);
                wVar10.f37560b = th;
                return wVar10.invokeSuspend(Unit.f38893a);
            case 10:
                w wVar11 = new w(this.f37561c, continuation, 10);
                wVar11.f37560b = th;
                return wVar11.invokeSuspend(Unit.f38893a);
            case 11:
                w wVar12 = new w(this.f37561c, continuation, 11);
                wVar12.f37560b = th;
                return wVar12.invokeSuspend(Unit.f38893a);
            default:
                w wVar13 = new w(this.f37561c, continuation, 12);
                wVar13.f37560b = th;
                return wVar13.invokeSuspend(Unit.f38893a);
        }
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        l lVar = this.f37561c;
        switch (this.f37559a) {
            case 0:
                a aVar = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 1:
                a aVar2 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 2:
                a aVar3 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 3:
                a aVar4 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 4:
                a aVar5 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 5:
                a aVar6 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 6:
                a aVar7 = a.f2423a;
                g.M(obj);
                b.E(lVar, this.f37560b);
                break;
            case 7:
                a aVar8 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 8:
                a aVar9 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 9:
                a aVar10 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
            case 10:
                a aVar11 = a.f2423a;
                g.M(obj);
                b.E(lVar, this.f37560b);
                break;
            case 11:
                a aVar12 = a.f2423a;
                g.M(obj);
                b.E(lVar, this.f37560b);
                break;
            default:
                a aVar13 = a.f2423a;
                g.M(obj);
                b.D(lVar, this.f37560b);
                break;
        }
        return Unit.f38893a;
    }
}
