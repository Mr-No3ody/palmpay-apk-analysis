package Rd;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: Rd.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0592h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f8328b;

    public /* synthetic */ C0592h(ConstraintLayout constraintLayout, int i7) {
        this.f8327a = i7;
        this.f8328b = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f8327a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f8328b;
    }

    public C0592h(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f8327a = 4;
        this.f8328b = constraintLayout;
    }
}
