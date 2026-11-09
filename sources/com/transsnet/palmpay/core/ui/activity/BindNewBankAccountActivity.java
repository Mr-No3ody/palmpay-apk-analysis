package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import Pa.r0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.MessageBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.BindBankAccountReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.core.bean.rsp.AddBankAccSendOtpRsp;
import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/bind_new_bank_account")
public class BindNewBankAccountActivity extends com.transsnet.palmpay.core.base.i implements AddBankAccountContract.IView, View.OnClickListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f27464H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f27465A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f27466B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkBankAccountResp.LinkBankAccount f27470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SelectBankDialogV2 f27473g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BankInfo f27474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f27475j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f27476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelBankInfoItem f27477p;
    public EditText t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f27478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f27479w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27468b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27469c = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1480n f27467C = new C1480n(this, 0);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_bind_new_bank_account;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleAddBankAccountResult(AddPayBankAccRsp addPayBankAccRsp) {
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleAddTzBankAccountResult(CommonResult commonResult) {
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IView
    public final void handleBankList(List list) {
        this.f27475j = list;
        if (this.f27473g.isShowing()) {
            this.f27473g.setBankCardInfos(this.f27475j);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleBindResult(BindActionRsp bindActionRsp) {
        String string;
        if (!bindActionRsp.isSuccess()) {
            if (CommonResult.CODE_BANK_CARD_NAME_NOT_MATCH_AUTHEN_NAME.equalsIgnoreCase(bindActionRsp.getRespCode())) {
                showErrorMessageDialog(bindActionRsp.getRespMsg(), getResources().getString(p025ba.k.core_try_again), getResources().getString(p025ba.k.core_cancel));
                return;
            }
            Postcard postcardWithString = com.horcrux.svg.d0.g(3, "/core/common_result", "extra_result").withString("extra_title", getString(p025ba.k.core_failed)).withString("extra_message", bindActionRsp.getRespMsg()).withString("extra_Btn1Text", getString(p025ba.k.core_try_again)).withInt("extra_Btn1Text_action", 1).withString("extra_Btn2Text", getString(p025ba.k.core_cancel));
            if (this.f27469c) {
                postcardWithString.withInt("extra_Btn2Text_action", 2);
            } else {
                postcardWithString.withInt("extra_Btn2Text_action", 5);
                Activity parentActivity = ActivityUtils.getParentActivity(this);
                if (parentActivity != null) {
                    postcardWithString.withString("extra_Btn2Text_page", parentActivity.getClass().getName());
                }
            }
            postcardWithString.navigation();
            return;
        }
        if (!TextUtils.isEmpty(bindActionRsp.token)) {
            com.horcrux.svg.d0.g(2, "/coreImpl/modify_real_name_alert", "extra_type").withString("extra_message", bindActionRsp.getRespMsg()).withString("extra_data", bindActionRsp.token).navigation();
            finish();
            return;
        }
        if (!this.f27469c) {
            BankCardInfo bankCardInfo = new BankCardInfo();
            if (this.f27478v.getVisibility() == 8) {
                string = this.t.getText().toString();
            } else {
                string = this.f27478v.getText().toString() + this.t.getText().toString();
            }
            bankCardInfo.bankAccountNo = string;
            BankInfo bankInfo = this.f27474i;
            if (bankInfo != null) {
                bankCardInfo.bankCode = bankInfo.bankCode;
                bankCardInfo.bankName = bankInfo.bankName;
                bankCardInfo.bankUrl = bankInfo.bankUrl;
                bankCardInfo.isNewAdded = 1;
            }
            MessageBean messageBean = new MessageBean();
            messageBean.key = 19;
            messageBean.msg = bankCardInfo;
            org.greenrobot.eventbus.c.b().f(messageBean);
            if (SPUtils.getInstance().getInt("KEY_WITHDRAW_ACCOUNT_NUM") <= 0) {
                SPUtils.getInstance().put("KEY_WITHDRAW_ACCOUNT_NUM", 1);
            }
        }
        org.greenrobot.eventbus.c.b().f(new MessageEvent(9, ""));
        ARouter.getInstance().build("/core/common_result").withInt("extra_result", 1).withString("extra_title", getString(p025ba.k.core_success)).withString("extra_message", getString(p025ba.k.core_msg_bind_account_success)).withString("extra_Btn1Text", getString(p025ba.k.core_complete)).withInt("extra_Btn1Text_action", 1).withBoolean("extra_flag", true).navigation();
        finish();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleCheckCardBindNum(CommonResult commonResult) {
        if (!commonResult.isSuccess()) {
            o(commonResult.getRespMsg());
            return;
        }
        if (this.f27472f) {
            m();
            return;
        }
        try {
            startActivityForResult(i0.q(this), 91);
        } catch (Exception e10) {
            F6.d.c(this.TAG, "clickNext: ", e10);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleCheckInputBankAccountInfoRsp(CheckBankCardInfoReq checkBankCardInfoReq, CheckBankCardInfoRsp checkBankCardInfoRsp) {
        if (!checkBankCardInfoRsp.isSuccess()) {
            o(checkBankCardInfoRsp.getRespMsg());
            return;
        }
        CheckBankCardInfoRsp.Data data = checkBankCardInfoRsp.data;
        if (data == null) {
            n();
            return;
        }
        if (checkBankCardInfoReq.bankCode.equals(data.bankCode)) {
            n();
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_attention);
        cVar.f6605k = true;
        cVar.b(p025ba.k.core_msg_wrong_bank_selected);
        cVar.d(p025ba.k.core_yes, new ViewOnClickListenerC1483q(this, checkBankCardInfoRsp));
        cVar.c(p025ba.k.core_no, null);
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleOtpResult(AddBankAccSendOtpRsp addBankAccSendOtpRsp) {
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handlePaymentMethods(List list) {
        this.f27476o = list;
        if (this.f27473g.isShowing()) {
            this.f27473g.setPayBankAccount(this.f27476o);
            this.f27473g.setBankCardInfos(this.f27475j);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f27475j = new ArrayList();
        SelectBankDialogV2 selectBankDialogV2 = new SelectBankDialogV2(this);
        this.f27473g = selectBankDialogV2;
        selectBankDialogV2.setCallBack(new C1482p(this));
        this.f27477p.f28272j.setText(p025ba.k.core_select_bank_text);
        this.f27477p.f28266c.setImageResource(com.transsnet.palmpay.custom_view.r.cv_bank_account);
        this.f27477p.e(false);
        this.f27477p.f28267d.addTextChangedListener(this.f27467C);
        this.t.addTextChangedListener(new C1480n(this, 1));
        this.f27477p.setOnClickListener(this);
        this.f27479w.setOnClickListener(this);
        if (this.f27470d != null) {
            BankInfo bankInfo = new BankInfo();
            this.f27474i = bankInfo;
            bankInfo.bankCode = this.f27470d.getBankCode();
            this.f27474i.bankName = this.f27470d.getBankName();
            this.f27477p.e(true);
            this.f27477p.f28267d.setText(this.f27474i.bankName);
            r0.u1(this.f27477p.f28266c, this.f27470d.getBankUrl(), com.transsnet.palmpay.custom_view.r.cv_default_bank_logo);
            this.t.setText(this.f27470d.getBankAccountNo());
        }
        p();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorPrimary));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new La.h();
    }

    public final void m() {
        String string;
        if (BaseApplication.isAO() || this.f27474i != null) {
            BindBankAccountReq bindBankAccountReq = new BindBankAccountReq();
            BankInfo bankInfo = this.f27474i;
            bindBankAccountReq.bankCode = bankInfo == null ? null : bankInfo.bankCode;
            if (this.f27478v.getVisibility() == 8) {
                string = this.t.getText().toString();
            } else {
                string = this.f27478v.getText().toString() + this.t.getText().toString();
            }
            bindBankAccountReq.bankAccountNo = string;
            ((La.h) this.f27350a).bindBankAccount(bindBankAccountReq);
        }
    }

    public final void n() {
        String string;
        if (BaseApplication.isAO() || this.f27474i != null) {
            CheckCardBindNumReq checkCardBindNumReq = new CheckCardBindNumReq();
            BankInfo bankInfo = this.f27474i;
            checkCardBindNumReq.setBankCode(bankInfo == null ? null : bankInfo.bankCode);
            if (this.f27478v.getVisibility() == 8) {
                string = this.t.getText().toString();
            } else {
                string = this.f27478v.getText().toString() + this.t.getText().toString();
            }
            checkCardBindNumReq.setBankAccountNo(string);
            ((La.h) this.f27350a).checkCardBindNum(checkCardBindNumReq);
        }
    }

    public final void o(String str) {
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_attention);
        cVar.f6605k = true;
        cVar.f6598d = str;
        cVar.d(p025ba.k.core_payment_confirm, null);
        O6.d dVarA = cVar.a();
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 91 && i10 == -1) {
            this.f27472f = true;
            m();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        int id2 = view.getId();
        if (id2 == this.f27479w.getId()) {
            La.h hVar = (La.h) this.f27350a;
            if (this.f27478v.getVisibility() == 8) {
                string = this.t.getText().toString();
            } else {
                string = this.f27478v.getText().toString() + this.t.getText().toString();
            }
            BankInfo bankInfo = this.f27474i;
            hVar.checkInputBankAccountInfo(new CheckBankCardInfoReq(1, string, bankInfo != null ? bankInfo.bankCode : null, "1"));
            return;
        }
        if (id2 == this.f27477p.getId()) {
            BankInfo bankInfo2 = this.f27474i;
            if (bankInfo2 != null) {
                this.f27473g.initNowSelectedBankCard(bankInfo2);
            }
            this.f27473g.show();
            List list = this.f27475j;
            if (list != null && list.isEmpty()) {
                this.f27473g.setLoading();
            } else {
                this.f27473g.setBankCardInfos(this.f27475j);
                this.f27473g.setPayBankAccount(this.f27476o);
            }
        }
    }

    public final void p() {
        this.f27479w.setEnabled((BaseApplication.isAO() || this.f27474i != null) && !TextUtils.isEmpty(this.t.getText().toString()));
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        if (BaseApplication.isAO()) {
            return;
        }
        ((La.h) this.f27350a).queryBankList(new QueryBankListReq(this.f27468b));
        ((La.h) this.f27350a).queryPaymentMethod();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f27477p = (ModelBankInfoItem) findViewById(L9.a.itemBankInfo);
        this.t = (EditText) findViewById(L9.a.itemAccountNo);
        this.f27478v = (TextView) findViewById(L9.a.bank_account_prefix_tv);
        this.f27479w = (TextView) findViewById(L9.a.textViewNext);
        this.f27466B = (TextView) findViewById(L9.a.tvNote);
        if (BaseApplication.isAO()) {
            this.t.setFilters(new InputFilter[]{new C1481o(21)});
            this.f27478v.setVisibility(0);
            this.f27477p.setVisibility(8);
        } else if (BaseApplication.isNG()) {
            this.t.setFilters(new InputFilter[]{new C1481o(12)});
        }
        this.f27465A = (TextView) findViewById(L9.a.select_other_method_tv);
        if ("cl_installment_router".equals(this.f27471e)) {
            this.f27465A.getPaint().setFlags(8);
            this.f27465A.getPaint().setAntiAlias(true);
            this.f27465A.setVisibility(0);
        } else {
            this.f27465A.setVisibility(8);
        }
        this.f27465A.setOnClickListener(new Yd.i(this, 23));
    }
}
