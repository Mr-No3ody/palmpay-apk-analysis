package Bc;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f868c;

    public w(ConstraintLayout constraintLayout, PpButton ppButton, RecyclerView recyclerView) {
        this.f866a = constraintLayout;
        this.f867b = ppButton;
        this.f868c = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f866a;
    }
}
