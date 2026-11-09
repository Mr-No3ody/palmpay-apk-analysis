package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.custom_view.ReverseRecyclerView;
import com.transsnet.palmpay.custom_view.StateImageView;
import com.transsnet.palmpay.custom_view.image.RoundImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f729g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f730i;

    public /* synthetic */ i(ViewGroup viewGroup, View view, View view2, ViewGroup viewGroup2, View view3, TextView textView, View view4, int i7) {
        this.f723a = i7;
        this.f724b = viewGroup;
        this.f726d = view;
        this.f727e = view2;
        this.f725c = viewGroup2;
        this.f728f = view3;
        this.f729g = textView;
        this.f730i = view4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f723a) {
            case 0:
                return (ConstraintLayout) this.f724b;
            case 1:
                return (ConstraintLayout) this.f724b;
            case 2:
                return (ConstraintLayout) this.f724b;
            case 3:
                return (ConstraintLayout) this.f724b;
            case 4:
                return (ConstraintLayout) this.f724b;
            case 5:
                return (ConstraintLayout) this.f724b;
            case 6:
                return (ConstraintLayout) this.f724b;
            case 7:
                return (LinearLayout) this.f724b;
            case 8:
                return (ConstraintLayout) this.f724b;
            case 9:
                return (LinearLayout) this.f724b;
            case 10:
                return (ConstraintLayout) this.f724b;
            case 11:
                return (ConstraintLayout) this.f724b;
            case 12:
                return (FrameLayout) this.f724b;
            case 13:
                return (LinearLayout) this.f724b;
            case 14:
                return (ConstraintLayout) this.f724b;
            case 15:
                return (ConstraintLayout) this.f724b;
            case 16:
                return (LinearLayout) this.f724b;
            case 17:
                return (LinearLayout) this.f724b;
            case 18:
                return (ConstraintLayout) this.f724b;
            case 19:
                return (FrameLayout) this.f724b;
            default:
                return (View) this.f730i;
        }
    }

    public /* synthetic */ i(ViewGroup viewGroup, View view, Object obj, View view2, View view3, View view4, View view5, int i7) {
        this.f723a = i7;
        this.f724b = viewGroup;
        this.f726d = view;
        this.f727e = obj;
        this.f728f = view2;
        this.f729g = view3;
        this.f725c = view4;
        this.f730i = view5;
    }

    public /* synthetic */ i(ConstraintLayout constraintLayout, View view, Object obj, Object obj2, Object obj3, TextView textView, TextView textView2, int i7) {
        this.f723a = i7;
        this.f724b = constraintLayout;
        this.f726d = view;
        this.f727e = obj;
        this.f725c = obj2;
        this.f730i = obj3;
        this.f728f = textView;
        this.f729g = textView2;
    }

    public /* synthetic */ i(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, FrameLayout frameLayout2, PpTitleBar ppTitleBar, TextView textView, TextView textView2, int i7) {
        this.f723a = i7;
        this.f724b = constraintLayout;
        this.f726d = frameLayout;
        this.f727e = view;
        this.f730i = frameLayout2;
        this.f725c = ppTitleBar;
        this.f728f = textView;
        this.f729g = textView2;
    }

    public i(ConstraintLayout constraintLayout, SingleAdView singleAdView, View view, TextView textView, PpButton ppButton, TextView textView2, PpButton ppButton2) {
        this.f723a = 8;
        this.f724b = constraintLayout;
        this.f726d = singleAdView;
        this.f730i = view;
        this.f728f = textView;
        this.f727e = ppButton;
        this.f729g = textView2;
        this.f725c = ppButton2;
    }

    public i(ConstraintLayout constraintLayout, PpButton ppButton, ConstraintLayout constraintLayout2, IconicsImageView iconicsImageView, ImageView imageView, TextView textView, TextView textView2) {
        this.f723a = 4;
        this.f724b = constraintLayout;
        this.f726d = ppButton;
        this.f725c = constraintLayout2;
        this.f730i = iconicsImageView;
        this.f727e = imageView;
        this.f728f = textView;
        this.f729g = textView2;
    }

    public i(LinearLayout linearLayout, View view, View view2, View view3, View view4, TextView textView, TextView textView2) {
        this.f723a = 7;
        this.f724b = linearLayout;
        this.f730i = view;
        this.f726d = view2;
        this.f727e = view3;
        this.f725c = view4;
        this.f728f = textView;
        this.f729g = textView2;
    }

    public i(LinearLayout linearLayout, EditText editText, EditText editText2, ModelEnterPhoneNumber1 modelEnterPhoneNumber1, PpTitleBar ppTitleBar, TextView textView, FlexboxLayout flexboxLayout) {
        this.f723a = 17;
        this.f724b = linearLayout;
        this.f726d = editText;
        this.f727e = editText2;
        this.f729g = modelEnterPhoneNumber1;
        this.f725c = ppTitleBar;
        this.f728f = textView;
        this.f730i = flexboxLayout;
    }

    public i(FrameLayout frameLayout, View view, C0107d c0107d, TextView textView, TextView textView2, TextView textView3, OneTimeCodeV5View oneTimeCodeV5View) {
        this.f723a = 12;
        this.f724b = frameLayout;
        this.f730i = view;
        this.f726d = c0107d;
        this.f728f = textView;
        this.f729g = textView2;
        this.f727e = textView3;
        this.f725c = oneTimeCodeV5View;
    }

    public i(LinearLayout linearLayout, TextView textView, ImageView imageView, StateImageView stateImageView, TextView textView2, TextView textView3, ReverseRecyclerView reverseRecyclerView) {
        this.f723a = 16;
        this.f724b = linearLayout;
        this.f728f = textView;
        this.f727e = imageView;
        this.f726d = stateImageView;
        this.f729g = textView2;
        this.f725c = textView3;
        this.f730i = reverseRecyclerView;
    }

    public i(ConstraintLayout constraintLayout, ImageView imageView, C0106c c0106c, RecyclerView recyclerView, AppCompatTextView appCompatTextView, IconicsTextView iconicsTextView, TextView textView) {
        this.f723a = 5;
        this.f724b = constraintLayout;
        this.f727e = imageView;
        this.f726d = c0106c;
        this.f725c = recyclerView;
        this.f729g = appCompatTextView;
        this.f730i = iconicsTextView;
        this.f728f = textView;
    }

    public i(ConstraintLayout constraintLayout, Group group, RoundImageView roundImageView, ImageView imageView, TextView textView, IconicsImageView iconicsImageView, TextView textView2, IconicsTextView iconicsTextView, TextView textView3) {
        this.f723a = 6;
        this.f724b = constraintLayout;
        this.f726d = group;
        this.f725c = roundImageView;
        this.f727e = imageView;
        this.f728f = textView;
        this.f729g = textView2;
        this.f730i = textView3;
    }

    public i(View view, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f723a = 20;
        this.f730i = view;
        this.f727e = imageView;
        this.f724b = imageView2;
        this.f728f = textView;
        this.f729g = textView2;
        this.f726d = textView3;
        this.f725c = textView4;
    }

    public i(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f723a = 18;
        this.f724b = constraintLayout;
        this.f728f = textView;
        this.f729g = textView2;
        this.f726d = textView3;
        this.f727e = textView4;
        this.f725c = textView5;
        this.f730i = textView6;
    }
}
