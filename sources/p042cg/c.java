package p042cg;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f18992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f18993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f18994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f18995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f18996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f18997f;

    static {
        c cVar = new c("CPU_ACQUIRED", 0);
        f18992a = cVar;
        c cVar2 = new c("BLOCKING", 1);
        f18993b = cVar2;
        c cVar3 = new c("PARKING", 2);
        f18994c = cVar3;
        c cVar4 = new c("DORMANT", 3);
        f18995d = cVar4;
        c cVar5 = new c("TERMINATED", 4);
        f18996e = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f18997f = cVarArr;
        b.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18997f.clone();
    }
}
