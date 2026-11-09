package com.flexibank.sdk.cashier.ui.fragment.verify;

import Nc.x;
import R3.e;
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
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckVoucherCodeFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/d;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckVoucherCodeFragment extends FlexiBankBaseVerifyFragment<d> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f22033A = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlexiBankTitleEditView f22034p;
    public PpButton t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f22035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f22036w = new x(this, 29);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckVoucherCodeFragment newInstance() {
            return new FlexiBankCheckVoucherCodeFragment();
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_check_voucher_code_fragment, viewGroup, false);
        int i7 = p.fb_cmf_mobile_item;
        if (((FlexiBankTitleEditView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p.fb_cmf_next_btn;
            if (((PpButton) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = p.fb_cmf_title_area;
                if (((FlexiBankModelPageTitleAreaInPayVerifyPage) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = p.fb_voucher_guide_tv;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        d dVar = new d((RelativeLayout) viewInflate, textView, 0);
                        Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                        return dVar;
                    }
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
        this.f22034p = (FlexiBankTitleEditView) g().findViewById(p.fb_cmf_mobile_item);
        FlexiBankTitleEditView flexiBankTitleEditView = this.f22034p;
        if (flexiBankTitleEditView != null) {
            flexiBankTitleEditView.f22219t0 = new e(this, 0);
        }
        this.t = (PpButton) g().findViewById(p.fb_cmf_next_btn);
        this.f22035v = (TextView) g().findViewById(p.fb_voucher_guide_tv);
        PpButton ppButton = this.t;
        if (ppButton != null) {
            ppButton.setEnabled(false);
        }
        PpButton ppButton2 = this.t;
        x xVar = this.f22036w;
        if (ppButton2 != null) {
            ppButton2.setOnClickListener(xVar);
        }
        TextView textView = this.f22035v;
        if (textView != null) {
            textView.setOnClickListener(xVar);
        }
        return 0;
    }
}
