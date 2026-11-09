package Ed;

import Wf.AbstractC0780y;
import Wf.p0;
import android.view.View;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ed.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0240u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f2403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240u(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment, Continuation continuation) {
        super(2, continuation);
        this.f2404c = bankAccountPalmPayContactFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0240u c0240u = new C0240u(this.f2404c, continuation);
        c0240u.f2403b = ((Number) obj).intValue();
        return c0240u;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0240u) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
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
        int i11 = this.f2402a;
        BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = this.f2404c;
        if (i11 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            i7 = this.f2403b;
            p042cg.f fVar = Wf.I.f10809a;
            p0 p0Var = p015ag.o.f11960a;
            C0239t c0239t = new C0239t(bankAccountPalmPayContactFragment, i7, null);
            this.f2403b = i7;
            this.f2402a = 1;
            if (AbstractC0780y.s(p0Var, c0239t, this) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            int i12 = this.f2403b;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            i7 = i12;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f2403b;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        yVarT = bankAccountPalmPayContactFragment.t();
        if (yVarT != null && (viewByPosition = yVarT.getViewByPosition(i10, p159kd.e.iivMenu)) != null) {
            tVar = bankAccountPalmPayContactFragment.f33752L;
            if (!((Balloon) tVar.getValue()).f25227f) {
                p002a.a.C(viewByPosition, (Balloon) tVar.getValue());
            }
        }
        bankAccountPalmPayContactFragment.f33748A = "";
        return Unit.f38893a;
        this.f2403b = i7;
        this.f2402a = 2;
        if (Wf.D.b(500L, this) != aVar) {
            i10 = i7;
            yVarT = bankAccountPalmPayContactFragment.t();
            if (yVarT != null) {
                tVar = bankAccountPalmPayContactFragment.f33752L;
                if (!((Balloon) tVar.getValue()).f25227f) {
                    p002a.a.C(viewByPosition, (Balloon) tVar.getValue());
                }
            }
            bankAccountPalmPayContactFragment.f33748A = "";
            return Unit.f38893a;
        }
        return aVar;
    }
}
