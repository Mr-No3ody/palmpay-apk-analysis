package com.mikepenz.iconics.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/mikepenz/iconics/utils/IconicsLogger;", "", "", "priority", "", "tag", "msg", "", "t", "", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IconicsLogger {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final com.growingio.android.circler.a f23603j0;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }
    }

    static {
        a aVar = a.$$INSTANCE;
        f23603j0 = new com.growingio.android.circler.a(5);
    }

    void log(int priority, @NotNull String tag, @NotNull String msg, @Nullable Throwable t);
}
