package p364y6;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f44111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44112b;

    public v(t clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f44111a = clickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f44112b > 1000) {
            this.f44112b = jCurrentTimeMillis;
            this.f44111a.onClick(v3);
        }
    }
}
