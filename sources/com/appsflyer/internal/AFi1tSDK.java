package com.appsflyer.internal;

import Kf.q;
import Sf.p;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi21\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n179#2,2:47\n1#3:49\n1#3:60\n11653#4,9:50\n13579#4:59\n13580#4:61\n11662#4:62\n1747#5,3:63\n*S KotlinDebug\n*F\n+ 1 NetworkDataCollectorApi21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi21\n*L\n17#1:47,2\n31#1:60\n31#1:50,9\n31#1:59\n31#1:61\n31#1:62\n33#1:63,3\n*E\n"})
public final class AFi1tSDK extends AFi1sSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1tSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "x_", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends o implements Function1<Network, NetworkInfo> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: x_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1tSDK.this.getMediationNetwork;
            Intrinsics.e(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    @NotNull
    public final String getCurrencyIso4217Code() {
        Network[] allNetworks;
        Object next;
        ConnectivityManager connectivityManager = this.getMediationNetwork;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return "unknown";
        }
        Intrinsics.checkNotNullParameter(allNetworks, "<this>");
        Sequence qVar = allNetworks.length == 0 ? Sf.f.f8887a : new q(allNetworks, 3);
        if (qVar == null) {
            return "unknown";
        }
        Sf.d dVar = new Sf.d(p.g(qVar, new AnonymousClass4()));
        do {
            if (!dVar.hasNext()) {
                next = null;
                break;
            }
            next = dVar.next();
        } while (!AFi1sSDK.v_((NetworkInfo) next));
        NetworkInfo networkInfo = (NetworkInfo) next;
        if (networkInfo == null) {
            return "unknown";
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? "unknown" : "WIFI";
        }
        return "MOBILE";
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    public final boolean getMediationNetwork() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getMediationNetwork;
                Intrinsics.e(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (w_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Failed collecting ivc data", e10);
            return false;
        }
    }
}
