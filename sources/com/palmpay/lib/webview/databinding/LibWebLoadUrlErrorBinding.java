package com.palmpay.lib.webview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.webview.R;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public final class LibWebLoadUrlErrorBinding implements ViewBinding {

    @NonNull
    public final ImageView errorImg;

    @NonNull
    public final TextView errorMsg;

    @NonNull
    public final TextView errorTips;

    @NonNull
    public final PpButton optBtn;

    @NonNull
    private final LinearLayout rootView;

    private LibWebLoadUrlErrorBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PpButton ppButton) {
        this.rootView = linearLayout;
        this.errorImg = imageView;
        this.errorMsg = textView;
        this.errorTips = textView2;
        this.optBtn = ppButton;
    }

    @NonNull
    public static LibWebLoadUrlErrorBinding bind(@NonNull View view) {
        int i7 = R.id.error_img;
        ImageView imageView = (ImageView) a.m(i7, view);
        if (imageView != null) {
            i7 = R.id.error_msg;
            TextView textView = (TextView) a.m(i7, view);
            if (textView != null) {
                i7 = R.id.error_tips;
                TextView textView2 = (TextView) a.m(i7, view);
                if (textView2 != null) {
                    i7 = R.id.opt_btn;
                    PpButton ppButton = (PpButton) a.m(i7, view);
                    if (ppButton != null) {
                        return new LibWebLoadUrlErrorBinding((LinearLayout) view, imageView, textView, textView2, ppButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static LibWebLoadUrlErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LibWebLoadUrlErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z3) {
        View viewInflate = layoutInflater.inflate(R.layout.lib_web_load_url_error, viewGroup, false);
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
