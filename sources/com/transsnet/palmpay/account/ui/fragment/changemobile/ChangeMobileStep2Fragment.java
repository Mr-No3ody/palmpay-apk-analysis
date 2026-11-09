package com.transsnet.palmpay.account.ui.fragment.changemobile;

import Bc.C0107d;
import F8.d;
import F8.e;
import L6.b;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.ChangeMobileActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p051d9.C1612i;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/changemobile/ChangeMobileStep2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/i;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/ChangeMobileContract$View;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeMobileStep2Fragment extends BaseMVPFragment<C1612i> implements ChangeMobileContract.View {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f26124o = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0107d f26125j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ChangeMobileStep2Fragment newInstance() {
            ChangeMobileStep2Fragment changeMobileStep2Fragment = new ChangeMobileStep2Fragment();
            changeMobileStep2Fragment.setArguments(new Bundle());
            return changeMobileStep2Fragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void handleCheckNumberResult(CommonResult response, String str) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccess()) {
            E activity = getActivity();
            if (activity instanceof ChangeMobileActivity) {
                ChangeMobileActivity changeMobileActivity = (ChangeMobileActivity) activity;
                if (changeMobileActivity.getSupportFragmentManager().D(d.fragmentContainer) instanceof ChangeMobileStep3Fragment) {
                    return;
                }
                h.i(changeMobileActivity, d.fragmentContainer, ChangeMobileStep3Fragment.f26126w.newInstance(str));
                return;
            }
            return;
        }
        if (CommonResult.CODE_PHONE_REGISTERED.equals(response.getRespCode())) {
            String string = getString(F8.h.ac_msg_mobile_number_is_used);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            u(string);
        } else {
            String respMsg = response.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            u(respMsg);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_change_mobile_step2, viewGroup, false);
        int i7 = d.editMobile;
        PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
        if (ppFormVertical != null) {
            i7 = d.titleBar;
            if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = d.tvMobile;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.tvNext;
                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton != null) {
                        C0107d c0107d = new C0107d((LinearLayout) viewInflate, ppFormVertical, textView, ppButton, 8);
                        this.f26125j = c0107d;
                        return c0107d;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        C0107d c0107d;
        AppCompatEditText editText;
        C0107d c0107d2;
        C0107d c0107d3 = this.f26125j;
        if (c0107d3 != null) {
            ((PpButton) c0107d3.f683e).setOnClickListener(new R8.d(this, 5));
        }
        C0107d c0107d4 = this.f26125j;
        r0.R1(c0107d4 != null ? (TextView) c0107d4.f682d : null, "fonts/PalmPayNum-Bold.ttf");
        if (BaseApplication.hasLogin()) {
            User user = BaseApplication.get().getUser();
            if (user != null && (c0107d2 = this.f26125j) != null) {
                ((TextView) c0107d2.f682d).setText(r0.E0(user.getPhoneNumber()));
            }
        } else if ((getActivity() instanceof ChangeMobileActivity) && (c0107d = this.f26125j) != null) {
            TextView textView = (TextView) c0107d.f682d;
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.ChangeMobileActivity");
            textView.setText(r0.E0(((ChangeMobileActivity) activity).f25840a));
        }
        C0107d c0107d5 = this.f26125j;
        if (c0107d5 != null && (editText = ((PpFormVertical) c0107d5.f681c).getEditText()) != null) {
            editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        }
        C0107d c0107d6 = this.f26125j;
        if (c0107d6 == null) {
            return 0;
        }
        ((PpFormVertical) c0107d6.f681c).setEditTextWatcher(new R3.e(this, 1));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ChangeMobileActivity changeMobileActivity;
        super.onResume();
        if (!(getActivity() instanceof ChangeMobileActivity) || (changeMobileActivity = (ChangeMobileActivity) getActivity()) == null) {
            return;
        }
        changeMobileActivity.initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, getContext()));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void showLoadingView(boolean z3) {
        PpFormVertical ppFormVertical;
        PpButton ppButton;
        C0107d c0107d = this.f26125j;
        if (c0107d != null && (ppButton = (PpButton) c0107d.f683e) != null) {
            ppButton.b(z3);
        }
        C0107d c0107d2 = this.f26125j;
        if (c0107d2 == null || (ppFormVertical = (PpFormVertical) c0107d2.f681c) == null) {
            return;
        }
        ppFormVertical.setEnabled(!z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1612i();
    }

    public final void u(String str) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        if (TextUtils.isEmpty(str)) {
            C0107d c0107d = this.f26125j;
            if (c0107d == null || (ppFormVertical2 = (PpFormVertical) c0107d.f681c) == null) {
                return;
            }
            ppFormVertical2.d();
            return;
        }
        C0107d c0107d2 = this.f26125j;
        if (c0107d2 == null || (ppFormVertical = (PpFormVertical) c0107d2.f681c) == null) {
            return;
        }
        ppFormVertical.h(str);
    }
}
