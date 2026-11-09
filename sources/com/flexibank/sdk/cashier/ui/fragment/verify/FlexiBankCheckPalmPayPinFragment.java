package com.flexibank.sdk.cashier.ui.fragment.verify;

import N6.e;
import N8.C0457a;
import N8.q0;
import Nc.x;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.core.viewmodel.FlexiBankKeyboardGridLayout;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelItemFee;
import com.flexibank.sdk.customview.FlexiBankPinEntryView;
import com.flexibank.sdk.n;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckPalmPayPinFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "LN6/e;", "Lcom/flexibank/sdk/core/viewmodel/FlexiBankKeyboardGridLayout$NumKeyboardClickListener;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckPalmPayPinFragment extends FlexiBankBaseVerifyFragment<e> implements FlexiBankKeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f22024C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f22025A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f22026B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f22027p;
    public FlexiBankPinEntryView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FlexiBankKeyboardGridLayout f22028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f22029w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckPalmPayPinFragment newInstance(@NotNull O3.e req) {
            Intrinsics.checkNotNullParameter(req, "req");
            FlexiBankCheckPalmPayPinFragment flexiBankCheckPalmPayPinFragment = new FlexiBankCheckPalmPayPinFragment();
            Bundle bundle = new Bundle();
            bundle.putString("_order_no", req.getOrderNo());
            bundle.putLong("payAmount", req.getPayAmount());
            bundle.putLong("orderAmount", req.getOrderAmount());
            bundle.putLong("feeAmount", req.getFeeAmount());
            bundle.putString("transType", req.getTransType());
            flexiBankCheckPalmPayPinFragment.setArguments(bundle);
            return flexiBankCheckPalmPayPinFragment;
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_fragment_check_palm_pay_pin, viewGroup, false);
        int i7 = p.fb_ivClose;
        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p.fb_paymentInfoContainer;
            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = p.fb_pinView;
                if (((FlexiBankPinEntryView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = p.fb_tvAmount;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = p.fb_viewContainer;
                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            e eVar = new e((ConstraintLayout) viewInflate, textView, 3);
                            Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
                            return eVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        HashMap map;
        FlexiBankPayVerificationActivity flexiBankPayVerificationActivityN = n();
        if (flexiBankPayVerificationActivityN != null && (map = flexiBankPayVerificationActivityN.f21976L) != null) {
            for (Object obj : map.keySet()) {
                Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                String str = (String) obj;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                FlexiBankModelItemFee flexiBankModelItemFee = new FlexiBankModelItemFee(contextRequireContext2, null, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, contextRequireContext.getResources().getDimensionPixelSize(n.fb_preview_item_height));
                LinearLayout linearLayout = this.f22026B;
                if (linearLayout != null) {
                    linearLayout.addView(flexiBankModelItemFee, 0, layoutParams);
                }
                CharSequence charSequence = (CharSequence) map.get(str);
                TextView textView = flexiBankModelItemFee.mTitleTv;
                Intrinsics.e(textView);
                textView.setText(str);
                flexiBankModelItemFee.setContent(charSequence);
            }
        }
        TextView textView2 = this.f22027p;
        if (textView2 != null) {
            textView2.setText(p118hf.a.t(this.f22029w, false));
        }
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
        FlexiBankPinEntryView flexiBankPinEntryView = this.t;
        if (flexiBankPinEntryView != null) {
            flexiBankPinEntryView.setEnabled(false);
        }
        FlexiBankPinEntryView flexiBankPinEntryView2 = this.t;
        if (flexiBankPinEntryView2 != null) {
            flexiBankPinEntryView2.setOnPinEnteredListener(new C0457a(this, 14));
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        this.f22028v = (FlexiBankKeyboardGridLayout) g().findViewById(p.fb_number_keyboard_content);
        this.t = (FlexiBankPinEntryView) g().findViewById(p.fb_pinView);
        this.f22026B = (LinearLayout) g().findViewById(p.fb_paymentInfoContainer);
        this.f22027p = (TextView) g().findViewById(p.fb_tvAmount);
        g().findViewById(p.fb_ivClose).setOnClickListener(new x(this, 28));
        FlexiBankKeyboardGridLayout flexiBankKeyboardGridLayout = this.f22028v;
        if (flexiBankKeyboardGridLayout == null) {
            return 0;
        }
        flexiBankKeyboardGridLayout.setNumKeyboardClickListener(this);
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("_order_no");
            this.f22025A = arguments.getString("transType");
            this.f22029w = arguments.getLong("payAmount");
            arguments.getLong("orderAmount");
            arguments.getLong("feeAmount");
        }
    }

    @Override // com.flexibank.sdk.core.viewmodel.FlexiBankKeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        FlexiBankPinEntryView flexiBankPinEntryView;
        FlexiBankPinEntryView flexiBankPinEntryView2 = this.t;
        String strValueOf = String.valueOf(flexiBankPinEntryView2 != null ? flexiBankPinEntryView2.getText() : null);
        if (TextUtils.isEmpty(strValueOf) || (flexiBankPinEntryView = this.t) == null) {
            return;
        }
        String strSubstring = strValueOf.substring(0, strValueOf.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        flexiBankPinEntryView.setText((Editable) new SpannableStringBuilder(strSubstring));
    }

    @Override // com.flexibank.sdk.core.viewmodel.FlexiBankKeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String str) {
        FlexiBankPinEntryView flexiBankPinEntryView;
        FlexiBankPinEntryView flexiBankPinEntryView2 = this.t;
        String strValueOf = String.valueOf(flexiBankPinEntryView2 != null ? flexiBankPinEntryView2.getText() : null);
        if (strValueOf.length() <= 4 && (flexiBankPinEntryView = this.t) != null) {
            flexiBankPinEntryView.setText((Editable) new SpannableStringBuilder(q0.j(strValueOf, str)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }
}
