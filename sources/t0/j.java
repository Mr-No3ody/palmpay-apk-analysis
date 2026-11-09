package t0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42283a;

    public j(List cubics) {
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.f42283a = cubics;
    }

    public abstract j a(p039cb.c cVar);
}
