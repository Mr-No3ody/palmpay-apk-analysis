package V0;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0698q implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0698q f9962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0698q[] f9963b;

    static {
        EnumC0698q enumC0698q = new EnumC0698q("INSTANCE", 0);
        f9962a = enumC0698q;
        f9963b = new EnumC0698q[]{enumC0698q};
    }

    public static EnumC0698q valueOf(String str) {
        return (EnumC0698q) Enum.valueOf(EnumC0698q.class, str);
    }

    public static EnumC0698q[] values() {
        return (EnumC0698q[]) f9963b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
