package androidx.core.text;

import C9.N;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16146e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16147a;

    static {
        N n10 = f.f16155c;
        f16143b = Character.toString((char) 8206);
        f16144c = Character.toString((char) 8207);
        f16145d = new b(false);
        f16146e = new b(true);
    }

    public b(boolean z3) {
        N n10 = f.f16153a;
        this.f16147a = z3;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f16141c = 0;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = aVar.f16141c;
            if (i12 < aVar.f16140b && i7 == 0) {
                CharSequence charSequence2 = aVar.f16139a;
                char cCharAt = charSequence2.charAt(i12);
                aVar.f16142d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f16141c);
                    aVar.f16141c = Character.charCount(iCodePointAt) + aVar.f16141c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f16141c++;
                    char c6 = aVar.f16142d;
                    directionality = c6 < 1792 ? a.f16138e[c6] : Character.getDirectionality(c6);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                    return -1;
                }
                i7 = i11;
            }
        }
        if (i7 != 0) {
            if (i10 == 0) {
                while (aVar.f16141c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i7 == i11) {
                                return -1;
                            }
                            i11--;
                            break;
                        case 16:
                        case 17:
                            if (i7 == i11) {
                                return 1;
                            }
                            i11--;
                            break;
                        case 18:
                            i11++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i10;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f16141c = aVar.f16140b;
        int i7 = 0;
        while (true) {
            int i10 = i7;
            while (aVar.f16141c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i7 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i7 == 0) {
                        return 1;
                    }
                    if (i10 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i10 == i7) {
                                return -1;
                            }
                            i7--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i7) {
                                return 1;
                            }
                            i7--;
                            break;
                        case 18:
                            i7++;
                            break;
                        default:
                            if (i10 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        N n10 = f.f16155c;
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = n10.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zIsRtl2 = (zIsRtl ? f.f16154b : f.f16153a).isRtl(charSequence, 0, charSequence.length());
        String str2 = "";
        String str3 = f16144c;
        String str4 = f16143b;
        boolean z3 = this.f16147a;
        if (z3 || !(zIsRtl2 || a(charSequence) == 1)) {
            str = (!z3 || (zIsRtl2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zIsRtl != z3) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zIsRtl3 = (zIsRtl ? f.f16154b : f.f16153a).isRtl(charSequence, 0, charSequence.length());
        if (!z3 && (zIsRtl3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z3 && (!zIsRtl3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
