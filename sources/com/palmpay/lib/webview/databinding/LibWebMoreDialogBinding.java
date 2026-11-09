package com.palmpay.lib.webview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.webview.R;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public final class LibWebMoreDialogBinding implements ViewBinding {

    @NonNull
    public final PpButton cancelBtn;

    @NonNull
    public final TextView copyBtn;

    @NonNull
    public final TextView openBrowserBtn;

    @NonNull
    public final TextView refreshBtn;

    @NonNull
    private final LinearLayout rootView;

    private LibWebMoreDialogBinding(@NonNull LinearLayout linearLayout, @NonNull PpButton ppButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.cancelBtn = ppButton;
        this.copyBtn = textView;
        this.openBrowserBtn = textView2;
        this.refreshBtn = textView3;
    }

    @NonNull
    public static LibWebMoreDialogBinding bind(@NonNull View view) {
        int i7 = R.id.cancel_btn;
        PpButton ppButton = (PpButton) a.m(i7, view);
        if (ppButton != null) {
            i7 = R.id.copy_btn;
            TextView textView = (TextView) a.m(i7, view);
            if (textView != null) {
                i7 = R.id.open_browser_btn;
                TextView textView2 = (TextView) a.m(i7, view);
                if (textView2 != null) {
                    i7 = R.id.refresh_btn;
                    TextView textView3 = (TextView) a.m(i7, view);
                    if (textView3 != null) {
                        return new LibWebMoreDialogBinding((LinearLayout) view, ppButton, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static LibWebMoreDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LibWebMoreDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z3) {
        View viewInflate = layoutInflater.inflate(R.layout.lib_web_more_dialog, viewGroup, false);
        if (z3) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
