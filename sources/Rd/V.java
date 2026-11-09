package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f8162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8164d;

    public V(TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView) {
        this.f8161a = constraintLayout;
        this.f8162b = iconicsImageView;
        this.f8163c = recyclerView;
        this.f8164d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8161a;
    }
}
