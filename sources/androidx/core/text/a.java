package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f16138e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f16139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f16142d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f16138e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f16139a = charSequence;
        this.f16140b = charSequence.length();
    }

    public final byte a() {
        int i7 = this.f16141c - 1;
        CharSequence charSequence = this.f16139a;
        char cCharAt = charSequence.charAt(i7);
        this.f16142d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f16141c);
            this.f16141c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f16141c--;
        char c6 = this.f16142d;
        return c6 < 1792 ? f16138e[c6] : Character.getDirectionality(c6);
    }
}
