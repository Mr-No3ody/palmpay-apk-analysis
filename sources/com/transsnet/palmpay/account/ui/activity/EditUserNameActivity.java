package com.transsnet.palmpay.account.ui.activity;

import Dd.b;
import F8.d;
import F8.e;
import F8.h;
import Je.l;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.req.ChangeUserInfoReq;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import org.greenrobot.eventbus.c;
import p025ba.f;
import p051d9.u0;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/edit_name")
public class EditUserNameActivity extends i implements TitleEditView.OnTextInputListener, VerifyRealNameContract.View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25844i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TitleEditView f25845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TitleEditView f25846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TitleEditView f25847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f25848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f25849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public User f25850g;

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    @Override // com.transsnet.palmpay.custom_view.TitleEditView.OnTextInputListener
    public final void OnTextInput(String str) {
        boolean z3;
        TitleEditView titleEditView = this.f25847d;
        if (TextUtils.isEmpty(titleEditView != null ? titleEditView.getEditText() : "")) {
            z3 = false;
        } else {
            TitleEditView titleEditView2 = this.f25845b;
            if (TextUtils.isEmpty(titleEditView2 != null ? titleEditView2.getEditText() : "")) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        this.f25848e.setEnabled(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_edit_user_name;
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
        this.f25849f = regularRuleRsp.data;
        if (z3 && m()) {
            ChangeUserInfoReq changeUserInfoReq = new ChangeUserInfoReq();
            TitleEditView titleEditView = this.f25845b;
            changeUserInfoReq.firstName = titleEditView != null ? titleEditView.getEditText() : "";
            TitleEditView titleEditView2 = this.f25846c;
            changeUserInfoReq.middleName = titleEditView2 != null ? titleEditView2.getEditText() : "";
            TitleEditView titleEditView3 = this.f25847d;
            changeUserInfoReq.lastName = titleEditView3 != null ? titleEditView3.getEditText() : "";
            ((u0) this.f27350a).changeName(changeUserInfoReq);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.View
    public final void handleVerifyName(CommonResult commonResult) {
        if (!commonResult.isSuccess()) {
            showErrorMessageDialog(commonResult.getRespMsg());
            return;
        }
        c.b().f(new MessageEvent(4));
        t tVar = new t(this);
        tVar.b();
        tVar.f31311j = new b(this, 5);
        tVar.e(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f25850g = BaseApplication.get().getUser();
        this.f25845b.setInputFilter(new InputFilter[]{new Tb.c(getResources().getInteger(f.max_name_length), 0), new Tb.b(0)});
        this.f25846c.setInputFilter(new InputFilter[]{new Tb.c(getResources().getInteger(f.max_name_length), 0), new Tb.b(0)});
        this.f25847d.setInputFilter(new InputFilter[]{new Tb.c(getResources().getInteger(f.max_name_length), 0), new Tb.b(0)});
        this.f25848e.setOnClickListener(new l(this, 17));
        this.f25847d.setOnTextInputListener(this);
        this.f25846c.setOnTextInputListener(this);
        this.f25845b.setOnTextInputListener(this);
        this.f25845b.setEditText(this.f25850g.getFirstName());
        this.f25846c.setEditText(this.f25850g.getMiddleName());
        this.f25847d.setEditText(this.f25850g.getLastName());
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
        TitleEditView titleEditView = this.f25845b;
        String editText = titleEditView != null ? titleEditView.getEditText() : "";
        TitleEditView titleEditView2 = this.f25846c;
        String editText2 = titleEditView2 != null ? titleEditView2.getEditText() : "";
        TitleEditView titleEditView3 = this.f25847d;
        String editText3 = titleEditView3 != null ? titleEditView3.getEditText() : "";
        for (RegularRuleRsp.DataBean dataBean : this.f25849f) {
            if (RegexUtils.isMatch(dataBean.rule, editText) != dataBean.pass) {
                this.f25845b.setError(dataBean.msg);
                return false;
            }
            if (!TextUtils.isEmpty(editText2) && RegexUtils.isMatch(dataBean.rule, editText2) != dataBean.pass) {
                this.f25846c.setError(dataBean.msg);
                return false;
            }
            if (RegexUtils.isMatch(dataBean.rule, editText3) != dataBean.pass) {
                this.f25847d.setError(dataBean.msg);
                return false;
            }
        }
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((u0) this.f27350a).getRegularRule(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f25845b = (TitleEditView) findViewById(d.inputFirstName);
        this.f25846c = (TitleEditView) findViewById(d.inputMiddleName);
        this.f25847d = (TitleEditView) findViewById(d.inputLastName);
        this.f25848e = (TextView) findViewById(d.textViewNext);
        this.f25846c.setTitle(getString(h.ac_middle_name_opt));
    }
}
