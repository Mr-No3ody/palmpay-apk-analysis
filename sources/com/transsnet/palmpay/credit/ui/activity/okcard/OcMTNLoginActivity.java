package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ed.ViewOnFocusChangeListenerC0235o;
import Pa.n0;
import Pa.r0;
import Ya.b;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.core.streamsharing.i;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.req.MTNLoginReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import java.util.HashMap;
import p025ba.k;
import p183m6.j;
import p221ob.c;
import p298tf.f;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC MTN登录页", path = "/credit_score/oneloop")
public class OcMTNLoginActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f29561Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f29562Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f29563k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f29564p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AppCompatEditText f29565q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f29566r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f29567s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TextView f29568t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Button f29569u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C2085k0 f29570v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public j f29571w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public i f29572x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f29573y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f29574z0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_mtn_login_activity_layout;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData != null) {
            this.f29574z0 = ocApplyData.getApplyId();
        }
        this.f29571w0 = new j(this, 24);
        this.f29572x0 = new i(this);
        final C2085k0 c2085k0 = new C2085k0(this, 0);
        this.f29570v0 = c2085k0;
        final int i7 = 2;
        this.f29561Y.setOnClickListener(new View.OnClickListener() { // from class: ub.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        C2085k0 c2085k1 = c2085k0;
                        c2085k1.getClass();
                        if (!r0.U0()) {
                            j jVar = ((OcMTNLoginActivity) c2085k1.f42878b).f29571w0;
                            OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) jVar.f39520b;
                            OcMTNLoginActivity ocMTNLoginActivity2 = (OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b;
                            ocMTNLoginActivity2.f29567s0.setBackgroundColor(ocMTNLoginActivity2.getColor(b.cs_main_color));
                            ocMTNLoginActivity2.f29568t0.setVisibility(8);
                            MTNLoginReq mTNLoginReq = new MTNLoginReq();
                            mTNLoginReq.password = ocMTNLoginActivity.f29565q0.getText().toString();
                            mTNLoginReq.applyId = ocMTNLoginActivity.f29574z0;
                            ocMTNLoginActivity.showLoadingDialog(true);
                            c.f40268a.getInstance().getClass();
                            c.a().mtnLogin(mTNLoginReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2081i0(jVar));
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    case 1:
                        C2085k0 c2085k2 = c2085k0;
                        c2085k2.getClass();
                        if (!r0.U0()) {
                            OcMTNLoginActivity ocMTNLoginActivity3 = (OcMTNLoginActivity) c2085k2.f42878b;
                            if (ocMTNLoginActivity3.f29573y0) {
                                j.a(ocMTNLoginActivity3.f29571w0, ocMTNLoginActivity3.f29574z0);
                            }
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocMTNLoginActivity3.f29573y0));
                            break;
                        }
                        break;
                    case 2:
                        C2085k0 c2085k3 = c2085k0;
                        c2085k3.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k3.f42878b).onBackPressed();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 3:
                        C2085k0 c2085k4 = c2085k0;
                        c2085k4.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k4.f42878b).v();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    default:
                        C2085k0 c2085k5 = c2085k0;
                        c2085k5.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k5.f42878b).r();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 3;
        this.f29562Z.setOnClickListener(new View.OnClickListener() { // from class: ub.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        C2085k0 c2085k1 = c2085k0;
                        c2085k1.getClass();
                        if (!r0.U0()) {
                            j jVar = ((OcMTNLoginActivity) c2085k1.f42878b).f29571w0;
                            OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) jVar.f39520b;
                            OcMTNLoginActivity ocMTNLoginActivity2 = (OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b;
                            ocMTNLoginActivity2.f29567s0.setBackgroundColor(ocMTNLoginActivity2.getColor(b.cs_main_color));
                            ocMTNLoginActivity2.f29568t0.setVisibility(8);
                            MTNLoginReq mTNLoginReq = new MTNLoginReq();
                            mTNLoginReq.password = ocMTNLoginActivity.f29565q0.getText().toString();
                            mTNLoginReq.applyId = ocMTNLoginActivity.f29574z0;
                            ocMTNLoginActivity.showLoadingDialog(true);
                            c.f40268a.getInstance().getClass();
                            c.a().mtnLogin(mTNLoginReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2081i0(jVar));
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    case 1:
                        C2085k0 c2085k2 = c2085k0;
                        c2085k2.getClass();
                        if (!r0.U0()) {
                            OcMTNLoginActivity ocMTNLoginActivity3 = (OcMTNLoginActivity) c2085k2.f42878b;
                            if (ocMTNLoginActivity3.f29573y0) {
                                j.a(ocMTNLoginActivity3.f29571w0, ocMTNLoginActivity3.f29574z0);
                            }
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocMTNLoginActivity3.f29573y0));
                            break;
                        }
                        break;
                    case 2:
                        C2085k0 c2085k3 = c2085k0;
                        c2085k3.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k3.f42878b).onBackPressed();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 3:
                        C2085k0 c2085k4 = c2085k0;
                        c2085k4.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k4.f42878b).v();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    default:
                        C2085k0 c2085k5 = c2085k0;
                        c2085k5.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k5.f42878b).r();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                }
            }
        });
        this.f29563k0.setText(k.core_skip);
        final int i11 = 4;
        this.f29563k0.setOnClickListener(new View.OnClickListener() { // from class: ub.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        C2085k0 c2085k1 = c2085k0;
                        c2085k1.getClass();
                        if (!r0.U0()) {
                            j jVar = ((OcMTNLoginActivity) c2085k1.f42878b).f29571w0;
                            OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) jVar.f39520b;
                            OcMTNLoginActivity ocMTNLoginActivity2 = (OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b;
                            ocMTNLoginActivity2.f29567s0.setBackgroundColor(ocMTNLoginActivity2.getColor(b.cs_main_color));
                            ocMTNLoginActivity2.f29568t0.setVisibility(8);
                            MTNLoginReq mTNLoginReq = new MTNLoginReq();
                            mTNLoginReq.password = ocMTNLoginActivity.f29565q0.getText().toString();
                            mTNLoginReq.applyId = ocMTNLoginActivity.f29574z0;
                            ocMTNLoginActivity.showLoadingDialog(true);
                            c.f40268a.getInstance().getClass();
                            c.a().mtnLogin(mTNLoginReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2081i0(jVar));
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    case 1:
                        C2085k0 c2085k2 = c2085k0;
                        c2085k2.getClass();
                        if (!r0.U0()) {
                            OcMTNLoginActivity ocMTNLoginActivity3 = (OcMTNLoginActivity) c2085k2.f42878b;
                            if (ocMTNLoginActivity3.f29573y0) {
                                j.a(ocMTNLoginActivity3.f29571w0, ocMTNLoginActivity3.f29574z0);
                            }
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocMTNLoginActivity3.f29573y0));
                            break;
                        }
                        break;
                    case 2:
                        C2085k0 c2085k3 = c2085k0;
                        c2085k3.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k3.f42878b).onBackPressed();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 3:
                        C2085k0 c2085k4 = c2085k0;
                        c2085k4.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k4.f42878b).v();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    default:
                        C2085k0 c2085k5 = c2085k0;
                        c2085k5.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k5.f42878b).r();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                }
            }
        });
        OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) this.f29570v0.f42878b;
        try {
            String strW0 = r0.w0(BaseApplication.get().getUser().getPhoneNumber());
            ocMTNLoginActivity.f29564p0.setText(ocMTNLoginActivity.getString(Ya.g.cs_str_sms_tips, strW0.substring(0, 3) + "****" + strW0.substring(strW0.length() - 4)));
        } catch (Exception unused) {
        }
        C2085k0 c2085k1 = this.f29570v0;
        OcMTNLoginActivity ocMTNLoginActivity2 = (OcMTNLoginActivity) c2085k1.f42878b;
        ocMTNLoginActivity2.f29565q0.addTextChangedListener(new R3.e(c2085k1, 21));
        ocMTNLoginActivity2.f29565q0.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(c2085k1, 23));
        final C2085k0 c2085k2 = this.f29570v0;
        final int i12 = 1;
        ((OcMTNLoginActivity) c2085k2.f42878b).f29566r0.setOnClickListener(new View.OnClickListener() { // from class: ub.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        C2085k0 c2085k3 = c2085k2;
                        c2085k3.getClass();
                        if (!r0.U0()) {
                            j jVar = ((OcMTNLoginActivity) c2085k3.f42878b).f29571w0;
                            OcMTNLoginActivity ocMTNLoginActivity3 = (OcMTNLoginActivity) jVar.f39520b;
                            OcMTNLoginActivity ocMTNLoginActivity4 = (OcMTNLoginActivity) ocMTNLoginActivity3.f29570v0.f42878b;
                            ocMTNLoginActivity4.f29567s0.setBackgroundColor(ocMTNLoginActivity4.getColor(b.cs_main_color));
                            ocMTNLoginActivity4.f29568t0.setVisibility(8);
                            MTNLoginReq mTNLoginReq = new MTNLoginReq();
                            mTNLoginReq.password = ocMTNLoginActivity3.f29565q0.getText().toString();
                            mTNLoginReq.applyId = ocMTNLoginActivity3.f29574z0;
                            ocMTNLoginActivity3.showLoadingDialog(true);
                            c.f40268a.getInstance().getClass();
                            c.a().mtnLogin(mTNLoginReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2081i0(jVar));
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    case 1:
                        C2085k0 c2085k4 = c2085k2;
                        c2085k4.getClass();
                        if (!r0.U0()) {
                            OcMTNLoginActivity ocMTNLoginActivity5 = (OcMTNLoginActivity) c2085k4.f42878b;
                            if (ocMTNLoginActivity5.f29573y0) {
                                j.a(ocMTNLoginActivity5.f29571w0, ocMTNLoginActivity5.f29574z0);
                            }
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocMTNLoginActivity5.f29573y0));
                            break;
                        }
                        break;
                    case 2:
                        C2085k0 c2085k5 = c2085k2;
                        c2085k5.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k5.f42878b).onBackPressed();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 3:
                        C2085k0 c2085k6 = c2085k2;
                        c2085k6.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k6.f42878b).v();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    default:
                        C2085k0 c2085k7 = c2085k2;
                        c2085k7.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k7.f42878b).r();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                }
            }
        });
        final C2085k0 c2085k3 = this.f29570v0;
        final int i13 = 0;
        ((OcMTNLoginActivity) c2085k3.f42878b).f29569u0.setOnClickListener(new View.OnClickListener() { // from class: ub.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        C2085k0 c2085k4 = c2085k3;
                        c2085k4.getClass();
                        if (!r0.U0()) {
                            j jVar = ((OcMTNLoginActivity) c2085k4.f42878b).f29571w0;
                            OcMTNLoginActivity ocMTNLoginActivity3 = (OcMTNLoginActivity) jVar.f39520b;
                            OcMTNLoginActivity ocMTNLoginActivity4 = (OcMTNLoginActivity) ocMTNLoginActivity3.f29570v0.f42878b;
                            ocMTNLoginActivity4.f29567s0.setBackgroundColor(ocMTNLoginActivity4.getColor(b.cs_main_color));
                            ocMTNLoginActivity4.f29568t0.setVisibility(8);
                            MTNLoginReq mTNLoginReq = new MTNLoginReq();
                            mTNLoginReq.password = ocMTNLoginActivity3.f29565q0.getText().toString();
                            mTNLoginReq.applyId = ocMTNLoginActivity3.f29574z0;
                            ocMTNLoginActivity3.showLoadingDialog(true);
                            c.f40268a.getInstance().getClass();
                            c.a().mtnLogin(mTNLoginReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2081i0(jVar));
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_login", "");
                            break;
                        }
                        break;
                    case 1:
                        C2085k0 c2085k5 = c2085k3;
                        c2085k5.getClass();
                        if (!r0.U0()) {
                            OcMTNLoginActivity ocMTNLoginActivity5 = (OcMTNLoginActivity) c2085k5.f42878b;
                            if (ocMTNLoginActivity5.f29573y0) {
                                j.a(ocMTNLoginActivity5.f29571w0, ocMTNLoginActivity5.f29574z0);
                            }
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "cs_resend_code", String.valueOf(ocMTNLoginActivity5.f29573y0));
                            break;
                        }
                        break;
                    case 2:
                        C2085k0 c2085k6 = c2085k3;
                        c2085k6.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k6.f42878b).onBackPressed();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_back_img", "");
                            break;
                        }
                        break;
                    case 3:
                        C2085k0 c2085k7 = c2085k3;
                        c2085k7.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k7.f42878b).v();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_close_img", "");
                            break;
                        }
                        break;
                    default:
                        C2085k0 c2085k8 = c2085k3;
                        c2085k8.getClass();
                        if (!r0.U0()) {
                            ((OcMTNLoginActivity) c2085k8.f42878b).r();
                            n0.g().m(C2085k0.class.getSimpleName().concat("_element_click"), "router_right_tv", "");
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (TextUtils.isEmpty(this.f29565q0.getText())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("screen_name", getClass().getSimpleName());
        map.put(getResources().getResourceEntryName(this.f29565q0.getId()), this.f29565q0.getText());
        n0.g().w("oc_input_router_screen", map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        j.a(this.f29571w0, this.f29574z0);
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f29561Y = (ImageView) findViewById(Ya.e.router_back_img);
        this.f29562Z = (ImageView) findViewById(Ya.e.router_close_img);
        this.f29563k0 = (TextView) findViewById(Ya.e.router_right_tv);
        this.f29564p0 = (TextView) findViewById(Ya.e.cs_tips);
        this.f29565q0 = (AppCompatEditText) findViewById(Ya.e.cs_verification_code_input);
        this.f29566r0 = (TextView) findViewById(Ya.e.cs_resend_code);
        this.f29567s0 = findViewById(Ya.e.cs_underline);
        this.f29568t0 = (TextView) findViewById(Ya.e.cs_error_info);
        this.f29569u0 = (Button) findViewById(Ya.e.cs_login);
        this.f29563k0.setVisibility(0);
        ((TextView) findViewById(Ya.e.router_title_tv)).setText(o());
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData == null || ocApplyData.getRouteInfoList() == null) {
            return;
        }
        OpenAccountRouterProgressViewV2 openAccountRouterProgressViewV2 = (OpenAccountRouterProgressViewV2) findViewById(Ya.e.router_progress_view);
        openAccountRouterProgressViewV2.setVisibility(0);
        openAccountRouterProgressViewV2.c(p(), this.f29248B.getRouteInfoList());
    }
}
