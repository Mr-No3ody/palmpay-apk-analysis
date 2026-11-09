package Cd;

import Pa.r0;
import android.text.TextUtils;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements PpAmountEditText.OnTextInputListener, AddFromContactsDialog.OnAddFromContactsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToPalmPayFragment f1391a;

    public /* synthetic */ v(ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment) {
        this.f1391a = scheduleTransferPaymentToPalmPayFragment;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        ScheduleTransferPaymentToPalmPayFragment.a aVar = ScheduleTransferPaymentToPalmPayFragment.f33719H;
        this.f1391a.u();
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog.OnAddFromContactsListener
    public void onSelected(AddFromContactListResp addFromContactListResp) {
        String recipientName;
        String recipientMemberId;
        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView;
        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView2;
        String recipientPhone;
        ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment = this.f1391a;
        scheduleTransferPaymentToPalmPayFragment.f33722C = false;
        p223od.p pVar = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
        if (pVar != null && (searchRecipientAccountToPalmPayView2 = pVar.f40448f) != null) {
            searchRecipientAccountToPalmPayView2.setAccount((addFromContactListResp == null || (recipientPhone = addFromContactListResp.getRecipientPhone()) == null) ? null : r0.w(recipientPhone));
        }
        p223od.p pVar2 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
        if (pVar2 != null && (searchRecipientAccountToPalmPayView = pVar2.f40448f) != null) {
            searchRecipientAccountToPalmPayView.c(addFromContactListResp != null ? addFromContactListResp.getRecipientName() : null, null);
        }
        if (addFromContactListResp != null && (recipientMemberId = addFromContactListResp.getRecipientMemberId()) != null) {
            if (TextUtils.isEmpty(recipientMemberId)) {
                recipientMemberId = null;
            }
            if (recipientMemberId != null) {
                scheduleTransferPaymentToPalmPayFragment.f33724p = recipientMemberId;
            }
        }
        if (addFromContactListResp == null || (recipientName = addFromContactListResp.getRecipientName()) == null) {
            return;
        }
        String str = TextUtils.isEmpty(recipientName) ? null : recipientName;
        if (str != null) {
            scheduleTransferPaymentToPalmPayFragment.f33723o = str;
        }
    }
}
