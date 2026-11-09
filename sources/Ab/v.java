package Ab;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AppCompatImageView imageView) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.f146a = imageView;
    }
}
