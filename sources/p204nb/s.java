package p204nb;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f39921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f39922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f39923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s[] f39924d;

    static {
        s sVar = new s("SUCCESS", 0);
        f39921a = sVar;
        s sVar2 = new s("NETWORK_FAIL", 1);
        f39922b = sVar2;
        s sVar3 = new s("BUS_FAIL", 2);
        f39923c = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        f39924d = sVarArr;
        b.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f39924d.clone();
    }
}
