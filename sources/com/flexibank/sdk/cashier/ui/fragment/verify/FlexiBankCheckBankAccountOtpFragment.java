package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.y;
import B5.c;
import Fe.h0;
import K3.j;
import N8.C0463g;
import Nc.x;
import Z3.d;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierVerifyViewModel;
import com.flexibank.sdk.customview.model.FlexiBankModelSendSms;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p377z5.l;
import x4.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckBankAccountOtpFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/f;", "Landroid/view/View$OnClickListener;", "Landroid/text/TextWatcher;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckBankAccountOtpFragment extends FlexiBankBaseVerifyFragment<f> implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f22002C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f22003A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f22004B = new c(this, 20);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlexiBankModelSendSms f22005p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpButton f22006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f22007w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckBankAccountOtpFragment newInstance(@NotNull String otpReference) {
            Intrinsics.checkNotNullParameter(otpReference, "otpReference");
            FlexiBankCheckBankAccountOtpFragment flexiBankCheckBankAccountOtpFragment = new FlexiBankCheckBankAccountOtpFragment();
            Bundle bundle = new Bundle();
            bundle.putString("otp_reference", otpReference);
            flexiBankCheckBankAccountOtpFragment.setArguments(bundle);
            return flexiBankCheckBankAccountOtpFragment;
        }

        private a() {
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_fragment_check_bank_account_otp, viewGroup, false);
        int i7 = p.fb_invalidate_otp_tip_tv;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = p.fb_ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = p.fb_send_opt_mss;
                FlexiBankModelSendSms flexiBankModelSendSms = (FlexiBankModelSendSms) p059e1.a.m(i7, viewInflate);
                if (flexiBankModelSendSms != null) {
                    i7 = p.fb_textViewContinue;
                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton != null) {
                        f fVar = new f((LinearLayout) viewInflate, textView, iconicsImageView, flexiBankModelSendSms, ppButton);
                        Intrinsics.checkNotNullExpressionValue(fVar, "inflate(...)");
                        return fVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) h();
        l.q(this, flexiBankCashierVerifyViewModel.f22085j, this, new y(3), new h0(19), 240);
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        EditText mEditText;
        g();
        f fVar = (f) this.f21944f;
        this.f22005p = fVar != null ? fVar.f43598d : null;
        this.t = fVar != null ? fVar.f43596b : null;
        this.f22006v = fVar != null ? fVar.f43599e : null;
        if (fVar != null) {
            p(fVar.f43597c);
        }
        PpButton ppButton = this.f22006v;
        if (ppButton != null) {
            ppButton.setOnClickListener(new x(this, 21));
        }
        FlexiBankModelSendSms flexiBankModelSendSms = this.f22005p;
        TextView mSendSmsTv = flexiBankModelSendSms != null ? flexiBankModelSendSms.getMSendSmsTv() : null;
        this.f22007w = mSendSmsTv;
        if (mSendSmsTv != null) {
            mSendSmsTv.setOnClickListener(this);
        }
        FlexiBankModelSendSms flexiBankModelSendSms2 = this.f22005p;
        if (flexiBankModelSendSms2 != null && (mEditText = flexiBankModelSendSms2.getMEditText()) != null) {
            mEditText.addTextChangedListener(this);
        }
        TextView textView = this.f22007w;
        if (textView != null) {
            textView.setEnabled(true);
        }
        TextView textView2 = this.f22007w;
        if (textView2 != null) {
            textView2.removeCallbacks(this.f22004B);
        }
        TextView textView3 = this.f22007w;
        if (textView3 == null) {
            return 0;
        }
        textView3.setText(r.fb_send_code);
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        TextView textView = this.t;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f22007w;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        TextView textView3 = this.f22007w;
        if (textView3 != null) {
            textView3.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
        }
        TextView textView4 = this.f22007w;
        if (textView4 != null) {
            textView4.post(this.f22004B);
        }
        d dVar = new d();
        dVar.a(this.f22003A);
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) h();
        C0463g function = new C0463g(this, 9);
        Intrinsics.checkNotNullParameter(function, "function");
        U3.c cVar = new U3.c(dVar, null);
        j jVar = flexiBankCashierVerifyViewModel.f22085j;
        jVar.f4932m = function;
        Unit unit = Unit.f38893a;
        p118hf.a.B(flexiBankCashierVerifyViewModel, cVar, jVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f22003A = arguments != null ? arguments.getString("otp_reference") : null;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        EditText mEditText;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        FlexiBankModelSendSms flexiBankModelSendSms = this.f22005p;
        if (TextUtils.isEmpty(String.valueOf((flexiBankModelSendSms == null || (mEditText = flexiBankModelSendSms.getMEditText()) == null) ? null : mEditText.getText()))) {
            PpButton ppButton = this.f22006v;
            if (ppButton != null) {
                ppButton.setEnabled(false);
                return;
            }
            return;
        }
        PpButton ppButton2 = this.f22006v;
        if (ppButton2 != null) {
            ppButton2.setEnabled(true);
        }
    }
}
