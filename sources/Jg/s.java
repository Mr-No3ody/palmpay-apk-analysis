package Jg;

import android.util.Log;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.W;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final t findAndroidPlatform() {
        CopyOnWriteArraySet copyOnWriteArraySet = Kg.e.f5491a;
        for (Map.Entry entry : Kg.e.f5492b.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Logger logger = Logger.getLogger(str);
            if (Kg.e.f5491a.add(logger)) {
                logger.setUseParentHandlers(false);
                logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                logger.addHandler(Kg.f.f5493a);
            }
        }
        t tVarBuildIfSupported = b.f4839e.buildIfSupported();
        if (tVarBuildIfSupported != null) {
            return tVarBuildIfSupported;
        }
        t tVarBuildIfSupported2 = e.f4844f.buildIfSupported();
        Intrinsics.e(tVarBuildIfSupported2);
        return tVarBuildIfSupported2;
    }

    private final t findJvmPlatform() {
        r rVarBuildIfSupported;
        g gVarBuildIfSupported;
        j jVarBuildIfSupported;
        if (isConscryptPreferred() && (jVarBuildIfSupported = j.f4852e.buildIfSupported()) != null) {
            return jVarBuildIfSupported;
        }
        if (isBouncyCastlePreferred() && (gVarBuildIfSupported = g.f4848e.buildIfSupported()) != null) {
            return gVarBuildIfSupported;
        }
        if (isOpenJSSEPreferred() && (rVarBuildIfSupported = r.f4866e.buildIfSupported()) != null) {
            return rVarBuildIfSupported;
        }
        p pVarBuildIfSupported = p.f4864d.buildIfSupported();
        if (pVarBuildIfSupported != null) {
            return pVarBuildIfSupported;
        }
        t tVarBuildIfSupported = m.f4858i.buildIfSupported();
        return tVarBuildIfSupported != null ? tVarBuildIfSupported : new t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t findPlatform() {
        return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
    }

    private final boolean isBouncyCastlePreferred() {
        return "BC".equals(Security.getProviders()[0].getName());
    }

    private final boolean isConscryptPreferred() {
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    private final boolean isOpenJSSEPreferred() {
        return "OpenJSSE".equals(Security.getProviders()[0].getName());
    }

    public static /* synthetic */ void resetForTests$default(s sVar, t tVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            tVar = sVar.findPlatform();
        }
        sVar.resetForTests(tVar);
    }

    @NotNull
    public final List<String> alpnProtocolNames(@NotNull List<? extends W> protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((W) obj) != W.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((W) it.next()).f40679a);
        }
        return arrayList2;
    }

    @NotNull
    public final byte[] concatLengthPrefixed(@NotNull List<? extends W> protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Pg.k kVar = new Pg.k();
        for (String str : alpnProtocolNames(protocols)) {
            kVar.m(str.length());
            kVar.v(str);
        }
        return kVar.readByteArray(kVar.f7358b);
    }

    @JvmStatic
    @NotNull
    public final t get() {
        return t.f4870b;
    }

    public final boolean isAndroid() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public final void resetForTests(@NotNull t platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        t.f4870b = platform;
    }

    private s() {
    }
}
