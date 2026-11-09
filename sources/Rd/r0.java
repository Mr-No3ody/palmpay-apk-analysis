package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.teller.ui.view.SideBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.p f8464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.k f8465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SideBarView f8466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f8467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8469g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f8471j;

    public r0(LinearLayout linearLayout, IconicsImageView iconicsImageView, Bc.p pVar, Bc.k kVar, SideBarView sideBarView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout3) {
        this.f8463a = linearLayout;
        this.f8464b = pVar;
        this.f8465c = kVar;
        this.f8466d = sideBarView;
        this.f8467e = linearLayout2;
        this.f8468f = textView;
        this.f8469g = textView2;
        this.f8470i = textView3;
        this.f8471j = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8463a;
    }
}
