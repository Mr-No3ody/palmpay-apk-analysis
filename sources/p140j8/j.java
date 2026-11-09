package p140j8;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f38355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f38356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f38357c;

    static {
        j jVar = new j("PADDING", 0);
        f38355a = jVar;
        j jVar2 = new j("MARGIN", 1);
        f38356b = jVar2;
        j[] jVarArr = {jVar, jVar2};
        f38357c = jVarArr;
        b.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f38357c.clone();
    }
}
