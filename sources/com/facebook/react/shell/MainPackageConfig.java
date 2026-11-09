package com.facebook.react.shell;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p061e3.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/shell/MainPackageConfig;", "", "Le3/o;", "frescoConfig", "<init>", "(Le3/o;)V", "Le3/o;", "getFrescoConfig", "()Le3/o;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainPackageConfig {

    @NotNull
    private final o frescoConfig;

    public MainPackageConfig(@NotNull o frescoConfig) {
        Intrinsics.checkNotNullParameter(frescoConfig, "frescoConfig");
        this.frescoConfig = frescoConfig;
    }

    @NotNull
    public final o getFrescoConfig() {
        return this.frescoConfig;
    }
}
