package I8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.l f4151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4152c;

    public m(LinearLayout linearLayout, Bc.l lVar, TextView textView) {
        this.f4150a = linearLayout;
        this.f4151b = lVar;
        this.f4152c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4150a;
    }
}
