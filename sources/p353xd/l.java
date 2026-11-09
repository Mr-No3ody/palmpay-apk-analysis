package p353xd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankForToBankActivity f43881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SelectBankForToBankActivity selectBankForToBankActivity, Continuation continuation) {
        super(2, continuation);
        this.f43881b = selectBankForToBankActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f43881b, continuation);
        lVar.f43880a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List list = (List) this.f43880a;
        int i7 = SelectBankForToBankActivity.f33506B;
        SelectBankForToBankActivity selectBankForToBankActivity = this.f43881b;
        selectBankForToBankActivity.r().setList(SelectBankForToBankActivity.m(selectBankForToBankActivity, list));
        return Unit.f38893a;
    }
}
