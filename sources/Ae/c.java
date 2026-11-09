package Ae;

import Ab.ViewOnClickListenerC0053e;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.UpdateAutoTransferConfig;
import com.transsnet.palmpay.ui.dialog.AcceptTurnOnSaveDialog;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AcceptTurnOnSaveDialog f269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AcceptTurnOnSaveDialog acceptTurnOnSaveDialog, Continuation continuation) {
        super(2, continuation);
        this.f269b = acceptTurnOnSaveDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f269b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objS;
        String str;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f268a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                p042cg.f fVar = I.f10809a;
                p042cg.e eVar = p042cg.e.f19009c;
                b bVar = new b(2, null);
                this.f268a = 1;
                objS = AbstractC0780y.s(eVar, bVar, this);
                if (objS == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
                objS = obj;
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) objS;
            boolean zIsSuccess = commonBeanResult.isSuccess();
            AcceptTurnOnSaveDialog acceptTurnOnSaveDialog = this.f269b;
            if (zIsSuccess) {
                Context context = acceptTurnOnSaveDialog.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer num = new Integer(Ac.h.main_cashbox_auto_save_turned_on);
                Integer num2 = new Integer(com.transsnet.palmpay.custom_view.r.cv_pay_success_green);
                UpdateAutoTransferConfig updateAutoTransferConfig = (UpdateAutoTransferConfig) commonBeanResult.data;
                if (updateAutoTransferConfig == null || (str = updateAutoTransferConfig.advertMsg) == null) {
                    str = "";
                }
                io.fastkv.n.O(context, 0, num, null, num2, null, null, str, new Integer(p025ba.k.core_go), null, new a(acceptTurnOnSaveDialog, 1), null, null, null, new ViewOnClickListenerC0053e(28), false, 0, 8354421);
            } else {
                Context context2 = acceptTurnOnSaveDialog.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                io.fastkv.n.O(context2, 0, new Integer(Ac.h.main_failed_please_try_again), null, new Integer(com.transsnet.palmpay.custom_view.r.cv_pay_fail), null, null, commonBeanResult.getRespMsg(), new Integer(p025ba.k.core_ok), null, new ViewOnClickListenerC0053e(28), null, null, null, new ViewOnClickListenerC0053e(28), false, 0, 8354421);
            }
            acceptTurnOnSaveDialog.dismiss();
        } catch (Exception e10) {
            ToastUtils.showLong(org.chromium.support_lib_boundary.util.b.W(e10), new Object[0]);
        }
        return Unit.f38893a;
    }
}
