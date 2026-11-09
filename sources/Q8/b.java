package Q8;

import Ff.h;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.ui.dialog.AutoLogoutOptionDialog;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AutoLogoutOptionDialog f7636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i7, AutoLogoutOptionDialog autoLogoutOptionDialog, Continuation continuation) {
        super(2, continuation);
        this.f7635b = i7;
        this.f7636c = autoLogoutOptionDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f7635b, this.f7636c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7634a;
        AutoLogoutOptionDialog autoLogoutOptionDialog = this.f7636c;
        int i10 = this.f7635b;
        try {
            if (i7 == 0) {
                g.M(obj);
                f fVar = I.f10809a;
                p042cg.e eVar = p042cg.e.f19009c;
                a aVar2 = new a(i10, null);
                this.f7634a = 1;
                obj = AbstractC0780y.s(eVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            CommonResult commonResult = (CommonResult) obj;
            if (commonResult.isSuccess()) {
                n0.g().m("AutoLogoutSetupGuide", "SettingType", String.valueOf(i10));
                SPUtils.getInstance().put(BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_PIN_SETTING", i10);
                String strH = com.transsnet.palmpay.core.config.d.h();
                Intrinsics.checkNotNullExpressionValue(strH, "getKeyLastPinTime(...)");
                p059e1.a.U(0, strH);
                p115ha.c cVar = p115ha.b.f37362a;
                cVar.a(0L);
                cVar.f37367e = autoLogoutOptionDialog.checkStatus;
                r0.P1(MessageEvent.EVENT_SET_AUTO_LOGOUT_COMPLETE);
            } else {
                ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
            }
        } catch (Exception unused) {
            ToastUtils.showLong(CommonViewExtKt.string(F8.h.ac_operation_fail, autoLogoutOptionDialog.getContext()), new Object[0]);
        } finally {
            autoLogoutOptionDialog.dismiss();
        }
        return Unit.f38893a;
    }
}
