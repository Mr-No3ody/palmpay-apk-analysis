package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f21329b = new o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f21330c = new o(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f21331d = new o(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f21332e = new o(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f21333f = new o(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f21334g = new o(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f21335h = new o(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f21336i = new o(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f21337j = new o(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21338a;

    public /* synthetic */ o(int i7) {
        this.f21338a = i7;
    }

    @Override // com.facebook.drawee.drawable.n
    public final void getTransformImpl(Matrix matrix, Rect rect, int i7, int i10, float f10, float f11, float f12, float f13) {
        float fWidth;
        float fHeight;
        float fMax;
        float fMax2;
        switch (this.f21338a) {
            case 0:
                matrix.setTranslate((int) (((rect.width() - i7) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i10) * 0.5f) + rect.top + 0.5f));
                break;
            case 1:
                if (f13 > f12) {
                    fWidth = ((rect.width() - (i7 * f13)) * 0.5f) + rect.left;
                    fHeight = rect.top;
                    f12 = f13;
                } else {
                    fWidth = rect.left;
                    fHeight = ((rect.height() - (i10 * f12)) * 0.5f) + rect.top;
                }
                matrix.setScale(f12, f12);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
                break;
            case 2:
                float fMin = Math.min(Math.min(f12, f13), 1.0f);
                float fWidth2 = ((rect.width() - (i7 * fMin)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i10 * fMin)) * 0.5f) + rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 3:
                float fMin2 = Math.min(f12, f13);
                float f14 = rect.left;
                float fHeight3 = (rect.height() - (i10 * fMin2)) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (f14 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            case 4:
                float fMin3 = Math.min(f12, f13);
                float fWidth3 = ((rect.width() - (i7 * fMin3)) * 0.5f) + rect.left;
                float fHeight4 = ((rect.height() - (i10 * fMin3)) * 0.5f) + rect.top;
                matrix.setScale(fMin3, fMin3);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight4 + 0.5f));
                break;
            case 5:
                float fMin4 = Math.min(f12, f13);
                float fWidth4 = (rect.width() - (i7 * fMin4)) + rect.left;
                float fHeight5 = (rect.height() - (i10 * fMin4)) + rect.top;
                matrix.setScale(fMin4, fMin4);
                matrix.postTranslate((int) (fWidth4 + 0.5f), (int) (fHeight5 + 0.5f));
                break;
            case 6:
                float fMin5 = Math.min(f12, f13);
                float f15 = rect.left;
                float f16 = rect.top;
                matrix.setScale(fMin5, fMin5);
                matrix.postTranslate((int) (f15 + 0.5f), (int) (f16 + 0.5f));
                break;
            case 7:
                float f17 = rect.left;
                float f18 = rect.top;
                matrix.setScale(f12, f13);
                matrix.postTranslate((int) (f17 + 0.5f), (int) (f18 + 0.5f));
                break;
            default:
                if (f13 > f12) {
                    float f19 = i7 * f13;
                    fMax = Math.max(Math.min((rect.width() * 0.5f) - (f10 * f19), 0.0f), rect.width() - f19) + rect.left;
                    fMax2 = rect.top;
                    f12 = f13;
                } else {
                    fMax = rect.left;
                    float f20 = i10 * f12;
                    fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f11 * f20), 0.0f), rect.height() - f20) + rect.top;
                }
                matrix.setScale(f12, f12);
                matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
                break;
        }
    }

    public final String toString() {
        switch (this.f21338a) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            default:
                return "focus_crop";
        }
    }
}
