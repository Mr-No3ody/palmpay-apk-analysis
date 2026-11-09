package kotlin.text;

/* JADX INFO: renamed from: kotlin.text.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1862a extends CharsKt__CharJVMKt {
    public static final boolean a(char c6, char c10, boolean z3) {
        if (c6 == c10) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
