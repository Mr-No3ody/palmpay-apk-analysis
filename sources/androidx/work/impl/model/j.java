package androidx.work.impl.model;

import N8.q0;
import V0.C0689h;
import V0.C0695n;
import V0.EnumC0682a;
import V0.Q;
import androidx.camera.video.u;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0695n f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0689h f18599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EnumC0682a f18601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f18603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f18606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f18608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f18609q;

    public j(String id2, Q state, C0695n output, long j6, long j10, long j11, C0689h constraints, int i7, EnumC0682a backoffPolicy, long j12, long j13, int i10, int i11, long j14, int i12, ArrayList tags, ArrayList progress) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f18593a = id2;
        this.f18594b = state;
        this.f18595c = output;
        this.f18596d = j6;
        this.f18597e = j10;
        this.f18598f = j11;
        this.f18599g = constraints;
        this.f18600h = i7;
        this.f18601i = backoffPolicy;
        this.f18602j = j12;
        this.f18603k = j13;
        this.f18604l = i10;
        this.f18605m = i11;
        this.f18606n = j14;
        this.f18607o = i12;
        this.f18608p = tags;
        this.f18609q = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.c(this.f18593a, jVar.f18593a) && this.f18594b == jVar.f18594b && Intrinsics.c(this.f18595c, jVar.f18595c) && this.f18596d == jVar.f18596d && this.f18597e == jVar.f18597e && this.f18598f == jVar.f18598f && this.f18599g.equals(jVar.f18599g) && this.f18600h == jVar.f18600h && this.f18601i == jVar.f18601i && this.f18602j == jVar.f18602j && this.f18603k == jVar.f18603k && this.f18604l == jVar.f18604l && this.f18605m == jVar.f18605m && this.f18606n == jVar.f18606n && this.f18607o == jVar.f18607o && Intrinsics.c(this.f18608p, jVar.f18608p) && Intrinsics.c(this.f18609q, jVar.f18609q);
    }

    public final int hashCode() {
        return this.f18609q.hashCode() + ((this.f18608p.hashCode() + u.b(this.f18607o, q0.b(u.b(this.f18605m, u.b(this.f18604l, q0.b(q0.b((this.f18601i.hashCode() + u.b(this.f18600h, (this.f18599g.hashCode() + q0.b(q0.b(q0.b((this.f18595c.hashCode() + ((this.f18594b.hashCode() + (this.f18593a.hashCode() * 31)) * 31)) * 31, 31, this.f18596d), 31, this.f18597e), 31, this.f18598f)) * 31, 31)) * 31, 31, this.f18602j), 31, this.f18603k), 31), 31), 31, this.f18606n), 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f18593a + ", state=" + this.f18594b + ", output=" + this.f18595c + ", initialDelay=" + this.f18596d + ", intervalDuration=" + this.f18597e + ", flexDuration=" + this.f18598f + ", constraints=" + this.f18599g + ", runAttemptCount=" + this.f18600h + ", backoffPolicy=" + this.f18601i + ", backoffDelayDuration=" + this.f18602j + ", lastEnqueueTime=" + this.f18603k + ", periodCount=" + this.f18604l + ", generation=" + this.f18605m + ", nextScheduleTimeOverride=" + this.f18606n + ", stopReason=" + this.f18607o + ", tags=" + this.f18608p + ", progress=" + this.f18609q + ')';
    }
}
