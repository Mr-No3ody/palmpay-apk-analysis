package p061e3;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f36026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f36027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f36028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f36029d;

    static {
        i iVar = new i("ALWAYS", 0);
        f36026a = iVar;
        i iVar2 = new i("AUTO", 1);
        f36027b = iVar2;
        i iVar3 = new i("NEVER", 2);
        f36028c = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        f36029d = iVarArr;
        b.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f36029d.clone();
    }
}
