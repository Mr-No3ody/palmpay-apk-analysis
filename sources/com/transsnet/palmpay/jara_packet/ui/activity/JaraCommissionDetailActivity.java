package com.transsnet.palmpay.jara_packet.ui.activity;

import O6.c;
import V9.C0714c;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import p025ba.k;
import p071ef.b;
import p185ma.e;
import p236pc.d;
import p254qc.a;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/jara_packet/commission_detailS")
public class JaraCommissionDetailActivity extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31847j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f31849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelTitleContentImg f31851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f31852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31854g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31855i;

    public static void m(JaraCommissionDetailActivity jaraCommissionDetailActivity, String str) {
        jaraCommissionDetailActivity.getClass();
        c cVar = new c(jaraCommissionDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new e(jaraCommissionDetailActivity, 11));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p236pc.e.jp_jara_commission_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        ((JaraPacketApiService) a.f41475a.f35518b).queryCommissionDetails(str).k(f.f42629b).i(b.a()).subscribe(new C0714c(this, 25));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n(this.f31848a);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f31855i = (TextView) findViewById(d.textViewTransactionDate);
        this.f31854g = (TextView) findViewById(d.textViewPostDate);
        this.f31853f = (TextView) findViewById(d.textViewRefNo);
        this.f31852e = (TextView) findViewById(d.textViewOriginOrder);
        this.f31851d = (ModelTitleContentImg) findViewById(d.itemBillType);
        this.f31850c = (ModelBillDetailTextItem1) findViewById(d.itemAmount);
        this.f31849b = (ModelBillDetailTitle) findViewById(d.detailTitle);
    }
}
