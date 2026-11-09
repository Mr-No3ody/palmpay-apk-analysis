package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f5832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f5833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f5834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f5835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f5836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f5837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f5838g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f5839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f5840j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p[] f5841o;

    static {
        p pVar = new p("DEFAULT", 0);
        f5832a = pVar;
        p pVar2 = new p("NONE", 1);
        f5833b = pVar2;
        p pVar3 = new p("FADE", 2);
        f5834c = pVar3;
        p pVar4 = new p("SLIDE_FROM_BOTTOM", 3);
        f5835d = pVar4;
        p pVar5 = new p("SLIDE_FROM_RIGHT", 4);
        f5836e = pVar5;
        p pVar6 = new p("SLIDE_FROM_LEFT", 5);
        f5837f = pVar6;
        p pVar7 = new p("FADE_FROM_BOTTOM", 6);
        f5838g = pVar7;
        p pVar8 = new p("IOS_FROM_RIGHT", 7);
        f5839i = pVar8;
        p pVar9 = new p("IOS_FROM_LEFT", 8);
        f5840j = pVar9;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9};
        f5841o = pVarArr;
        com.facebook.imagepipeline.nativecode.b.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f5841o.clone();
    }
}
