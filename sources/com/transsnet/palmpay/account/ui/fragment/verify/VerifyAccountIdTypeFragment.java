package com.transsnet.palmpay.account.ui.fragment.verify;

import Bc.p;
import F8.d;
import F8.e;
import L6.b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import Yd.i;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethodRsp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountIdTypeFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerifyAccountIdTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyAccountIdTypeFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountIdTypeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1869#2,2:113\n*S KotlinDebug\n*F\n+ 1 VerifyAccountIdTypeFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountIdTypeFragment\n*L\n44#1:113,2\n*E\n"})
public final class VerifyAccountIdTypeFragment extends BaseVerifyAccountFragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f26313o;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        p pVar = this.f26313o;
        if (pVar == null) {
            return 0;
        }
        PpTitleBar ppTitleBar = (PpTitleBar) pVar.f813d;
        ppTitleBar.setBackButtonClickListener(new i(this, 10));
        ppTitleBar.setRightText("");
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_id_type, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i7 = d.titleBar;
        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
        if (ppTitleBar == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        p pVar = new p(linearLayout, linearLayout, ppTitleBar, 11);
        this.f26313o = pVar;
        return pVar;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        List<SecurityVerifyMethod> list;
        List<SecurityVerifyMethod> list2;
        LinearLayout linearLayout;
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            C0525w c0525wF = C0525w.f();
            String string = arguments.getString("extra_data");
            c0525wF.getClass();
            SecurityVerifyMethodRsp securityVerifyMethodRsp = (SecurityVerifyMethodRsp) C0525w.d(string, SecurityVerifyMethodRsp.class);
            if (securityVerifyMethodRsp != null && (list = securityVerifyMethodRsp.verifyMethodList) != null && (!list.isEmpty()) && (list2 = securityVerifyMethodRsp.verifyMethodList) != null) {
                for (SecurityVerifyMethod securityVerifyMethod : list2) {
                    Intrinsics.e(securityVerifyMethod);
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                    int i7 = e.ac_layout_security_verify_method_item;
                    p pVar = this.f26313o;
                    View viewInflate = layoutInflaterFrom.inflate(i7, (ViewGroup) (pVar != null ? (LinearLayout) pVar.f812c : null), false);
                    if (viewInflate != null) {
                        ImageView imageView = (ImageView) viewInflate.findViewById(d.ivIcon1);
                        TextView textView = (TextView) viewInflate.findViewById(d.tvName1);
                        TextView textView2 = (TextView) viewInflate.findViewById(d.tvLine1);
                        r0.l1(C0525w.j(securityVerifyMethod.extendInfo, "icon"), imageView);
                        String strJ = C0525w.j(securityVerifyMethod.extendInfo, "name");
                        String strJ2 = C0525w.j(securityVerifyMethod.extendInfo, "suffix");
                        if (securityVerifyMethod.verifyMethod == 9 && !TextUtils.isEmpty(strJ2)) {
                            textView.setText(new SpanUtils().append(strJ).append(" (").append(String.valueOf(i0.R(strJ2))).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, viewInflate.getContext())).append(")").create());
                        } else if (securityVerifyMethod.verifyMethod != 2 || TextUtils.isEmpty(strJ2)) {
                            textView.setText(strJ);
                        } else {
                            textView.setText(new SpanUtils().append(strJ).append(" (").append(String.valueOf(r0.E0(strJ2))).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, viewInflate.getContext())).append(")").create());
                        }
                        textView2.setText(C0525w.j(securityVerifyMethod.extendInfo, "msg"));
                        viewInflate.setOnClickListener(new p010a9.b(4, this, securityVerifyMethod));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.topMargin = CommonViewExtKt.getDp(12.0f);
                        layoutParams.leftMargin = CommonViewExtKt.getDp(16.0f);
                        layoutParams.rightMargin = CommonViewExtKt.getDp(16.0f);
                        p pVar2 = this.f26313o;
                        if (pVar2 != null && (linearLayout = (LinearLayout) pVar2.f812c) != null) {
                            linearLayout.addView(viewInflate, layoutParams);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
