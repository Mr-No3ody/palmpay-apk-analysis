package p099gb;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.custom_view.CircleProgressView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f37039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f37040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f37041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f37042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f37043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f37044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f37045g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewPager2 f37046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CircleProgressView f37047j;

    public a(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, View view, View view2, ViewPager2 viewPager2, CircleProgressView circleProgressView) {
        this.f37039a = linearLayout;
        this.f37040b = textView;
        this.f37041c = textView2;
        this.f37042d = imageView;
        this.f37043e = textView3;
        this.f37044f = view;
        this.f37045g = view2;
        this.f37046i = viewPager2;
        this.f37047j = circleProgressView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f37039a;
    }
}
