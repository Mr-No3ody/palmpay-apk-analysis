package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i7, Collection<String> collection, int i10) throws IllegalStateException, IllegalArgumentException;

    boolean stop(OutputStream outputStream, Executor executor);
}
