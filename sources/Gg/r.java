package Gg;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String getSocketHost(@NotNull InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            String hostName = inetSocketAddress.getHostName();
            Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
            return hostName;
        }
        String hostAddress = address.getHostAddress();
        Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
        return hostAddress;
    }

    private r() {
    }
}
