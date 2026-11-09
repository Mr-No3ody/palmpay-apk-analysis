package Me;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f6007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6008d;

    public t(View view, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f6005a = view;
        this.f6006b = imageView;
        this.f6007c = imageView2;
        this.f6008d = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.c(this.f6005a, tVar.f6005a) && Intrinsics.c(this.f6006b, tVar.f6006b) && Intrinsics.c(this.f6007c, tVar.f6007c) && Intrinsics.c(this.f6008d, tVar.f6008d);
    }

    public final int hashCode() {
        View view = this.f6005a;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        ImageView imageView = this.f6006b;
        int iHashCode2 = (iHashCode + (imageView == null ? 0 : imageView.hashCode())) * 31;
        ImageView imageView2 = this.f6007c;
        int iHashCode3 = (iHashCode2 + (imageView2 == null ? 0 : imageView2.hashCode())) * 31;
        TextView textView = this.f6008d;
        return iHashCode3 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "RewardProgressItemViews(root=" + this.f6005a + ", ivIcon=" + this.f6006b + ", ivCheck=" + this.f6007c + ", tvRewardAmt=" + this.f6008d + ")";
    }
}
