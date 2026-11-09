package p076f3;

import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.i0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final <T> DataSource<T> create(@NotNull Producer<T> producer, @NotNull i0 settableProducerContext, @NotNull RequestListener2 listener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new d(producer, settableProducerContext, listener);
    }

    private c() {
    }
}
