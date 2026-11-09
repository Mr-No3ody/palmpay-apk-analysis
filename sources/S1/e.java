package S1;

import M1.j;
import com.chad.library.adapter.base.module.LoadMoreModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R1.b f8649a = new R1.b();

    public static c a(LoadMoreModule loadMoreModule, j baseQuickAdapter) {
        Intrinsics.checkNotNullParameter(loadMoreModule, "this");
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        return new c(baseQuickAdapter);
    }
}
