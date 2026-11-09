package M7;

import com.swmansion.rnscreens.ScreenStackFragment;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1947o;
import okhttp3.k0;

/* JADX INFO: renamed from: M7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0442b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5805a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5808d;

    public okhttp3.r a() {
        return new okhttp3.r(this.f5805a, this.f5806b, (String[]) this.f5807c, (String[]) this.f5808d);
    }

    public void b(String... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f5805a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f5807c = (String[]) cipherSuites.clone();
    }

    public void c(C1947o... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f5805a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C1947o c1947o : cipherSuites) {
            arrayList.add(c1947o.f40969a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void d() {
        androidx.activity.I onBackPressedDispatcher;
        if (this.f5805a || !this.f5806b) {
            return;
        }
        ScreenStackFragment screenStackFragment = (ScreenStackFragment) this.f5807c;
        androidx.fragment.app.E activity = screenStackFragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.a(screenStackFragment, (p294tb.K) this.f5808d);
        }
        this.f5805a = true;
    }

    public void e(String... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f5805a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f5808d = (String[]) tlsVersions.clone();
    }

    public void f(k0... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f5805a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (k0 k0Var : tlsVersions) {
            arrayList.add(k0Var.f40946a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
