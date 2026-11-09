package p341wd;

import M1.j;
import Pa.F;
import android.text.TextUtils;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.send_money.bean.ScheduleTransferPaymentBean;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmTransferInfoDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements OnItemChildClickListener, OnItemClickListener, StateAmountEditText.OnTextInputListener, ConfirmTransferInfoDialog.OnConfirmTransferInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43425a;

    public /* synthetic */ l(ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity) {
        this.f43425a = scheduleTransferForBankUnstableHomeActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.StateAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        int i7 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
        this.f43425a.n();
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmTransferInfoDialog.OnConfirmTransferInfoListener
    public void onConfirmClick(View it) {
        int i7 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43425a.p();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(j jVar, View view, int i7) {
        int i10 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43425a;
        ScheduleTransferPaymentBean scheduleTransferPaymentBean = (ScheduleTransferPaymentBean) scheduleTransferForBankUnstableHomeActivity.q().getItem(i7);
        if (TextUtils.isEmpty(scheduleTransferPaymentBean.getJumpUrl())) {
            return;
        }
        ActivityUtils.startActivity(F.a(scheduleTransferForBankUnstableHomeActivity, scheduleTransferPaymentBean.getJumpUrl()));
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        int i10 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43425a;
        ScheduleTransferPaymentBean scheduleTransferPaymentBean = (ScheduleTransferPaymentBean) scheduleTransferForBankUnstableHomeActivity.q().getItem(i7);
        if (scheduleTransferPaymentBean.getBalanceEnough()) {
            ScheduleTransferPaymentBean scheduleTransferPaymentBean2 = scheduleTransferForBankUnstableHomeActivity.f33462p0;
            if (scheduleTransferPaymentBean2 != null) {
                scheduleTransferPaymentBean2.setDefaultOption(false);
            }
            scheduleTransferPaymentBean.setDefaultOption(true);
            scheduleTransferForBankUnstableHomeActivity.f33462p0 = scheduleTransferPaymentBean;
            scheduleTransferForBankUnstableHomeActivity.q().notifyDataSetChanged();
        }
    }
}
