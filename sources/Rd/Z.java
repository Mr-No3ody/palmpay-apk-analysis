package Rd;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f8188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f8190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f8192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8193g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f8194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f8195j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FrameLayout f8196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8197p;
    public final FrameLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WheelView f8198v;

    public Z(ConstraintLayout constraintLayout, TextView textView, TextView textView2, IconicsImageView iconicsImageView, TextView textView3, RecyclerView recyclerView, TextView textView4, View view, View view2, FrameLayout frameLayout, TextView textView5, FrameLayout frameLayout2, WheelView wheelView) {
        this.f8187a = constraintLayout;
        this.f8188b = textView;
        this.f8189c = textView2;
        this.f8190d = iconicsImageView;
        this.f8191e = textView3;
        this.f8192f = recyclerView;
        this.f8193g = textView4;
        this.f8194i = view;
        this.f8195j = view2;
        this.f8196o = frameLayout;
        this.f8197p = textView5;
        this.t = frameLayout2;
        this.f8198v = wheelView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8187a;
    }
}
