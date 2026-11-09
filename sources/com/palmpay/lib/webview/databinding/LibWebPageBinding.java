package com.palmpay.lib.webview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.palmpay.lib.webview.R;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public final class LibWebPageBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llContainer;

    @NonNull
    public final PpTitleBar ppTitleBar;

    @NonNull
    public final FrameLayout ppTitleContainer;

    @NonNull
    private final LinearLayout rootView;

    private LibWebPageBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull PpTitleBar ppTitleBar, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.llContainer = linearLayout2;
        this.ppTitleBar = ppTitleBar;
        this.ppTitleContainer = frameLayout;
    }

    @NonNull
    public static LibWebPageBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i7 = R.id.pp_title_bar;
        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, view);
        if (ppTitleBar != null) {
            i7 = R.id.pp_title_container;
            FrameLayout frameLayout = (FrameLayout) a.m(i7, view);
            if (frameLayout != null) {
                return new LibWebPageBinding(linearLayout, linearLayout, ppTitleBar, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static LibWebPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LibWebPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z3) {
        View viewInflate = layoutInflater.inflate(R.layout.lib_web_page, viewGroup, false);
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
