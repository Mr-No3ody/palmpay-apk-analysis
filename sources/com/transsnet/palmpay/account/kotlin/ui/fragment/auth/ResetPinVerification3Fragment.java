package com.transsnet.palmpay.account.kotlin.ui.fragment.auth;

import Ab.D;
import Bc.C0105b;
import F8.d;
import F8.e;
import F8.h;
import Je.l;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.TitleEditView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/fragment/auth/ResetPinVerification3Fragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/custom_view/TitleEditView$OnTextInputListener;", "<init>", "()V", "a", "K8/b", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinVerification3Fragment extends BaseFragment implements TitleEditView.OnTextInputListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f25800p = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25802j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0105b f25803o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResetPinVerification3Fragment newInstance(@NotNull String verifyType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(verifyType, "verifyType");
            ResetPinVerification3Fragment resetPinVerification3Fragment = new ResetPinVerification3Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_type", verifyType);
            bundle.putString("extra_data", str);
            resetPinVerification3Fragment.setArguments(bundle);
            return resetPinVerification3Fragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.TitleEditView.OnTextInputListener
    public final void OnTextInput(String str) {
        u();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        C0105b c0105b = this.f25803o;
        if (c0105b != null) {
            ((TextView) c0105b.f664d).setOnClickListener(new l(this, 4));
        }
        C0105b c0105b2 = this.f25803o;
        if (c0105b2 == null) {
            return 0;
        }
        ((TextView) c0105b2.f665e).setOnClickListener(new K8.a(2));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_resetpin_verification_3, viewGroup, false);
        int i7 = d.bannerView;
        BannerViewPager bannerViewPager = (BannerViewPager) p059e1.a.m(i7, viewInflate);
        if (bannerViewPager != null) {
            i7 = d.inputBank;
            TitleEditView titleEditView = (TitleEditView) p059e1.a.m(i7, viewInflate);
            if (titleEditView != null) {
                i7 = d.textViewMsg;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.textViewNext;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = d.tvContactUs;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView3 != null) {
                            C0105b c0105b = new C0105b((ViewGroup) viewInflate, (View) bannerViewPager, (View) titleEditView, textView, textView2, textView3, 10);
                            this.f25803o = c0105b;
                            return c0105b;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        u();
        G8.a.t().queryMyBankList(this.f25802j, !Intrinsics.c(this.f25801i, ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD) ? 1 : 0).k(f.f42629b).i(b.a()).subscribe(new D(this, 17));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        this.f25801i = arguments != null ? arguments.getString("extra_type") : null;
        Bundle arguments2 = getArguments();
        this.f25802j = arguments2 != null ? arguments2.getString("extra_data") : null;
        C0105b c0105b = this.f25803o;
        if (c0105b != null) {
            ((TitleEditView) c0105b.f667g).setOnTextInputListener(this);
        }
        C0105b c0105b2 = this.f25803o;
        if (c0105b2 != null) {
            ((TextView) c0105b2.f663c).setText(Intrinsics.c(this.f25801i, ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD) ? h.ac_msg_reset_pin_verification_bankinfo : h.ac_msg_reset_pin_verification_bank_account_info);
        }
        C0105b c0105b3 = this.f25803o;
        if (c0105b3 == null) {
            return 0;
        }
        ((TitleEditView) c0105b3.f667g).setTitle(Intrinsics.c(this.f25801i, ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD) ? getString(h.ac_bank_card_number) : getString(k.core_bank_account_number));
        return 0;
    }

    public final boolean t(boolean z3) {
        String editText;
        C0105b c0105b;
        C0105b c0105b2;
        C0105b c0105b3 = this.f25803o;
        if (c0105b3 == null || (editText = ((TitleEditView) c0105b3.f667g).getEditText()) == null) {
            editText = "";
        }
        if (((!TextUtils.isEmpty(editText) && editText.startsWith(TransType.TRANS_TYPE_EX_GRATIA_REFUND)) ? (char) 15 : (char) 16) == 15) {
            if (editText.length() == 15) {
                return true;
            }
            if (z3 && (c0105b2 = this.f25803o) != null) {
                ((TitleEditView) c0105b2.f667g).setError(getString(k.core_msg_invalid_bank_card_no_15_digit));
                return false;
            }
        } else {
            if (r0.a1(editText)) {
                return true;
            }
            if (z3 && (c0105b = this.f25803o) != null) {
                ((TitleEditView) c0105b.f667g).setError(getString(k.core_msg_invalid_bank_card_no));
            }
        }
        return false;
    }

    public final void u() {
        TextView textView;
        TitleEditView titleEditView;
        String editText;
        C0105b c0105b = this.f25803o;
        if (c0105b == null || (textView = (TextView) c0105b.f664d) == null) {
            return;
        }
        boolean zT = false;
        if (Intrinsics.c(this.f25801i, ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD)) {
            zT = t(false);
        } else {
            C0105b c0105b2 = this.f25803o;
            if (c0105b2 != null && (titleEditView = (TitleEditView) c0105b2.f667g) != null && (editText = titleEditView.getEditText()) != null && editText.length() > 0) {
                zT = true;
            }
        }
        textView.setEnabled(zT);
    }
}
