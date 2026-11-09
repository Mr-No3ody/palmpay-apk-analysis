package com.transsnet.palmpay.managemoney.ui.view;

import Kc.f;
import Pa.r0;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.managemoney.bean.CashBoxRemainingBalance;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.ui.dialog.EstimatedInterestDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxEstimatedInterestView f32710b;

    public /* synthetic */ a(CashBoxEstimatedInterestView cashBoxEstimatedInterestView, int i7) {
        this.f32709a = i7;
        this.f32710b = cashBoxEstimatedInterestView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long remainingBalance;
        String productDesc;
        CashBoxEstimatedInterestView cashBoxEstimatedInterestView = this.f32710b;
        switch (this.f32709a) {
            case 0:
                AmountEditText amountEditText = cashBoxEstimatedInterestView.f32698i;
                if (amountEditText != null) {
                    GetUserAssetsAmountResp.Balance balance = cashBoxEstimatedInterestView.f32687A;
                    long jLongValue = 0;
                    long j6 = balance != null ? balance.availableBalance : 0L;
                    CashBoxRemainingBalance cashBoxRemainingBalance = cashBoxEstimatedInterestView.f32688B;
                    if (cashBoxRemainingBalance != null && (remainingBalance = cashBoxRemainingBalance.getRemainingBalance()) != null) {
                        jLongValue = remainingBalance.longValue();
                    }
                    if (j6 > jLongValue) {
                        j6 = jLongValue;
                    }
                    amountEditText.setText(r0.A(j6));
                }
                break;
            default:
                int i7 = CashBoxEstimatedInterestView.f32686L;
                EstimatedInterestDialogFragment.a aVar = EstimatedInterestDialogFragment.f32295C;
                GetInterestRateConfigResp getInterestRateConfigResp = f.f4999b.getInstance().f5000a;
                if (getInterestRateConfigResp == null || (productDesc = getInterestRateConfigResp.getProductDesc()) == null) {
                    productDesc = "test";
                }
                AmountEditText amountEditText2 = cashBoxEstimatedInterestView.f32698i;
                EstimatedInterestDialogFragment estimatedInterestDialogFragmentNewInstance = aVar.newInstance(productDesc, String.valueOf(amountEditText2 != null ? amountEditText2.getText() : null));
                Context context = cashBoxEstimatedInterestView.getContext();
                Intrinsics.f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Z supportFragmentManager = ((E) context).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                estimatedInterestDialogFragmentNewInstance.show(supportFragmentManager, "showEstimatedDialog");
                break;
        }
    }
}
