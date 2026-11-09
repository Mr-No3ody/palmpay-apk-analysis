package androidx.vectordrawable.graphics.drawable;

import Pa.C0505b;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f18183p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f18186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f18187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f18188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f18189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f18190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f18196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f18197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M.f f18198o;

    public n() {
        this.f18186c = new Matrix();
        this.f18191h = 0.0f;
        this.f18192i = 0.0f;
        this.f18193j = 0.0f;
        this.f18194k = 0.0f;
        this.f18195l = 255;
        this.f18196m = null;
        this.f18197n = null;
        this.f18198o = new M.f(0);
        this.f18190g = new k();
        this.f18184a = new Path();
        this.f18185b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i7, int i10) {
        char c6;
        float f10;
        int i11;
        k kVar2 = kVar;
        char c10 = 1;
        kVar2.f18169a.set(matrix);
        Matrix matrix2 = kVar2.f18169a;
        matrix2.preConcat(kVar2.f18178j);
        canvas.save();
        char c11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = kVar2.f18170b;
            if (i12 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l lVar = (l) arrayList.get(i12);
            if (lVar instanceof k) {
                a((k) lVar, matrix2, canvas, i7, i10);
            } else {
                if (lVar instanceof m) {
                    m mVar = (m) lVar;
                    float f11 = i7 / this.f18193j;
                    float f12 = i10 / this.f18194k;
                    float fMin = Math.min(f11, f12);
                    Matrix matrix3 = this.f18186c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c11], fArr[c10]);
                    boolean z3 = c10;
                    boolean z8 = c11;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f13 = (fArr[z8 ? 1 : 0] * fArr[3]) - (fArr[z3 ? 1 : 0] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f13) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f18184a;
                        mVar.getClass();
                        path.reset();
                        androidx.core.graphics.g[] gVarArr = mVar.f18180a;
                        if (gVarArr != null) {
                            androidx.core.graphics.g.b(gVarArr, path);
                        }
                        Path path2 = this.f18185b;
                        path2.reset();
                        if (mVar instanceof i) {
                            path2.setFillType(mVar.f18182c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            j jVar = (j) mVar;
                            float f14 = jVar.f18163i;
                            if (f14 != 0.0f || jVar.f18164j != 1.0f) {
                                float f15 = jVar.f18165k;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (jVar.f18164j + f15) % 1.0f;
                                if (this.f18189f == null) {
                                    this.f18189f = new PathMeasure();
                                }
                                this.f18189f.setPath(path, z8);
                                float length = this.f18189f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path.reset();
                                if (f18 > f19) {
                                    this.f18189f.getSegment(f18, length, path, z3);
                                    f10 = 0.0f;
                                    this.f18189f.getSegment(0.0f, f19, path, z3);
                                } else {
                                    f10 = 0.0f;
                                    this.f18189f.getSegment(f18, f19, path, z3);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix3);
                            C0505b c0505b = jVar.f18160f;
                            float f20 = 255.0f;
                            if ((((Shader) c0505b.f7073c) == null && c0505b.f7072b == 0) ? false : true) {
                                if (this.f18188e == null) {
                                    i11 = FlexItem.MAX_SIZE;
                                    Paint paint = new Paint(1);
                                    this.f18188e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i11 = FlexItem.MAX_SIZE;
                                }
                                Paint paint2 = this.f18188e;
                                Shader shader = (Shader) c0505b.f7073c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(jVar.f18162h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i13 = c0505b.f7072b;
                                    float f21 = jVar.f18162h;
                                    PorterDuff.Mode mode = q.f18212o;
                                    paint2.setColor((i13 & i11) | (((int) (Color.alpha(i13) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(jVar.f18182c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f20 = 255.0f;
                                i11 = FlexItem.MAX_SIZE;
                            }
                            C0505b c0505b2 = jVar.f18158d;
                            if (((Shader) c0505b2.f7073c) != null || c0505b2.f7072b != 0) {
                                if (this.f18187d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f18187d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f18187d;
                                Paint.Join join = jVar.f18167m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = jVar.f18166l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(jVar.f18168n);
                                Shader shader2 = (Shader) c0505b2.f7073c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(jVar.f18161g * f20));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i14 = c0505b2.f7072b;
                                    float f22 = jVar.f18161g;
                                    PorterDuff.Mode mode2 = q.f18212o;
                                    paint4.setColor((i14 & i11) | (((int) (Color.alpha(i14) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(jVar.f18159e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c6 = 1;
                }
                i12++;
                kVar2 = kVar;
                c10 = c6;
                c11 = 0;
            }
            c6 = c10;
            i12++;
            kVar2 = kVar;
            c10 = c6;
            c11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f18195l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f18195l = i7;
    }

    public n(n nVar) {
        this.f18186c = new Matrix();
        this.f18191h = 0.0f;
        this.f18192i = 0.0f;
        this.f18193j = 0.0f;
        this.f18194k = 0.0f;
        this.f18195l = 255;
        this.f18196m = null;
        this.f18197n = null;
        M.f fVar = new M.f(0);
        this.f18198o = fVar;
        this.f18190g = new k(nVar.f18190g, fVar);
        this.f18184a = new Path(nVar.f18184a);
        this.f18185b = new Path(nVar.f18185b);
        this.f18191h = nVar.f18191h;
        this.f18192i = nVar.f18192i;
        this.f18193j = nVar.f18193j;
        this.f18194k = nVar.f18194k;
        this.f18195l = nVar.f18195l;
        this.f18196m = nVar.f18196m;
        String str = nVar.f18196m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f18197n = nVar.f18197n;
    }
}
