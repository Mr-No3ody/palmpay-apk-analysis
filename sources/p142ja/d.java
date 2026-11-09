package p142ja;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f38460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f38461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f38462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38463d;

    public d(LinearLayout linearLayout, IconicsImageView iconicsImageView, RecyclerView recyclerView, TextView textView) {
        this.f38460a = linearLayout;
        this.f38461b = iconicsImageView;
        this.f38462c = recyclerView;
        this.f38463d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38460a;
    }
}
