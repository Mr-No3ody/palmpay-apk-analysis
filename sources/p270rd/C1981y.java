package p270rd;

import Ef.a;
import Ff.h;
import Jd.c;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: rd.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1981y extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1981y(SelectBankActivity selectBankActivity, Continuation continuation) {
        super(2, continuation);
        this.f41784b = selectBankActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1981y c1981y = new C1981y(this.f41784b, continuation);
        c1981y.f41783a = obj;
        return c1981y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1981y) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List list = (List) this.f41783a;
        int i7 = SelectBankActivity.f33187A;
        SelectBankActivity selectBankActivity = this.f41784b;
        selectBankActivity.p().f4985b = SelectBankActivity.m(selectBankActivity, list, true);
        selectBankActivity.p().notifyDataSetChanged();
        selectBankActivity.o().setList(c.g(SelectBankActivity.m(selectBankActivity, list, false)));
        return Unit.f38893a;
    }
}
