package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f8150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f8153e;

    public T(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout2) {
        this.f8149a = constraintLayout;
        this.f8150b = iconicsImageView;
        this.f8151c = recyclerView;
        this.f8152d = textView;
        this.f8153e = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8149a;
    }
}
