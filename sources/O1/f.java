package O1;

import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f6551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DiffUtil.ItemCallback f6552b;

    public f(ExecutorService backgroundThreadExecutor, DiffUtil.ItemCallback diffCallback) {
        Intrinsics.checkNotNullParameter(backgroundThreadExecutor, "backgroundThreadExecutor");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f6551a = backgroundThreadExecutor;
        this.f6552b = diffCallback;
    }
}
