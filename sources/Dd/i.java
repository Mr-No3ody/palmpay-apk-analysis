package Dd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f1859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f1860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f1861c;

    static {
        i iVar = new i("REOPEN", 0);
        f1859a = iVar;
        i iVar2 = new i("QR_BIZ", 1);
        f1860b = iVar2;
        i[] iVarArr = {iVar, iVar2};
        f1861c = iVarArr;
        com.facebook.imagepipeline.nativecode.b.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f1861c.clone();
    }
}
