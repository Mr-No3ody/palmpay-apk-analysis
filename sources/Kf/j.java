package Kf;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5475a;

    public j(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f5475a = root;
    }

    public abstract File a();
}
