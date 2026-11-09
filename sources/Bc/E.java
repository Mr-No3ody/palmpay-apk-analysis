package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.send_money.ui.view.ClipboardAccountPromptView;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f628A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f629B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ViewGroup f630C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ViewGroup f631H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ViewGroup f632L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ViewGroup f633M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ViewGroup f634Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ViewGroup f635X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f636a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f642g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f644j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f646p;
    public final ViewGroup t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f648w;

    public E(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, RecyclerView recyclerView, ConstraintLayout constraintLayout3, TextView textView, ImageTextView imageTextView, ImageTextView imageTextView2, TextView textView2, TextView textView3, PpButton ppButton, ImageTextView imageTextView3, TextView textView4, ImageTextView imageTextView4, TextView textView5, TextView textView6, FrameLayout frameLayout) {
        this.f639d = constraintLayout;
        this.t = constraintLayout2;
        this.f637b = imageView;
        this.f638c = imageView2;
        this.f648w = imageView3;
        this.f628A = imageView4;
        this.f629B = imageView5;
        this.f640e = recyclerView;
        this.f647v = constraintLayout3;
        this.f641f = textView;
        this.f630C = imageTextView;
        this.f631H = imageTextView2;
        this.f642g = textView2;
        this.f643i = textView3;
        this.f634Q = ppButton;
        this.f632L = imageTextView3;
        this.f644j = textView4;
        this.f633M = imageTextView4;
        this.f645o = textView5;
        this.f646p = textView6;
        this.f635X = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f636a) {
            case 0:
                return this.f639d;
            default:
                return (LinearLayout) this.t;
        }
    }

    public E(LinearLayout linearLayout, ImageView imageView, ClipboardAccountPromptView clipboardAccountPromptView, CustomAutoCompleteTextView customAutoCompleteTextView, Group group, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ModelErrorDivider modelErrorDivider, ModelErrorDivider modelErrorDivider2, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.t = linearLayout;
        this.f637b = imageView;
        this.f647v = clipboardAccountPromptView;
        this.f648w = customAutoCompleteTextView;
        this.f628A = group;
        this.f638c = imageView2;
        this.f629B = linearLayout2;
        this.f630C = linearLayout3;
        this.f631H = linearLayout4;
        this.f632L = linearLayout5;
        this.f633M = modelErrorDivider;
        this.f634Q = modelErrorDivider2;
        this.f639d = constraintLayout;
        this.f640e = recyclerView;
        this.f635X = recyclerView2;
        this.f641f = textView;
        this.f642g = textView2;
        this.f643i = textView3;
        this.f644j = textView4;
        this.f645o = textView5;
        this.f646p = textView6;
    }
}
