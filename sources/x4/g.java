package x4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f43601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatEditText f43602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f43603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsImageView f43604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43606g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f43607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f43608j;

    public g(LinearLayout linearLayout, PpButton ppButton, AppCompatEditText appCompatEditText, ImageView imageView, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f43600a = linearLayout;
        this.f43601b = ppButton;
        this.f43602c = appCompatEditText;
        this.f43603d = imageView;
        this.f43604e = iconicsImageView;
        this.f43605f = textView;
        this.f43606g = textView2;
        this.f43607i = textView3;
        this.f43608j = textView4;
    }

    public static g a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(q.fb_fragment_check_bank_otp, viewGroup, false);
        int i7 = p.fb_buttonNext;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = p.fb_editCardOtp;
            AppCompatEditText appCompatEditText = (AppCompatEditText) p059e1.a.m(i7, viewInflate);
            if (appCompatEditText != null) {
                i7 = p.fb_ivBank;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = p.fb_ivClose;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                    if (iconicsImageView != null) {
                        i7 = p.fb_tvBankName;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = p.fb_tvCountDown;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = p.fb_tvMsg;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = p.fb_tvTitle;
                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        return new g((LinearLayout) viewInflate, ppButton, appCompatEditText, imageView, iconicsImageView, textView, textView2, textView3, textView4);
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

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43600a;
    }
}
