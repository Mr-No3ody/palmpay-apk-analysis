package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final SparseIntArray f15751q0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15752A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15753B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f15754C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15755D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15756E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f15757F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15758G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15759H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15760I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15761J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15762K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15763L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15764M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f15765N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f15766O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f15767P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15768Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f15769R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f15770S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f15771T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f15772U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f15773V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f15774W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f15775X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f15776Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f15777Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15778a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15779a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15780b;
    public int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15781c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15782d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f15783d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15784e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f15785e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15786f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f15787f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15788g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f15789g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15790h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f15791h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15792i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15793j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int[] f15794j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15795k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f15796k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15797l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f15798l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15799m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f15800m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15801n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f15802n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15803o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f15804o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15805p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15806p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15809s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f15814y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f15815z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15751q0 = sparseIntArray;
        sparseIntArray.append(p.Layout_layout_constraintLeft_toLeftOf, 24);
        sparseIntArray.append(p.Layout_layout_constraintLeft_toRightOf, 25);
        sparseIntArray.append(p.Layout_layout_constraintRight_toLeftOf, 28);
        sparseIntArray.append(p.Layout_layout_constraintRight_toRightOf, 29);
        sparseIntArray.append(p.Layout_layout_constraintTop_toTopOf, 35);
        sparseIntArray.append(p.Layout_layout_constraintTop_toBottomOf, 34);
        sparseIntArray.append(p.Layout_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(p.Layout_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(p.Layout_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(p.Layout_layout_editor_absoluteX, 6);
        sparseIntArray.append(p.Layout_layout_editor_absoluteY, 7);
        sparseIntArray.append(p.Layout_layout_constraintGuide_begin, 17);
        sparseIntArray.append(p.Layout_layout_constraintGuide_end, 18);
        sparseIntArray.append(p.Layout_layout_constraintGuide_percent, 19);
        sparseIntArray.append(p.Layout_guidelineUseRtl, 90);
        sparseIntArray.append(p.Layout_android_orientation, 26);
        sparseIntArray.append(p.Layout_layout_constraintStart_toEndOf, 31);
        sparseIntArray.append(p.Layout_layout_constraintStart_toStartOf, 32);
        sparseIntArray.append(p.Layout_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(p.Layout_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(p.Layout_layout_goneMarginLeft, 13);
        sparseIntArray.append(p.Layout_layout_goneMarginTop, 16);
        sparseIntArray.append(p.Layout_layout_goneMarginRight, 14);
        sparseIntArray.append(p.Layout_layout_goneMarginBottom, 11);
        sparseIntArray.append(p.Layout_layout_goneMarginStart, 15);
        sparseIntArray.append(p.Layout_layout_goneMarginEnd, 12);
        sparseIntArray.append(p.Layout_layout_constraintVertical_weight, 38);
        sparseIntArray.append(p.Layout_layout_constraintHorizontal_weight, 37);
        sparseIntArray.append(p.Layout_layout_constraintHorizontal_chainStyle, 39);
        sparseIntArray.append(p.Layout_layout_constraintVertical_chainStyle, 40);
        sparseIntArray.append(p.Layout_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(p.Layout_layout_constraintVertical_bias, 36);
        sparseIntArray.append(p.Layout_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(p.Layout_layout_constraintLeft_creator, 91);
        sparseIntArray.append(p.Layout_layout_constraintTop_creator, 91);
        sparseIntArray.append(p.Layout_layout_constraintRight_creator, 91);
        sparseIntArray.append(p.Layout_layout_constraintBottom_creator, 91);
        sparseIntArray.append(p.Layout_layout_constraintBaseline_creator, 91);
        sparseIntArray.append(p.Layout_android_layout_marginLeft, 23);
        sparseIntArray.append(p.Layout_android_layout_marginRight, 27);
        sparseIntArray.append(p.Layout_android_layout_marginStart, 30);
        sparseIntArray.append(p.Layout_android_layout_marginEnd, 8);
        sparseIntArray.append(p.Layout_android_layout_marginTop, 33);
        sparseIntArray.append(p.Layout_android_layout_marginBottom, 2);
        sparseIntArray.append(p.Layout_android_layout_width, 22);
        sparseIntArray.append(p.Layout_android_layout_height, 21);
        sparseIntArray.append(p.Layout_layout_constraintWidth, 41);
        sparseIntArray.append(p.Layout_layout_constraintHeight, 42);
        sparseIntArray.append(p.Layout_layout_constrainedWidth, 41);
        sparseIntArray.append(p.Layout_layout_constrainedHeight, 42);
        sparseIntArray.append(p.Layout_layout_wrapBehaviorInParent, 76);
        sparseIntArray.append(p.Layout_layout_constraintCircle, 61);
        sparseIntArray.append(p.Layout_layout_constraintCircleRadius, 62);
        sparseIntArray.append(p.Layout_layout_constraintCircleAngle, 63);
        sparseIntArray.append(p.Layout_layout_constraintWidth_percent, 69);
        sparseIntArray.append(p.Layout_layout_constraintHeight_percent, 70);
        sparseIntArray.append(p.Layout_chainUseRtl, 71);
        sparseIntArray.append(p.Layout_barrierDirection, 72);
        sparseIntArray.append(p.Layout_barrierMargin, 73);
        sparseIntArray.append(p.Layout_constraint_referenced_ids, 74);
        sparseIntArray.append(p.Layout_barrierAllowsGoneWidgets, 75);
    }

    public final void a(i iVar) {
        this.f15778a = iVar.f15778a;
        this.f15781c = iVar.f15781c;
        this.f15780b = iVar.f15780b;
        this.f15782d = iVar.f15782d;
        this.f15784e = iVar.f15784e;
        this.f15786f = iVar.f15786f;
        this.f15788g = iVar.f15788g;
        this.f15790h = iVar.f15790h;
        this.f15792i = iVar.f15792i;
        this.f15793j = iVar.f15793j;
        this.f15795k = iVar.f15795k;
        this.f15797l = iVar.f15797l;
        this.f15799m = iVar.f15799m;
        this.f15801n = iVar.f15801n;
        this.f15803o = iVar.f15803o;
        this.f15805p = iVar.f15805p;
        this.f15807q = iVar.f15807q;
        this.f15808r = iVar.f15808r;
        this.f15809s = iVar.f15809s;
        this.t = iVar.t;
        this.f15810u = iVar.f15810u;
        this.f15811v = iVar.f15811v;
        this.f15812w = iVar.f15812w;
        this.f15813x = iVar.f15813x;
        this.f15814y = iVar.f15814y;
        this.f15815z = iVar.f15815z;
        this.f15752A = iVar.f15752A;
        this.f15753B = iVar.f15753B;
        this.f15754C = iVar.f15754C;
        this.f15755D = iVar.f15755D;
        this.f15756E = iVar.f15756E;
        this.f15757F = iVar.f15757F;
        this.f15758G = iVar.f15758G;
        this.f15759H = iVar.f15759H;
        this.f15760I = iVar.f15760I;
        this.f15761J = iVar.f15761J;
        this.f15762K = iVar.f15762K;
        this.f15763L = iVar.f15763L;
        this.f15764M = iVar.f15764M;
        this.f15765N = iVar.f15765N;
        this.f15766O = iVar.f15766O;
        this.f15767P = iVar.f15767P;
        this.f15768Q = iVar.f15768Q;
        this.f15769R = iVar.f15769R;
        this.f15770S = iVar.f15770S;
        this.f15771T = iVar.f15771T;
        this.f15772U = iVar.f15772U;
        this.f15773V = iVar.f15773V;
        this.f15774W = iVar.f15774W;
        this.f15775X = iVar.f15775X;
        this.f15776Y = iVar.f15776Y;
        this.f15777Z = iVar.f15777Z;
        this.f15779a0 = iVar.f15779a0;
        this.b0 = iVar.b0;
        this.c0 = iVar.c0;
        this.f15783d0 = iVar.f15783d0;
        this.f15785e0 = iVar.f15785e0;
        this.f15787f0 = iVar.f15787f0;
        this.f15789g0 = iVar.f15789g0;
        this.f15791h0 = iVar.f15791h0;
        this.i0 = iVar.i0;
        this.f15798l0 = iVar.f15798l0;
        int[] iArr = iVar.f15794j0;
        if (iArr == null || iVar.f15796k0 != null) {
            this.f15794j0 = null;
        } else {
            this.f15794j0 = Arrays.copyOf(iArr, iArr.length);
        }
        this.f15796k0 = iVar.f15796k0;
        this.f15800m0 = iVar.f15800m0;
        this.f15802n0 = iVar.f15802n0;
        this.f15804o0 = iVar.f15804o0;
        this.f15806p0 = iVar.f15806p0;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.Layout);
        this.f15780b = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray = f15751q0;
            int i10 = sparseIntArray.get(index);
            switch (i10) {
                case 1:
                    this.f15807q = m.o(typedArrayObtainStyledAttributes, index, this.f15807q);
                    break;
                case 2:
                    this.f15761J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15761J);
                    break;
                case 3:
                    this.f15805p = m.o(typedArrayObtainStyledAttributes, index, this.f15805p);
                    break;
                case 4:
                    this.f15803o = m.o(typedArrayObtainStyledAttributes, index, this.f15803o);
                    break;
                case 5:
                    this.f15815z = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.f15755D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15755D);
                    break;
                case 7:
                    this.f15756E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15756E);
                    break;
                case 8:
                    this.f15762K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15762K);
                    break;
                case 9:
                    this.f15812w = m.o(typedArrayObtainStyledAttributes, index, this.f15812w);
                    break;
                case 10:
                    this.f15811v = m.o(typedArrayObtainStyledAttributes, index, this.f15811v);
                    break;
                case 11:
                    this.f15768Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15768Q);
                    break;
                case 12:
                    this.f15769R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15769R);
                    break;
                case 13:
                    this.f15765N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15765N);
                    break;
                case 14:
                    this.f15767P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15767P);
                    break;
                case 15:
                    this.f15770S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15770S);
                    break;
                case 16:
                    this.f15766O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15766O);
                    break;
                case 17:
                    this.f15784e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15784e);
                    break;
                case 18:
                    this.f15786f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15786f);
                    break;
                case 19:
                    this.f15788g = typedArrayObtainStyledAttributes.getFloat(index, this.f15788g);
                    break;
                case 20:
                    this.f15813x = typedArrayObtainStyledAttributes.getFloat(index, this.f15813x);
                    break;
                case 21:
                    this.f15782d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f15782d);
                    break;
                case 22:
                    this.f15781c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f15781c);
                    break;
                case 23:
                    this.f15758G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15758G);
                    break;
                case 24:
                    this.f15792i = m.o(typedArrayObtainStyledAttributes, index, this.f15792i);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    this.f15793j = m.o(typedArrayObtainStyledAttributes, index, this.f15793j);
                    break;
                case 26:
                    this.f15757F = typedArrayObtainStyledAttributes.getInt(index, this.f15757F);
                    break;
                case 27:
                    this.f15759H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15759H);
                    break;
                case 28:
                    this.f15795k = m.o(typedArrayObtainStyledAttributes, index, this.f15795k);
                    break;
                case 29:
                    this.f15797l = m.o(typedArrayObtainStyledAttributes, index, this.f15797l);
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    this.f15763L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15763L);
                    break;
                case 31:
                    this.t = m.o(typedArrayObtainStyledAttributes, index, this.t);
                    break;
                case 32:
                    this.f15810u = m.o(typedArrayObtainStyledAttributes, index, this.f15810u);
                    break;
                case 33:
                    this.f15760I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15760I);
                    break;
                case 34:
                    this.f15801n = m.o(typedArrayObtainStyledAttributes, index, this.f15801n);
                    break;
                case 35:
                    this.f15799m = m.o(typedArrayObtainStyledAttributes, index, this.f15799m);
                    break;
                case 36:
                    this.f15814y = typedArrayObtainStyledAttributes.getFloat(index, this.f15814y);
                    break;
                case 37:
                    this.f15773V = typedArrayObtainStyledAttributes.getFloat(index, this.f15773V);
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    this.f15772U = typedArrayObtainStyledAttributes.getFloat(index, this.f15772U);
                    break;
                case 39:
                    this.f15774W = typedArrayObtainStyledAttributes.getInt(index, this.f15774W);
                    break;
                case 40:
                    this.f15775X = typedArrayObtainStyledAttributes.getInt(index, this.f15775X);
                    break;
                case 41:
                    m.p(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    m.p(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i10) {
                        case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                            this.f15752A = m.o(typedArrayObtainStyledAttributes, index, this.f15752A);
                            break;
                        case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                            this.f15753B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15753B);
                            break;
                        case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                            this.f15754C = typedArrayObtainStyledAttributes.getFloat(index, this.f15754C);
                            break;
                        default:
                            switch (i10) {
                                case 69:
                                    this.f15785e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f15787f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case KkCarPayResultDialog.SUCCESS_TITLE_MARGIN_TOP_DP /* 72 */:
                                    this.f15789g0 = typedArrayObtainStyledAttributes.getInt(index, this.f15789g0);
                                    break;
                                case 73:
                                    this.f15791h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15791h0);
                                    break;
                                case 74:
                                    this.f15796k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f15804o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15804o0);
                                    break;
                                case 76:
                                    this.f15806p0 = typedArrayObtainStyledAttributes.getInt(index, this.f15806p0);
                                    break;
                                case 77:
                                    this.f15808r = m.o(typedArrayObtainStyledAttributes, index, this.f15808r);
                                    break;
                                case 78:
                                    this.f15809s = m.o(typedArrayObtainStyledAttributes, index, this.f15809s);
                                    break;
                                case 79:
                                    this.f15771T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15771T);
                                    break;
                                case 80:
                                    this.f15764M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15764M);
                                    break;
                                case 81:
                                    this.f15776Y = typedArrayObtainStyledAttributes.getInt(index, this.f15776Y);
                                    break;
                                case 82:
                                    this.f15777Z = typedArrayObtainStyledAttributes.getInt(index, this.f15777Z);
                                    break;
                                case 83:
                                    this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 84:
                                    this.f15779a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15779a0);
                                    break;
                                case 85:
                                    this.f15783d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15783d0);
                                    break;
                                case 86:
                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 87:
                                    this.f15800m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15800m0);
                                    break;
                                case 88:
                                    this.f15802n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15802n0);
                                    break;
                                case 89:
                                    this.f15798l0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f15790h = typedArrayObtainStyledAttributes.getBoolean(index, this.f15790h);
                                    break;
                                case 91:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
