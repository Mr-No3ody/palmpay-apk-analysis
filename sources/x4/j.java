package x4;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f43618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f43619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f43620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpButton f43621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43623g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f43624i;

    public /* synthetic */ j(ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView, PpButton ppButton, TextView textView, TextView textView2, TextView textView3, int i7) {
        this.f43617a = i7;
        this.f43618b = constraintLayout;
        this.f43619c = recyclerView;
        this.f43620d = iconicsImageView;
        this.f43621e = ppButton;
        this.f43622f = textView;
        this.f43623g = textView2;
        this.f43624i = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f43617a) {
            case 0:
                break;
        }
        return this.f43618b;
    }
}
