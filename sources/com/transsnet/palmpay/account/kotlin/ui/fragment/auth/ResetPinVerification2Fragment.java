package com.transsnet.palmpay.account.kotlin.ui.fragment.auth;

import Bc.C0107d;
import F8.d;
import F8.e;
import Je.l;
import K8.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.TitleEditView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/fragment/auth/ResetPinVerification2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/custom_view/TitleEditView$OnTextInputListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinVerification2Fragment extends BaseFragment implements TitleEditView.OnTextInputListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0107d f25799i;

    @Override // com.transsnet.palmpay.custom_view.TitleEditView.OnTextInputListener
    public final void OnTextInput(String str) {
        t();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        C0107d c0107d = this.f25799i;
        if (c0107d != null) {
            ((TextView) c0107d.f682d).setOnClickListener(new l(this, 3));
        }
        C0107d c0107d2 = this.f25799i;
        if (c0107d2 == null) {
            return 0;
        }
        ((TextView) c0107d2.f683e).setOnClickListener(new a(1));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_resetpin_verification_2, viewGroup, false);
        int i7 = d.inputAccountNo;
        TitleEditView titleEditView = (TitleEditView) p059e1.a.m(i7, viewInflate);
        if (titleEditView != null) {
            i7 = d.textViewNext;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.tvContactUs;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    C0107d c0107d = new C0107d((RelativeLayout) viewInflate, titleEditView, textView, textView2, 11);
                    this.f25799i = c0107d;
                    return c0107d;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        t();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        C0107d c0107d = this.f25799i;
        if (c0107d == null) {
            return 0;
        }
        ((TitleEditView) c0107d.f681c).setOnTextInputListener(this);
        return 0;
    }

    public final void t() {
        TextView textView;
        TitleEditView titleEditView;
        C0107d c0107d = this.f25799i;
        boolean z3 = !TextUtils.isEmpty((c0107d == null || (titleEditView = (TitleEditView) c0107d.f681c) == null) ? null : titleEditView.getEditText());
        C0107d c0107d2 = this.f25799i;
        if (c0107d2 == null || (textView = (TextView) c0107d2.f682d) == null) {
            return;
        }
        textView.setEnabled(z3);
    }
}
