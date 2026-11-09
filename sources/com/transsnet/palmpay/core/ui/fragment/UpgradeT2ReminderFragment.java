package com.transsnet.palmpay.core.ui.fragment;

import Pa.r0;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/UpgradeT2ReminderFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeT2ReminderFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f27871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f27872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f27873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27874d;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p025ba.g.core_fragment_upgrade_t2_reminder, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.f27871a = (TextView) viewInflate.findViewById(p025ba.e.tvLine1);
        this.f27872b = (TextView) viewInflate.findViewById(p025ba.e.tvLine2);
        this.f27873c = viewInflate.findViewById(p025ba.e.tvUpgrade);
        this.f27874d = (TextView) viewInflate.findViewById(p025ba.e.tvIgnore);
        View view = this.f27873c;
        if (view != null) {
            final int i7 = 0;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.fragment.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeT2ReminderFragment f27924b;

                {
                    this.f27924b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i7) {
                        case 0:
                            if (BaseApplication.isNG()) {
                                com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                            }
                            E activity = this.f27924b.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        default:
                            this.f27924b.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        TextView textView = this.f27874d;
        if (textView != null) {
            final int i10 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.fragment.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeT2ReminderFragment f27924b;

                {
                    this.f27924b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            if (BaseApplication.isNG()) {
                                com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                            }
                            E activity = this.f27924b.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        default:
                            this.f27924b.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        TextView textView2 = this.f27871a;
        if (textView2 != null) {
            String string = getString(k.core_msg_exceeded_daily_limit, r0.C(r0.n0(((long) getResources().getInteger(p025ba.f.core_ng_t1_daily_trans_limit)) * 100), false));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            textView2.setText(string);
        }
        TextView textView3 = this.f27872b;
        if (textView3 != null) {
            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(getString(k.core_msg_upgrade_limit_1)).append(" ").append(getString(k.core_tier2)).setForegroundColor(getResources().getColor(L6.b.ppColorPrimary)).append(" ").append(getString(k.core_msg_upgrade_limit_2)).append(" ").append(r0.C(r0.n0(((long) getResources().getInteger(p025ba.f.core_ng_t2_daily_trans_limit)) * 100), false)).setForegroundColor(getResources().getColor(L6.b.ppColorPrimary)).create();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
            textView3.setText(spannableStringBuilderCreate);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.e(dialog);
        Window window = dialog.getWindow();
        Intrinsics.e(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (ScreenUtils.getScreenWidth() * 0.916f);
        window.setAttributes(attributes);
    }
}
