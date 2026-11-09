package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes.dex */
@Module
abstract class ExecutionModule {
    @Provides
    @Singleton
    @SuppressLint({"ThreadPoolCreation"})
    public static Executor executor() {
        return new SafeLoggingExecutor(ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.google.android.datatransport.runtime.ExecutionModule"));
    }
}
