package kotlin.text;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.api.Service;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToCommonAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38997a;

    public /* synthetic */ D(int i7) {
        this.f38997a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        switch (this.f38997a) {
            case 0:
                CharSequence it = (CharSequence) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            case 1:
                p133ig.a buildSerialDescriptor = (p133ig.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                p133ig.a.a(buildSerialDescriptor, "JsonPrimitive", new p176lg.m(new p171lb.d(4)));
                p133ig.a.a(buildSerialDescriptor, "JsonNull", new p176lg.m(new p171lb.d(5)));
                p133ig.a.a(buildSerialDescriptor, "JsonLiteral", new p176lg.m(new p171lb.d(6)));
                p133ig.a.a(buildSerialDescriptor, "JsonObject", new p176lg.m(new p171lb.d(7)));
                p133ig.a.a(buildSerialDescriptor, "JsonArray", new p176lg.m(new p171lb.d(8)));
                return Unit.f38893a;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                p176lg.j jVar = (p176lg.j) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                p191mg.r.a(str, sb2);
                sb2.append(':');
                sb2.append(jVar);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            case 3:
                String it2 = (String) obj;
                KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                Intrinsics.checkNotNullParameter(it2, "it");
                ToastUtils.showShort(it2, new Object[0]);
                return Unit.f38893a;
            case 4:
                String it3 = (String) obj;
                KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                Intrinsics.checkNotNullParameter(it3, "it");
                ToastUtils.showShort(it3, new Object[0]);
                return Unit.f38893a;
            case 5:
                String it4 = (String) obj;
                KProperty[] kPropertyArr3 = ScheduleTopUpEditTaskFragment.f26566Y;
                Intrinsics.checkNotNullParameter(it4, "it");
                ToastUtils.showShort(it4, new Object[0]);
                return Unit.f38893a;
            case 6:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 7:
                return CashierSelectPayMethodDialog.show$lambda$4((CashierPaymentMethodBean) obj);
            case 8:
                return Unit.f38893a;
            case 9:
                return Unit.f38893a;
            case 10:
                ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) obj;
                int i7 = p292t6.a.f42345a;
                p292t6.a.a("Face Detection install success: " + moduleInstallResponse.areModulesAlreadyInstalled());
                p232p6.p.f41240g = moduleInstallResponse.areModulesAlreadyInstalled() ? 1 : 2;
                r6.a aVar = p232p6.p.f41237d;
                if (aVar != null && (liveID$ILiveIDMonitor = aVar.f41573e) != null) {
                    p320v6.d dVar = p320v6.e.f43080h;
                    liveID$ILiveIDMonitor.report(dVar.f43071a, kotlin.collections.G.h(new Pair("result", Integer.valueOf(p232p6.p.f41240g)), new Pair("event_desc", dVar.f43072b)));
                }
                return Unit.f38893a;
            case 11:
                int i10 = PayShopInputAmountActivity.f33176p;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 12:
                int i11 = PayShopInputAmountActivity.f33176p;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 13:
                int i12 = TransferToCommonAccountActivity.f33276q0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 14:
                int i13 = TransferToMobileActivity.f33282v0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 15:
                int i14 = WithdrawInputAmountActivity.f33293p;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 16:
                int i15 = WithdrawInputAmountActivity.f33293p;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 17:
                String it5 = (String) obj;
                int i16 = BettingAutoRenewOverlayActivity.f26654g;
                Intrinsics.checkNotNullParameter(it5, "it");
                ToastUtils.showShort(it5, new Object[0]);
                return Unit.f38893a;
            case 18:
                KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 19:
                String it6 = (String) obj;
                KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter(it6, "it");
                ToastUtils.showLong(it6, new Object[0]);
                return Unit.f38893a;
            case 20:
                String it7 = (String) obj;
                KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter(it7, "it");
                ToastUtils.showLong(it7, new Object[0]);
                return Unit.f38893a;
            case 21:
                KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 22:
                KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 23:
                KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
            case 24:
                Long aLong = (Long) obj;
                ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                Intrinsics.checkNotNullParameter(aLong, "aLong");
                return Long.valueOf(5 - aLong.longValue());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ReactNativeFeatureFlagsLocalAccessor.override$lambda$0((String) obj);
            case 26:
                return ReactNativeFeatureFlagsLocalAccessor.getAccessedFeatureFlags$lambda$1((String) obj);
            case 27:
                Long it8 = (Long) obj;
                int i17 = CLOpenResultActivity.f28955V0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Long.valueOf(((long) 3) - it8.longValue());
            case 28:
                int i18 = CLOpenResultActivity.f28955V0;
                return Unit.f38893a;
            default:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f38893a;
        }
    }
}
