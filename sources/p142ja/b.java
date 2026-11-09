package p142ja;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f38448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f38449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f38450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRecyclerView f38451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AVLoadingIndicatorView f38453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f38454g;

    public b(RelativeLayout relativeLayout, IconicsImageView iconicsImageView, TextView textView, SwipeRecyclerView swipeRecyclerView, TextView textView2, AVLoadingIndicatorView aVLoadingIndicatorView, RelativeLayout relativeLayout2) {
        this.f38448a = relativeLayout;
        this.f38449b = iconicsImageView;
        this.f38450c = textView;
        this.f38451d = swipeRecyclerView;
        this.f38452e = textView2;
        this.f38453f = aVLoadingIndicatorView;
        this.f38454g = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38448a;
    }
}
