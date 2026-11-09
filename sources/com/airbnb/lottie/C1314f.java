package com.airbnb.lottie;

import android.graphics.Matrix;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.airbnb.lottie.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1314f implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19862a;

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.f19862a) {
            case 0:
                C1314f c1314f = LottieAnimationView.f19574w;
                Matrix matrix = com.airbnb.lottie.utils.i.f20269a;
                if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                    throw new IllegalStateException("Unable to parse composition", th);
                }
                com.airbnb.lottie.utils.c.c("Unable to load composition.", th);
                return;
            default:
                int i7 = p354xe.f.f43925i;
                return;
        }
    }
}
