package Gg;

import java.net.Socket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.i0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final n newTestConnection(@NotNull p connectionPool, @NotNull i0 route, @NotNull Socket socket, long j6) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(socket, "socket");
        n nVar = new n(connectionPool, route);
        nVar.f3464d = socket;
        nVar.f3477q = j6;
        return nVar;
    }

    private j() {
    }
}
