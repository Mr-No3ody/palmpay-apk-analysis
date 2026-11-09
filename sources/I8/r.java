package I8;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.l f4201b;

    public r(LinearLayout linearLayout, Bc.l lVar) {
        this.f4200a = linearLayout;
        this.f4201b = lVar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4200a;
    }
}
