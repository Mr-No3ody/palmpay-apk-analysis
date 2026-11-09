package androidx.work.impl.constraints.trackers;

import V0.C;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18522a;

    static {
        String strD = C.d("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"NetworkStateTracker\")");
        f18522a = strD;
    }

    public static final androidx.work.impl.constraints.i a(ConnectivityManager connectivityManager) {
        boolean zHasCapability;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
                zHasCapability = networkCapabilities.hasCapability(16);
            } else {
                zHasCapability = false;
            }
        } catch (SecurityException e10) {
            C.c().b(f18522a, "Unable to validate active network", e10);
        }
        return new androidx.work.impl.constraints.i(z3, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
