package p024b9;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f18822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f18823b;

    public o(ImageView statusView, TextView titleView) {
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        this.f18822a = titleView;
        this.f18823b = statusView;
    }
}
