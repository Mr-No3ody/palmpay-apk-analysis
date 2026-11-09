package Aa;

import Ac.e;
import Ac.f;
import E9.g;
import E9.h;
import E9.i;
import android.os.Handler;
import android.os.Looper;
import com.google.api.Service;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawQueryAccountListActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.AvailableCouponItem;
import com.transsnet.palmpay.send_money.ui.dialog.TransferProcessDialog;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneTaskListDialog;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.ui.fragment.PalmZoneTaskRewardsFragment;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p173ld.B;
import p328ve.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    public /* synthetic */ a(int i7) {
        this.f96a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f96a) {
            case 0:
                return c.f97a;
            case 1:
                return TransferProcessDialog.adapter_delegate$lambda$3();
            case 2:
                return Unit.f38893a;
            case 3:
                return PalmZoneTaskListDialog.mTaskList_delegate$lambda$0();
            case 4:
                int i7 = WithdrawQueryAccountListActivity.f26945C;
                return new i();
            case 5:
                int i10 = WithdrawQueryAccountListActivity.f26945C;
                return new h(p366y9.c.cash_in_item_recently, null);
            case 6:
                int i11 = WithdrawQueryAccountListActivity.f26945C;
                return new g();
            case 7:
                ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                return new p173ld.i();
            case 8:
                ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                return new p173ld.i();
            case 9:
                ScheduleTransferPaymentToBankFragment.a aVar3 = ScheduleTransferPaymentToBankFragment.f33711H;
                return new ArrayList();
            case 10:
                ScheduleTransferPaymentToBankFragment.a aVar4 = ScheduleTransferPaymentToBankFragment.f33711H;
                return new ArrayList();
            case 11:
                ScheduleTransferPaymentToPalmPayFragment.a aVar5 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                return new ArrayList();
            case 12:
                ScheduleTransferPaymentToPalmPayFragment.a aVar6 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                return new ArrayList();
            case 13:
                int i12 = BankCardFragment.f35064B;
                p328ve.d dVar = new p328ve.d(f.main_item_bank_card, null);
                dVar.addChildClickViewIds(e.v_status_bg, e.ivDelete, e.iv_setting, e.iv_copy, e.iiv_show);
                return dVar;
            case 14:
                return new ArrayList();
            case 15:
                int i13 = HomeFragmentHomeTab.f35093A0;
                return new Handler(Looper.getMainLooper());
            case 16:
                HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                return new ArrayList();
            case 17:
                InvestGuideFragment.a aVar8 = InvestGuideFragment.f35185t0;
                return new ArrayList();
            case 18:
                PalmZoneTaskRewardsFragment.a aVar9 = PalmZoneTaskRewardsFragment.f35232v;
                return new ArrayList();
            case 19:
                int i14 = TransactionHistoryFragment.f35248k0;
                w wVar = new w();
                wVar.a(1, f.main_item_history_month);
                wVar.a(0, f.main_layout_trans_history_item);
                wVar.addChildClickViewIds(e.tvMonth);
                return wVar;
            case 20:
                int i15 = AddMoneyHomeActivity.f26973o;
                return new D9.b(p366y9.c.ci_layout_add_money_item_v, null);
            case 21:
                int i16 = AvailableCouponItem.f30663p;
                return new p103gf.a();
            case 22:
                return new CopyOnWriteArrayList();
            case 23:
                TransferToBankAddBankAccountFragment.a aVar10 = TransferToBankAddBankAccountFragment.f33758M;
                return new ArrayList();
            case 24:
                TransferToBankAddBankAccountFragment.a aVar11 = TransferToBankAddBankAccountFragment.f33758M;
                return new ArrayList();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new B(false);
            case 26:
                TransferToPalmPayAddMobileAccountFragment.a aVar12 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                return new ArrayList();
            case 27:
                TransferToPalmPayAddMobileAccountFragment.a aVar13 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                return new ArrayList();
            case 28:
                return new CopyOnWriteArrayList();
            default:
                return new CopyOnWriteArrayList();
        }
    }
}
