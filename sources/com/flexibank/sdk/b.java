package com.flexibank.sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.flexibank.sdk.b[], still in use, count: 1, list:
  (r0v1 com.flexibank.sdk.b[]) from 0x003a: INVOKE (r0v1 com.flexibank.sdk.b[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:59)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    DEV("https://app-dev.flexi-bank.com"),
    /* JADX INFO: Fake field, exist only in values array */
    DAILY("https://app-daily.flexi-bank.com"),
    /* JADX INFO: Fake field, exist only in values array */
    SIT("https://app-sit.flexi-bank.com"),
    /* JADX INFO: Fake field, exist only in values array */
    PRE("https://app-pre.flexi-bank.com"),
    PRODUCTION("https://app.flexi-bank.com");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21937a;

    static {
        com.facebook.imagepipeline.nativecode.b.n(bVarArr);
    }

    public b(String str) {
        super(str, i);
        this.f21937a = str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21936c.clone();
    }
}
