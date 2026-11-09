package H5;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends o implements Function1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f3706A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ float f3707B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ float f3708C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ int f3709H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ int f3710L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ int f3711M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final /* synthetic */ int f3712Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final /* synthetic */ int f3713X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ float f3714Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ float f3715Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f3716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Paint.Style f3717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f3718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f3719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f3720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f3721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3722g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ IIcon f3723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3724j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ float f3725k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f3726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3727p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f3728p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f3729q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ PorterDuff.Mode f3730r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f3731s0;
    public final /* synthetic */ int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f3732v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f3733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ColorStateList colorStateList, Paint.Style style, Typeface typeface, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, int i7, IIcon iIcon, String str, boolean z3, int i10, int i11, boolean z8, boolean z10, boolean z11, float f10, float f11, int i12, int i13, int i14, int i15, int i16, float f12, float f13, float f14, int i17, ColorStateList colorStateList5, PorterDuff.Mode mode, ColorFilter colorFilter) {
        super(1);
        this.f3716a = colorStateList;
        this.f3717b = style;
        this.f3718c = typeface;
        this.f3719d = colorStateList2;
        this.f3720e = colorStateList3;
        this.f3721f = colorStateList4;
        this.f3722g = i7;
        this.f3723i = iIcon;
        this.f3724j = str;
        this.f3726o = z3;
        this.f3727p = i10;
        this.t = i11;
        this.f3732v = z8;
        this.f3733w = z10;
        this.f3706A = z11;
        this.f3707B = f10;
        this.f3708C = f11;
        this.f3709H = i12;
        this.f3710L = i13;
        this.f3711M = i14;
        this.f3712Q = i15;
        this.f3713X = i16;
        this.f3714Y = f12;
        this.f3715Z = f13;
        this.f3725k0 = f14;
        this.f3728p0 = i17;
        this.f3729q0 = colorStateList5;
        this.f3730r0 = mode;
        this.f3731s0 = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IconicsDrawable apply = (IconicsDrawable) obj;
        Intrinsics.checkNotNullParameter(apply, "$this$apply");
        apply.g(this.f3716a);
        Paint.Style value = this.f3717b;
        Intrinsics.checkNotNullParameter(value, "value");
        ((TextPaint) apply.f23580c.f3699a).setStyle(value);
        apply.d();
        ((TextPaint) apply.f23580c.f3699a).setTypeface(this.f3718c);
        apply.d();
        c cVar = apply.f23581d;
        cVar.f3701c = this.f3719d;
        if (cVar.a(apply.getState())) {
            apply.d();
        }
        apply.f(this.f3720e);
        c cVar2 = apply.f23583f;
        cVar2.f3701c = this.f3721f;
        if (cVar2.a(apply.getState())) {
            apply.d();
        }
        apply.f23587j = this.f3722g;
        apply.d();
        apply.i(this.f3723i);
        String str = this.f3724j;
        apply.f23589l = str;
        if (str != null) {
            apply.i(null);
            apply.d();
        }
        boolean z3 = this.f3726o;
        apply.f23590m = z3;
        apply.setAutoMirrored(z3);
        apply.d();
        apply.k(this.f3727p);
        apply.l(this.t);
        apply.f23595r = this.f3732v;
        apply.d();
        boolean z8 = apply.f23596s;
        boolean z10 = this.f3733w;
        if (z10 != z8) {
            apply.f23596s = z10;
            apply.j(((z10 ? 1 : -1) * apply.f23600x) + apply.f23599w);
            apply.d();
        }
        apply.h(this.f3706A);
        apply.f23597u = this.f3707B;
        apply.d();
        apply.f23598v = this.f3708C;
        apply.d();
        apply.j(this.f3709H);
        int i7 = this.f3710L;
        apply.f23600x = i7;
        apply.f23583f.f3699a.setStrokeWidth(i7);
        if (true != apply.f23596s) {
            apply.f23596s = true;
            apply.j(apply.f23600x + apply.f23599w);
            apply.d();
        }
        apply.d();
        int i10 = this.f3711M;
        apply.f23601y = i10;
        apply.f23581d.f3699a.setStrokeWidth(i10);
        apply.h(true);
        apply.d();
        apply.f23602z = this.f3712Q;
        apply.d();
        apply.f23569A = this.f3713X;
        apply.d();
        apply.f23570B = this.f3714Y;
        apply.p();
        apply.f23571C = this.f3715Z;
        apply.p();
        apply.f23572D = this.f3725k0;
        apply.p();
        apply.f23573E = this.f3728p0;
        apply.p();
        apply.d();
        apply.f23574F = this.f3729q0;
        apply.q();
        apply.d();
        PorterDuff.Mode value2 = this.f3730r0;
        Intrinsics.checkNotNullParameter(value2, "value");
        apply.f23575G = value2;
        apply.q();
        apply.d();
        apply.f23577I = this.f3731s0;
        apply.d();
        return Unit.f38893a;
    }
}
