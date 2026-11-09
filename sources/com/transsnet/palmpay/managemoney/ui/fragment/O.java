package com.transsnet.palmpay.managemoney.ui.fragment;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import com.transsnet.palmpay.main.export.ui.view.ModelNewCustomerSavings;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements ModelNewCustomerSavings.OnInvestBtnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewUserFixedSavingFragment f32497a;

    public O(NewUserFixedSavingFragment newUserFixedSavingFragment) {
        this.f32497a = newUserFixedSavingFragment;
    }

    @Override // com.transsnet.palmpay.main.export.ui.view.ModelNewCustomerSavings.OnInvestBtnClickListener
    public final void onInvestBtnClick(SavingProduct savingProduct) {
        String strT;
        Long amount;
        Long productId;
        if (!TextUtils.isEmpty(savingProduct != null ? savingProduct.getAndroidUrl() : null)) {
            NewUserFixedSavingFragment.a aVar = NewUserFixedSavingFragment.f32484A;
            Intent intentA = Pa.F.a(this.f32497a.f27319c, savingProduct != null ? savingProduct.getAndroidUrl() : null);
            if (intentA != null) {
                ActivityUtils.startActivity(intentA);
                return;
            }
            return;
        }
        long jLongValue = 0;
        Postcard postcardWithLong = ARouter.getInstance().build("/manage_money/create_plan_activity").withLong(FirebaseAnalytics.Param.PRODUCT_ID, (savingProduct == null || (productId = savingProduct.getProductId()) == null) ? 0L : productId.longValue()).withLong("duration_day", savingProduct != null ? savingProduct.getDurationDay() : 0L);
        if ((savingProduct != null ? savingProduct.getAmount() : null) == null) {
            strT = "";
        } else {
            if (savingProduct != null && (amount = savingProduct.getAmount()) != null) {
                jLongValue = amount.longValue();
            }
            strT = Pa.r0.t(String.valueOf(jLongValue));
        }
        postcardWithLong.withString("plan_amount", strT).navigation();
    }
}
