package Bc;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.send_money.ui.view.ClipboardAccountPromptView;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f614A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f621g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f623j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f625p;
    public final View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f626v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f627w;

    public D(ConstraintLayout constraintLayout, PpButton ppButton, AppCompatCheckBox appCompatCheckBox, Group group, ImageView imageView, ImageView imageView2, AppCompatSeekBar appCompatSeekBar, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f624o = constraintLayout;
        this.f625p = ppButton;
        this.t = appCompatCheckBox;
        this.f618d = group;
        this.f616b = imageView;
        this.f617c = imageView2;
        this.f626v = appCompatSeekBar;
        this.f627w = ppTitleBar;
        this.f619e = textView;
        this.f620f = textView2;
        this.f621g = textView3;
        this.f622i = textView4;
        this.f623j = textView5;
        this.f614A = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f615a) {
            case 0:
                return this.f624o;
            case 1:
                return (ConstraintLayout) this.f624o;
            case 2:
                return (ConstraintLayout) this.f624o;
            case 3:
                return (FrameLayout) this.f625p;
            case 4:
                return (ConstraintLayout) this.f624o;
            default:
                return (ConstraintLayout) this.f624o;
        }
    }

    public D(ConstraintLayout constraintLayout, ViewStub viewStub, PpButton ppButton, PpButton ppButton2, ImageView imageView, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout2) {
        this.f624o = constraintLayout;
        this.f625p = viewStub;
        this.f617c = ppButton;
        this.t = ppButton2;
        this.f616b = imageView;
        this.f626v = ppTitleBar;
        this.f619e = textView;
        this.f620f = textView2;
        this.f621g = textView3;
        this.f622i = textView4;
        this.f623j = textView5;
        this.f618d = linearLayout;
        this.f627w = constraintLayout2;
        this.f614A = linearLayout2;
    }

    public D(View view, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, AVLoadingIndicatorView aVLoadingIndicatorView, RecyclerView recyclerView, RecyclerView recyclerView2, ModelPremiumScrollNotice modelPremiumScrollNotice, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2) {
        this.f624o = view;
        this.f619e = textView;
        this.f616b = imageView;
        this.f617c = imageView2;
        this.t = imageView3;
        this.f618d = linearLayout;
        this.f626v = aVLoadingIndicatorView;
        this.f627w = recyclerView2;
        this.f614A = modelPremiumScrollNotice;
        this.f620f = textView2;
        this.f621g = textView3;
        this.f622i = textView4;
        this.f623j = textView5;
        this.f625p = view2;
    }

    public D(FrameLayout frameLayout, PpButton ppButton, PpFormVertical ppFormVertical, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, C0107d c0107d, PinEntryView pinEntryView, PinEntryView pinEntryView2, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f625p = frameLayout;
        this.f616b = ppButton;
        this.f617c = ppFormVertical;
        this.t = iconicsImageView;
        this.f618d = iconicsImageView2;
        this.f626v = c0107d;
        this.f627w = pinEntryView;
        this.f614A = pinEntryView2;
        this.f624o = view;
        this.f619e = textView;
        this.f620f = textView2;
        this.f621g = textView3;
        this.f622i = textView4;
        this.f623j = textView5;
    }

    public D(ConstraintLayout constraintLayout, PpButton ppButton, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f624o = constraintLayout;
        this.f625p = ppButton;
        this.t = constraintLayout2;
        this.f616b = imageView;
        this.f617c = imageView2;
        this.f618d = linearLayout;
        this.f626v = ppTitleBar;
        this.f619e = textView;
        this.f620f = textView2;
        this.f621g = textView3;
        this.f622i = textView4;
        this.f623j = textView5;
        this.f627w = textView6;
        this.f614A = textView7;
    }

    public D(ConstraintLayout constraintLayout, ClipboardAccountPromptView clipboardAccountPromptView, CustomAutoCompleteTextView customAutoCompleteTextView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ModelErrorDivider modelErrorDivider, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f624o = constraintLayout;
        this.f625p = clipboardAccountPromptView;
        this.f616b = customAutoCompleteTextView;
        this.f618d = linearLayout;
        this.f617c = linearLayout2;
        this.t = linearLayout3;
        this.f626v = linearLayout4;
        this.f614A = modelErrorDivider;
        this.f627w = recyclerView;
        this.f619e = textView;
        this.f620f = textView2;
        this.f621g = textView3;
        this.f622i = textView4;
        this.f623j = textView5;
    }
}
