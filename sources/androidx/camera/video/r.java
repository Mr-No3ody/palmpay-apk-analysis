package androidx.camera.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f14816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f14817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f14818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f14819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f14820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f14821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f14822g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f14823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r[] f14824j;

    static {
        r rVar = new r("CONFIGURING", 0);
        f14816a = rVar;
        r rVar2 = new r("PENDING_RECORDING", 1);
        f14817b = rVar2;
        r rVar3 = new r("PENDING_PAUSED", 2);
        f14818c = rVar3;
        r rVar4 = new r("IDLING", 3);
        f14819d = rVar4;
        r rVar5 = new r("RECORDING", 4);
        f14820e = rVar5;
        r rVar6 = new r("PAUSED", 5);
        r rVar7 = new r("STOPPING", 6);
        f14821f = rVar7;
        r rVar8 = new r("RESETTING", 7);
        f14822g = rVar8;
        r rVar9 = new r("ERROR", 8);
        f14823i = rVar9;
        f14824j = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f14824j.clone();
    }
}
