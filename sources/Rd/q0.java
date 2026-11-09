package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f8456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.p f8457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f8458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8459e;

    public q0(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, Bc.p pVar, RecyclerView recyclerView, TextView textView) {
        this.f8455a = constraintLayout;
        this.f8456b = iconicsImageView;
        this.f8457c = pVar;
        this.f8458d = recyclerView;
        this.f8459e = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8455a;
    }
}
