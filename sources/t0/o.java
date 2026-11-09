package t0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f42293b = new n(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42294a;

    public o(t start, t end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f42294a = f42293b.match$graphics_shapes_release(start, end);
    }
}
