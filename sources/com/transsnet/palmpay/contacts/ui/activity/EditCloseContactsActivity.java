package com.transsnet.palmpay.contacts.ui.activity;

import Pa.i0;
import Pa.r0;
import R9.d;
import R9.e;
import R9.f;
import Tb.a;
import Ua.E0;
import V9.q;
import V9.r;
import V9.s;
import W9.C0724e;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.CloseContactBeanV2;
import com.transsnet.palmpay.core.bean.CloseContactTag;
import com.transsnet.palmpay.core.bean.RemindListBean;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.dialog.SuccessFailDialog;
import com.transsnet.palmpay.custom_view.dialog.t;
import java.util.ArrayList;
import p025ba.k;
import p071ef.b;
import p183m6.j;
import p185ma.m;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/edit_close_contact")
public class EditCloseContactsActivity extends h {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f27191X = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f27192A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f27194C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f27195H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f27196L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SuccessFailDialog f27198Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f27199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TitleEditView f27200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f27203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintLayout f27204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConstraintLayout f27205g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelEnterPhoneNumber1 f27206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0724e f27207j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f27208o;
    public CloseContactBeanV2 t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public E0 f27210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E0 f27211w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27209p = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f27193B = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final s f27197M = new s(this, 2);

    public static int m(EditCloseContactsActivity editCloseContactsActivity, String str) {
        String[] strArr = m.f39612b;
        Integer[] numArr = m.f39613c;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (str.equals(strArr[i7])) {
                return numArr[i7].intValue();
            }
        }
        return 0;
    }

    public static void n(EditCloseContactsActivity editCloseContactsActivity, boolean z3, String str) {
        SuccessFailDialog successFailDialog = editCloseContactsActivity.f27198Q;
        if (successFailDialog != null) {
            successFailDialog.dismiss();
            editCloseContactsActivity.f27198Q = null;
        }
        if (i0.W(editCloseContactsActivity)) {
            if (z3) {
                t tVar = new t(editCloseContactsActivity);
                tVar.f31304c = str;
                String string = editCloseContactsActivity.getString(k.core_confirm);
                tVar.f31312k = new s(editCloseContactsActivity, 0);
                tVar.f31305d = string;
                tVar.b();
                editCloseContactsActivity.f27198Q = tVar.d(0);
            } else {
                t tVar2 = new t(editCloseContactsActivity);
                tVar2.f31304c = str;
                String string2 = editCloseContactsActivity.getString(k.core_confirm);
                tVar2.f31312k = new s(editCloseContactsActivity, 1);
                tVar2.f31305d = string2;
                tVar2.a();
                editCloseContactsActivity.f27198Q = tVar2.d(0);
            }
            editCloseContactsActivity.f27198Q.setCanceledOnTouchOutside(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_edit_close_contacts_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (this.f27209p != 1) {
            this.f27203e.setVisibility(8);
            this.f27202d.setVisibility(8);
            return;
        }
        User user = BaseApplication.getInstance().getUser();
        if (user.getPhoneNumber().equals(r0.a0(this.t.phone.replace(" ", "")))) {
            this.f27206i.f28345e.setText(getString(f.ct_hi_x, user.getNickName()));
        }
        this.f27206i.f28343c.setText(this.t.phone);
        this.f27200b.setEditText(this.t.tag);
        C0724e c0724e = this.f27207j;
        String str = this.t.tag;
        ArrayList arrayList = this.f27208o;
        int i7 = -1;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < this.f27208o.size(); i10++) {
                if (TextUtils.equals(str, ((CloseContactTag) this.f27208o.get(i10)).tag)) {
                    i7 = i10;
                    break;
                }
            }
        }
        c0724e.f10628e = i7;
        c0724e.notifyDataSetChanged();
        if (this.t.remindList.size() > 0) {
            RemindListBean remindListBean = this.t.remindList.get(0);
            E0 e10 = this.f27210v;
            boolean z3 = remindListBean.reminder != 0;
            SwitchCompat switchCompat = (SwitchCompat) e10.f9320j.getValue();
            if (switchCompat != null) {
                switchCompat.setChecked(z3);
            }
            if (remindListBean.reminder != 0) {
                this.f27210v.f(remindListBean.remindPeriod);
                this.f27210v.g(remindListBean.remindTime);
                if (TextUtils.equals("Airtime", remindListBean.paymentType)) {
                    this.f27210v.e(0);
                    p(0);
                } else {
                    this.f27210v.e(1);
                    p(1);
                }
            }
        }
        if (this.t.remindList.size() > 1) {
            this.f27204f.setVisibility(8);
            this.f27205g.setVisibility(this.t.remindList.get(1).reminder != 0 ? 0 : 8);
            this.f27204f.setVisibility(this.t.remindList.get(1).reminder == 0 ? 0 : 8);
            RemindListBean remindListBean2 = this.t.remindList.get(1);
            E0 e11 = this.f27211w;
            boolean z8 = remindListBean2.reminder != 0;
            SwitchCompat switchCompat2 = (SwitchCompat) e11.f9320j.getValue();
            if (switchCompat2 != null) {
                switchCompat2.setChecked(z8);
            }
            if (remindListBean2.reminder != 0) {
                this.f27211w.f(remindListBean2.remindPeriod);
                this.f27211w.g(remindListBean2.remindTime);
                if (TextUtils.equals("Airtime", remindListBean2.paymentType)) {
                    this.f27211w.e(0);
                } else {
                    this.f27211w.e(1);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void o() {
        String[] strArr = {"Family", "Friend", "Business", "Customer"};
        for (int i7 = 0; i7 < 4; i7++) {
            CloseContactTag closeContactTag = new CloseContactTag(strArr[i7]);
            if (!this.f27208o.contains(closeContactTag)) {
                this.f27208o.add(closeContactTag);
            }
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (intent == null) {
            return;
        }
        this.f27206i.f28343c.setText(i0.j(intent.getStringExtra("PHONE_NUMBER")));
    }

    public final void p(int i7) {
        if (i7 == 0) {
            this.f27211w.a(false);
            this.f27211w.b(true);
            this.f27211w.e(1);
        } else {
            this.f27211w.a(true);
            this.f27211w.b(false);
            this.f27211w.e(0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((PayApiService) c.f43141a.f14621b).groupTag(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE).k(p298tf.f.f42629b).i(b.a()).subscribe(new r(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 0;
        initStatusBar(getColor(L6.b.ppColorBackgroundLight), !isDarkMode());
        ARouter.getInstance().inject(this);
        this.f27199a = (RecyclerView) findViewById(d.cecca_tag_rcv);
        this.f27200b = (TitleEditView) findViewById(d.cecca_tag_et);
        this.f27201c = (TextView) findViewById(d.cecca_save_tv);
        this.f27202d = (TextView) findViewById(d.cecca_delete_tv);
        this.f27203e = findViewById(d.cecca_space_view);
        this.f27204f = (ConstraintLayout) findViewById(d.ce_add_remind);
        this.f27205g = (ConstraintLayout) findViewById(d.cecc_time_remind2);
        this.f27206i = (ModelEnterPhoneNumber1) findViewById(d.cecca_input_phone_num_area);
        this.f27196L = getIntent().getStringExtra("transType");
        E0 e10 = new E0(findViewById(d.cecc_time_remind), true);
        this.f27210v = e10;
        RelativeLayout relativeLayout = (RelativeLayout) e10.f9319i.getValue();
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.f27192A = this.f27210v.c();
        this.f27210v.f9330u = new p045d3.k(this, 10);
        E0 e11 = new E0(findViewById(d.cecc_time_remind2), true);
        this.f27211w = e11;
        RelativeLayout relativeLayout2 = (RelativeLayout) e11.f9319i.getValue();
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        this.f27211w.a(false);
        this.f27211w.b(true);
        this.f27211w.e(1);
        this.f27193B = this.f27211w.c();
        this.f27211w.f9330u = new j(this, 8);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setJustifyContent(0);
        this.f27199a.setLayoutManager(flexboxLayoutManager);
        this.f27208o = new ArrayList();
        C0724e c0724e = new C0724e(this);
        c0724e.f10628e = -1;
        this.f27207j = c0724e;
        c0724e.f4985b = this.f27208o;
        this.f27199a.setAdapter(c0724e);
        this.f27199a.addItemDecoration(new V9.t());
        this.f27207j.f4986c = new q(this, i7);
        TextView textView = this.f27201c;
        s sVar = this.f27197M;
        textView.setOnClickListener(sVar);
        this.f27202d.setOnClickListener(sVar);
        this.f27206i.f28344d.setOnClickListener(sVar);
        this.f27206i.f28345e.setTextColor(getColor(L6.b.ppColorTextNormal));
        o();
        this.f27207j.notifyDataSetChanged();
        this.f27200b.getEditTextView().setFilters(new InputFilter[]{new a(1)});
        this.f27204f.setOnClickListener(sVar);
    }
}
