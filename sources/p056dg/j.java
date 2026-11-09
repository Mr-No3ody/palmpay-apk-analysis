package p056dg;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f35967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f35968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f35969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f35970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f35971e;

    static {
        j jVar = new j("SUCCESSFUL", 0);
        f35967a = jVar;
        j jVar2 = new j("REREGISTER", 1);
        f35968b = jVar2;
        j jVar3 = new j("CANCELLED", 2);
        f35969c = jVar3;
        j jVar4 = new j("ALREADY_SELECTED", 3);
        f35970d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f35971e = jVarArr;
        b.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f35971e.clone();
    }
}
