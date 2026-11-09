package p353xd;

import Ef.a;
import Ff.h;
import Jd.c;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankForToBankActivity f43871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SelectBankForToBankActivity selectBankForToBankActivity, Continuation continuation) {
        super(2, continuation);
        this.f43871b = selectBankForToBankActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.f43871b, continuation);
        iVar.f43870a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List list = (List) this.f43870a;
        int i7 = SelectBankForToBankActivity.f33506B;
        SelectBankForToBankActivity selectBankForToBankActivity = this.f43871b;
        selectBankForToBankActivity.q().setList(c.g(SelectBankForToBankActivity.m(selectBankForToBankActivity, list)));
        return Unit.f38893a;
    }
}
