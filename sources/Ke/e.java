package Ke;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f5437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f5438c;

    public e(ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        View viewInflate = viewStub.inflate();
        this.f5436a = viewInflate;
        if (viewInflate != null) {
            this.f5437b = (LinearLayout) viewInflate.findViewById(Ac.e.llContainer);
        }
    }
}
