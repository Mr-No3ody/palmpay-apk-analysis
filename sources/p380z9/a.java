package p380z9;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f44508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f44509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f44510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f44511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f44512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f44513g;

    public a(ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f44507a = constraintLayout;
        this.f44508b = recyclerView;
        this.f44509c = iconicsImageView;
        this.f44510d = textView;
        this.f44511e = textView2;
        this.f44512f = textView3;
        this.f44513g = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f44507a;
    }
}
