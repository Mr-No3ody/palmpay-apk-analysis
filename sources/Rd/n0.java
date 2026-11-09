package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.teller.ui.view.SideBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f8417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f8418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bc.p f8420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bc.k f8421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SideBarView f8422g;

    public n0(ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView, TextView textView, Bc.p pVar, Bc.k kVar, SideBarView sideBarView) {
        this.f8416a = constraintLayout;
        this.f8417b = recyclerView;
        this.f8418c = iconicsImageView;
        this.f8419d = textView;
        this.f8420e = pVar;
        this.f8421f = kVar;
        this.f8422g = sideBarView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8416a;
    }
}
