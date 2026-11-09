package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import F8.h;
import N8.p0;
import Tb.b;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.req.ModifyMemberInfoReq;
import com.transsnet.palmpay.account.bean.req.VerifyRealNameReq;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import org.greenrobot.eventbus.c;
import p025ba.f;
import p025ba.k;
import p051d9.u0;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/verify_real_name")
public class VerifyRealNameActivity extends i implements TitleEditView.OnTextInputListener, VerifyRealNameContract.View {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26075p = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TitleEditView f26078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TitleEditView f26079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TitleEditView f26080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f26081g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f26082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f26083j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f26084o;

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    @Override // com.transsnet.palmpay.custom_view.TitleEditView.OnTextInputListener
    public final void OnTextInput(String str) {
        boolean z3;
        TitleEditView titleEditView = this.f26080f;
        if (TextUtils.isEmpty(titleEditView != null ? titleEditView.getEditText() : "")) {
            z3 = false;
        } else {
            TitleEditView titleEditView2 = this.f26078d;
            if (TextUtils.isEmpty(titleEditView2 != null ? titleEditView2.getEditText() : "")) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        this.f26081g.setEnabled(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_verify_real_name;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.View
    public final void handleRegularRule(RegularRuleRsp regularRuleRsp, boolean z3) {
        if (regularRuleRsp == null) {
            return;
        }
        if (!regularRuleRsp.isSuccess()) {
            ToastUtils.showLong(regularRuleRsp.getRespMsg());
            return;
        }
        this.f26082i = regularRuleRsp.data;
        if (z3 && m()) {
            n();
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.View
    public final void handleVerifyName(CommonResult commonResult) {
        if (this.f26076b == 65535) {
            if (!commonResult.isSuccess()) {
                showErrorMessageDialog(commonResult.getRespMsg());
                return;
            }
            t tVar = new t(this);
            tVar.b();
            int i7 = k.core_confirm;
            tVar.f31312k = new p0(this, 2);
            tVar.f31305d = tVar.f31302a.getString(i7);
            tVar.e(true);
            return;
        }
        if (commonResult.isSuccess()) {
            c.b().f(new MessageEvent(9, ""));
            ARouter.getInstance().build("/account/verify_real_name_result").withInt("extra_type", this.f26076b).navigation();
            finish();
            return;
        }
        if ("CFRONT_800027".equalsIgnoreCase(commonResult.getRespCode())) {
            d0.g(3, "/core/common_result", "extra_result").withString("extra_title", getString(k.core_failed)).withString("extra_message", commonResult.getRespMsg()).withString("extra_Btn1Text", getString(k.core_complete)).withInt("extra_Btn1Text_action", 2).navigation();
            finish();
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = commonResult.getRespMsg();
        cVar.d(k.core_try_again, null);
        cVar.c(k.core_cancel, new p0(this, 1));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int i7 = 0;
        if (BaseApplication.isNG()) {
            this.f26080f.setTitle(getString(h.ac_legal_surname));
        }
        this.f26078d.setInputFilter(new InputFilter[]{new Tb.c(getResources().getInteger(f.max_name_length), 0), new b(0)});
        this.f26079e.setInputFilter(new InputFilter[]{new Tb.c(getResources().getInteger(f.max_name_length), 0), new b(0)});
        this.f26080f.setInputFilter(new InputFilter[]{new Tb.c(getResources().getInteger(f.max_name_length), 0), new b(0)});
        this.f26081g.setOnClickListener(new p0(this, i7));
        this.f26080f.setOnTextInputListener(this);
        this.f26079e.setOnTextInputListener(this);
        this.f26078d.setOnTextInputListener(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorPrimary));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new u0();
    }

    public final boolean m() {
        TitleEditView titleEditView = this.f26078d;
        String editText = titleEditView != null ? titleEditView.getEditText() : "";
        TitleEditView titleEditView2 = this.f26079e;
        String editText2 = titleEditView2 != null ? titleEditView2.getEditText() : "";
        TitleEditView titleEditView3 = this.f26080f;
        String editText3 = titleEditView3 != null ? titleEditView3.getEditText() : "";
        for (RegularRuleRsp.DataBean dataBean : this.f26082i) {
            if (RegexUtils.isMatch(dataBean.rule, editText) != dataBean.pass) {
                this.f26078d.setError(dataBean.msg);
                return false;
            }
            if (!TextUtils.isEmpty(editText2) && RegexUtils.isMatch(dataBean.rule, editText2) != dataBean.pass) {
                this.f26079e.setError(dataBean.msg);
                return false;
            }
            if (RegexUtils.isMatch(dataBean.rule, editText3) != dataBean.pass) {
                this.f26080f.setError(dataBean.msg);
                return false;
            }
        }
        return true;
    }

    public final void n() {
        if (this.f26076b == 65535) {
            ModifyMemberInfoReq modifyMemberInfoReq = new ModifyMemberInfoReq();
            TitleEditView titleEditView = this.f26078d;
            modifyMemberInfoReq.firstName = titleEditView != null ? titleEditView.getEditText() : "";
            TitleEditView titleEditView2 = this.f26079e;
            modifyMemberInfoReq.middleName = titleEditView2 != null ? titleEditView2.getEditText() : "";
            TitleEditView titleEditView3 = this.f26080f;
            modifyMemberInfoReq.lastName = titleEditView3 != null ? titleEditView3.getEditText() : "";
            ((u0) this.f27350a).verifyMobileNumberRealName(modifyMemberInfoReq);
            return;
        }
        VerifyRealNameReq verifyRealNameReq = new VerifyRealNameReq();
        TitleEditView titleEditView4 = this.f26078d;
        verifyRealNameReq.firstName = titleEditView4 != null ? titleEditView4.getEditText() : "";
        TitleEditView titleEditView5 = this.f26079e;
        verifyRealNameReq.middleName = titleEditView5 != null ? titleEditView5.getEditText() : "";
        TitleEditView titleEditView6 = this.f26080f;
        verifyRealNameReq.lastName = titleEditView6 != null ? titleEditView6.getEditText() : "";
        verifyRealNameReq.token = this.f26077c;
        ((u0) this.f27350a).verifyName(verifyRealNameReq);
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((u0) this.f27350a).getRegularRule(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f26078d = (TitleEditView) findViewById(d.inputFirstName);
        this.f26079e = (TitleEditView) findViewById(d.inputMiddleName);
        this.f26080f = (TitleEditView) findViewById(d.inputLastName);
        if (BaseApplication.isNG()) {
            this.f26080f.setTitle(getString(h.ac_legal_surname));
        }
        this.f26081g = (TextView) findViewById(d.textViewNext);
        this.f26083j = (TextView) findViewById(d.tvTitle);
        TextView textView = (TextView) findViewById(d.tvMessage);
        this.f26084o = textView;
        int i7 = this.f26076b;
        if (i7 == 65535) {
            this.f26083j.setText(h.ac_msg_authenticate_name);
            this.f26084o.setVisibility(8);
        } else if (i7 == 4) {
            textView.setText(h.ac_msg_edit_your_name_for_id_verify);
        }
    }
}
