package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.i;
import N8.q0;
import Nc.x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPageTitleAreaInPayVerifyPage;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckMobileFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lq9/a;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckMobileFragment extends FlexiBankBaseVerifyFragment<p251q9.a> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f22018B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final x f22019A = new x(this, 26);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlexiBankModelPageTitleAreaInPayVerifyPage f22020p;
    public FlexiBankTitleEditView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpButton f22021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f22022w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckMobileFragment newInstance(@Nullable String str) {
            FlexiBankCheckMobileFragment flexiBankCheckMobileFragment = new FlexiBankCheckMobileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("card_no", str);
            flexiBankCheckMobileFragment.setArguments(bundle);
            return flexiBankCheckMobileFragment;
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_check_mobile_fragment, viewGroup, false);
        int i7 = p.fb_cmf_mobile_item;
        if (((FlexiBankTitleEditView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p.fb_cmf_next_btn;
            if (((PpButton) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = p.fb_cmf_title_area;
                if (((FlexiBankModelPageTitleAreaInPayVerifyPage) p059e1.a.m(i7, viewInflate)) != null) {
                    p251q9.a aVar = new p251q9.a((RelativeLayout) viewInflate);
                    Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    return aVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        FlexiBankModelPageTitleAreaInPayVerifyPage flexiBankModelPageTitleAreaInPayVerifyPage;
        TextView mContentTv;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22022w = arguments.getString("card_no");
        }
        this.t = (FlexiBankTitleEditView) g().findViewById(p.fb_cmf_mobile_item);
        this.f22020p = (FlexiBankModelPageTitleAreaInPayVerifyPage) g().findViewById(p.fb_cmf_title_area);
        if (!TextUtils.isEmpty(this.f22022w) && (flexiBankModelPageTitleAreaInPayVerifyPage = this.f22020p) != null && (mContentTv = flexiBankModelPageTitleAreaInPayVerifyPage.getMContentTv()) != null) {
            int i7 = r.fb_confirm_mobile_format;
            String accountId = this.f22022w;
            String strK = "";
            if (accountId == null) {
                accountId = "";
            }
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            if (!TextUtils.isEmpty(accountId)) {
                if (accountId.length() > 4) {
                    accountId = accountId.substring(accountId.length() - 4, accountId.length());
                    Intrinsics.checkNotNullExpressionValue(accountId, "substring(...)");
                }
                strK = q0.k("(**** ", accountId, ")");
            }
            mContentTv.setText(getString(i7, strK));
        }
        FlexiBankTitleEditView flexiBankTitleEditView = this.t;
        if (flexiBankTitleEditView != null) {
            flexiBankTitleEditView.f22219t0 = new i(this, 28);
        }
        PpButton ppButton = (PpButton) g().findViewById(p.fb_cmf_next_btn);
        this.f22021v = ppButton;
        if (ppButton != null) {
            ppButton.setEnabled(false);
        }
        PpButton ppButton2 = this.f22021v;
        if (ppButton2 != null) {
            ppButton2.setOnClickListener(this.f22019A);
        }
        return 0;
    }
}
