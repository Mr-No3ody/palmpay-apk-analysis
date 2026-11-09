package Ie;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p354xe.h f4382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p354xe.h f4383d;

    public n(View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f4380a = itemView;
        this.f4381b = (ImageView) itemView.findViewById(Ac.e.ivTitle);
        ImageView imageView = (ImageView) itemView.findViewById(Ac.e.iv_arrow);
        if (imageView != null) {
            imageView.setOnClickListener(new Ha.d(this, 11));
        }
        this.f4382c = new p354xe.h(itemView.findViewById(Ac.e.item1));
        this.f4383d = new p354xe.h(itemView.findViewById(Ac.e.item2));
    }
}
