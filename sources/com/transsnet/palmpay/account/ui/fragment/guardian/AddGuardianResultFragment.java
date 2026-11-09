package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.f;
import F8.e;
import L6.b;
import Pa.C0525w;
import R8.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianResultFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddGuardianResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddGuardianResultFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianResultFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1869#2,2:97\n*S KotlinDebug\n*F\n+ 1 AddGuardianResultFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianResultFragment\n*L\n79#1:97,2\n*E\n"})
public final class AddGuardianResultFragment extends BaseAddGuardianFragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f26140p;

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        super.k();
        f fVar = this.f26140p;
        y(fVar != null ? (PpTitleBar) fVar.f703j : null);
        C0525w c0525wF = C0525w.f();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_data") : null;
        c0525wF.getClass();
        SubmitGuardianRsp submitGuardianRsp = (SubmitGuardianRsp) C0525w.d(string, SubmitGuardianRsp.class);
        if (submitGuardianRsp != null) {
            f fVar2 = this.f26140p;
            if (fVar2 != null) {
                LinearLayout linearLayout = (LinearLayout) fVar2.f697c;
                TextView textView = new TextView(getContext());
                String str = submitGuardianRsp.contentTitle;
                textView.setText(str != null ? h.B(str, textView.getContext(), Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorTextPrimary, textView.getContext())), null, 14, "sans-serif-medium", null, 996) : null);
                linearLayout.addView(textView);
                List<String> list = submitGuardianRsp.contentDetail;
                if (list != null) {
                    int i7 = 1;
                    for (String str2 : list) {
                        TextView textView2 = new TextView(getContext());
                        textView2.setText(new SpanUtils().append("Step" + i7 + ": ").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, textView2.getContext())).append(str2).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, textView2.getContext())).create());
                        textView2.setTextSize(14.0f);
                        linearLayout.addView(textView2);
                        h.k(textView2, Integer.valueOf(CommonViewExtKt.getDp(12.0f)), null, null, null, 14);
                        i7++;
                    }
                }
                h.C(linearLayout);
            }
            f fVar3 = this.f26140p;
            if (fVar3 != null) {
                ((TextView) fVar3.f701g).setText(new SpanUtils().append(submitGuardianRsp.statusDescribe).append(submitGuardianRsp.highlightStatusDescribe).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext())).create());
            }
        }
        f fVar4 = this.f26140p;
        if (fVar4 != null) {
            ((PpButton) fVar4.f700f).setOnClickListener(new d(this, 7));
        }
        f fVar5 = this.f26140p;
        org.chromium.support_lib_boundary.util.b.c(fVar5 != null ? (SingleAdView) fVar5.f699e : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_add_guardian_result, viewGroup, false);
        int i7 = F8.d.bottomAd;
        SingleAdView singleAdView = (SingleAdView) a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = F8.d.bottomViewStub;
            ViewStub viewStub = (ViewStub) a.m(i7, viewInflate);
            if (viewStub != null) {
                i7 = F8.d.btnConfirm;
                PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = F8.d.ivIcon;
                    if (((ImageView) a.m(i7, viewInflate)) != null) {
                        i7 = F8.d.titleBar;
                        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                        if (ppTitleBar != null) {
                            i7 = F8.d.tvMessage;
                            TextView textView = (TextView) a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = F8.d.tvTitle;
                                TextView textView2 = (TextView) a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = F8.d.viewInstruction;
                                    LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                                    if (linearLayout != null) {
                                        f fVar = new f((ConstraintLayout) viewInflate, singleAdView, viewStub, ppButton, ppTitleBar, textView, textView2, linearLayout);
                                        this.f26140p = fVar;
                                        return fVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        f fVar = this.f26140p;
        if (fVar != null) {
            return (ViewStub) fVar.f696b;
        }
        return null;
    }
}
