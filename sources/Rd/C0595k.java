package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: Rd.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0595k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8366a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8367b;

    public C0595k(LinearLayout linearLayout) {
        this.f8367b = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f8366a) {
            case 0:
                break;
        }
        return this.f8367b;
    }

    public C0595k(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f8367b = linearLayout;
    }
}
