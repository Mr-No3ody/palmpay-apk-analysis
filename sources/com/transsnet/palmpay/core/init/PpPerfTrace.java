package com.transsnet.palmpay.core.init;

import android.os.Trace;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J-\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/init/PpPerfTrace;", "", "<init>", "()V", Constants.ENABLE_DISABLE, "", "begin", "", "name", "", ViewProps.END, "trace", "T", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PpPerfTrace {

    @NotNull
    public static final PpPerfTrace INSTANCE = new PpPerfTrace();

    private PpPerfTrace() {
    }

    @JvmStatic
    public static final void begin(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isEnabled()) {
            try {
                Trace.beginSection(name);
            } catch (Throwable unused) {
            }
        }
    }

    @JvmStatic
    public static final void end() {
        if (isEnabled()) {
            try {
                Trace.endSection();
            } catch (Throwable unused) {
            }
        }
    }

    @JvmStatic
    public static final boolean isEnabled() {
        return false;
    }

    public final <T> T trace(@NotNull String name, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        begin(name);
        try {
            return block.invoke();
        } finally {
            end();
        }
    }
}
