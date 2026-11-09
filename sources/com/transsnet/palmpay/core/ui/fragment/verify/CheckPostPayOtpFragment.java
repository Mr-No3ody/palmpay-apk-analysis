package com.transsnet.palmpay.core.ui.fragment.verify;

import B5.c;
import Ha.d;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.custom_view.model.ModelSendSms;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckPostPayOtpFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/text/TextWatcher;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckPostPayOtpFragment extends BaseFragment implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f28004B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f28005A = new c(this, 9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelSendSms f28006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28007j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f28009p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f28010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28011w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CheckPostPayOtpFragment newInstance(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            CheckPostPayOtpFragment checkPostPayOtpFragment = new CheckPostPayOtpFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_data", str);
            bundle.putString("extra_data_1", str2);
            bundle.putString("extra_message", str3);
            checkPostPayOtpFragment.setArguments(bundle);
            return checkPostPayOtpFragment;
        }

        private a() {
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z3 = false;
        u("", false);
        ModelSendSms modelSendSms = this.f28006i;
        if (modelSendSms == null) {
            Intrinsics.n("mTvSendSms");
            throw null;
        }
        String string = modelSendSms.f31581d.getText().toString();
        TextView textView = this.f28009p;
        if (textView == null) {
            Intrinsics.n("mTvNext");
            throw null;
        }
        if (!TextUtils.isEmpty(string) && string.length() >= 1) {
            z3 = true;
        }
        textView.setEnabled(z3);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_postpay_otp;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TextView textView = this.t;
        if (textView != null) {
            textView.setOnClickListener(new d(this, 27));
            return 0;
        }
        Intrinsics.n("mTvSend");
        throw null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        String str;
        t(false);
        if (TextUtils.isEmpty(this.f28011w) || (str = this.f28011w) == null) {
            return;
        }
        u(str, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        Bundle arguments2 = getArguments();
        this.f28010v = (String) (arguments2 != null ? arguments2.get("extra_data_1") : null);
        Bundle arguments3 = getArguments();
        this.f28011w = (String) (arguments3 != null ? arguments3.get("extra_message") : null);
        this.f28006i = (ModelSendSms) this.f27318b.findViewById(e.tvSendSms);
        this.f28007j = (TextView) this.f27318b.findViewById(e.tvMessage);
        this.f28008o = (TextView) this.f27318b.findViewById(e.tvError);
        this.f28009p = (TextView) this.f27318b.findViewById(e.tvNext);
        ModelSendSms modelSendSms = this.f28006i;
        if (modelSendSms == null) {
            Intrinsics.n("mTvSendSms");
            throw null;
        }
        this.t = modelSendSms.f31582e;
        modelSendSms.f31581d.addTextChangedListener(this);
        TextView textView = this.f28009p;
        if (textView != null) {
            textView.setOnClickListener(this);
            return 0;
        }
        Intrinsics.n("mTvNext");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.activity.PayVerificationActivity");
        PayVerificationActivity payVerificationActivity = (PayVerificationActivity) activity;
        ModelSendSms modelSendSms = this.f28006i;
        if (modelSendSms != null) {
            payVerificationActivity.verifyPayMethod(modelSendSms.f31581d.getText().toString(), 12);
        } else {
            Intrinsics.n("mTvSendSms");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public final void t(boolean z3) {
        TextView textView = this.t;
        if (textView == null) {
            Intrinsics.n("mTvSend");
            throw null;
        }
        textView.setEnabled(z3);
        c cVar = this.f28005A;
        if (z3) {
            TextView textView2 = this.t;
            if (textView2 == null) {
                Intrinsics.n("mTvSend");
                throw null;
            }
            textView2.removeCallbacks(cVar);
            TextView textView3 = this.t;
            if (textView3 != null) {
                textView3.setText(k.core_send);
                return;
            } else {
                Intrinsics.n("mTvSend");
                throw null;
            }
        }
        TextView textView4 = this.t;
        if (textView4 == null) {
            Intrinsics.n("mTvSend");
            throw null;
        }
        textView4.setTag(Long.valueOf(System.currentTimeMillis()));
        TextView textView5 = this.t;
        if (textView5 != null) {
            textView5.post(cVar);
        } else {
            Intrinsics.n("mTvSend");
            throw null;
        }
    }

    public final void u(String str, boolean z3) {
        if (!z3) {
            TextView textView = this.f28008o;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                Intrinsics.n("mTvError");
                throw null;
            }
        }
        TextView textView2 = this.f28008o;
        if (textView2 == null) {
            Intrinsics.n("mTvError");
            throw null;
        }
        textView2.setText(str);
        TextView textView3 = this.f28008o;
        if (textView3 != null) {
            textView3.setVisibility(0);
        } else {
            Intrinsics.n("mTvError");
            throw null;
        }
    }
}
