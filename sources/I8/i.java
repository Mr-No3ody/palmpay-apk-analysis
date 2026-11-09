package I8;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f4094c;

    public i(ConstraintLayout constraintLayout, ImageView imageView, IconicsImageView iconicsImageView) {
        this.f4092a = constraintLayout;
        this.f4093b = imageView;
        this.f4094c = iconicsImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4092a;
    }
}
