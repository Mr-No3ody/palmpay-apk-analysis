package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public interface Consumer<T> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    void onCancellation();

    void onFailure(Throwable th);

    void onNewResult(@Nullable T t, int i7);

    void onProgressUpdate(float f10);
}
