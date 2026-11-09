package com.transsnet.palmpay.account.kotlin.ui.fragment.auth;

import F8.d;
import F8.e;
import I8.v;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/fragment/auth/ResetPinVerification4Fragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/custom_view/TitleEditView$OnTextInputListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinVerification4Fragment extends BaseFragment implements TitleEditView.OnTextInputListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f25804i;

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
        v vVar = this.f25804i;
        if (vVar != null) {
            vVar.f4241e.setOnClickListener(new l(this, 5));
        }
        v vVar2 = this.f25804i;
        if (vVar2 == null) {
            return 0;
        }
        vVar2.f4242f.setOnClickListener(new a(3));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_resetpin_verification_4, viewGroup, false);
        int i7 = d.inputBVN;
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
                        v vVar = new v((RelativeLayout) viewInflate, titleEditView, textView, textView2, textView3, 0);
                        this.f25804i = vVar;
                        return vVar;
                    }
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
        v vVar = this.f25804i;
        if (vVar == null) {
            return 0;
        }
        vVar.f4239c.setOnTextInputListener(this);
        return 0;
    }

    public final void t() {
        TextView textView;
        TitleEditView titleEditView;
        String editText;
        TitleEditView titleEditView2;
        v vVar = this.f25804i;
        boolean z3 = false;
        if (!TextUtils.isEmpty((vVar == null || (titleEditView2 = vVar.f4239c) == null) ? null : titleEditView2.getEditText())) {
            v vVar2 = this.f25804i;
            if (((vVar2 == null || (titleEditView = vVar2.f4239c) == null || (editText = titleEditView.getEditText()) == null) ? 0 : editText.length()) >= 11) {
                z3 = true;
            }
        }
        v vVar3 = this.f25804i;
        if (vVar3 == null || (textView = vVar3.f4241e) == null) {
            return;
        }
        textView.setEnabled(z3);
    }
}
