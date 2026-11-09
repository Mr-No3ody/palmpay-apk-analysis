package p270rd;

import Pd.c;
import Pd.d;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsForTests;
import com.google.api.Service;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRaceScheduleView;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import com.transsnet.palmpay.credit.ui.activity.PastShopListActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLCreditManagementActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.ui.activity.settings.PersonalActivityV2;
import com.transsnet.palmpay.ui.activity.settings.SetPaymentMethodActivity;
import com.transsnet.palmpay.ui.activity.settings.SettingsActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeNewUserActivity;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import p159kd.f;
import p173ld.e;
import p173ld.g;
import p173ld.h;
import p173ld.j;
import p173ld.k;
import p173ld.v;
import p328ve.t;
import p339wb.q;
import p339wb.r;
import p351xb.l;
import t9.m;

/* JADX INFO: renamed from: rd.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1976t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41773a;

    public /* synthetic */ C1976t(int i7) {
        this.f41773a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41773a) {
            case 0:
                int i7 = SelectBankActivity.f33187A;
                return new CopyOnWriteArrayList();
            case 1:
                TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                return new v(f.sm_item_transfer_receipt_type, null);
            case 2:
                KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                return Unit.f38893a;
            case 3:
                KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                return Unit.f38893a;
            case 4:
                int i10 = PastShopListActivity.f28701j;
                return new r(Ya.f.cs_item_past_shop_list, null);
            case 5:
                int i11 = PayShopHomeActivity.f28705p0;
                return new q(Ya.f.cs_item_past_shop_home, null);
            case 6:
                KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                return new Handler(Looper.getMainLooper());
            case 7:
                KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                return new ArrayList();
            case 8:
                int i12 = PersonalActivityV2.f34952C;
                return new Handler(Looper.getMainLooper());
            case 9:
                int i13 = SetPaymentMethodActivity.f34967f;
                return new ArrayList();
            case 10:
                int i14 = SetPaymentMethodActivity.f34967f;
                return new t(Ac.f.main_payment_method_item, null);
            case 11:
                int i15 = SettingsActivity.f34971d;
                return new Handler(Looper.getMainLooper());
            case 12:
                return ReactNativeFeatureFlags.accessorProvider$lambda$0();
            case 13:
                return ReactNativeFeatureFlagsForTests.setUp$lambda$0();
            case 14:
                return Integer.valueOf((ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(60)) / 3);
            case 15:
                int i16 = CLCreditManagementActivity.f28897j;
                return new l();
            case 16:
                return new ArrayList();
            case 17:
                int i17 = PayMeActivity.t;
                e eVar = new e();
                eVar.a(0, f.sm_item_pay_me_empty);
                eVar.a(1, f.sm_item_pay_me_account);
                eVar.addChildClickViewIds(p159kd.e.tv_copy_info, p159kd.e.tv_download, p159kd.e.tv_get_now);
                return eVar;
            case 18:
                return PickBettingBillerDialog.datas_delegate$lambda$0();
            case 19:
                int i18 = ScheduleTransferCreateActivity.f33322O0;
                return new p173ld.f();
            case 20:
                int i19 = ScheduleTransferCreateV2Activity.f33373C0;
                return new p173ld.f();
            case 21:
                int i20 = ScheduleTransferOrderDetailActivity.f33409p;
                return new k(f.sm_item_schedule_transfer_sub_order, null);
            case 22:
                WelcomeNewUserActivity.a aVar2 = WelcomeNewUserActivity.f35040i;
                return new Handler(Looper.getMainLooper());
            case 23:
                int i21 = ModelBettingRaceScheduleView.f26738e;
                t9.f fVar = new t9.f(d.qt_item_betting_race_schedule, null);
                fVar.addChildClickViewIds(c.raceContentLayout, c.tvMore);
                return fVar;
            case 24:
                int i22 = ModelQuickBettingView.f26759p;
                return new t9.l();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i23 = ModelQuickBettingView.f26759p;
                return new m(d.qt_item_quick_betting_sports, null);
            case 26:
                int i24 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                return new g(f.sm_item_schedule_transfer_for_bank_unstable_beneficiary, null);
            case 27:
                int i25 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                return new CopyOnWriteArrayList();
            case 28:
                int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                j jVar = new j(f.sm_item_schedule_transfer_payment, null);
                jVar.addChildClickViewIds(p159kd.e.tv_fund);
                return jVar;
            default:
                int i27 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                return new h();
        }
    }
}
