package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f5842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f5843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f5844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f5845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q[] f5846e;

    static {
        q qVar = new q("PUSH", 0);
        f5842a = qVar;
        q qVar2 = new q("MODAL", 1);
        f5843b = qVar2;
        q qVar3 = new q("TRANSPARENT_MODAL", 2);
        f5844c = qVar3;
        q qVar4 = new q("FORM_SHEET", 3);
        f5845d = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
        f5846e = qVarArr;
        com.facebook.imagepipeline.nativecode.b.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f5846e.clone();
    }
}
