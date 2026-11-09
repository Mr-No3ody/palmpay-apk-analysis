package com.facebook.imagepipeline.common;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final e getHigherPriority(@NotNull e priority1, @NotNull e priority2) {
        Intrinsics.checkNotNullParameter(priority1, "priority1");
        Intrinsics.checkNotNullParameter(priority2, "priority2");
        return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
    }

    private d() {
    }
}
