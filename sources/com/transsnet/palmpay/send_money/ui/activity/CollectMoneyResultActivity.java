package com.transsnet.palmpay.send_money.ui.activity;

import L6.b;
import Pa.r0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.message.VoucherOperationMsg;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherReq;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherResp;
import com.transsnet.palmpay.send_money.contract.CollectMoneyResultContract$IView;
import com.transsnet.palmpay.send_money.ui.activity.CollectMoneyResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import org.greenrobot.eventbus.c;
import p025ba.k;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p255qd.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/voucher/collect")
public class CollectMoneyResultActivity extends i implements CollectMoneyResultContract$IView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f33155o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LottieAnimationView f33156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f33157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f33158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem f33159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelBillDetailTextItem f33160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelBillDetailTextItem f33161g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f33162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f33163j;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_collect_money_result_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new a();
    }

    public final void m(View view) {
        int id2 = view.getId();
        if (id2 == e.collect_money_result_upgrade_account) {
            ARouter.getInstance().build("/account/upgrade").navigation(this);
        } else if (id2 == e.collect_money_complete) {
            ARouter.getInstance().build("/send/money").withFlags(67108864).navigation(this);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        showLoadingDialog(true, getString(h.sm_receiving_ing));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("orderId");
        String stringExtra2 = intent.getStringExtra("remark");
        ApplyVoucherReq applyVoucherReq = new ApplyVoucherReq();
        applyVoucherReq.setOrderId(stringExtra);
        if (!TextUtils.isEmpty(stringExtra2)) {
            applyVoucherReq.setRemark(stringExtra2);
        }
        ((a) this.f27350a).applyVoucher(applyVoucherReq);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        this.f33163j = (Button) findViewById(e.collect_money_complete);
        this.f33162i = (Button) findViewById(e.collect_money_result_upgrade_account);
        this.f33161g = (ModelBillDetailTextItem) findViewById(e.collect_result_sender_msg);
        this.f33160f = (ModelBillDetailTextItem) findViewById(e.collect_result_sender);
        this.f33159e = (ModelBillDetailTextItem) findViewById(e.collect_result_money);
        this.f33158d = (TextView) findViewById(e.collect_money_result_desc_tv);
        this.f33157c = (TextView) findViewById(e.collect_money_result_tv);
        this.f33156b = (LottieAnimationView) findViewById(e.collect_money_result_img);
        final int i7 = 0;
        this.f33162i.setOnClickListener(new View.OnClickListener(this) { // from class: rd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectMoneyResultActivity f41735b;

            {
                this.f41735b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectMoneyResultActivity collectMoneyResultActivity = this.f41735b;
                switch (i7) {
                    case 0:
                        int i10 = CollectMoneyResultActivity.f33155o;
                        collectMoneyResultActivity.m(view);
                        break;
                    default:
                        int i11 = CollectMoneyResultActivity.f33155o;
                        collectMoneyResultActivity.m(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f33163j.setOnClickListener(new View.OnClickListener(this) { // from class: rd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectMoneyResultActivity f41735b;

            {
                this.f41735b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectMoneyResultActivity collectMoneyResultActivity = this.f41735b;
                switch (i10) {
                    case 0:
                        int i11 = CollectMoneyResultActivity.f33155o;
                        collectMoneyResultActivity.m(view);
                        break;
                    default:
                        int i12 = CollectMoneyResultActivity.f33155o;
                        collectMoneyResultActivity.m(view);
                        break;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.send_money.contract.CollectMoneyResultContract$IView
    public final void showApplyVoucherError(String str) {
        showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // com.transsnet.palmpay.send_money.contract.CollectMoneyResultContract$IView
    public final void showApplyVoucherResult(ApplyVoucherResp applyVoucherResp) {
        ApplyVoucherResp.Data data;
        showLoadingDialog(false);
        if (!applyVoucherResp.isSuccess() || (data = applyVoucherResp.data) == null) {
            this.f33156b.setImageResource(r.cv_result_fail);
            this.f33157c.setText(k.core_failed_upper);
            this.f33158d.setVisibility(0);
            this.f33158d.setText(applyVoucherResp.getRespMsg());
            this.f33163j.setVisibility(0);
            return;
        }
        if (data.orderStatus != 5) {
            this.f33156b.setImageResource(r.cv_result_fail);
            this.f33157c.setText(k.core_failed_upper);
            this.f33158d.setVisibility(0);
            this.f33158d.setText(applyVoucherResp.data.orderStatusDesc);
            this.f33163j.setVisibility(0);
            return;
        }
        this.f33156b.setImageResource(r.cv_result_success);
        this.f33157c.setText(h.sm_tf_money_success);
        this.f33159e.setContent(r0.B(applyVoucherResp.data.amount, false));
        this.f33160f.setContent(applyVoucherResp.data.senderNickname);
        if (!TextUtils.isEmpty(applyVoucherResp.data.senderRemark)) {
            this.f33161g.setContent(applyVoucherResp.data.senderRemark);
        }
        this.f33163j.setVisibility(0);
        c.b().f(new VoucherOperationMsg(applyVoucherResp.data.orderId, true));
    }
}
