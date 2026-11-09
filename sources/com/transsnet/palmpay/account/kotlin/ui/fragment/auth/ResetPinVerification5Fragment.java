package com.transsnet.palmpay.account.kotlin.ui.fragment.auth;

import Ab.D;
import F8.d;
import F8.e;
import I8.v;
import Je.l;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.account.bean.UserValidIdInfoRsp;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.TitleEditView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/fragment/auth/ResetPinVerification5Fragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/custom_view/TitleEditView$OnTextInputListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPinVerification5Fragment extends BaseFragment implements TitleEditView.OnTextInputListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f25805p = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserValidIdInfoRsp f25807j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f25808o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResetPinVerification5Fragment newInstance(@Nullable String str) {
            ResetPinVerification5Fragment resetPinVerification5Fragment = new ResetPinVerification5Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_data", str);
            resetPinVerification5Fragment.setArguments(bundle);
            return resetPinVerification5Fragment;
        }

        private a() {
        }
    }

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
        v vVar = this.f25808o;
        if (vVar != null) {
            vVar.f4241e.setOnClickListener(new l(this, 6));
        }
        v vVar2 = this.f25808o;
        if (vVar2 == null) {
            return 0;
        }
        vVar2.f4242f.setOnClickListener(new K8.a(4));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_resetpin_verification_5, viewGroup, false);
        int i7 = d.inputIdNo;
        TitleEditView titleEditView = (TitleEditView) p059e1.a.m(i7, viewInflate);
        if (titleEditView != null) {
            i7 = d.inputIdType;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.textViewNext;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = d.tvContactUs;
                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView3 != null) {
                        v vVar = new v((RelativeLayout) viewInflate, titleEditView, textView, textView2, textView3, 1);
                        this.f25808o = vVar;
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
        showLoadingDialog(true);
        G8.a.t().queryUserValidIdInfo(this.f25806i).k(f.f42629b).i(b.a()).subscribe(new D(this, 18));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        this.f25806i = arguments != null ? arguments.getString("extra_data") : null;
        v vVar = this.f25808o;
        if (vVar == null) {
            return 0;
        }
        vVar.f4239c.setOnTextInputListener(this);
        return 0;
    }

    public final void t() {
        TextView textView;
        TitleEditView titleEditView;
        v vVar = this.f25808o;
        boolean z3 = !TextUtils.isEmpty((vVar == null || (titleEditView = vVar.f4239c) == null) ? null : titleEditView.getEditText());
        v vVar2 = this.f25808o;
        if (vVar2 == null || (textView = vVar2.f4241e) == null) {
            return;
        }
        textView.setEnabled(z3);
    }
}
