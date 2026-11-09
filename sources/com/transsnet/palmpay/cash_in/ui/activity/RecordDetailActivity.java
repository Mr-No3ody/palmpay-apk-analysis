package com.transsnet.palmpay.cash_in.ui.activity;

import F6.d;
import N8.q0;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.fragment.BindBankCardDetailFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.FundDetailFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawRecordDetailFragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.util.BarUtils;
import p366y9.b;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cash_in_out/billdetail")
public class RecordDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26898c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_activity_record_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        if (this.f26898c <= 0) {
            this.f26898c = intent.getIntExtra("orderType", 0);
        }
        if (TextUtils.isEmpty(this.f26896a)) {
            this.f26896a = getQueryParameter("orderNo");
        }
        if (TextUtils.isEmpty(this.f26897b)) {
            this.f26897b = getQueryParameter("extra_type");
        }
        Uri data = intent.getData();
        if (data != null && this.f26898c <= 0) {
            try {
                this.f26898c = Integer.parseInt(data.getQueryParameter("orderType"));
            } catch (NumberFormatException e10) {
                d.c(this.TAG, "initData: ", e10);
            }
        }
        int i7 = this.f26898c;
        if (i7 == 1 || "01".equals(this.f26897b)) {
            String str = this.f26896a;
            BarUtils.setStatusBarLightMode((Activity) this, true);
            Z supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.e(b.card_fragment_container, FundDetailFragment.f27008X.newInstance(str), null);
            c1161a.h(true);
            return;
        }
        if (i7 == 2 || "02".equals(this.f26897b) || TransType.TRANS_TYPE_AUTO_WITHDRAW.equals(this.f26897b)) {
            Z supportFragmentManager2 = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager2, supportFragmentManager2);
            c1161aE.e(b.card_fragment_container, WithdrawRecordDetailFragment.f27042w.newInstance(this.f26897b, this.f26896a), null);
            c1161aE.h(true);
            return;
        }
        if (TransType.TRANS_TYPE_BIND_BANK_CARD.equals(this.f26897b)) {
            Z supportFragmentManager3 = getSupportFragmentManager();
            C1161a c1161aE2 = q0.e(supportFragmentManager3, supportFragmentManager3);
            c1161aE2.e(b.card_fragment_container, BindBankCardDetailFragment.f27000C.newInstance(this.f26896a), null);
            c1161aE2.h(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
