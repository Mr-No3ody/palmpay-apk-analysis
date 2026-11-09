package V0;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f9908d = new W(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.model.k f9910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f9911c;

    public X(UUID id2, androidx.work.impl.model.k workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f9909a = id2;
        this.f9910b = workSpec;
        this.f9911c = tags;
    }
}
