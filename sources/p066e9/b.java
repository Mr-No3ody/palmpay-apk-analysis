package p066e9;

import android.R;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f36187s = {R.attr.state_checkable, R.attr.state_checked};
    public static final int[] t = {R.attr.state_pressed, R.attr.state_checkable, R.attr.state_checked};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f36188u = {R.attr.state_checkable};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f36189v = {R.attr.state_pressed, R.attr.state_checkable};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f36190w = new int[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f36191x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f36192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f36193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f36194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f36195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f36203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f36204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f36205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f36207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f36209r;

    public b(c cVar) {
        this.f36207p = cVar.f36217h;
        this.f36197f = cVar.f36211b;
        this.f36196e = cVar.f36210a;
        this.f36198g = cVar.f36212c;
        this.f36206o = cVar.f36215f;
    }

    public final int a(int i7, int i10) {
        int i11 = ((this.f36196e / 2) + this.f36200i) - i7;
        int i12 = ((this.f36197f / 2) + this.f36201j) - i10;
        return (i12 * i12) + (i11 * i11);
    }
}
