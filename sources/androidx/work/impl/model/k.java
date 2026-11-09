package androidx.work.impl.model;

import C0.G;
import E.K;
import N8.q0;
import V0.C;
import V0.C0689h;
import V0.C0695n;
import V0.EnumC0682a;
import V0.Q;
import androidx.camera.video.u;
import androidx.work.OverwritingInputMerger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f18610y = new h(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final K f18611z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f18613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0695n f18616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0695n f18617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0689h f18621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EnumC0682a f18623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f18624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f18626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f18627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V0.K f18629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18630s;
    public final int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f18631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f18634x;

    static {
        Intrinsics.checkNotNullExpressionValue(C.d("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f18611z = new K(4);
    }

    public k(String id2, Q state, String workerClassName, String inputMergerClassName, C0695n input, C0695n output, long j6, long j10, long j11, C0689h constraints, int i7, EnumC0682a backoffPolicy, long j12, long j13, long j14, long j15, boolean z3, V0.K outOfQuotaPolicy, int i10, int i11, long j16, int i12, int i13, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f18612a = id2;
        this.f18613b = state;
        this.f18614c = workerClassName;
        this.f18615d = inputMergerClassName;
        this.f18616e = input;
        this.f18617f = output;
        this.f18618g = j6;
        this.f18619h = j10;
        this.f18620i = j11;
        this.f18621j = constraints;
        this.f18622k = i7;
        this.f18623l = backoffPolicy;
        this.f18624m = j12;
        this.f18625n = j13;
        this.f18626o = j14;
        this.f18627p = j15;
        this.f18628q = z3;
        this.f18629r = outOfQuotaPolicy;
        this.f18630s = i10;
        this.t = i11;
        this.f18631u = j16;
        this.f18632v = i12;
        this.f18633w = i13;
        this.f18634x = str;
    }

    public static k b(k kVar, String str, Q q10, String str2, C0695n c0695n, int i7, long j6, int i10, int i11, long j10, int i12, int i13) {
        String id2 = (i13 & 1) != 0 ? kVar.f18612a : str;
        Q state = (i13 & 2) != 0 ? kVar.f18613b : q10;
        String workerClassName = (i13 & 4) != 0 ? kVar.f18614c : str2;
        String inputMergerClassName = kVar.f18615d;
        C0695n input = (i13 & 16) != 0 ? kVar.f18616e : c0695n;
        C0695n output = kVar.f18617f;
        long j11 = kVar.f18618g;
        long j12 = kVar.f18619h;
        long j13 = kVar.f18620i;
        C0689h constraints = kVar.f18621j;
        int i14 = (i13 & 1024) != 0 ? kVar.f18622k : i7;
        EnumC0682a backoffPolicy = kVar.f18623l;
        long j14 = kVar.f18624m;
        long j15 = (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? kVar.f18625n : j6;
        long j16 = kVar.f18626o;
        long j17 = kVar.f18627p;
        boolean z3 = kVar.f18628q;
        V0.K outOfQuotaPolicy = kVar.f18629r;
        int i15 = (i13 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? kVar.f18630s : i10;
        int i16 = (i13 & 524288) != 0 ? kVar.t : i11;
        long j18 = (i13 & 1048576) != 0 ? kVar.f18631u : j10;
        int i17 = (i13 & 2097152) != 0 ? kVar.f18632v : i12;
        int i18 = kVar.f18633w;
        String str3 = kVar.f18634x;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new k(id2, state, workerClassName, inputMergerClassName, input, output, j11, j12, j13, constraints, i14, backoffPolicy, j14, j15, j16, j17, z3, outOfQuotaPolicy, i15, i16, j18, i17, i18, str3);
    }

    public final long a() {
        return f18610y.calculateNextRunTime(this.f18613b == Q.f9885a && this.f18622k > 0, this.f18622k, this.f18623l, this.f18624m, this.f18625n, this.f18630s, d(), this.f18618g, this.f18620i, this.f18619h, this.f18631u);
    }

    public final boolean c() {
        return !Intrinsics.c(C0689h.f9939j, this.f18621j);
    }

    public final boolean d() {
        return this.f18619h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.c(this.f18612a, kVar.f18612a) && this.f18613b == kVar.f18613b && Intrinsics.c(this.f18614c, kVar.f18614c) && Intrinsics.c(this.f18615d, kVar.f18615d) && Intrinsics.c(this.f18616e, kVar.f18616e) && Intrinsics.c(this.f18617f, kVar.f18617f) && this.f18618g == kVar.f18618g && this.f18619h == kVar.f18619h && this.f18620i == kVar.f18620i && Intrinsics.c(this.f18621j, kVar.f18621j) && this.f18622k == kVar.f18622k && this.f18623l == kVar.f18623l && this.f18624m == kVar.f18624m && this.f18625n == kVar.f18625n && this.f18626o == kVar.f18626o && this.f18627p == kVar.f18627p && this.f18628q == kVar.f18628q && this.f18629r == kVar.f18629r && this.f18630s == kVar.f18630s && this.t == kVar.t && this.f18631u == kVar.f18631u && this.f18632v == kVar.f18632v && this.f18633w == kVar.f18633w && Intrinsics.c(this.f18634x, kVar.f18634x);
    }

    public final int hashCode() {
        int iB = u.b(this.f18633w, u.b(this.f18632v, q0.b(u.b(this.t, u.b(this.f18630s, (this.f18629r.hashCode() + u.d(q0.b(q0.b(q0.b(q0.b((this.f18623l.hashCode() + u.b(this.f18622k, (this.f18621j.hashCode() + q0.b(q0.b(q0.b((this.f18617f.hashCode() + ((this.f18616e.hashCode() + G.c(G.c((this.f18613b.hashCode() + (this.f18612a.hashCode() * 31)) * 31, 31, this.f18614c), 31, this.f18615d)) * 31)) * 31, 31, this.f18618g), 31, this.f18619h), 31, this.f18620i)) * 31, 31)) * 31, 31, this.f18624m), 31, this.f18625n), 31, this.f18626o), 31, this.f18627p), 31, this.f18628q)) * 31, 31), 31), 31, this.f18631u), 31), 31);
        String str = this.f18634x;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return u.p(new StringBuilder("{WorkSpec: "), this.f18612a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(String str, Q q10, String str2, String str3, C0695n c0695n, C0695n c0695n2, long j6, long j10, long j11, C0689h c0689h, int i7, EnumC0682a enumC0682a, long j12, long j13, long j14, long j15, boolean z3, V0.K k2, int i10, long j16, int i11, int i12, String str4, int i13) {
        String str5;
        Q q11 = (i13 & 2) != 0 ? Q.f9885a : q10;
        if ((i13 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "OverwritingInputMerger::class.java.name");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, q11, str2, str5, (i13 & 16) != 0 ? C0695n.f9957c : c0695n, (i13 & 32) != 0 ? C0695n.f9957c : c0695n2, (i13 & 64) != 0 ? 0L : j6, (i13 & 128) != 0 ? 0L : j10, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j11, (i13 & 512) != 0 ? C0689h.f9939j : c0689h, (i13 & 1024) != 0 ? 0 : i7, (i13 & 2048) != 0 ? EnumC0682a.f9915a : enumC0682a, (i13 & 4096) != 0 ? 30000L : j12, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? -1L : j13, (i13 & 16384) == 0 ? j14 : 0L, (32768 & i13) != 0 ? -1L : j15, (65536 & i13) != 0 ? false : z3, (131072 & i13) != 0 ? V0.K.f9880a : k2, (262144 & i13) != 0 ? 0 : i10, 0, (1048576 & i13) != 0 ? Long.MAX_VALUE : j16, (2097152 & i13) != 0 ? 0 : i11, (4194304 & i13) != 0 ? -256 : i12, (i13 & 8388608) != 0 ? null : str4);
    }
}
