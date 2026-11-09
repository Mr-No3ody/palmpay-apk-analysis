package Cd;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;
import java.util.ArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToBankFragment f1390a;

    public u(ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment) {
        this.f1390a = scheduleTransferPaymentToBankFragment;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener
    public final void afterAccountEdit(String str) {
        ScheduleTransferPaymentToBankFragment.a aVar = ScheduleTransferPaymentToBankFragment.f33711H;
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1390a;
        scheduleTransferPaymentToBankFragment.v();
        if ((str != null ? str.length() : 0) >= 10) {
            ScheduleTransferPaymentToBankFragment.u(scheduleTransferPaymentToBankFragment);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener
    public final void onBankSelectClick(View view) {
        SearchRecipientAccountToBankView searchRecipientAccountToBankView;
        Postcard postcardBuild = ARouter.getInstance().build("/sm/select_bank_for_to_bank_activity");
        ScheduleTransferPaymentToBankFragment.a aVar = ScheduleTransferPaymentToBankFragment.f33711H;
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1390a;
        p223od.o oVar = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
        String bankAccount = (oVar == null || (searchRecipientAccountToBankView = oVar.f40442f) == null) ? null : searchRecipientAccountToBankView.getBankAccount();
        if (!TextUtils.isEmpty(bankAccount)) {
            if ((bankAccount != null ? bankAccount.length() : 0) >= 10) {
                postcardBuild.withString("core_extra_bank_account_data", bankAccount);
            }
        }
        ARouter aRouter = ARouter.getInstance();
        Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
        Intrinsics.e(postcardBuild);
        r0.x(aRouter, scheduleTransferPaymentToBankFragment, postcardBuild, 4674);
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener
    public final void onChooseBankClick(BankInfo bankInfo) {
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1390a;
        scheduleTransferPaymentToBankFragment.f33712A = bankInfo;
        scheduleTransferPaymentToBankFragment.v();
        ScheduleTransferPaymentToBankFragment.u(scheduleTransferPaymentToBankFragment);
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener
    public final void onCleanAccountInfo() {
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1390a;
        scheduleTransferPaymentToBankFragment.f33712A = null;
        scheduleTransferPaymentToBankFragment.v();
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener
    public final void onContactSelectClick(View view) {
        AddFromContactsDialog addFromContactsDialog;
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1390a;
        Context contextRequireContext = scheduleTransferPaymentToBankFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AddFromContactsDialog addFromContactsDialog2 = new AddFromContactsDialog(contextRequireContext, true);
        addFromContactsDialog2.setTabTextList(C1850q.i("Recent", "Favorite"));
        addFromContactsDialog2.setRecentData((ArrayList) scheduleTransferPaymentToBankFragment.f33717v.getValue());
        addFromContactsDialog2.setPhoneContactData((ArrayList) scheduleTransferPaymentToBankFragment.f33718w.getValue());
        addFromContactsDialog2.setOnAddFromContactsListener(new r(scheduleTransferPaymentToBankFragment));
        scheduleTransferPaymentToBankFragment.t = addFromContactsDialog2;
        if (addFromContactsDialog2.isShowing() || (addFromContactsDialog = scheduleTransferPaymentToBankFragment.t) == null) {
            return;
        }
        addFromContactsDialog.show();
    }
}
