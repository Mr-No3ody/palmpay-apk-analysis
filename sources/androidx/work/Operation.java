package androidx.work;

import V0.I;
import androidx.annotation.NonNull;
import androidx.lifecycle.B;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public interface Operation {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final I f18343f0 = new I(1);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final I f18344g0 = new I(0);

    @NonNull
    ListenableFuture<I> getResult();

    @NonNull
    B getState();
}
