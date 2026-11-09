package com.github.mikephil.charting.charts;

import A4.c;
import A4.f;
import B4.e;
import D4.b;
import F4.g;
import F4.i;
import G4.d;
import G4.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.IHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import java.util.ArrayList;
import java.util.Iterator;
import p045d3.k;
import p362y4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Chart<T extends e> extends ViewGroup implements ChartInterface {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f22394A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public g f22395B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public IHighlighter f22396C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public j f22397H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public a f22398L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f22399M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f22400Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f22405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f22406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f22407g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f22409j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f22410k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A4.e f22411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnChartValueSelectedListener f22412p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f22413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f22414q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public IMarker f22415r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f22416s0;
    public E4.c t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f22417t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f22418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnChartGestureListener f22419w;

    public Chart(Context context) {
        super(context);
        this.f22401a = false;
        this.f22402b = true;
        this.f22403c = true;
        this.f22404d = 0.9f;
        this.f22405e = new k(0);
        this.f22408i = true;
        this.f22418v = "No chart data available.";
        this.f22397H = new j();
        this.f22399M = 0.0f;
        this.f22400Q = 0.0f;
        this.f22410k0 = 0.0f;
        this.f22413p0 = 0.0f;
        this.f22414q0 = 0.0f;
        this.f22416s0 = new ArrayList();
        this.f22417t0 = false;
        c();
    }

    public static void d(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i7 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i7 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                d(viewGroup.getChildAt(i7));
                i7++;
            }
        }
    }

    public void a() {
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
    }

    public final void b(D4.c cVar) {
        setLastHighlighted(null);
        OnChartValueSelectedListener onChartValueSelectedListener = this.f22412p;
        if (onChartValueSelectedListener != null) {
            onChartValueSelectedListener.onNothingSelected();
        }
        invalidate();
    }

    public void c() {
        setWillNotDraw(false);
        this.f22398L = new a();
        Context context = getContext();
        DisplayMetrics displayMetrics = G4.i.f3002a;
        if (context == null) {
            G4.i.f3003b = ViewConfiguration.getMinimumFlingVelocity();
            G4.i.f3004c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            G4.i.f3003b = viewConfiguration.getScaledMinimumFlingVelocity();
            G4.i.f3004c = viewConfiguration.getScaledMaximumFlingVelocity();
            G4.i.f3002a = context.getResources().getDisplayMetrics();
        }
        this.f22414q0 = G4.i.b(500.0f);
        c cVar = new c();
        Paint.Align align = Paint.Align.RIGHT;
        cVar.f44c = G4.i.b(8.0f);
        this.f22409j = cVar;
        A4.e eVar = new A4.e();
        eVar.f46d = 1;
        eVar.f47e = 3;
        eVar.f48f = 1;
        eVar.f49g = 0.95f;
        eVar.f50h = 0.0f;
        eVar.f51i = 0.0f;
        new ArrayList(16);
        new ArrayList(16);
        new ArrayList(16);
        eVar.f44c = G4.i.b(10.0f);
        eVar.f42a = G4.i.b(5.0f);
        eVar.f43b = G4.i.b(3.0f);
        this.f22411o = eVar;
        i iVar = new i(this.f22397H);
        new ArrayList(16);
        new Paint.FontMetrics();
        new Path();
        Paint paint = new Paint(1);
        iVar.f2580d = paint;
        paint.setTextSize(G4.i.b(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        new Paint(1).setStyle(Paint.Style.FILL);
        this.f22394A = iVar;
        f fVar = new f();
        fVar.f52j = 1;
        fVar.f53k = 1;
        fVar.f54l = 1;
        fVar.f43b = G4.i.b(4.0f);
        this.f22407g = fVar;
        new Paint(1);
        Paint paint2 = new Paint(1);
        this.f22406f = paint2;
        paint2.setColor(Color.rgb(247, 189, 51));
        this.f22406f.setTextAlign(Paint.Align.CENTER);
        this.f22406f.setTextSize(G4.i.b(12.0f));
    }

    public a getAnimator() {
        return this.f22398L;
    }

    public d getCenter() {
        return d.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public d getCenterOfView() {
        return getCenter();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public d getCenterOffsets() {
        RectF rectF = this.f22397H.f3007b;
        return d.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public RectF getContentRect() {
        return this.f22397H.f3007b;
    }

    public T getData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public IValueFormatter getDefaultValueFormatter() {
        return this.f22405e;
    }

    public c getDescription() {
        return this.f22409j;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f22404d;
    }

    public float getExtraBottomOffset() {
        return this.f22410k0;
    }

    public float getExtraLeftOffset() {
        return this.f22413p0;
    }

    public float getExtraRightOffset() {
        return this.f22400Q;
    }

    public float getExtraTopOffset() {
        return this.f22399M;
    }

    public D4.c[] getHighlighted() {
        return null;
    }

    public IHighlighter getHighlighter() {
        return this.f22396C;
    }

    public ArrayList<Runnable> getJobs() {
        return this.f22416s0;
    }

    public A4.e getLegend() {
        return this.f22411o;
    }

    public i getLegendRenderer() {
        return this.f22394A;
    }

    public IMarker getMarker() {
        return this.f22415r0;
    }

    @Deprecated
    public IMarker getMarkerView() {
        return getMarker();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getMaxHighlightDistance() {
        return this.f22414q0;
    }

    public OnChartGestureListener getOnChartGestureListener() {
        return this.f22419w;
    }

    public E4.c getOnTouchListener() {
        return this.t;
    }

    public g getRenderer() {
        return this.f22395B;
    }

    public j getViewPortHandler() {
        return this.f22397H;
    }

    public f getXAxis() {
        return this.f22407g;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMax() {
        return this.f22407g.f39g;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMin() {
        return this.f22407g.f40h;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXRange() {
        return this.f22407g.f41i;
    }

    public float getYMax() {
        throw null;
    }

    public float getYMin() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22417t0) {
            d(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (TextUtils.isEmpty(this.f22418v)) {
            return;
        }
        d center = getCenter();
        int i7 = p376z4.a.f44435a[this.f22406f.getTextAlign().ordinal()];
        if (i7 == 1) {
            center.f2987b = 0.0f;
            canvas.drawText(this.f22418v, 0.0f, center.f2988c, this.f22406f);
        } else {
            if (i7 != 2) {
                canvas.drawText(this.f22418v, center.f2987b, center.f2988c, this.f22406f);
                return;
            }
            float f10 = (float) (((double) center.f2987b) * 2.0d);
            center.f2987b = f10;
            canvas.drawText(this.f22418v, f10, center.f2988c, this.f22406f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).layout(i7, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int iB = (int) G4.i.b(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iB, i7)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iB, i10)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 > 0 && i10 > 0 && i7 < 10000 && i10 < 10000) {
            j jVar = this.f22397H;
            RectF rectF = jVar.f3007b;
            float f10 = rectF.left;
            float f11 = rectF.top;
            float f12 = jVar.f3008c - rectF.right;
            float fB = jVar.b();
            jVar.f3009d = i10;
            jVar.f3008c = i7;
            jVar.d(f10, f11, f12, fB);
        }
        ArrayList arrayList = this.f22416s0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            post((Runnable) it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i7, i10, i11, i12);
    }

    public void setDescription(c cVar) {
        this.f22409j = cVar;
    }

    public void setDragDecelerationEnabled(boolean z3) {
        this.f22403c = z3;
    }

    public void setDragDecelerationFrictionCoef(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 >= 1.0f) {
            f10 = 0.999f;
        }
        this.f22404d = f10;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z3) {
        setDrawMarkers(z3);
    }

    public void setDrawMarkers(boolean z3) {
    }

    public void setExtraBottomOffset(float f10) {
        this.f22410k0 = G4.i.b(f10);
    }

    public void setExtraLeftOffset(float f10) {
        this.f22413p0 = G4.i.b(f10);
    }

    public void setExtraRightOffset(float f10) {
        this.f22400Q = G4.i.b(f10);
    }

    public void setExtraTopOffset(float f10) {
        this.f22399M = G4.i.b(f10);
    }

    public void setHardwareAccelerationEnabled(boolean z3) {
        if (z3) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z3) {
        this.f22402b = z3;
    }

    public void setHighlighter(b bVar) {
        this.f22396C = bVar;
    }

    public void setLastHighlighted(D4.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length > 0) {
            D4.c cVar = cVarArr[0];
        }
        this.t.getClass();
    }

    public void setLogEnabled(boolean z3) {
        this.f22401a = z3;
    }

    public void setMarker(IMarker iMarker) {
        this.f22415r0 = iMarker;
    }

    @Deprecated
    public void setMarkerView(IMarker iMarker) {
        setMarker(iMarker);
    }

    public void setMaxHighlightDistance(float f10) {
        this.f22414q0 = G4.i.b(f10);
    }

    public void setNoDataText(String str) {
        this.f22418v = str;
    }

    public void setNoDataTextAlignment(Paint.Align align) {
        this.f22406f.setTextAlign(align);
    }

    public void setNoDataTextColor(int i7) {
        this.f22406f.setColor(i7);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f22406f.setTypeface(typeface);
    }

    public void setOnChartGestureListener(OnChartGestureListener onChartGestureListener) {
        this.f22419w = onChartGestureListener;
    }

    public void setOnChartValueSelectedListener(OnChartValueSelectedListener onChartValueSelectedListener) {
        this.f22412p = onChartValueSelectedListener;
    }

    public void setOnTouchListener(E4.c cVar) {
        this.t = cVar;
    }

    public void setRenderer(g gVar) {
        if (gVar != null) {
            this.f22395B = gVar;
        }
    }

    public void setTouchEnabled(boolean z3) {
        this.f22408i = z3;
    }

    public void setUnbindEnabled(boolean z3) {
        this.f22417t0 = z3;
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22401a = false;
        this.f22402b = true;
        this.f22403c = true;
        this.f22404d = 0.9f;
        this.f22405e = new k(0);
        this.f22408i = true;
        this.f22418v = "No chart data available.";
        this.f22397H = new j();
        this.f22399M = 0.0f;
        this.f22400Q = 0.0f;
        this.f22410k0 = 0.0f;
        this.f22413p0 = 0.0f;
        this.f22414q0 = 0.0f;
        this.f22416s0 = new ArrayList();
        this.f22417t0 = false;
        c();
    }

    public Chart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22401a = false;
        this.f22402b = true;
        this.f22403c = true;
        this.f22404d = 0.9f;
        this.f22405e = new k(0);
        this.f22408i = true;
        this.f22418v = "No chart data available.";
        this.f22397H = new j();
        this.f22399M = 0.0f;
        this.f22400Q = 0.0f;
        this.f22410k0 = 0.0f;
        this.f22413p0 = 0.0f;
        this.f22414q0 = 0.0f;
        this.f22416s0 = new ArrayList();
        this.f22417t0 = false;
        c();
    }

    public void setData(T t) {
    }
}
