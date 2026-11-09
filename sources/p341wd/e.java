package p341wd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity, Continuation continuation) {
        super(2, continuation);
        this.f43411b = scheduleTransferForBankUnstableBeneficiariesListActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f43411b, continuation);
        eVar.f43410a = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List list = (List) this.f43410a;
        int i7 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
        this.f43411b.m().setList(list);
        return Unit.f38893a;
    }
}
