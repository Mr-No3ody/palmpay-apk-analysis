package Cd;

import Kd.X;
import Pa.r0;
import Rd.k0;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.transsnet.palmpay.send_money.bean.req.QueryRecipientMemberInfoReq;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferPaymentViewModel;
import java.util.ArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements SearchRecipientAccountToPalmPayView.OnSearchRecipientAccountToPalmPayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToPalmPayFragment f1397a;

    public y(ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment) {
        this.f1397a = scheduleTransferPaymentToPalmPayFragment;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView.OnSearchRecipientAccountToPalmPayListener
    public final void afterAccountEdit(String str) {
        ScheduleTransferPaymentToPalmPayFragment.a aVar = ScheduleTransferPaymentToPalmPayFragment.f33719H;
        ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment = this.f1397a;
        scheduleTransferPaymentToPalmPayFragment.u();
        if ((str != null ? str.length() : 0) >= 10) {
            p223od.p pVar = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
            if (pVar != null) {
                pVar.f40448f.a();
            }
            p223od.p pVar2 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
            String phoneAccount = pVar2 != null ? pVar2.f40448f.getPhoneAccount() : null;
            if ((phoneAccount != null ? phoneAccount.length() : 0) < 10) {
                return;
            }
            boolean z3 = scheduleTransferPaymentToPalmPayFragment.f33722C;
            if (!z3) {
                scheduleTransferPaymentToPalmPayFragment.f33722C = !z3;
                return;
            }
            p223od.p pVar3 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
            if (pVar3 != null) {
                SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView = pVar3.f40448f;
                String string = scheduleTransferPaymentToPalmPayFragment.getString(p159kd.h.sm_looking_for_this_user_name);
                k0 k0Var = searchRecipientAccountToPalmPayView.f33838c;
                if (k0Var != null) {
                    p220oa.h.C((LinearLayout) k0Var.f8377o);
                }
                if (k0Var != null) {
                    k0Var.f8372e.setText(string);
                }
                if (k0Var != null) {
                    p220oa.h.c((LinearLayout) k0Var.f8378p);
                }
            }
            QueryRecipientMemberInfoReq queryRecipientMemberInfoReq = new QueryRecipientMemberInfoReq(r0.v0(phoneAccount), 10);
            ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) scheduleTransferPaymentToPalmPayFragment.f27333i;
            if (scheduleTransferPaymentViewModel != null) {
                p140j8.f.s(scheduleTransferPaymentViewModel, new X(queryRecipientMemberInfoReq, null), scheduleTransferPaymentViewModel.f34006i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView.OnSearchRecipientAccountToPalmPayListener
    public final void onCleanAccountInfo() {
        this.f1397a.f33723o = null;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView.OnSearchRecipientAccountToPalmPayListener
    public final void onContactSelectClick(View view) {
        AddFromContactsDialog addFromContactsDialog;
        ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment = this.f1397a;
        Context contextRequireContext = scheduleTransferPaymentToPalmPayFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AddFromContactsDialog addFromContactsDialog2 = new AddFromContactsDialog(contextRequireContext, false);
        addFromContactsDialog2.setTabTextList(C1850q.i("Recent", "Favorite"));
        addFromContactsDialog2.setRecentData((ArrayList) scheduleTransferPaymentToPalmPayFragment.f33725v.getValue());
        addFromContactsDialog2.setPhoneContactData((ArrayList) scheduleTransferPaymentToPalmPayFragment.f33726w.getValue());
        addFromContactsDialog2.setOnAddFromContactsListener(new v(scheduleTransferPaymentToPalmPayFragment));
        scheduleTransferPaymentToPalmPayFragment.t = addFromContactsDialog2;
        if (addFromContactsDialog2.isShowing() || (addFromContactsDialog = scheduleTransferPaymentToPalmPayFragment.t) == null) {
            return;
        }
        addFromContactsDialog.show();
    }
}
