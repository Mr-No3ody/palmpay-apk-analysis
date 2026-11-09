package androidx.constraintlayout.widget;

import com.google.android.material.navigation.NavigationBarView;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f15734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f15735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f15737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f15738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f15740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f15741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15742l;

    public final void a(int i7, float f10) {
        int i10 = this.f15736f;
        int[] iArr = this.f15734d;
        if (i10 >= iArr.length) {
            this.f15734d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f15735e;
            this.f15735e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f15734d;
        int i11 = this.f15736f;
        iArr2[i11] = i7;
        float[] fArr2 = this.f15735e;
        this.f15736f = i11 + 1;
        fArr2[i11] = f10;
    }

    public final void b(int i7, int i10) {
        int i11 = this.f15733c;
        int[] iArr = this.f15731a;
        if (i11 >= iArr.length) {
            this.f15731a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f15732b;
            this.f15732b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f15731a;
        int i12 = this.f15733c;
        iArr3[i12] = i7;
        int[] iArr4 = this.f15732b;
        this.f15733c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i7, String str) {
        int i10 = this.f15739i;
        int[] iArr = this.f15737g;
        if (i10 >= iArr.length) {
            this.f15737g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f15738h;
            this.f15738h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f15737g;
        int i11 = this.f15739i;
        iArr2[i11] = i7;
        String[] strArr2 = this.f15738h;
        this.f15739i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i7, boolean z3) {
        int i10 = this.f15742l;
        int[] iArr = this.f15740j;
        if (i10 >= iArr.length) {
            this.f15740j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f15741k;
            this.f15741k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f15740j;
        int i11 = this.f15742l;
        iArr2[i11] = i7;
        boolean[] zArr2 = this.f15741k;
        this.f15742l = i11 + 1;
        zArr2[i11] = z3;
    }

    public final void e(h hVar) {
        for (int i7 = 0; i7 < this.f15733c; i7++) {
            int i10 = this.f15731a[i7];
            int i11 = this.f15732b[i7];
            if (i10 == 6) {
                hVar.f15747e.f15755D = i11;
            } else if (i10 == 7) {
                hVar.f15747e.f15756E = i11;
            } else if (i10 == 8) {
                hVar.f15747e.f15762K = i11;
            } else if (i10 == 27) {
                hVar.f15747e.f15757F = i11;
            } else if (i10 == 28) {
                hVar.f15747e.f15759H = i11;
            } else if (i10 == 41) {
                hVar.f15747e.f15774W = i11;
            } else if (i10 == 42) {
                hVar.f15747e.f15775X = i11;
            } else if (i10 == 61) {
                hVar.f15747e.f15752A = i11;
            } else if (i10 == 62) {
                hVar.f15747e.f15753B = i11;
            } else if (i10 == 72) {
                hVar.f15747e.f15789g0 = i11;
            } else if (i10 == 73) {
                hVar.f15747e.f15791h0 = i11;
            } else if (i10 == 88) {
                hVar.f15746d.f15828l = i11;
            } else if (i10 == 89) {
                hVar.f15746d.f15829m = i11;
            } else if (i10 == 2) {
                hVar.f15747e.f15761J = i11;
            } else if (i10 == 31) {
                hVar.f15747e.f15763L = i11;
            } else if (i10 == 34) {
                hVar.f15747e.f15760I = i11;
            } else if (i10 == 38) {
                hVar.f15743a = i11;
            } else if (i10 == 64) {
                hVar.f15746d.f15818b = i11;
            } else if (i10 == 66) {
                hVar.f15746d.f15822f = i11;
            } else if (i10 == 76) {
                hVar.f15746d.f15821e = i11;
            } else if (i10 == 78) {
                hVar.f15745c.f15832c = i11;
            } else if (i10 == 97) {
                hVar.f15747e.f15806p0 = i11;
            } else if (i10 == 93) {
                hVar.f15747e.f15764M = i11;
            } else if (i10 != 94) {
                switch (i10) {
                    case 11:
                        hVar.f15747e.f15768Q = i11;
                        break;
                    case 12:
                        hVar.f15747e.f15769R = i11;
                        break;
                    case 13:
                        hVar.f15747e.f15765N = i11;
                        break;
                    case 14:
                        hVar.f15747e.f15767P = i11;
                        break;
                    case 15:
                        hVar.f15747e.f15770S = i11;
                        break;
                    case 16:
                        hVar.f15747e.f15766O = i11;
                        break;
                    case 17:
                        hVar.f15747e.f15784e = i11;
                        break;
                    case 18:
                        hVar.f15747e.f15786f = i11;
                        break;
                    default:
                        switch (i10) {
                            case 21:
                                hVar.f15747e.f15782d = i11;
                                break;
                            case 22:
                                hVar.f15745c.f15831b = i11;
                                break;
                            case 23:
                                hVar.f15747e.f15781c = i11;
                                break;
                            case 24:
                                hVar.f15747e.f15758G = i11;
                                break;
                            default:
                                switch (i10) {
                                    case 54:
                                        hVar.f15747e.f15776Y = i11;
                                        break;
                                    case 55:
                                        hVar.f15747e.f15777Z = i11;
                                        break;
                                    case 56:
                                        hVar.f15747e.f15779a0 = i11;
                                        break;
                                    case 57:
                                        hVar.f15747e.b0 = i11;
                                        break;
                                    case 58:
                                        hVar.f15747e.c0 = i11;
                                        break;
                                    case 59:
                                        hVar.f15747e.f15783d0 = i11;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 82:
                                                hVar.f15746d.f15819c = i11;
                                                break;
                                            case 83:
                                                hVar.f15748f.f15844i = i11;
                                                break;
                                            case 84:
                                                hVar.f15746d.f15826j = i11;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                hVar.f15747e.f15771T = i11;
            }
        }
        for (int i12 = 0; i12 < this.f15736f; i12++) {
            int i13 = this.f15734d[i12];
            float f10 = this.f15735e[i12];
            if (i13 == 19) {
                hVar.f15747e.f15788g = f10;
            } else if (i13 == 20) {
                hVar.f15747e.f15813x = f10;
            } else if (i13 == 37) {
                hVar.f15747e.f15814y = f10;
            } else if (i13 == 60) {
                hVar.f15748f.f15837b = f10;
            } else if (i13 == 63) {
                hVar.f15747e.f15754C = f10;
            } else if (i13 == 79) {
                hVar.f15746d.f15823g = f10;
            } else if (i13 == 85) {
                hVar.f15746d.f15825i = f10;
            } else if (i13 == 39) {
                hVar.f15747e.f15773V = f10;
            } else if (i13 != 40) {
                switch (i13) {
                    case 43:
                        hVar.f15745c.f15833d = f10;
                        break;
                    case 44:
                        l lVar = hVar.f15748f;
                        lVar.f15849n = f10;
                        lVar.f15848m = true;
                        break;
                    case 45:
                        hVar.f15748f.f15838c = f10;
                        break;
                    case 46:
                        hVar.f15748f.f15839d = f10;
                        break;
                    case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                        hVar.f15748f.f15840e = f10;
                        break;
                    case 48:
                        hVar.f15748f.f15841f = f10;
                        break;
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        hVar.f15748f.f15842g = f10;
                        break;
                    case 50:
                        hVar.f15748f.f15843h = f10;
                        break;
                    case 51:
                        hVar.f15748f.f15845j = f10;
                        break;
                    case 52:
                        hVar.f15748f.f15846k = f10;
                        break;
                    case 53:
                        hVar.f15748f.f15847l = f10;
                        break;
                    default:
                        switch (i13) {
                            case 67:
                                hVar.f15746d.f15824h = f10;
                                break;
                            case 68:
                                hVar.f15745c.f15834e = f10;
                                break;
                            case 69:
                                hVar.f15747e.f15785e0 = f10;
                                break;
                            case 70:
                                hVar.f15747e.f15787f0 = f10;
                                break;
                        }
                        break;
                }
            } else {
                hVar.f15747e.f15772U = f10;
            }
        }
        for (int i14 = 0; i14 < this.f15739i; i14++) {
            int i15 = this.f15737g[i14];
            String str = this.f15738h[i14];
            if (i15 == 5) {
                hVar.f15747e.f15815z = str;
            } else if (i15 == 65) {
                hVar.f15746d.f15820d = str;
            } else if (i15 == 74) {
                i iVar = hVar.f15747e;
                iVar.f15796k0 = str;
                iVar.f15794j0 = null;
            } else if (i15 == 77) {
                hVar.f15747e.f15798l0 = str;
            } else if (i15 == 90) {
                hVar.f15746d.f15827k = str;
            }
        }
        for (int i16 = 0; i16 < this.f15742l; i16++) {
            int i17 = this.f15740j[i16];
            boolean z3 = this.f15741k[i16];
            if (i17 == 44) {
                hVar.f15748f.f15848m = z3;
            } else if (i17 == 75) {
                hVar.f15747e.f15804o0 = z3;
            } else if (i17 == 80) {
                hVar.f15747e.f15800m0 = z3;
            } else if (i17 == 81) {
                hVar.f15747e.f15802n0 = z3;
            }
        }
    }
}
