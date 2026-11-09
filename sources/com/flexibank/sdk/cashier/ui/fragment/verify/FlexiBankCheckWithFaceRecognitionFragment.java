package com.flexibank.sdk.cashier.ui.fragment.verify;

import L6.i;
import O6.c;
import O6.d;
import V3.f;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.core.util.FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;
import com.flexibank.sdk.k;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import j4.t;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckWithFaceRecognitionFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/h;", "Lcom/flexibank/sdk/core/util/FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankCheckWithFaceRecognitionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankCheckWithFaceRecognitionFragment.kt\ncom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckWithFaceRecognitionFragment\n+ 2 DialogExt.kt\ncom/palmpay/lib/ui/dialog/DialogExtKt\n*L\n1#1,174:1\n9#2,74:175\n*S KotlinDebug\n*F\n+ 1 FlexiBankCheckWithFaceRecognitionFragment.kt\ncom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckWithFaceRecognitionFragment\n*L\n150#1:175,74\n*E\n"})
public final class FlexiBankCheckWithFaceRecognitionFragment extends FlexiBankBaseVerifyFragment<h> implements FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f22037H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f22038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f f22039B = new f(this);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f22040C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PpButton f22041p;
    public PpButton t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpButton f22042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f22043w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckWithFaceRecognitionFragment newInstance(@NotNull FlexiBankPayByOrderResp.DataBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment = new FlexiBankCheckWithFaceRecognitionFragment();
            Bundle bundle = new Bundle();
            bundle.putString("payId", bean.getPayId());
            flexiBankCheckWithFaceRecognitionFragment.setArguments(bundle);
            return flexiBankCheckWithFaceRecognitionFragment;
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_fragment_check_face_recognition, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i7 = p.fb_titleBar;
        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
        if (ppTitleBar != null) {
            i7 = p.fb_view1;
            ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
            if (viewStub != null) {
                i7 = p.fb_view2;
                ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                if (viewStub2 != null) {
                    h hVar = new h(constraintLayout, constraintLayout, ppTitleBar, viewStub, viewStub2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "inflate(...)");
                    return hVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        ConstraintLayout constraintLayout;
        h hVar = (h) this.f21944f;
        if (hVar != null && (constraintLayout = hVar.f43610b) != null) {
            p062e4.a.b(constraintLayout, Integer.valueOf(BarUtils.getStatusBarHeight()), 0, 0, 0);
        }
        h hVar2 = (h) this.f21944f;
        View viewInflate = hVar2 != null ? hVar2.f43612d.inflate() : null;
        this.f22043w = viewInflate;
        PpButton ppButton = viewInflate != null ? (PpButton) viewInflate.findViewById(p.fb_btnScan) : null;
        this.f22042v = ppButton;
        if (ppButton != null) {
            ppButton.setOnClickListener(new R3.f(this, 1));
        }
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22038A = arguments.getString("payId");
        }
        h hVar = (h) this.f21944f;
        if (hVar != null) {
            hVar.f43611c.setBackButton(S6.a.pay_Close);
        }
        h hVar2 = (h) this.f21944f;
        if (hVar2 == null) {
            return 0;
        }
        hVar2.f43611c.setBackButtonClickListener(new R3.f(this, 0));
        return 0;
    }

    @Override // com.flexibank.sdk.core.util.FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack
    public final void onFailed(String str, String str2) {
        showLoadingDialog(false, false);
        PpButton ppButton = this.f22042v;
        if (ppButton != null) {
            ppButton.setEnabled(true);
        }
        PpButton ppButton2 = this.f22042v;
        if (ppButton2 != null) {
            ppButton2.b(false);
        }
        E eRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
        int i7 = r.fb_retry;
        R3.f fVar = new R3.f(this, 4);
        R3.f fVar2 = new R3.f(this, 5);
        int i10 = r.fb_core_cancel;
        int i11 = i.ppDefaultDialogTheme;
        c cVar = new c(eRequireActivity);
        cVar.f6614u = 1;
        cVar.f6598d = str2;
        cVar.d(i7, fVar);
        cVar.c(i10, fVar2);
        cVar.f6605k = false;
        cVar.f6606l = 0;
        cVar.f6615v = i11;
        d dialog = cVar.g();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
    }

    @Override // com.flexibank.sdk.core.util.FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack
    public final void onProcessing() {
        showLoadingDialog(true, false);
    }

    @Override // com.flexibank.sdk.core.util.FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack
    public final void onSuccess(p006a4.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        showLoadingDialog(false, false);
        PpButton ppButton = this.f22042v;
        if (ppButton != null) {
            ppButton.setEnabled(true);
        }
        PpButton ppButton2 = this.f22042v;
        if (ppButton2 != null) {
            ppButton2.b(false);
        }
        if (!TextUtils.isEmpty(data.getToken())) {
            FlexiBankPayVerificationActivity flexiBankPayVerificationActivityN = n();
            if (flexiBankPayVerificationActivityN != null) {
                String token = data.getToken();
                if (token == null) {
                    token = "";
                }
                flexiBankPayVerificationActivityN.verifyPayMethod(token, 24);
                return;
            }
            return;
        }
        h hVar = (h) this.f21944f;
        if (hVar != null) {
            p062e4.a.d(hVar.f43612d, false);
        }
        h hVar2 = (h) this.f21944f;
        if (hVar2 != null) {
            p062e4.a.d(hVar2.f43613e, true);
        }
        ToastUtils.showLong(data.getErrorMsg(), new Object[0]);
        h hVar3 = (h) this.f21944f;
        if (hVar3 != null) {
            p062e4.a.d(hVar3.f43612d, false);
        }
        h hVar4 = (h) this.f21944f;
        View viewInflate = hVar4 != null ? hVar4.f43613e.inflate() : null;
        if (viewInflate != null) {
            p062e4.a.d(viewInflate, true);
        }
        this.f22041p = viewInflate != null ? (PpButton) viewInflate.findViewById(p.fb_tvConfirm) : null;
        this.t = viewInflate != null ? (PpButton) viewInflate.findViewById(p.fb_tvCancel) : null;
        this.f22040C = true;
        PpButton ppButton3 = this.f22041p;
        if (ppButton3 != null) {
            ppButton3.setText(getString(r.fb_confirm));
        }
        PpButton ppButton4 = this.t;
        if (ppButton4 != null) {
            p062e4.a.d(ppButton4, false);
        }
        PpButton ppButton5 = this.f22041p;
        if (ppButton5 != null) {
            ppButton5.setOnClickListener(new R3.f(this, 2));
        }
        PpButton ppButton6 = this.t;
        if (ppButton6 != null) {
            ppButton6.setOnClickListener(new R3.f(this, 3));
        }
    }

    public final void r() {
        PpButton ppButton = this.f22042v;
        if (ppButton != null) {
            ppButton.b(true);
        }
        t rVar = t.f38312g.getInstance();
        rVar.f38319f = this.f22038A;
        p020b4.a aVarI = k.f22317a.i();
        f requestPermissionLauncher = this.f22039B;
        Intrinsics.checkNotNullParameter(requestPermissionLauncher, "requestPermissionLauncher");
        E activity = getActivity();
        Intrinsics.checkNotNullParameter(requestPermissionLauncher, "requestPermissionLauncher");
        rVar.f38314a = 5;
        rVar.f38318e = aVarI.f18771b;
        rVar.f38317d = new WeakReference(activity);
        rVar.f38315b = this;
        rVar.f38316c = requestPermissionLauncher;
        rVar.a();
    }
}
