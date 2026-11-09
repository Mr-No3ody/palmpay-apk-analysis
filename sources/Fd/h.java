package Fd;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import android.view.View;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f2677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment, Continuation continuation) {
        super(2, continuation);
        this.f2678c = transferToPalmPayContactAllFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f2678c, continuation);
        hVar.f2677b = ((Number) obj).intValue();
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        int i10;
        p173ld.y yVarT;
        View viewByPosition;
        p355xf.t tVar;
        Ef.a aVar = Ef.a.f2423a;
        int i11 = this.f2676a;
        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2678c;
        if (i11 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            i7 = this.f2677b;
            p042cg.f fVar = I.f10809a;
            p0 p0Var = p015ag.o.f11960a;
            C0252g c0252g = new C0252g(transferToPalmPayContactAllFragment, i7, null);
            this.f2677b = i7;
            this.f2676a = 1;
            if (AbstractC0780y.s(p0Var, c0252g, this) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            int i12 = this.f2677b;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            i7 = i12;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f2677b;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        yVarT = transferToPalmPayContactAllFragment.t();
        if (yVarT != null && (viewByPosition = yVarT.getViewByPosition(i10, p159kd.e.iivMenu)) != null) {
            tVar = transferToPalmPayContactAllFragment.f33799H;
            if (!((Balloon) tVar.getValue()).f25227f) {
                p002a.a.C(viewByPosition, (Balloon) tVar.getValue());
            }
        }
        transferToPalmPayContactAllFragment.f33804w = "";
        return Unit.f38893a;
        this.f2677b = i7;
        this.f2676a = 2;
        if (Wf.D.b(500L, this) != aVar) {
            i10 = i7;
            yVarT = transferToPalmPayContactAllFragment.t();
            if (yVarT != null) {
                tVar = transferToPalmPayContactAllFragment.f33799H;
                if (!((Balloon) tVar.getValue()).f25227f) {
                    p002a.a.C(viewByPosition, (Balloon) tVar.getValue());
                }
            }
            transferToPalmPayContactAllFragment.f33804w = "";
            return Unit.f38893a;
        }
        return aVar;
    }
}
