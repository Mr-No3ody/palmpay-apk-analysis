package I8;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.l f4056c;

    public /* synthetic */ d(LinearLayout linearLayout, Bc.l lVar, int i7) {
        this.f4054a = i7;
        this.f4055b = linearLayout;
        this.f4056c = lVar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4054a) {
            case 0:
                break;
        }
        return this.f4055b;
    }
}
