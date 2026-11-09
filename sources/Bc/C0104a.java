package Bc;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.ui.view.SettingItem;

/* JADX INFO: renamed from: Bc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0104a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f649a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f655g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f657j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f659p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f660v;

    public C0104a(View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f660v = view;
        this.f652d = imageView;
        this.f653e = imageView2;
        this.f654f = imageView3;
        this.f655g = imageView4;
        this.f656i = imageView5;
        this.f657j = imageView6;
        this.f658o = textView;
        this.f659p = textView2;
        this.t = textView3;
        this.f650b = textView4;
        this.f651c = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f649a) {
            case 0:
                return (LinearLayout) this.f652d;
            case 1:
                return (ConstraintLayout) this.f650b;
            case 2:
                return (ConstraintLayout) this.f650b;
            case 3:
                return (ConstraintLayout) this.f650b;
            case 4:
                return (ConstraintLayout) this.f650b;
            case 5:
                return this.f660v;
            default:
                return this.f660v;
        }
    }

    public C0104a(View view, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f660v = view;
        this.f652d = imageView;
        this.f653e = imageView2;
        this.f658o = textView;
        this.f659p = textView2;
        this.t = textView3;
        this.f654f = textView4;
        this.f655g = textView5;
        this.f656i = textView6;
        this.f657j = textView7;
        this.f650b = textView8;
        this.f651c = textView9;
    }

    public C0104a(ConstraintLayout constraintLayout, SingleAdView singleAdView, Pb.a aVar, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpFormVertical ppFormVertical3, PpFormVertical ppFormVertical4, NestedScrollView nestedScrollView, PpButton ppButton, TextView textView, TextView textView2, TextView textView3) {
        this.f650b = constraintLayout;
        this.f652d = singleAdView;
        this.f653e = aVar;
        this.f654f = ppFormVertical;
        this.f655g = ppFormVertical2;
        this.f656i = ppFormVertical3;
        this.f657j = ppFormVertical4;
        this.f651c = nestedScrollView;
        this.f660v = ppButton;
        this.f658o = textView;
        this.f659p = textView2;
        this.t = textView3;
    }

    public C0104a(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, AppCompatTextView appCompatTextView) {
        this.f650b = constraintLayout;
        this.f652d = imageView;
        this.f653e = imageView2;
        this.f654f = constraintLayout2;
        this.f658o = textView;
        this.f659p = textView2;
        this.t = textView3;
        this.f655g = textView4;
        this.f656i = textView5;
        this.f657j = textView6;
        this.f651c = textView7;
        this.f660v = appCompatTextView;
    }

    public C0104a(LinearLayout linearLayout, SettingItem settingItem, ConstraintLayout constraintLayout, SettingItem settingItem2, SettingItem settingItem3, SettingItem settingItem4, TextView textView, PpTitleBar ppTitleBar, TextView textView2, TextView textView3, View view, LinearLayout linearLayout2) {
        this.f652d = linearLayout;
        this.f654f = settingItem;
        this.f650b = constraintLayout;
        this.f655g = settingItem2;
        this.f656i = settingItem3;
        this.f657j = settingItem4;
        this.f658o = textView;
        this.f651c = ppTitleBar;
        this.f659p = textView2;
        this.t = textView3;
        this.f660v = view;
        this.f653e = linearLayout2;
    }

    public C0104a(ConstraintLayout constraintLayout, SingleAdView singleAdView, SingleAdView singleAdView2, SingleAdView singleAdView3, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, CardView cardView, PpTitleBar ppTitleBar, IconicsTextView iconicsTextView, IconicsTextView iconicsTextView2, PpButton ppButton) {
        this.f650b = constraintLayout;
        this.f652d = singleAdView;
        this.f653e = singleAdView2;
        this.f654f = singleAdView3;
        this.f655g = viewStub;
        this.f656i = viewStub2;
        this.f657j = viewStub3;
        this.f658o = cardView;
        this.f651c = ppTitleBar;
        this.f659p = iconicsTextView;
        this.t = iconicsTextView2;
        this.f660v = ppButton;
    }

    public C0104a(ConstraintLayout constraintLayout, Group group, AppCompatImageView appCompatImageView, IconicsImageView iconicsImageView, ImageView imageView, Group group2, TextView textView, TextView textView2, TextView textView3, TextView textView4, IconicsTextView iconicsTextView, TextView textView5) {
        this.f650b = constraintLayout;
        this.f652d = group;
        this.f653e = appCompatImageView;
        this.f654f = iconicsImageView;
        this.f655g = imageView;
        this.f656i = group2;
        this.f658o = textView;
        this.f659p = textView2;
        this.t = textView3;
        this.f657j = textView4;
        this.f651c = iconicsTextView;
        this.f660v = textView5;
    }
}
