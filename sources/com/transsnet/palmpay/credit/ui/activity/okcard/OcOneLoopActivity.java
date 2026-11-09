package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ed.ViewOnFocusChangeListenerC0235o;
import L6.b;
import Pa.n0;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.core.streamsharing.i;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcVerifyOneLoopReq;
import com.transsnet.palmpay.credit.bean.resp.MTNLoginResp;
import com.transsnet.palmpay.credit.bean.resp.QueryOneLoopInfoResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import p025ba.k;
import p221ob.c;
import p294tb.C2055q;
import p298tf.f;
import p310ub.C2102t0;
import p310ub.C2106v0;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC逆向页面", path = "/credit_score/all_operate_one_loop_activity")
public class OcOneLoopActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ int f29605E0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ModelMobileWithIconInputLayout f29606A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public QueryOneLoopInfoResp f29607B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f29608C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public OcOneLoopActivity f29609D0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f29610Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f29611Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f29612k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AppCompatEditText f29613p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f29614q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View f29615r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f29616s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public PpButton f29617t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public C2106v0 f29618u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C2102t0 f29619v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public i f29620w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f29621x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f29622y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public MTNLoginResp.DataBean f29623z0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_one_loop_layout;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData != null) {
            this.f29622y0 = ocApplyData.getApplyId();
        }
        this.f29619v0 = new C2102t0(this);
        this.f29620w0 = new i(this);
        final C2106v0 c2106v0 = new C2106v0(this);
        this.f29618u0 = c2106v0;
        final int i7 = 0;
        this.f29610Y.setOnClickListener(new View.OnClickListener() { // from class: ub.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        C2106v0 c2106v1 = c2106v0;
                        c2106v1.getClass();
                        if (!r0.U0()) {
                            c2106v1.f42934a.onBackPressed();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 1:
                        C2106v0 c2106v2 = c2106v0;
                        c2106v2.getClass();
                        if (!r0.U0()) {
                            c2106v2.f42934a.v();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    case 2:
                        C2106v0 c2106v3 = c2106v0;
                        c2106v3.getClass();
                        if (!r0.U0()) {
                            c2106v3.f42934a.r();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                    case 3:
                        C2106v0 c2106v4 = c2106v0;
                        c2106v4.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity = c2106v4.f42934a;
                            MTNLoginResp.DataBean dataBean = ocOneLoopActivity.f29623z0;
                            if (dataBean == null || MTNLoginResp.DataBean.OTP_INCORRECT.equals(dataBean.statusCode)) {
                                C2102t0 c2102t0 = ocOneLoopActivity.f29619v0;
                                OcOneLoopActivity ocOneLoopActivity2 = (OcOneLoopActivity) c2102t0.f42923a;
                                if (TextUtils.isEmpty(ocOneLoopActivity2.f29613p0.getText())) {
                                    ToastUtils.showLong("verify code is null");
                                } else {
                                    OcOneLoopActivity ocOneLoopActivity3 = ocOneLoopActivity2.f29618u0.f42934a;
                                    ocOneLoopActivity3.f29615r0.setBackgroundColor(ocOneLoopActivity3.getColor(b.ppColorTextPrimary));
                                    ocOneLoopActivity3.f29616s0.setVisibility(8);
                                    OcVerifyOneLoopReq ocVerifyOneLoopReq = new OcVerifyOneLoopReq(ocOneLoopActivity2.f29613p0.getText().toString(), ocOneLoopActivity2.f29622y0);
                                    ocOneLoopActivity2.f29617t0.b(true);
                                    c.f40268a.getInstance().getClass();
                                    c.a().verifyOneLoopOTP(ocVerifyOneLoopReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2100s0(c2102t0));
                                }
                            } else {
                                ocOneLoopActivity.x("SKIP");
                                ocOneLoopActivity.r();
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    default:
                        C2106v0 c2106v5 = c2106v0;
                        c2106v5.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity4 = c2106v5.f42934a;
                            if (ocOneLoopActivity4.f29621x0) {
                                C2102t0.a(ocOneLoopActivity4.f29619v0);
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocOneLoopActivity4.f29621x0));
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f29611Z.setOnClickListener(new View.OnClickListener() { // from class: ub.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        C2106v0 c2106v1 = c2106v0;
                        c2106v1.getClass();
                        if (!r0.U0()) {
                            c2106v1.f42934a.onBackPressed();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 1:
                        C2106v0 c2106v2 = c2106v0;
                        c2106v2.getClass();
                        if (!r0.U0()) {
                            c2106v2.f42934a.v();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    case 2:
                        C2106v0 c2106v3 = c2106v0;
                        c2106v3.getClass();
                        if (!r0.U0()) {
                            c2106v3.f42934a.r();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                    case 3:
                        C2106v0 c2106v4 = c2106v0;
                        c2106v4.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity = c2106v4.f42934a;
                            MTNLoginResp.DataBean dataBean = ocOneLoopActivity.f29623z0;
                            if (dataBean == null || MTNLoginResp.DataBean.OTP_INCORRECT.equals(dataBean.statusCode)) {
                                C2102t0 c2102t0 = ocOneLoopActivity.f29619v0;
                                OcOneLoopActivity ocOneLoopActivity2 = (OcOneLoopActivity) c2102t0.f42923a;
                                if (TextUtils.isEmpty(ocOneLoopActivity2.f29613p0.getText())) {
                                    ToastUtils.showLong("verify code is null");
                                } else {
                                    OcOneLoopActivity ocOneLoopActivity3 = ocOneLoopActivity2.f29618u0.f42934a;
                                    ocOneLoopActivity3.f29615r0.setBackgroundColor(ocOneLoopActivity3.getColor(b.ppColorTextPrimary));
                                    ocOneLoopActivity3.f29616s0.setVisibility(8);
                                    OcVerifyOneLoopReq ocVerifyOneLoopReq = new OcVerifyOneLoopReq(ocOneLoopActivity2.f29613p0.getText().toString(), ocOneLoopActivity2.f29622y0);
                                    ocOneLoopActivity2.f29617t0.b(true);
                                    c.f40268a.getInstance().getClass();
                                    c.a().verifyOneLoopOTP(ocVerifyOneLoopReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2100s0(c2102t0));
                                }
                            } else {
                                ocOneLoopActivity.x("SKIP");
                                ocOneLoopActivity.r();
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    default:
                        C2106v0 c2106v5 = c2106v0;
                        c2106v5.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity4 = c2106v5.f42934a;
                            if (ocOneLoopActivity4.f29621x0) {
                                C2102t0.a(ocOneLoopActivity4.f29619v0);
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocOneLoopActivity4.f29621x0));
                            break;
                        }
                        break;
                }
            }
        });
        this.f29612k0.setText(k.core_skip);
        final int i11 = 2;
        this.f29612k0.setOnClickListener(new View.OnClickListener() { // from class: ub.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        C2106v0 c2106v1 = c2106v0;
                        c2106v1.getClass();
                        if (!r0.U0()) {
                            c2106v1.f42934a.onBackPressed();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 1:
                        C2106v0 c2106v2 = c2106v0;
                        c2106v2.getClass();
                        if (!r0.U0()) {
                            c2106v2.f42934a.v();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    case 2:
                        C2106v0 c2106v3 = c2106v0;
                        c2106v3.getClass();
                        if (!r0.U0()) {
                            c2106v3.f42934a.r();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                    case 3:
                        C2106v0 c2106v4 = c2106v0;
                        c2106v4.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity = c2106v4.f42934a;
                            MTNLoginResp.DataBean dataBean = ocOneLoopActivity.f29623z0;
                            if (dataBean == null || MTNLoginResp.DataBean.OTP_INCORRECT.equals(dataBean.statusCode)) {
                                C2102t0 c2102t0 = ocOneLoopActivity.f29619v0;
                                OcOneLoopActivity ocOneLoopActivity2 = (OcOneLoopActivity) c2102t0.f42923a;
                                if (TextUtils.isEmpty(ocOneLoopActivity2.f29613p0.getText())) {
                                    ToastUtils.showLong("verify code is null");
                                } else {
                                    OcOneLoopActivity ocOneLoopActivity3 = ocOneLoopActivity2.f29618u0.f42934a;
                                    ocOneLoopActivity3.f29615r0.setBackgroundColor(ocOneLoopActivity3.getColor(b.ppColorTextPrimary));
                                    ocOneLoopActivity3.f29616s0.setVisibility(8);
                                    OcVerifyOneLoopReq ocVerifyOneLoopReq = new OcVerifyOneLoopReq(ocOneLoopActivity2.f29613p0.getText().toString(), ocOneLoopActivity2.f29622y0);
                                    ocOneLoopActivity2.f29617t0.b(true);
                                    c.f40268a.getInstance().getClass();
                                    c.a().verifyOneLoopOTP(ocVerifyOneLoopReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2100s0(c2102t0));
                                }
                            } else {
                                ocOneLoopActivity.x("SKIP");
                                ocOneLoopActivity.r();
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    default:
                        C2106v0 c2106v5 = c2106v0;
                        c2106v5.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity4 = c2106v5.f42934a;
                            if (ocOneLoopActivity4.f29621x0) {
                                C2102t0.a(ocOneLoopActivity4.f29619v0);
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocOneLoopActivity4.f29621x0));
                            break;
                        }
                        break;
                }
            }
        });
        C2106v0 c2106v1 = this.f29618u0;
        OcOneLoopActivity ocOneLoopActivity = c2106v1.f42934a;
        ocOneLoopActivity.f29613p0.addTextChangedListener(new R3.e(c2106v1, 23));
        ocOneLoopActivity.f29613p0.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(c2106v1, 25));
        final C2106v0 c2106v2 = this.f29618u0;
        final int i12 = 4;
        c2106v2.f42934a.f29614q0.setOnClickListener(new View.OnClickListener() { // from class: ub.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        C2106v0 c2106v3 = c2106v2;
                        c2106v3.getClass();
                        if (!r0.U0()) {
                            c2106v3.f42934a.onBackPressed();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 1:
                        C2106v0 c2106v4 = c2106v2;
                        c2106v4.getClass();
                        if (!r0.U0()) {
                            c2106v4.f42934a.v();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    case 2:
                        C2106v0 c2106v5 = c2106v2;
                        c2106v5.getClass();
                        if (!r0.U0()) {
                            c2106v5.f42934a.r();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                    case 3:
                        C2106v0 c2106v6 = c2106v2;
                        c2106v6.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity2 = c2106v6.f42934a;
                            MTNLoginResp.DataBean dataBean = ocOneLoopActivity2.f29623z0;
                            if (dataBean == null || MTNLoginResp.DataBean.OTP_INCORRECT.equals(dataBean.statusCode)) {
                                C2102t0 c2102t0 = ocOneLoopActivity2.f29619v0;
                                OcOneLoopActivity ocOneLoopActivity3 = (OcOneLoopActivity) c2102t0.f42923a;
                                if (TextUtils.isEmpty(ocOneLoopActivity3.f29613p0.getText())) {
                                    ToastUtils.showLong("verify code is null");
                                } else {
                                    OcOneLoopActivity ocOneLoopActivity4 = ocOneLoopActivity3.f29618u0.f42934a;
                                    ocOneLoopActivity4.f29615r0.setBackgroundColor(ocOneLoopActivity4.getColor(b.ppColorTextPrimary));
                                    ocOneLoopActivity4.f29616s0.setVisibility(8);
                                    OcVerifyOneLoopReq ocVerifyOneLoopReq = new OcVerifyOneLoopReq(ocOneLoopActivity3.f29613p0.getText().toString(), ocOneLoopActivity3.f29622y0);
                                    ocOneLoopActivity3.f29617t0.b(true);
                                    c.f40268a.getInstance().getClass();
                                    c.a().verifyOneLoopOTP(ocVerifyOneLoopReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2100s0(c2102t0));
                                }
                            } else {
                                ocOneLoopActivity2.x("SKIP");
                                ocOneLoopActivity2.r();
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    default:
                        C2106v0 c2106v7 = c2106v2;
                        c2106v7.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity5 = c2106v7.f42934a;
                            if (ocOneLoopActivity5.f29621x0) {
                                C2102t0.a(ocOneLoopActivity5.f29619v0);
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocOneLoopActivity5.f29621x0));
                            break;
                        }
                        break;
                }
            }
        });
        final C2106v0 c2106v3 = this.f29618u0;
        final int i13 = 3;
        c2106v3.f42934a.f29617t0.setOnClickListener(new View.OnClickListener() { // from class: ub.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        C2106v0 c2106v4 = c2106v3;
                        c2106v4.getClass();
                        if (!r0.U0()) {
                            c2106v4.f42934a.onBackPressed();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 1:
                        C2106v0 c2106v5 = c2106v3;
                        c2106v5.getClass();
                        if (!r0.U0()) {
                            c2106v5.f42934a.v();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    case 2:
                        C2106v0 c2106v6 = c2106v3;
                        c2106v6.getClass();
                        if (!r0.U0()) {
                            c2106v6.f42934a.r();
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                    case 3:
                        C2106v0 c2106v7 = c2106v3;
                        c2106v7.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity2 = c2106v7.f42934a;
                            MTNLoginResp.DataBean dataBean = ocOneLoopActivity2.f29623z0;
                            if (dataBean == null || MTNLoginResp.DataBean.OTP_INCORRECT.equals(dataBean.statusCode)) {
                                C2102t0 c2102t0 = ocOneLoopActivity2.f29619v0;
                                OcOneLoopActivity ocOneLoopActivity3 = (OcOneLoopActivity) c2102t0.f42923a;
                                if (TextUtils.isEmpty(ocOneLoopActivity3.f29613p0.getText())) {
                                    ToastUtils.showLong("verify code is null");
                                } else {
                                    OcOneLoopActivity ocOneLoopActivity4 = ocOneLoopActivity3.f29618u0.f42934a;
                                    ocOneLoopActivity4.f29615r0.setBackgroundColor(ocOneLoopActivity4.getColor(b.ppColorTextPrimary));
                                    ocOneLoopActivity4.f29616s0.setVisibility(8);
                                    OcVerifyOneLoopReq ocVerifyOneLoopReq = new OcVerifyOneLoopReq(ocOneLoopActivity3.f29613p0.getText().toString(), ocOneLoopActivity3.f29622y0);
                                    ocOneLoopActivity3.f29617t0.b(true);
                                    c.f40268a.getInstance().getClass();
                                    c.a().verifyOneLoopOTP(ocVerifyOneLoopReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2100s0(c2102t0));
                                }
                            } else {
                                ocOneLoopActivity2.x("SKIP");
                                ocOneLoopActivity2.r();
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    default:
                        C2106v0 c2106v8 = c2106v3;
                        c2106v8.getClass();
                        if (!r0.U0()) {
                            OcOneLoopActivity ocOneLoopActivity5 = c2106v8.f42934a;
                            if (ocOneLoopActivity5.f29621x0) {
                                C2102t0.a(ocOneLoopActivity5.f29619v0);
                            }
                            n0.g().m(C2106v0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocOneLoopActivity5.f29621x0));
                            break;
                        }
                        break;
                }
            }
        });
        C2102t0 c2102t0 = this.f29619v0;
        c2102t0.getClass();
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().queryOneLoopInfo().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(c2102t0, 21));
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (TextUtils.isEmpty(this.f29613p0.getText())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("screen_name", getClass().getSimpleName());
        map.put(getResources().getResourceEntryName(this.f29613p0.getId()), this.f29613p0.getText());
        n0.g().w("oc_input_router_screen", map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(-1);
        this.f29609D0 = this;
        this.f29610Y = (ImageView) findViewById(Ya.e.router_back_img);
        this.f29611Z = (ImageView) findViewById(Ya.e.router_close_img);
        this.f29612k0 = (TextView) findViewById(Ya.e.router_right_tv);
        this.f29613p0 = (AppCompatEditText) findViewById(Ya.e.cs_verification_code_input);
        this.f29614q0 = (TextView) findViewById(Ya.e.cs_resend_code);
        this.f29615r0 = findViewById(Ya.e.cs_underline);
        this.f29616s0 = (TextView) findViewById(Ya.e.cs_error_info);
        this.f29617t0 = (PpButton) findViewById(Ya.e.cs_login);
        this.f29612k0.setVisibility(8);
        ((TextView) findViewById(Ya.e.router_title_tv)).setText(o());
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) findViewById(Ya.e.one_loop_phone_num_input);
        this.f29606A0 = modelMobileWithIconInputLayout;
        try {
            modelMobileWithIconInputLayout.setPhoneNumber(BaseApplication.get().getUser().getPhoneNumber().substring(4));
        } catch (Exception e10) {
            F6.d.c(this.TAG, "setupView: ", e10);
        }
        this.f29606A0.getPhoneNumberEdit().setEnabled(false);
        OpenAccountRouterProgressViewV2 openAccountRouterProgressViewV2 = (OpenAccountRouterProgressViewV2) findViewById(Ya.e.router_progress_view);
        if ("oc_use_type_alone".equals(this.f29249C)) {
            this.f29611Z.setVisibility(8);
            openAccountRouterProgressViewV2.setVisibility(8);
            return;
        }
        this.f29611Z.setVisibility(0);
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData == null || ocApplyData.getRouteInfoList() == null) {
            return;
        }
        openAccountRouterProgressViewV2.setVisibility(0);
        openAccountRouterProgressViewV2.c(p(), this.f29248B.getRouteInfoList());
    }
}
