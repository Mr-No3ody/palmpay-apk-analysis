package com.transsnet.palmpay.account.kotlin.ui.fragment.auth;

import Bc.C0105b;
import F8.d;
import F8.e;
import Je.l;
import Tb.b;
import Tb.c;
import android.text.InputFilter;
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
import p025ba.f;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/fragment/auth/ResetPinVerification1Fragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/custom_view/TitleEditView$OnTextInputListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinVerification1Fragment extends BaseFragment implements TitleEditView.OnTextInputListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0105b f25798i;

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
        C0105b c0105b = this.f25798i;
        if (c0105b != null) {
            ((TitleEditView) c0105b.f665e).setInputFilter(new InputFilter[]{new c(getResources().getInteger(f.max_name_length), 0), new b(0)});
        }
        C0105b c0105b2 = this.f25798i;
        if (c0105b2 != null) {
            ((TitleEditView) c0105b2.f667g).setInputFilter(new InputFilter[]{new c(getResources().getInteger(f.max_name_length), 0), new b(0)});
        }
        C0105b c0105b3 = this.f25798i;
        if (c0105b3 != null) {
            ((TitleEditView) c0105b3.f666f).setInputFilter(new InputFilter[]{new c(getResources().getInteger(f.max_name_length), 0), new b(0)});
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_resetpin_verification_1, viewGroup, false);
        int i7 = d.inputFirstName;
        TitleEditView titleEditView = (TitleEditView) a.m(i7, viewInflate);
        if (titleEditView != null) {
            i7 = d.inputLastName;
            TitleEditView titleEditView2 = (TitleEditView) a.m(i7, viewInflate);
            if (titleEditView2 != null) {
                i7 = d.inputMiddleName;
                TitleEditView titleEditView3 = (TitleEditView) a.m(i7, viewInflate);
                if (titleEditView3 != null) {
                    i7 = d.textViewNext;
                    TextView textView = (TextView) a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tvContactUs;
                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                        if (textView2 != null) {
                            C0105b c0105b = new C0105b((RelativeLayout) viewInflate, titleEditView, titleEditView2, titleEditView3, textView, textView2);
                            this.f25798i = c0105b;
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
        C0105b c0105b = this.f25798i;
        if (c0105b != null) {
            ((TextView) c0105b.f663c).setOnClickListener(new l(this, 2));
        }
        C0105b c0105b2 = this.f25798i;
        if (c0105b2 != null) {
            ((TextView) c0105b2.f664d).setOnClickListener(new K8.a(0));
        }
        t();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        C0105b c0105b = this.f25798i;
        if (c0105b != null) {
            ((TitleEditView) c0105b.f665e).setOnTextInputListener(this);
        }
        C0105b c0105b2 = this.f25798i;
        if (c0105b2 != null) {
            ((TitleEditView) c0105b2.f667g).setOnTextInputListener(this);
        }
        C0105b c0105b3 = this.f25798i;
        if (c0105b3 == null) {
            return 0;
        }
        ((TitleEditView) c0105b3.f666f).setOnTextInputListener(this);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    public final void t() {
        String editText;
        boolean z3;
        C0105b c0105b = this.f25798i;
        String editText2 = null;
        if ((c0105b != null ? (TitleEditView) c0105b.f665e : null) != null) {
            editText = c0105b != null ? ((TitleEditView) c0105b.f665e).getEditText() : null;
        } else {
            editText = "";
        }
        if (TextUtils.isEmpty(editText)) {
            z3 = false;
        } else {
            C0105b c0105b2 = this.f25798i;
            if ((c0105b2 != null ? (TitleEditView) c0105b2.f666f : null) == null) {
                editText2 = "";
            } else if (c0105b2 != null) {
                editText2 = ((TitleEditView) c0105b2.f666f).getEditText();
            }
            if (TextUtils.isEmpty(editText2)) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        C0105b c0105b3 = this.f25798i;
        if (c0105b3 != null) {
            ((TextView) c0105b3.f663c).setEnabled(z3);
        }
    }
}
