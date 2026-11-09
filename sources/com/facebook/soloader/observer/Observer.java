package com.facebook.soloader.observer;

import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.x;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface Observer {
    void onGetDependenciesEnd(@Nullable Throwable th);

    void onGetDependenciesStart();

    void onLoadDependencyEnd(@Nullable Throwable th, boolean z3);

    void onLoadDependencyStart(String str, int i7);

    void onLoadLibraryEnd(@Nullable Throwable th, boolean z3);

    void onLoadLibraryStart(String str, @Nullable String str2, int i7);

    void onRecoveryEnd(@Nullable Throwable th);

    void onRecoveryStart(RecoveryStrategy recoveryStrategy);

    void onSoFileLoaderLoadEnd(@Nullable Throwable th);

    void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i7);

    void onSoSourceLoadLibraryEnd(@Nullable Throwable th);

    void onSoSourceLoadLibraryStart(x xVar);
}
