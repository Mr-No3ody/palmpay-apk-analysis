package com.flexibank.sdk.cashier.ui.activity;

import C9.C0139f;
import Fd.G;
import Fe.h0;
import K3.d;
import K3.j;
import N8.q0;
import O3.e;
import O6.c;
import P3.m;
import Q3.k;
import Sd.b;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.bumptech.glide.p;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.ui.fragment.FlexiBankPayLoadingFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankAddLinkCardWebFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankBaseVerifyFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankAccountOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankPinFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBirthdayFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckCVVFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckMobileFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayPinFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckVoucherCodeFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckWithFaceRecognitionFragment;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierVerifyViewModel;
import com.flexibank.sdk.customview.FlexiBankPinEntryView;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.util.ToastUtils;
import j4.u;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p006a4.i;
import p355xf.t;
import p377z5.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/activity/FlexiBankPayVerificationActivity;", "LK3/d;", "Lcom/flexibank/sdk/cashier/viewmodel/FlexiBankCashierVerifyViewModel;", "Landroidx/viewbinding/ViewBinding;", "Lcom/flexibank/sdk/cashier/callback/FlexiBankPayVerificationCallback;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankPayVerificationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankPayVerificationActivity.kt\ncom/flexibank/sdk/cashier/ui/activity/FlexiBankPayVerificationActivity\n+ 2 FlexiBankLifecycleOwnerKtx.kt\ncom/flexibank/sdk/base/ext/FlexiBankLifecycleOwnerKtxKt\n*L\n1#1,567:1\n305#2,10:568\n336#2:578\n*S KotlinDebug\n*F\n+ 1 FlexiBankPayVerificationActivity.kt\ncom/flexibank/sdk/cashier/ui/activity/FlexiBankPayVerificationActivity\n*L\n140#1:568,10\n140#1:578\n*E\n"})
public final class FlexiBankPayVerificationActivity extends d implements FlexiBankPayVerificationCallback {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f21971Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f21972A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f21973B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f21974C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public FlexiBankCashierPaymentMethodBean f21975H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public HashMap f21976L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f21977M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public k f21978Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public i.a f21979X;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public FlexiBankPayVerificationActivity() {
        super(FlexiBankCashierVerifyViewModel.class);
    }

    public final void checkPayFail(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showLoadingDialog(false);
        int i7 = r.fb_title_error_info;
        if (CommonResult.ERROR_MSG_CONNECT_TIMEOUT.equals(message)) {
            i7 = r.fb_title_attention;
            message = getString(r.fb_msg_pay_order_time_out);
        }
        c cVar = new c(this);
        cVar.e(i7);
        cVar.f6598d = message;
        cVar.f6605k = true;
        String string = getString(r.fb_confirm);
        m mVar = new m(this, 2);
        cVar.f6600f = string;
        cVar.f6602h = mVar;
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    public final void g() {
        i.a aVar;
        if (this.f21977M) {
            finish();
            return;
        }
        k kVar = new k(this);
        this.f21978Q = kVar;
        kVar.f7624p = new b(this, 5);
        kVar.show();
        k kVar2 = this.f21978Q;
        if (kVar2 != null) {
            String titleStr = getString(r.fb_payment_not_complete);
            Intrinsics.checkNotNullExpressionValue(titleStr, "getString(...)");
            Intrinsics.checkNotNullParameter(titleStr, "titleStr");
            if (!TextUtils.isEmpty(titleStr)) {
                Object value = kVar2.f7623o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(titleStr);
            }
        }
        k kVar3 = this.f21978Q;
        if (kVar3 != null && (aVar = this.f21979X) != null) {
            boolean zIsEmpty = TextUtils.isEmpty(aVar.getPicUrl());
            t tVar = kVar3.f7621i;
            if (zIsEmpty) {
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                p062e4.a.d((ImageView) value2, false);
            } else {
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                p062e4.a.d((ImageView) value3, true);
                Object value4 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ImageView imageView = (ImageView) value4;
                String picUrl = aVar.getPicUrl();
                if (imageView == null ? false : u.b(imageView.getContext())) {
                    Intrinsics.e(imageView);
                    p pVarF = com.bumptech.glide.b.f(imageView);
                    if (!TextUtils.isEmpty(picUrl)) {
                        Intrinsics.e(picUrl);
                        if (y.m(picUrl, "http://", false)) {
                            picUrl = y.k(picUrl, "http://", "https://");
                        }
                    }
                    if (picUrl == null) {
                        picUrl = "";
                    }
                    com.bumptech.glide.m mVarLoad = pVarF.load(new p230p4.a(picUrl));
                    Intrinsics.checkNotNullExpressionValue(mVarLoad, "load(...)");
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                        mVarLoad = (com.bumptech.glide.m) mVarLoad.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    mVarLoad.S(imageView);
                }
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(aVar.getContent());
            t tVar2 = kVar3.f7622j;
            if (zIsEmpty2) {
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((TextView) value5).setText(kVar3.getContext().getString(r.fb_confirm_leave_pin));
            } else {
                Object value6 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setText(aVar.getContent());
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(aVar.getTips());
            t tVar3 = kVar3.f7618e;
            if (zIsEmpty3) {
                Object value7 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                p062e4.a.d((TextView) value7, false);
            } else {
                Object value8 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((TextView) value8).setText(aVar.getTips());
                Object value9 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                p062e4.a.d((TextView) value9, true);
            }
        }
        this.f21977M = true;
    }

    @Override // K3.d
    public final int getLayoutId() {
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        return q.fb_activity_pay_verification;
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void gotoAddCardWebPage(String str) {
        initStatusBar(0);
        FlexiBankAddLinkCardWebFragment.a aVar = FlexiBankAddLinkCardWebFragment.f21998w;
        if (str == null) {
            str = "";
        }
        FlexiBankAddLinkCardWebFragment flexiBankAddLinkCardWebFragmentNewInstance = aVar.newInstance(str);
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(com.flexibank.sdk.p.fb_apv_fragment_container, flexiBankAddLinkCardWebFragmentNewInstance, null);
        c1161aE.h(true);
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void gotoCheckVoucherCode() {
        initStatusBar(0);
        Z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager);
        c1161a.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankCheckVoucherCodeFragment.f22033A.newInstance(), null);
        c1161a.h(true);
    }

    public final Fragment h() {
        return getSupportFragmentManager().D(com.flexibank.sdk.p.fb_apv_fragment_container);
    }

    public final void i(com.flexibank.sdk.cashier.bean.a aVar) {
        e eVar = this.f21973B;
        if (TextUtils.isEmpty(eVar != null ? eVar.getOrderNo() : null)) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_pay_response", aVar.getData());
        setResult(-1, intent);
        finish();
    }

    @Override // K3.d
    public final void initData() {
        getIntent().getIntExtra("receiver_account_type", 0);
        this.f21974C = getIntent().getIntExtra("payer_account_type", 0);
        e eVar = (e) getIntent().getSerializableExtra("verify_content");
        this.f21973B = eVar;
        this.f21972A = eVar != null ? eVar.getVerifyMethod() : 0;
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) getIntent().getParcelableExtra("payment_method");
        this.f21975H = flexiBankCashierPaymentMethodBean;
        if (flexiBankCashierPaymentMethodBean != null) {
            this.f21974C = flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getSenderAccountType() : 0;
        }
        this.f21976L = (HashMap) getIntent().getSerializableExtra("key_extra_payment_info");
        k(this.f21972A, (FlexiBankPayByOrderResp.DataBean) getIntent().getParcelableExtra("key_pay_response"));
    }

    @Override // K3.d
    public final void initStatusBar() {
        initStatusBar(0);
    }

    @Override // K3.d
    public final boolean isForceNoNightMode() {
        return getIntent().getBooleanExtra("FORCE_NO_NIGHT_MODE", true);
    }

    public final void j(String str, CharSequence charSequence) {
        c cVar = new c(this);
        cVar.e(r.fb_title_error_info);
        cVar.f6598d = charSequence;
        cVar.f6605k = true;
        if ("000099".equalsIgnoreCase(str) || "SM000026".equalsIgnoreCase(str)) {
            cVar.d(r.fb_confirm, null);
        } else if ((!TextUtils.isEmpty(str) && y.m(str, "CFRONT_TCE", false)) || CommonResult.CODE_OUT_OF_TRANSACTION_LIMIT_ERROR.equalsIgnoreCase(str) || CommonResult.CODE_ACCOUNT_STATE_ERROR.equalsIgnoreCase(str)) {
            cVar.d(r.fb_confirm, new m(this, 0));
        } else {
            cVar.d(r.fb_try_again, new m(this, 1));
        }
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    public final void k(int i7, FlexiBankPayByOrderResp.DataBean dataBean) {
        String otpReference;
        e eVar;
        String url;
        String otpReference2;
        if (i7 == 13) {
            if (h() instanceof FlexiBankCheckUbaBankAccountOTPFragment) {
                return;
            }
            if (dataBean == null || (otpReference = dataBean.getOtpReference()) == null) {
                e eVar2 = this.f21973B;
                otpReference = eVar2 != null ? eVar2.getOtpReference() : null;
            }
            if (TextUtils.isEmpty(otpReference)) {
                return;
            }
            FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragmentNewInstance = FlexiBankCheckUbaBankAccountOTPFragment.f22030w.newInstance(otpReference, dataBean != null ? dataBean.getPromptMessage() : null);
            Z supportFragmentManager = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(com.flexibank.sdk.p.fb_apv_fragment_container, flexiBankCheckUbaBankAccountOTPFragmentNewInstance, null);
            c1161aE.h(true);
            return;
        }
        if (i7 != 16) {
            if (i7 == 24) {
                if (h() instanceof FlexiBankCheckWithFaceRecognitionFragment) {
                    return;
                }
                initStatusBar(getColor(L6.b.ppColorBackgroundLight));
                if (dataBean != null) {
                    Z supportFragmentManager2 = getSupportFragmentManager();
                    C1161a c1161aE2 = q0.e(supportFragmentManager2, supportFragmentManager2);
                    c1161aE2.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankCheckWithFaceRecognitionFragment.f22037H.newInstance(dataBean), null);
                    c1161aE2.h(true);
                    return;
                }
                return;
            }
            String str = "";
            switch (i7) {
                case 1:
                    initStatusBar(0);
                    Z supportFragmentManager3 = getSupportFragmentManager();
                    supportFragmentManager3.getClass();
                    C1161a c1161a = new C1161a(supportFragmentManager3);
                    c1161a.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankCheckBankPinFragment.t.newInstance(), null);
                    c1161a.h(true);
                    break;
                case 2:
                    String string = getString(r.fb_confirm_otc);
                    if (dataBean != null && !TextUtils.isEmpty(dataBean.getPromptMessage())) {
                        string = dataBean.getPromptMessage();
                    }
                    initStatusBar(0);
                    Z supportFragmentManager4 = getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    C1161a c1161a2 = new C1161a(supportFragmentManager4);
                    c1161a2.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankCheckBankOtpFragment.t.newInstance(string), null);
                    c1161a2.h(true);
                    break;
                case 3:
                case 11:
                    initStatusBar(0);
                    Z supportFragmentManager5 = getSupportFragmentManager();
                    supportFragmentManager5.getClass();
                    C1161a c1161a3 = new C1161a(supportFragmentManager5);
                    c1161a3.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankCheckBirthdayFragment.f22010H.newInstance(i7, dataBean != null ? dataBean.getErrorMsg() : null), null);
                    c1161a3.h(true);
                    break;
                case 4:
                    initStatusBar(0);
                    FlexiBankCheckMobileFragment.a aVar = FlexiBankCheckMobileFragment.f22018B;
                    e eVar3 = this.f21973B;
                    FlexiBankCheckMobileFragment flexiBankCheckMobileFragmentNewInstance = aVar.newInstance(eVar3 != null ? eVar3.getBankCardNo() : null);
                    Z supportFragmentManager6 = getSupportFragmentManager();
                    C1161a c1161aE3 = q0.e(supportFragmentManager6, supportFragmentManager6);
                    c1161aE3.e(com.flexibank.sdk.p.fb_apv_fragment_container, flexiBankCheckMobileFragmentNewInstance, null);
                    c1161aE3.h(true);
                    break;
                case 5:
                    e eVar4 = this.f21973B;
                    if (eVar4 != null && (url = eVar4.getUrl()) != null) {
                        str = url;
                    }
                    gotoAddCardWebPage(str);
                    break;
                case 6:
                    gotoCheckVoucherCode();
                    break;
                case 8:
                    if (!(h() instanceof FlexiBankCheckPalmPayOtpFragment)) {
                        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
                        FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragmentNewInstance = FlexiBankCheckPalmPayOtpFragment.f22023p.newInstance();
                        Z supportFragmentManager7 = getSupportFragmentManager();
                        C1161a c1161aE4 = q0.e(supportFragmentManager7, supportFragmentManager7);
                        c1161aE4.e(com.flexibank.sdk.p.fb_apv_fragment_container, flexiBankCheckPalmPayOtpFragmentNewInstance, null);
                        c1161aE4.h(true);
                        break;
                    }
                    break;
                case 9:
                    if (!(h() instanceof FlexiBankCheckCVVFragment)) {
                        initStatusBar(0);
                        Z supportFragmentManager8 = getSupportFragmentManager();
                        supportFragmentManager8.getClass();
                        C1161a c1161a4 = new C1161a(supportFragmentManager8);
                        c1161a4.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankCheckCVVFragment.f22017p.newInstance(), null);
                        c1161a4.h(true);
                        break;
                    }
                    break;
                case 10:
                    if (!(h() instanceof FlexiBankCheckBankAccountOtpFragment)) {
                        if (dataBean == null || (otpReference2 = dataBean.getOtpReference()) == null) {
                            e eVar5 = this.f21973B;
                            otpReference2 = eVar5 != null ? eVar5.getOtpReference() : null;
                        }
                        if (!TextUtils.isEmpty(otpReference2)) {
                            FlexiBankCheckBankAccountOtpFragment flexiBankCheckBankAccountOtpFragmentNewInstance = FlexiBankCheckBankAccountOtpFragment.f22002C.newInstance(otpReference2 != null ? otpReference2 : "");
                            Z supportFragmentManager9 = getSupportFragmentManager();
                            C1161a c1161aE5 = q0.e(supportFragmentManager9, supportFragmentManager9);
                            c1161aE5.e(com.flexibank.sdk.p.fb_apv_fragment_container, flexiBankCheckBankAccountOtpFragmentNewInstance, null);
                            c1161aE5.h(true);
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        if ((h() instanceof FlexiBankCheckPalmPayPinFragment) || (eVar = this.f21973B) == null) {
            return;
        }
        FlexiBankCheckPalmPayPinFragment flexiBankCheckPalmPayPinFragmentNewInstance = FlexiBankCheckPalmPayPinFragment.f22024C.newInstance(eVar);
        Z supportFragmentManager10 = getSupportFragmentManager();
        C1161a c1161aE6 = q0.e(supportFragmentManager10, supportFragmentManager10);
        c1161aE6.e(com.flexibank.sdk.p.fb_apv_fragment_container, flexiBankCheckPalmPayPinFragmentNewInstance, null);
        c1161aE6.h(true);
    }

    @Override // K3.d, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i7 != 4 || event.getRepeatCount() != 0) {
            return false;
        }
        g();
        return true;
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void payLoading() {
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(com.flexibank.sdk.p.fb_apv_fragment_container, FlexiBankPayLoadingFragment.f21997o.newInstance(), null);
        c1161aE.h(true);
    }

    @Override // K3.d
    public final void processLogic(Bundle bundle) {
        String transType;
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) e();
        int i7 = this.f21974C;
        e eVar = this.f21973B;
        if (eVar == null || (transType = eVar.getTransType()) == null) {
            transType = "";
        }
        Intrinsics.checkNotNullParameter(transType, "transType");
        p118hf.a.A(flexiBankCashierVerifyViewModel, new U3.e(i7, transType, null), flexiBankCashierVerifyViewModel.f22082f);
        j jVar = ((FlexiBankCashierVerifyViewModel) e()).f22082f;
        if (jVar != null) {
            jVar.e(this, new G(new C0139f(22, this, this), 5));
        }
        final int i10 = 0;
        l.q(this, ((FlexiBankCashierVerifyViewModel) e()).f22081e, this, new Function2(this) { // from class: P3.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankPayVerificationActivity f6905b;

            {
                this.f6905b = this;
            }

            /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
            /* JADX WARN: Code duplicated, block: B:127:0x01da  */
            /* JADX WARN: Code duplicated, block: B:129:0x01e0  */
            /* JADX WARN: Code duplicated, block: B:132:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:133:0x0211  */
            /* JADX WARN: Code duplicated, block: B:135:0x0219  */
            /* JADX WARN: Code duplicated, block: B:136:0x0223  */
            /* JADX WARN: Code duplicated, block: B:139:0x022e  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FlexiBankCheckPalmPayPinFragment flexiBankCheckPalmPayPinFragment;
                FlexiBankPinEntryView flexiBankPinEntryView;
                String respCode;
                FlexiBankPinEntryView flexiBankPinEntryView2;
                String strB;
                O3.e eVar2;
                FlexiBankPayVerificationActivity flexiBankPayVerificationActivity = this.f6905b;
                switch (i10) {
                    case 0:
                        O3.e eVar3 = (O3.e) obj;
                        com.flexibank.sdk.cashier.bean.a resp = (com.flexibank.sdk.cashier.bean.a) obj2;
                        int i11 = FlexiBankPayVerificationActivity.f21971Y;
                        if (resp != null) {
                            int verifyMethod = eVar3 != null ? eVar3.getVerifyMethod() : 0;
                            flexiBankPayVerificationActivity.getClass();
                            Intrinsics.checkNotNullParameter(resp, "resp");
                            flexiBankPayVerificationActivity.showLoadingDialog(false);
                            org.greenrobot.eventbus.c.b().f(Integer.valueOf(MessageEvent.EVENT_PAY_ORDER_FINISH));
                            FlexiBankPayByOrderResp.DataBean data = resp.getData();
                            if (!resp.c() || data == null) {
                                O3.e eVar4 = flexiBankPayVerificationActivity.f21973B;
                                if ("7".equals(eVar4 != null ? eVar4.getOrderType() : null)) {
                                    org.greenrobot.eventbus.c.b().f(new Y3.a(MessageEvent.EVENT_ADD_NEW_CARD_ERROR));
                                }
                                Fragment fragmentH = flexiBankPayVerificationActivity.h();
                                if (verifyMethod == 7) {
                                    if (!(fragmentH instanceof FlexiBankCheckPalmPayPinFragment)) {
                                        flexiBankCheckPalmPayPinFragment = (FlexiBankCheckPalmPayPinFragment) fragmentH;
                                        flexiBankPinEntryView = flexiBankCheckPalmPayPinFragment.t;
                                        if (flexiBankPinEntryView != null) {
                                            flexiBankPinEntryView.setText((Editable) new SpannableStringBuilder(""));
                                        }
                                        respCode = resp.getRespCode();
                                        if ("MEMBER_0052".equalsIgnoreCase(respCode)) {
                                            O6.c cVar = new O6.c(flexiBankCheckPalmPayPinFragment.getActivity());
                                            cVar.e(r.fb_failed_all_cap);
                                            cVar.f6598d = resp.b();
                                            cVar.d(r.fb_confirm, null);
                                            cVar.g();
                                        } else if ("MEMBER_0051".equalsIgnoreCase(respCode)) {
                                            ToastUtils.showLong(resp.b(), new Object[0]);
                                        } else {
                                            String respCode2 = resp.getRespCode();
                                            String strB2 = resp.b();
                                            flexiBankPayVerificationActivity.j(respCode2, strB2 != null ? strB2 : "");
                                        }
                                    } else {
                                        String respCode3 = resp.getRespCode();
                                        String strB3 = resp.b();
                                        flexiBankPayVerificationActivity.j(respCode3, strB3 != null ? strB3 : "");
                                    }
                                } else if (verifyMethod != 8) {
                                    if (verifyMethod != 10) {
                                        if (verifyMethod == 16) {
                                            if (!(fragmentH instanceof FlexiBankCheckPalmPayPinFragment)) {
                                                flexiBankCheckPalmPayPinFragment = (FlexiBankCheckPalmPayPinFragment) fragmentH;
                                                flexiBankPinEntryView = flexiBankCheckPalmPayPinFragment.t;
                                                if (flexiBankPinEntryView != null) {
                                                    flexiBankPinEntryView.setText((Editable) new SpannableStringBuilder(""));
                                                }
                                                respCode = resp.getRespCode();
                                                if ("MEMBER_0052".equalsIgnoreCase(respCode)) {
                                                    O6.c cVar2 = new O6.c(flexiBankCheckPalmPayPinFragment.getActivity());
                                                    cVar2.e(r.fb_failed_all_cap);
                                                    cVar2.f6598d = resp.b();
                                                    cVar2.d(r.fb_confirm, null);
                                                    cVar2.g();
                                                } else if ("MEMBER_0051".equalsIgnoreCase(respCode)) {
                                                    ToastUtils.showLong(resp.b(), new Object[0]);
                                                }
                                            }
                                        }
                                    } else if (fragmentH instanceof FlexiBankCheckBankAccountOtpFragment) {
                                        FlexiBankCheckBankAccountOtpFragment flexiBankCheckBankAccountOtpFragment = (FlexiBankCheckBankAccountOtpFragment) fragmentH;
                                        flexiBankCheckBankAccountOtpFragment.getClass();
                                        String respCode4 = resp.getRespCode();
                                        if ("VL000003".equalsIgnoreCase(respCode4) || "VL000004".equalsIgnoreCase(respCode4) || "VL000005".equalsIgnoreCase(respCode4)) {
                                            TextView textView = flexiBankCheckBankAccountOtpFragment.t;
                                            if (textView != null) {
                                                textView.setVisibility(0);
                                            }
                                        }
                                    }
                                    String respCode5 = resp.getRespCode();
                                    String strB4 = resp.b();
                                    flexiBankPayVerificationActivity.j(respCode5, strB4 != null ? strB4 : "");
                                } else if (fragmentH instanceof FlexiBankCheckPalmPayOtpFragment) {
                                    FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = (FlexiBankCheckPalmPayOtpFragment) fragmentH;
                                    flexiBankCheckPalmPayOtpFragment.getClass();
                                    String respCode6 = resp.getRespCode();
                                    if ("VL000003".equalsIgnoreCase(respCode6) || "VL000004".equalsIgnoreCase(respCode6) || "VL000005".equalsIgnoreCase(respCode6)) {
                                        x4.i iVar = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                                        if (iVar != null) {
                                            iVar.f43616c.setSendOtcButtonState(true);
                                        }
                                        x4.i iVar2 = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                                        if (iVar2 != null) {
                                            iVar2.f43616c.setError(resp.b());
                                        }
                                        x4.i iVar3 = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                                        if (iVar3 != null && (flexiBankPinEntryView2 = iVar3.f43616c.mSmsCodeView) != null) {
                                            flexiBankPinEntryView2.setText("");
                                        }
                                    } else {
                                        String respCode7 = resp.getRespCode();
                                        String strB5 = resp.b();
                                        flexiBankPayVerificationActivity.j(respCode7, strB5 != null ? strB5 : "");
                                    }
                                } else {
                                    String respCode8 = resp.getRespCode();
                                    String strB6 = resp.b();
                                    flexiBankPayVerificationActivity.j(respCode8, strB6 != null ? strB6 : "");
                                }
                            } else {
                                Fragment fragmentD = flexiBankPayVerificationActivity.getSupportFragmentManager().D(com.flexibank.sdk.p.fb_apv_fragment_container);
                                if (fragmentD != null && (fragmentD instanceof FlexiBankBaseVerifyFragment)) {
                                }
                                if (data.getFlag()) {
                                    O3.e eVar5 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar5 != null) {
                                        eVar5.r(data.getPayId());
                                    }
                                    O3.e eVar6 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar6 != null) {
                                        eVar6.u(data.getSubPayId());
                                    }
                                    O3.e eVar7 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar7 != null) {
                                        eVar7.y(data.getUrl());
                                    }
                                    O3.e eVar8 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar8 != null) {
                                        eVar8.A(data.getVerifyMethod());
                                    }
                                    O3.e eVar9 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar9 != null) {
                                        eVar9.s(data.getPayRouteId());
                                    }
                                    O3.e eVar10 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar10 != null) {
                                        eVar10.p(data.getOtpReference());
                                    }
                                    O3.e eVar11 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar11 != null) {
                                        eVar11.t(data.getQueryMaxSec());
                                    }
                                    O3.e eVar12 = flexiBankPayVerificationActivity.f21973B;
                                    flexiBankPayVerificationActivity.k(eVar12 != null ? eVar12.getVerifyMethod() : 0, data);
                                } else {
                                    flexiBankPayVerificationActivity.i(resp);
                                }
                            }
                        }
                        break;
                    default:
                        com.flexibank.sdk.cashier.bean.a aVar = (com.flexibank.sdk.cashier.bean.a) obj2;
                        int i12 = FlexiBankPayVerificationActivity.f21971Y;
                        flexiBankPayVerificationActivity.showLoadingDialog(false);
                        FlexiBankPayByOrderResp.DataBean data2 = aVar != null ? aVar.getData() : null;
                        if (aVar == null || !aVar.c() || data2 == null) {
                            if (aVar != null && (strB = aVar.b()) != null) {
                                flexiBankPayVerificationActivity.j("", strB);
                            }
                        } else if (data2.getFlag()) {
                            O3.e eVar13 = flexiBankPayVerificationActivity.f21973B;
                            if (eVar13 != null) {
                                eVar13.r(data2.getPayId());
                            }
                            if (!TextUtils.isEmpty(data2.getSubPayId()) && (eVar2 = flexiBankPayVerificationActivity.f21973B) != null) {
                                eVar2.u(data2.getSubPayId());
                            }
                            O3.e eVar14 = flexiBankPayVerificationActivity.f21973B;
                            if (eVar14 != null) {
                                eVar14.y(data2.getUrl());
                            }
                            O3.e eVar15 = flexiBankPayVerificationActivity.f21973B;
                            if (eVar15 != null) {
                                eVar15.A(data2.getVerifyMethod());
                            }
                            O3.e eVar16 = flexiBankPayVerificationActivity.f21973B;
                            flexiBankPayVerificationActivity.k(eVar16 != null ? eVar16.getVerifyMethod() : 0, data2);
                        } else {
                            flexiBankPayVerificationActivity.i(aVar);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: P3.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankPayVerificationActivity f6907b;

            {
                this.f6907b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FlexiBankPayVerificationActivity flexiBankPayVerificationActivity = this.f6907b;
                String msg = (String) obj;
                switch (i10) {
                    case 0:
                        int i11 = FlexiBankPayVerificationActivity.f21971Y;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        flexiBankPayVerificationActivity.checkPayFail(msg);
                        break;
                    default:
                        int i12 = FlexiBankPayVerificationActivity.f21971Y;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        flexiBankPayVerificationActivity.checkPayFail(msg);
                        break;
                }
                return Unit.f38893a;
            }
        }, 96);
        final int i11 = 1;
        l.q(this, ((FlexiBankCashierVerifyViewModel) e()).f22084i, this, new Function2(this) { // from class: P3.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankPayVerificationActivity f6905b;

            {
                this.f6905b = this;
            }

            /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
            /* JADX WARN: Code duplicated, block: B:127:0x01da  */
            /* JADX WARN: Code duplicated, block: B:129:0x01e0  */
            /* JADX WARN: Code duplicated, block: B:132:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:133:0x0211  */
            /* JADX WARN: Code duplicated, block: B:135:0x0219  */
            /* JADX WARN: Code duplicated, block: B:136:0x0223  */
            /* JADX WARN: Code duplicated, block: B:139:0x022e  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FlexiBankCheckPalmPayPinFragment flexiBankCheckPalmPayPinFragment;
                FlexiBankPinEntryView flexiBankPinEntryView;
                String respCode;
                FlexiBankPinEntryView flexiBankPinEntryView2;
                String strB;
                O3.e eVar2;
                FlexiBankPayVerificationActivity flexiBankPayVerificationActivity = this.f6905b;
                switch (i11) {
                    case 0:
                        O3.e eVar3 = (O3.e) obj;
                        com.flexibank.sdk.cashier.bean.a resp = (com.flexibank.sdk.cashier.bean.a) obj2;
                        int i12 = FlexiBankPayVerificationActivity.f21971Y;
                        if (resp != null) {
                            int verifyMethod = eVar3 != null ? eVar3.getVerifyMethod() : 0;
                            flexiBankPayVerificationActivity.getClass();
                            Intrinsics.checkNotNullParameter(resp, "resp");
                            flexiBankPayVerificationActivity.showLoadingDialog(false);
                            org.greenrobot.eventbus.c.b().f(Integer.valueOf(MessageEvent.EVENT_PAY_ORDER_FINISH));
                            FlexiBankPayByOrderResp.DataBean data = resp.getData();
                            if (!resp.c() || data == null) {
                                O3.e eVar4 = flexiBankPayVerificationActivity.f21973B;
                                if ("7".equals(eVar4 != null ? eVar4.getOrderType() : null)) {
                                    org.greenrobot.eventbus.c.b().f(new Y3.a(MessageEvent.EVENT_ADD_NEW_CARD_ERROR));
                                }
                                Fragment fragmentH = flexiBankPayVerificationActivity.h();
                                if (verifyMethod == 7) {
                                    if (!(fragmentH instanceof FlexiBankCheckPalmPayPinFragment)) {
                                        flexiBankCheckPalmPayPinFragment = (FlexiBankCheckPalmPayPinFragment) fragmentH;
                                        flexiBankPinEntryView = flexiBankCheckPalmPayPinFragment.t;
                                        if (flexiBankPinEntryView != null) {
                                            flexiBankPinEntryView.setText((Editable) new SpannableStringBuilder(""));
                                        }
                                        respCode = resp.getRespCode();
                                        if ("MEMBER_0052".equalsIgnoreCase(respCode)) {
                                            O6.c cVar2 = new O6.c(flexiBankCheckPalmPayPinFragment.getActivity());
                                            cVar2.e(r.fb_failed_all_cap);
                                            cVar2.f6598d = resp.b();
                                            cVar2.d(r.fb_confirm, null);
                                            cVar2.g();
                                        } else if ("MEMBER_0051".equalsIgnoreCase(respCode)) {
                                            ToastUtils.showLong(resp.b(), new Object[0]);
                                        } else {
                                            String respCode8 = resp.getRespCode();
                                            String strB6 = resp.b();
                                            flexiBankPayVerificationActivity.j(respCode8, strB6 != null ? strB6 : "");
                                        }
                                    } else {
                                        String respCode9 = resp.getRespCode();
                                        String strB7 = resp.b();
                                        flexiBankPayVerificationActivity.j(respCode9, strB7 != null ? strB7 : "");
                                    }
                                } else if (verifyMethod != 8) {
                                    if (verifyMethod != 10) {
                                        if (verifyMethod == 16) {
                                            if (!(fragmentH instanceof FlexiBankCheckPalmPayPinFragment)) {
                                                flexiBankCheckPalmPayPinFragment = (FlexiBankCheckPalmPayPinFragment) fragmentH;
                                                flexiBankPinEntryView = flexiBankCheckPalmPayPinFragment.t;
                                                if (flexiBankPinEntryView != null) {
                                                    flexiBankPinEntryView.setText((Editable) new SpannableStringBuilder(""));
                                                }
                                                respCode = resp.getRespCode();
                                                if ("MEMBER_0052".equalsIgnoreCase(respCode)) {
                                                    O6.c cVar3 = new O6.c(flexiBankCheckPalmPayPinFragment.getActivity());
                                                    cVar3.e(r.fb_failed_all_cap);
                                                    cVar3.f6598d = resp.b();
                                                    cVar3.d(r.fb_confirm, null);
                                                    cVar3.g();
                                                } else if ("MEMBER_0051".equalsIgnoreCase(respCode)) {
                                                    ToastUtils.showLong(resp.b(), new Object[0]);
                                                }
                                            }
                                        }
                                    } else if (fragmentH instanceof FlexiBankCheckBankAccountOtpFragment) {
                                        FlexiBankCheckBankAccountOtpFragment flexiBankCheckBankAccountOtpFragment = (FlexiBankCheckBankAccountOtpFragment) fragmentH;
                                        flexiBankCheckBankAccountOtpFragment.getClass();
                                        String respCode4 = resp.getRespCode();
                                        if ("VL000003".equalsIgnoreCase(respCode4) || "VL000004".equalsIgnoreCase(respCode4) || "VL000005".equalsIgnoreCase(respCode4)) {
                                            TextView textView = flexiBankCheckBankAccountOtpFragment.t;
                                            if (textView != null) {
                                                textView.setVisibility(0);
                                            }
                                        }
                                    }
                                    String respCode10 = resp.getRespCode();
                                    String strB8 = resp.b();
                                    flexiBankPayVerificationActivity.j(respCode10, strB8 != null ? strB8 : "");
                                } else if (fragmentH instanceof FlexiBankCheckPalmPayOtpFragment) {
                                    FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = (FlexiBankCheckPalmPayOtpFragment) fragmentH;
                                    flexiBankCheckPalmPayOtpFragment.getClass();
                                    String respCode6 = resp.getRespCode();
                                    if ("VL000003".equalsIgnoreCase(respCode6) || "VL000004".equalsIgnoreCase(respCode6) || "VL000005".equalsIgnoreCase(respCode6)) {
                                        x4.i iVar = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                                        if (iVar != null) {
                                            iVar.f43616c.setSendOtcButtonState(true);
                                        }
                                        x4.i iVar2 = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                                        if (iVar2 != null) {
                                            iVar2.f43616c.setError(resp.b());
                                        }
                                        x4.i iVar3 = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                                        if (iVar3 != null && (flexiBankPinEntryView2 = iVar3.f43616c.mSmsCodeView) != null) {
                                            flexiBankPinEntryView2.setText("");
                                        }
                                    } else {
                                        String respCode11 = resp.getRespCode();
                                        String strB9 = resp.b();
                                        flexiBankPayVerificationActivity.j(respCode11, strB9 != null ? strB9 : "");
                                    }
                                } else {
                                    String respCode12 = resp.getRespCode();
                                    String strB10 = resp.b();
                                    flexiBankPayVerificationActivity.j(respCode12, strB10 != null ? strB10 : "");
                                }
                            } else {
                                Fragment fragmentD = flexiBankPayVerificationActivity.getSupportFragmentManager().D(com.flexibank.sdk.p.fb_apv_fragment_container);
                                if (fragmentD != null && (fragmentD instanceof FlexiBankBaseVerifyFragment)) {
                                }
                                if (data.getFlag()) {
                                    O3.e eVar5 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar5 != null) {
                                        eVar5.r(data.getPayId());
                                    }
                                    O3.e eVar6 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar6 != null) {
                                        eVar6.u(data.getSubPayId());
                                    }
                                    O3.e eVar7 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar7 != null) {
                                        eVar7.y(data.getUrl());
                                    }
                                    O3.e eVar8 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar8 != null) {
                                        eVar8.A(data.getVerifyMethod());
                                    }
                                    O3.e eVar9 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar9 != null) {
                                        eVar9.s(data.getPayRouteId());
                                    }
                                    O3.e eVar10 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar10 != null) {
                                        eVar10.p(data.getOtpReference());
                                    }
                                    O3.e eVar11 = flexiBankPayVerificationActivity.f21973B;
                                    if (eVar11 != null) {
                                        eVar11.t(data.getQueryMaxSec());
                                    }
                                    O3.e eVar12 = flexiBankPayVerificationActivity.f21973B;
                                    flexiBankPayVerificationActivity.k(eVar12 != null ? eVar12.getVerifyMethod() : 0, data);
                                } else {
                                    flexiBankPayVerificationActivity.i(resp);
                                }
                            }
                        }
                        break;
                    default:
                        com.flexibank.sdk.cashier.bean.a aVar = (com.flexibank.sdk.cashier.bean.a) obj2;
                        int i13 = FlexiBankPayVerificationActivity.f21971Y;
                        flexiBankPayVerificationActivity.showLoadingDialog(false);
                        FlexiBankPayByOrderResp.DataBean data2 = aVar != null ? aVar.getData() : null;
                        if (aVar == null || !aVar.c() || data2 == null) {
                            if (aVar != null && (strB = aVar.b()) != null) {
                                flexiBankPayVerificationActivity.j("", strB);
                            }
                        } else if (data2.getFlag()) {
                            O3.e eVar13 = flexiBankPayVerificationActivity.f21973B;
                            if (eVar13 != null) {
                                eVar13.r(data2.getPayId());
                            }
                            if (!TextUtils.isEmpty(data2.getSubPayId()) && (eVar2 = flexiBankPayVerificationActivity.f21973B) != null) {
                                eVar2.u(data2.getSubPayId());
                            }
                            O3.e eVar14 = flexiBankPayVerificationActivity.f21973B;
                            if (eVar14 != null) {
                                eVar14.y(data2.getUrl());
                            }
                            O3.e eVar15 = flexiBankPayVerificationActivity.f21973B;
                            if (eVar15 != null) {
                                eVar15.A(data2.getVerifyMethod());
                            }
                            O3.e eVar16 = flexiBankPayVerificationActivity.f21973B;
                            flexiBankPayVerificationActivity.k(eVar16 != null ? eVar16.getVerifyMethod() : 0, data2);
                        } else {
                            flexiBankPayVerificationActivity.i(aVar);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: P3.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankPayVerificationActivity f6907b;

            {
                this.f6907b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FlexiBankPayVerificationActivity flexiBankPayVerificationActivity = this.f6907b;
                String msg = (String) obj;
                switch (i11) {
                    case 0:
                        int i12 = FlexiBankPayVerificationActivity.f21971Y;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        flexiBankPayVerificationActivity.checkPayFail(msg);
                        break;
                    default:
                        int i13 = FlexiBankPayVerificationActivity.f21971Y;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        flexiBankPayVerificationActivity.checkPayFail(msg);
                        break;
                }
                return Unit.f38893a;
            }
        }, 96);
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void queryDefinitePayResult(String str, String str2) {
        e eVar = this.f21973B;
        if (eVar != null) {
            eVar.w(str);
        }
        e eVar2 = this.f21973B;
        if (eVar2 != null) {
            eVar2.k(str2);
        }
        e eVar3 = this.f21973B;
        if (eVar3 != null) {
            eVar3.l(true);
        }
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) e();
        e eVar4 = this.f21973B;
        h0 function = new h0(18);
        Intrinsics.checkNotNullParameter(function, "function");
        U3.d dVar = new U3.d(eVar4, null);
        j jVar = flexiBankCashierVerifyViewModel.f22084i;
        jVar.f4932m = function;
        Unit unit = Unit.f38893a;
        p118hf.a.B(flexiBankCashierVerifyViewModel, dVar, jVar);
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void queryPayResult(String str, String str2) {
        e eVar = this.f21973B;
        if (eVar != null) {
            eVar.w(str);
        }
        e eVar2 = this.f21973B;
        if (eVar2 != null) {
            eVar2.k(str2);
        }
        e eVar3 = this.f21973B;
        if (eVar3 != null) {
            eVar3.l(false);
        }
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) e();
        e eVar4 = this.f21973B;
        h0 function = new h0(17);
        Intrinsics.checkNotNullParameter(function, "function");
        U3.d dVar = new U3.d(eVar4, null);
        j jVar = flexiBankCashierVerifyViewModel.f22084i;
        jVar.f4932m = function;
        Unit unit = Unit.f38893a;
        p118hf.a.B(flexiBankCashierVerifyViewModel, dVar, jVar);
    }

    @Override // K3.d
    public final void setupView() {
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void showAlertDialog(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        j("", charSequence);
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void verifyPayMethod(String str, int i7) {
        e eVar = this.f21973B;
        if (eVar != null) {
            eVar.z(str);
        }
        e eVar2 = this.f21973B;
        if (eVar2 != null) {
            int i10 = this.f21972A;
            if (i10 == 16) {
                i7 = i10;
            }
            eVar2.A(i7);
        }
        e req = this.f21973B;
        if (req != null) {
            FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) e();
            Intrinsics.checkNotNullParameter(req, "req");
            U3.b bVar = new U3.b(req, null);
            j jVar = flexiBankCashierVerifyViewModel.f22081e;
            jVar.f4932m = req;
            Unit unit = Unit.f38893a;
            p118hf.a.B(flexiBankCashierVerifyViewModel, bVar, jVar);
        }
    }

    @Override // com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback
    public final void verifyPayMethodWithReference(String str, int i7, String str2) {
        e eVar = this.f21973B;
        if (eVar != null) {
            eVar.p(str2);
        }
        verifyPayMethod(str, i7);
    }
}
