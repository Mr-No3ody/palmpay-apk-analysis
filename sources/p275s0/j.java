package p275s0;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f42008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f42008a = fragment;
    }
}
