package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.teller.ui.view.SideBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f8446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.p f8448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SideBarView f8449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f8450f;

    public p0(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, TextView textView, Bc.p pVar, SideBarView sideBarView, ConstraintLayout constraintLayout2) {
        this.f8445a = constraintLayout;
        this.f8446b = iconicsImageView;
        this.f8447c = textView;
        this.f8448d = pVar;
        this.f8449e = sideBarView;
        this.f8450f = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8445a;
    }
}
