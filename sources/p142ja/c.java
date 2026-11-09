package p142ja;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f38455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f38456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f38457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f38458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38459e;

    public c(LinearLayout linearLayout, PpButton ppButton, IconicsImageView iconicsImageView, RecyclerView recyclerView, TextView textView) {
        this.f38455a = linearLayout;
        this.f38456b = ppButton;
        this.f38457c = iconicsImageView;
        this.f38458d = recyclerView;
        this.f38459e = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38455a;
    }
}
