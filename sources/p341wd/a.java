package p341wd;

import Kd.K;
import M1.j;
import N8.q0;
import Wf.AbstractC0780y;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.V;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements SwipeRefreshLayout.OnRefreshListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43402a;

    public /* synthetic */ a(ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity) {
        this.f43402a = scheduleTransferForBankUnstableBeneficiariesListActivity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        int i10 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43402a;
        String recipientAccountNumber = ((RecipientListResp.RecipientBean) scheduleTransferForBankUnstableBeneficiariesListActivity.m().getData().get(i7)).getRecipientAccountNumber();
        if (recipientAccountNumber != null) {
            if (TextUtils.isEmpty(recipientAccountNumber)) {
                recipientAccountNumber = null;
            }
            if (recipientAccountNumber != null) {
                scheduleTransferForBankUnstableBeneficiariesListActivity.setResult(-1, scheduleTransferForBankUnstableBeneficiariesListActivity.getIntent().putExtra("extra_data", recipientAccountNumber));
                scheduleTransferForBankUnstableBeneficiariesListActivity.finish();
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43402a;
        String str = scheduleTransferForBankUnstableBeneficiariesListActivity.f33430g;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) scheduleTransferForBankUnstableBeneficiariesListActivity.l();
                scheduleTransferForBankUnstableViewModel.getClass();
                AbstractC0780y.m(V.h(scheduleTransferForBankUnstableViewModel), null, null, new K(scheduleTransferForBankUnstableViewModel.t, q0.y(p367ya.a.d().i(), "_queryBeneficiaryList_", BaseApplication.getCountryLocale()), null, str), 3);
            }
        }
    }
}
