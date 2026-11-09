package androidx.camera.core.impl;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {
    public static int a(int i7) {
        if (i7 == 35) {
            return 2;
        }
        if (i7 == 256) {
            return 3;
        }
        if (i7 == 4101) {
            return 4;
        }
        return i7 == 32 ? 5 : 1;
    }

    public static C0995o b(int i7, int i10, Size size, C0997p c0997p) {
        int iA = a(i10);
        M0 m7 = M0.NOT_SUPPORT;
        int iA2 = androidx.camera.core.internal.utils.d.a(size);
        if (i7 == 1) {
            if (iA2 <= androidx.camera.core.internal.utils.d.a((Size) c0997p.f14117b.get(Integer.valueOf(i10)))) {
                m7 = M0.s720p;
            } else {
                if (iA2 <= androidx.camera.core.internal.utils.d.a((Size) c0997p.f14119d.get(Integer.valueOf(i10)))) {
                    m7 = M0.s1440p;
                }
            }
        } else if (iA2 <= androidx.camera.core.internal.utils.d.a(c0997p.f14116a)) {
            m7 = M0.VGA;
        } else if (iA2 <= androidx.camera.core.internal.utils.d.a(c0997p.f14118c)) {
            m7 = M0.PREVIEW;
        } else if (iA2 <= androidx.camera.core.internal.utils.d.a(c0997p.f14120e)) {
            m7 = M0.RECORD;
        } else {
            if (iA2 <= androidx.camera.core.internal.utils.d.a((Size) c0997p.f14121f.get(Integer.valueOf(i10)))) {
                m7 = M0.MAXIMUM;
            } else {
                Size size2 = (Size) c0997p.f14122g.get(Integer.valueOf(i10));
                if (size2 != null) {
                    if (iA2 <= size2.getHeight() * size2.getWidth()) {
                        m7 = M0.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C0995o(iA, m7, 0L);
    }
}
