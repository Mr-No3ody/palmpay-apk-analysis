package Ab;

import android.view.View;
import androidx.core.view.q0;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.LogBoxDialog;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankAccountOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.google.api.Service;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.teller.bean.WAECOperatorResp;
import com.transsnet.palmpay.teller.bean.resp.BettingWithdrawRecentUserIDResp;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CopyableThreadContextElement;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;

    public /* synthetic */ y(int i7) {
        this.f149a = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.f149a) {
            case 0:
                CLMainResp t1 = (CLMainResp) obj;
                CLInstallmentLoanMainPageResp t3 = (CLInstallmentLoanMainPageResp) obj2;
                CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                Intrinsics.checkNotNullParameter(t1, "t1");
                Intrinsics.checkNotNullParameter(t3, "t2");
                return new Pair(t1, t3);
            case 1:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 2:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                CoroutineContext coroutineContextMinusKey = acc2.minusKey(element2.getKey());
                kotlin.coroutines.f fVar = kotlin.coroutines.f.f38943a;
                if (coroutineContextMinusKey == fVar) {
                    return element2;
                }
                kotlin.coroutines.d dVar = ContinuationInterceptor.f38936l0;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(dVar);
                if (continuationInterceptor == null) {
                    cVar = new kotlin.coroutines.c(element2, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(dVar);
                    if (coroutineContextMinusKey2 == fVar) {
                        return new kotlin.coroutines.c(continuationInterceptor, element2);
                    }
                    cVar = new kotlin.coroutines.c(continuationInterceptor, new kotlin.coroutines.c(element2, coroutineContextMinusKey2));
                }
                return cVar;
            case 3:
                Function1 function1 = (Function1) obj;
                p006a4.f fVar2 = (p006a4.f) obj2;
                FlexiBankCheckBankAccountOtpFragment.a aVar2 = FlexiBankCheckBankAccountOtpFragment.f22002C;
                if (function1 != null) {
                    function1.invoke(fVar2);
                }
                return Unit.f38893a;
            case 4:
                Function1 function2 = (Function1) obj;
                W3.f rsp = (W3.f) obj2;
                FlexiBankCheckPalmPayOtpFragment.a aVar3 = FlexiBankCheckPalmPayOtpFragment.f22023p;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                if (function2 != null) {
                    function2.invoke(rsp);
                }
                return Unit.f38893a;
            case 5:
                Function1 function3 = (Function1) obj;
                W3.f fVar3 = (W3.f) obj2;
                FlexiBankCheckUbaBankAccountOTPFragment.a aVar4 = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                if (function3 != null) {
                    function3.invoke(fVar3);
                }
                return Unit.f38893a;
            case 6:
                return ReservationTimeDialog.mListener$lambda$5(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 7:
                Function1 function4 = (Function1) obj;
                WAECOperatorResp rsp2 = (WAECOperatorResp) obj2;
                int i7 = WaecHomeActivity.f34237Q;
                Intrinsics.checkNotNullParameter(rsp2, "rsp");
                if (rsp2.isSuccess() && function4 != null) {
                    function4.invoke(rsp2);
                }
                return Unit.f38893a;
            case 8:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((CoroutineContext.Element) obj2) instanceof CopyableThreadContextElement));
            case 9:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                return element3 instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) element3).copyForChild()) : coroutineContext.plus(element3);
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (!(element4 instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element4 : Integer.valueOf(iIntValue + 1);
            case 12:
                ThreadContextElement threadContextElement = (ThreadContextElement) obj;
                CoroutineContext.Element element5 = (CoroutineContext.Element) obj2;
                if (threadContextElement != null) {
                    return threadContextElement;
                }
                if (element5 instanceof ThreadContextElement) {
                    return (ThreadContextElement) element5;
                }
                return null;
            case 13:
                p015ag.x xVar = (p015ag.x) obj;
                CoroutineContext.Element element6 = (CoroutineContext.Element) obj2;
                if (element6 instanceof ThreadContextElement) {
                    ThreadContextElement threadContextElement2 = (ThreadContextElement) element6;
                    Object objUpdateThreadContext = threadContextElement2.updateThreadContext(xVar.f11973a);
                    int i10 = xVar.f11976d;
                    xVar.f11974b[i10] = objUpdateThreadContext;
                    xVar.f11976d = 1 + i10;
                    xVar.f11975c[i10] = threadContextElement2;
                }
                return xVar;
            case 14:
                return DynamicFromMap.asMap$lambda$6((ReadableMap) obj, (String) obj2);
            case 15:
                return Integer.valueOf(DynamicFromMap.asInt$lambda$3((ReadableMap) obj, (String) obj2));
            case 16:
                return Boolean.valueOf(DynamicFromMap.asBoolean$lambda$1((ReadableMap) obj, (String) obj2));
            case 17:
                return DynamicFromMap.asString$lambda$4((ReadableMap) obj, (String) obj2);
            case 18:
                return DynamicFromMap._get_type_$lambda$7((ReadableMap) obj, (String) obj2);
            case 19:
                return DynamicFromMap.asArray$lambda$5((ReadableMap) obj, (String) obj2);
            case 20:
                return Boolean.valueOf(DynamicFromMap._get_isNull_$lambda$0((ReadableMap) obj, (String) obj2));
            case 21:
                return Double.valueOf(DynamicFromMap.asDouble$lambda$2((ReadableMap) obj, (String) obj2));
            case 22:
                return LogBoxDialog.onCreate$lambda$3$lambda$1(135, (View) obj, (q0) obj2);
            case 23:
                return Integer.valueOf(ViewGroupDrawingOrderHelper.getChildDrawingOrder$lambda$0((View) obj, (View) obj2));
            case 24:
                Function1 function5 = (Function1) obj;
                CommonBeanResult resp = (CommonBeanResult) obj2;
                int i11 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(resp, "resp");
                if (resp.isSuccess() && resp.data != 0 && function5 != null) {
                    function5.invoke(resp);
                }
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Function0 function0 = (Function0) obj;
                CommonResult rsp3 = (CommonResult) obj2;
                KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                Intrinsics.checkNotNullParameter(rsp3, "rsp");
                if (rsp3.isSuccess() && function0 != null) {
                    function0.invoke();
                }
                ToastUtils.showShort(rsp3.getRespMsg(), new Object[0]);
                return Unit.f38893a;
            case 26:
                Function0 function6 = (Function0) obj;
                CommonResult rsp4 = (CommonResult) obj2;
                Intrinsics.checkNotNullParameter(rsp4, "rsp");
                if (rsp4.isSuccess() && function6 != null) {
                    function6.invoke();
                }
                return Unit.f38893a;
            case 27:
                CLMainResp t8 = (CLMainResp) obj;
                CLInstallmentLoanMainPageResp t10 = (CLInstallmentLoanMainPageResp) obj2;
                int i12 = CLMainActivity.f28940q0;
                Intrinsics.checkNotNullParameter(t8, "t1");
                Intrinsics.checkNotNullParameter(t10, "t2");
                return new Pair(t8, t10);
            default:
                Function1 function7 = (Function1) obj;
                BettingWithdrawRecentUserIDResp rsp5 = (BettingWithdrawRecentUserIDResp) obj2;
                Intrinsics.checkNotNullParameter(rsp5, "rsp");
                if (function7 != null) {
                    function7.invoke(rsp5);
                }
                return Unit.f38893a;
        }
    }
}
