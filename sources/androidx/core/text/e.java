package androidx.core.text;

import C9.N;

/* JADX INFO: loaded from: classes.dex */
public final class e implements TextDirectionHeuristicsCompat$TextDirectionAlgorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16152a = new e();

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm
    public final int checkRtl(CharSequence charSequence, int i7, int i10) {
        int i11 = i10 + i7;
        int i12 = 2;
        while (i7 < i11 && i12 == 2) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i7));
            N n10 = f.f16153a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i12 = 1;
                            break;
                        case 16:
                        case 17:
                            i12 = 0;
                            break;
                        default:
                            i12 = 2;
                            break;
                    }
                } else {
                    i12 = 0;
                }
            } else {
                i12 = 1;
            }
            i7++;
        }
        return i12;
    }
}
