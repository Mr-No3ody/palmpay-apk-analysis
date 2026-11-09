package com.flexibank.sdk.cashier.ui.fragment.verify;

import N8.C0457a;
import Nc.x;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelDayPick;
import com.flexibank.sdk.customview.model.FlexiBankTitleTextView1;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p033c4.b;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckBirthdayFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/d;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckBirthdayFragment extends FlexiBankBaseVerifyFragment<d> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f22010H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f22011A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f22012B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f22013C = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlexiBankTitleTextView1 f22014p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f22015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PpButton f22016w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckBirthdayFragment newInstance(int i7, @Nullable String str) {
            FlexiBankCheckBirthdayFragment flexiBankCheckBirthdayFragment = new FlexiBankCheckBirthdayFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_type", i7);
            bundle.putString("extra_message", str);
            flexiBankCheckBirthdayFragment.setArguments(bundle);
            return flexiBankCheckBirthdayFragment;
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_fragment_confirm_birthday, viewGroup, false);
        int i7 = p.fb_acb_birthday_item;
        if (((FlexiBankTitleTextView1) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p.fb_acb_next_btn;
            if (((PpButton) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = p.fb_tvError;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    d dVar = new d((RelativeLayout) viewInflate, textView, 1);
                    Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                    return dVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        if (!TextUtils.isEmpty(this.f22012B)) {
            TextView textView = this.t;
            if (textView != null) {
                textView.setText(this.f22012B);
            }
            TextView textView2 = this.t;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22013C = arguments.getInt("extra_type");
            this.f22012B = arguments.getString("extra_message");
        }
        this.t = (TextView) g().findViewById(p.fb_tvError);
        this.f22016w = (PpButton) g().findViewById(p.fb_acb_next_btn);
        this.f22014p = (FlexiBankTitleTextView1) g().findViewById(p.fb_acb_birthday_item);
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b(context, 0, 6, 0);
        this.f22015v = bVar;
        bVar.f18856f = true;
        FlexiBankModelDayPick flexiBankModelDayPick = bVar.f18855e;
        if (flexiBankModelDayPick != null) {
            flexiBankModelDayPick.getMConfirmBtn().setVisibility(bVar.f18856f ? 0 : 8);
        }
        b bVar2 = this.f22015v;
        if (bVar2 != null) {
            bVar2.setOnDismissListener(new Dd.b(this, 9));
        }
        PpButton ppButton = this.f22016w;
        if (ppButton != null) {
            ppButton.setOnClickListener(new x(this, 24));
        }
        FlexiBankTitleTextView1 flexiBankTitleTextView1 = this.f22014p;
        if (flexiBankTitleTextView1 != null) {
            flexiBankTitleTextView1.setCallback(new C0457a(this, 12));
        }
        return 0;
    }
}
