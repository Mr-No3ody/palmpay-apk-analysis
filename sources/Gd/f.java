package Gd;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f3346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, LinearLayout container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        this.f3347b = gVar;
        this.f3346a = container;
    }
}
