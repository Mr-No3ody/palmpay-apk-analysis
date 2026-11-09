package com.transsnet.palmpay.send_money.ui.activity.topp;

import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import Z4.e;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem;
import com.transsnet.palmpay.send_money.bean.TransferData;
import p159kd.f;
import p159kd.h;
import p327vd.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/receive_money_result")
public class ReceiveMoneyResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33573f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LottieAnimationView f33574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f33575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem f33576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem f33577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem f33578e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_receive_money_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra = getIntent().getStringExtra("business_info");
        try {
            C0525w.f().getClass();
            TransferData transferData = (TransferData) C0525w.d(stringExtra, TransferData.class);
            if (transferData == null || transferData.orderStatus != 5) {
                return;
            }
            this.f33574a.e();
            i0.k0();
            this.f33575b.setText(h.sm_tf_money_success);
            this.f33576c.setContent(r0.B(transferData.amount, false));
            this.f33577d.setContent(r0.k0(transferData.senderNickname, transferData.senderPhone));
            String strC = e.c(transferData.senderRemark);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            this.f33578e.setContent(strC);
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(-1);
        this.f33574a = (LottieAnimationView) findViewById(p159kd.e.collect_money_result_img);
        this.f33575b = (TextView) findViewById(p159kd.e.collect_money_result_tv);
        this.f33576c = (ModelBillDetailTextItem) findViewById(p159kd.e.receive_amount);
        this.f33577d = (ModelBillDetailTextItem) findViewById(p159kd.e.receive_payer);
        this.f33578e = (ModelBillDetailTextItem) findViewById(p159kd.e.receive_message);
        findViewById(p159kd.e.collect_money_complete).setOnClickListener(new c(this, 13));
    }
}
