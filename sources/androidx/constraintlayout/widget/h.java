package androidx.constraintlayout.widget;

import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f15745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f15746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f15747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f15748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f15749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f15750h;

    public h() {
        k kVar = new k();
        kVar.f15830a = false;
        kVar.f15831b = 0;
        kVar.f15832c = 0;
        kVar.f15833d = 1.0f;
        kVar.f15834e = Float.NaN;
        this.f15745c = kVar;
        j jVar = new j();
        jVar.f15817a = false;
        jVar.f15818b = -1;
        jVar.f15819c = 0;
        jVar.f15820d = null;
        jVar.f15821e = -1;
        jVar.f15822f = 0;
        jVar.f15823g = Float.NaN;
        jVar.f15824h = Float.NaN;
        jVar.f15825i = Float.NaN;
        jVar.f15826j = -1;
        jVar.f15827k = null;
        jVar.f15828l = -3;
        jVar.f15829m = -1;
        this.f15746d = jVar;
        i iVar = new i();
        iVar.f15778a = false;
        iVar.f15780b = false;
        iVar.f15784e = -1;
        iVar.f15786f = -1;
        iVar.f15788g = -1.0f;
        iVar.f15790h = true;
        iVar.f15792i = -1;
        iVar.f15793j = -1;
        iVar.f15795k = -1;
        iVar.f15797l = -1;
        iVar.f15799m = -1;
        iVar.f15801n = -1;
        iVar.f15803o = -1;
        iVar.f15805p = -1;
        iVar.f15807q = -1;
        iVar.f15808r = -1;
        iVar.f15809s = -1;
        iVar.t = -1;
        iVar.f15810u = -1;
        iVar.f15811v = -1;
        iVar.f15812w = -1;
        iVar.f15813x = 0.5f;
        iVar.f15814y = 0.5f;
        iVar.f15815z = null;
        iVar.f15752A = -1;
        iVar.f15753B = 0;
        iVar.f15754C = 0.0f;
        iVar.f15755D = -1;
        iVar.f15756E = -1;
        iVar.f15757F = -1;
        iVar.f15758G = 0;
        iVar.f15759H = 0;
        iVar.f15760I = 0;
        iVar.f15761J = 0;
        iVar.f15762K = 0;
        iVar.f15763L = 0;
        iVar.f15764M = 0;
        iVar.f15765N = Integer.MIN_VALUE;
        iVar.f15766O = Integer.MIN_VALUE;
        iVar.f15767P = Integer.MIN_VALUE;
        iVar.f15768Q = Integer.MIN_VALUE;
        iVar.f15769R = Integer.MIN_VALUE;
        iVar.f15770S = Integer.MIN_VALUE;
        iVar.f15771T = Integer.MIN_VALUE;
        iVar.f15772U = -1.0f;
        iVar.f15773V = -1.0f;
        iVar.f15774W = 0;
        iVar.f15775X = 0;
        iVar.f15776Y = 0;
        iVar.f15777Z = 0;
        iVar.f15779a0 = 0;
        iVar.b0 = 0;
        iVar.c0 = 0;
        iVar.f15783d0 = 0;
        iVar.f15785e0 = 1.0f;
        iVar.f15787f0 = 1.0f;
        iVar.f15789g0 = -1;
        iVar.f15791h0 = 0;
        iVar.i0 = -1;
        iVar.f15800m0 = false;
        iVar.f15802n0 = false;
        iVar.f15804o0 = true;
        iVar.f15806p0 = 0;
        this.f15747e = iVar;
        l lVar = new l();
        lVar.f15836a = false;
        lVar.f15837b = 0.0f;
        lVar.f15838c = 0.0f;
        lVar.f15839d = 0.0f;
        lVar.f15840e = 1.0f;
        lVar.f15841f = 1.0f;
        lVar.f15842g = Float.NaN;
        lVar.f15843h = Float.NaN;
        lVar.f15844i = -1;
        lVar.f15845j = 0.0f;
        lVar.f15846k = 0.0f;
        lVar.f15847l = 0.0f;
        lVar.f15848m = false;
        lVar.f15849n = 0.0f;
        this.f15748f = lVar;
        this.f15749g = new HashMap();
    }

    public final void a(ConstraintLayout.LayoutParams layoutParams) {
        i iVar = this.f15747e;
        layoutParams.f15642e = iVar.f15792i;
        layoutParams.f15644f = iVar.f15793j;
        layoutParams.f15646g = iVar.f15795k;
        layoutParams.f15648h = iVar.f15797l;
        layoutParams.f15650i = iVar.f15799m;
        layoutParams.f15651j = iVar.f15801n;
        layoutParams.f15653k = iVar.f15803o;
        layoutParams.f15655l = iVar.f15805p;
        layoutParams.f15657m = iVar.f15807q;
        layoutParams.f15659n = iVar.f15808r;
        layoutParams.f15661o = iVar.f15809s;
        layoutParams.f15668s = iVar.t;
        layoutParams.t = iVar.f15810u;
        layoutParams.f15669u = iVar.f15811v;
        layoutParams.f15670v = iVar.f15812w;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iVar.f15758G;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iVar.f15759H;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iVar.f15760I;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iVar.f15761J;
        layoutParams.f15610A = iVar.f15770S;
        layoutParams.f15611B = iVar.f15769R;
        layoutParams.f15672x = iVar.f15766O;
        layoutParams.f15674z = iVar.f15768Q;
        layoutParams.f15614E = iVar.f15813x;
        layoutParams.f15615F = iVar.f15814y;
        layoutParams.f15663p = iVar.f15752A;
        layoutParams.f15665q = iVar.f15753B;
        layoutParams.f15667r = iVar.f15754C;
        layoutParams.f15616G = iVar.f15815z;
        layoutParams.f15629T = iVar.f15755D;
        layoutParams.f15630U = iVar.f15756E;
        layoutParams.f15618I = iVar.f15772U;
        layoutParams.f15617H = iVar.f15773V;
        layoutParams.f15620K = iVar.f15775X;
        layoutParams.f15619J = iVar.f15774W;
        layoutParams.f15632W = iVar.f15800m0;
        layoutParams.f15633X = iVar.f15802n0;
        layoutParams.f15621L = iVar.f15776Y;
        layoutParams.f15622M = iVar.f15777Z;
        layoutParams.f15625P = iVar.f15779a0;
        layoutParams.f15626Q = iVar.b0;
        layoutParams.f15623N = iVar.c0;
        layoutParams.f15624O = iVar.f15783d0;
        layoutParams.f15627R = iVar.f15785e0;
        layoutParams.f15628S = iVar.f15787f0;
        layoutParams.f15631V = iVar.f15757F;
        layoutParams.f15639c = iVar.f15788g;
        layoutParams.f15636a = iVar.f15784e;
        layoutParams.f15638b = iVar.f15786f;
        ((ViewGroup.MarginLayoutParams) layoutParams).width = iVar.f15781c;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = iVar.f15782d;
        String str = iVar.f15798l0;
        if (str != null) {
            layoutParams.f15634Y = str;
        }
        layoutParams.f15635Z = iVar.f15806p0;
        layoutParams.setMarginStart(iVar.f15763L);
        layoutParams.setMarginEnd(iVar.f15762K);
        layoutParams.a();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        h hVar = new h();
        hVar.f15747e.a(this.f15747e);
        hVar.f15746d.a(this.f15746d);
        k kVar = hVar.f15745c;
        k kVar2 = this.f15745c;
        kVar.f15830a = kVar2.f15830a;
        kVar.f15831b = kVar2.f15831b;
        kVar.f15833d = kVar2.f15833d;
        kVar.f15834e = kVar2.f15834e;
        kVar.f15832c = kVar2.f15832c;
        hVar.f15748f.a(this.f15748f);
        hVar.f15743a = this.f15743a;
        hVar.f15750h = this.f15750h;
        return hVar;
    }

    public final void c(int i7, ConstraintLayout.LayoutParams layoutParams) {
        this.f15743a = i7;
        int i10 = layoutParams.f15642e;
        i iVar = this.f15747e;
        iVar.f15792i = i10;
        iVar.f15793j = layoutParams.f15644f;
        iVar.f15795k = layoutParams.f15646g;
        iVar.f15797l = layoutParams.f15648h;
        iVar.f15799m = layoutParams.f15650i;
        iVar.f15801n = layoutParams.f15651j;
        iVar.f15803o = layoutParams.f15653k;
        iVar.f15805p = layoutParams.f15655l;
        iVar.f15807q = layoutParams.f15657m;
        iVar.f15808r = layoutParams.f15659n;
        iVar.f15809s = layoutParams.f15661o;
        iVar.t = layoutParams.f15668s;
        iVar.f15810u = layoutParams.t;
        iVar.f15811v = layoutParams.f15669u;
        iVar.f15812w = layoutParams.f15670v;
        iVar.f15813x = layoutParams.f15614E;
        iVar.f15814y = layoutParams.f15615F;
        iVar.f15815z = layoutParams.f15616G;
        iVar.f15752A = layoutParams.f15663p;
        iVar.f15753B = layoutParams.f15665q;
        iVar.f15754C = layoutParams.f15667r;
        iVar.f15755D = layoutParams.f15629T;
        iVar.f15756E = layoutParams.f15630U;
        iVar.f15757F = layoutParams.f15631V;
        iVar.f15788g = layoutParams.f15639c;
        iVar.f15784e = layoutParams.f15636a;
        iVar.f15786f = layoutParams.f15638b;
        iVar.f15781c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
        iVar.f15782d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
        iVar.f15758G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        iVar.f15759H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        iVar.f15760I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        iVar.f15761J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        iVar.f15764M = layoutParams.f15613D;
        iVar.f15772U = layoutParams.f15618I;
        iVar.f15773V = layoutParams.f15617H;
        iVar.f15775X = layoutParams.f15620K;
        iVar.f15774W = layoutParams.f15619J;
        iVar.f15800m0 = layoutParams.f15632W;
        iVar.f15802n0 = layoutParams.f15633X;
        iVar.f15776Y = layoutParams.f15621L;
        iVar.f15777Z = layoutParams.f15622M;
        iVar.f15779a0 = layoutParams.f15625P;
        iVar.b0 = layoutParams.f15626Q;
        iVar.c0 = layoutParams.f15623N;
        iVar.f15783d0 = layoutParams.f15624O;
        iVar.f15785e0 = layoutParams.f15627R;
        iVar.f15787f0 = layoutParams.f15628S;
        iVar.f15798l0 = layoutParams.f15634Y;
        iVar.f15766O = layoutParams.f15672x;
        iVar.f15768Q = layoutParams.f15674z;
        iVar.f15765N = layoutParams.f15671w;
        iVar.f15767P = layoutParams.f15673y;
        iVar.f15770S = layoutParams.f15610A;
        iVar.f15769R = layoutParams.f15611B;
        iVar.f15771T = layoutParams.f15612C;
        iVar.f15806p0 = layoutParams.f15635Z;
        iVar.f15762K = layoutParams.getMarginEnd();
        iVar.f15763L = layoutParams.getMarginStart();
    }

    public final void d(int i7, Constraints.LayoutParams layoutParams) {
        c(i7, layoutParams);
        this.f15745c.f15833d = layoutParams.f15680r0;
        float f10 = layoutParams.f15683u0;
        l lVar = this.f15748f;
        lVar.f15837b = f10;
        lVar.f15838c = layoutParams.f15684v0;
        lVar.f15839d = layoutParams.f15685w0;
        lVar.f15840e = layoutParams.f15686x0;
        lVar.f15841f = layoutParams.f15687y0;
        lVar.f15842g = layoutParams.f15688z0;
        lVar.f15843h = layoutParams.f15676A0;
        lVar.f15845j = layoutParams.f15677B0;
        lVar.f15846k = layoutParams.f15678C0;
        lVar.f15847l = layoutParams.f15679D0;
        lVar.f15849n = layoutParams.f15682t0;
        lVar.f15848m = layoutParams.f15681s0;
    }
}
