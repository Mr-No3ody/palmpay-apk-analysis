package H8;

import C0.G;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.transsnet.palmpay.util.SystemProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f3757a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3758b;

    static {
        Intrinsics.checkNotNullParameter("", "clientId");
        Intrinsics.checkNotNullParameter("", "clientSecret");
        Intrinsics.checkNotNullParameter("", "redirectUri");
        a aVar = new a();
        aVar.f3742a = "";
        aVar.f3743b = "";
        f3758b = aVar;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = SystemProperties.get("gsm.operator.numeric", "");
        if (str == null) {
            str = "";
        }
        String str2 = SystemProperties.get("gsm.sim.operator.numeric", "");
        String str3 = str2 != null ? str2 : "";
        F6.d.h("MTNApi", 3, G.p("isOnMTNNetwork: operatorNumeric=", str, ", simOperatorNumeric=", str3));
        List listC = c(str);
        List listC2 = c(str3);
        boolean z3 = false;
        if (!listC.contains("62130") && !listC2.contains("62130")) {
            F6.d.h("MTNApi", 3, "isOnMTNNetwork: not MTN operator, operatorNumerics=" + listC + ", simOperatorNumerics=" + listC2);
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            F6.d.h("MTNApi", 3, "isOnMTNNetwork: no active network");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            F6.d.h("MTNApi", 3, "isOnMTNNetwork: no network capabilities");
            return false;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(0);
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (zHasTransport && zHasCapability) {
            z3 = true;
        }
        F6.d.h("MTNApi", 3, "isOnMTNNetwork: hasMobileTransport=" + zHasTransport + ", hasInternet=" + zHasCapability + ", result=" + z3);
        return z3;
    }

    public static List c(String str) {
        try {
            if (str.length() == 0) {
                return z.f38935a;
            }
            String strK = StringsKt.K(StringsKt.V(str).toString(), "[", "]");
            if (strK.length() == 0) {
                return z.f38935a;
            }
            List listSplit$default = StringsKt__StringsKt.split$default(strK, new String[]{","}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(r.l(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.V((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return z.f38935a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0142 A[Catch: Exception -> 0x0140, TRY_LEAVE, TryCatch #0 {Exception -> 0x0140, blocks: (B:44:0x0123, B:46:0x012f, B:51:0x013a, B:54:0x0142), top: B:59:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r1 == r5) goto L37;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0142, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r18, androidx.lifecycle.AbstractC1207q r19, java.lang.String r20, java.lang.String r21, Ff.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H8.f.a(android.content.Context, androidx.lifecycle.q, java.lang.String, java.lang.String, Ff.c):java.lang.Object");
    }
}
