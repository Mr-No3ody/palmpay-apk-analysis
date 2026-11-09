package Pg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends C0559f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Socket f7336a;

    public C(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f7336a = socket;
    }

    @Override // Pg.C0559f
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // Pg.C0559f
    public final void timedOut() {
        Socket socket = this.f7336a;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!AbstractC0555b.e(e10)) {
                throw e10;
            }
            s.f7375a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            s.f7375a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
