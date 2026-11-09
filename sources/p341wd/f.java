package p341wd;

import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p042cg.e;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity, String str, Continuation continuation) {
        super(2, continuation);
        this.f43413b = scheduleTransferForBankUnstableBeneficiariesListActivity;
        this.f43414c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f43413b, this.f43414c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f43412a;
        if (i7 == 0) {
            g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f43414c;
            ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43413b;
            T t = new T(new c(scheduleTransferForBankUnstableBeneficiariesListActivity, str, arrayList, null));
            p042cg.f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, e.f19009c), new d(3, null));
            e eVar = new e(scheduleTransferForBankUnstableBeneficiariesListActivity, null);
            this.f43412a = 1;
            if (X.g(c1888u, eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
