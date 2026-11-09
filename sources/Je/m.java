package Je;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4827c;

    public m(View view, TextView textView, TextView textView2) {
        this.f4825a = view;
        this.f4826b = textView;
        this.f4827c = textView2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.c(this.f4825a, mVar.f4825a) && Intrinsics.c(this.f4826b, mVar.f4826b) && Intrinsics.c(this.f4827c, mVar.f4827c);
    }

    public final int hashCode() {
        View view = this.f4825a;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        TextView textView = this.f4826b;
        int iHashCode2 = (iHashCode + (textView == null ? 0 : textView.hashCode())) * 31;
        TextView textView2 = this.f4827c;
        return iHashCode2 + (textView2 != null ? textView2.hashCode() : 0);
    }

    public final String toString() {
        return "MilestoneItemViews(root=" + this.f4825a + ", tvAmount=" + this.f4826b + ", tvUser=" + this.f4827c + ")";
    }
}
