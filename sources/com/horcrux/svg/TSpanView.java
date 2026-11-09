package com.horcrux.svg;

import N8.q0;
import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.text.ReactFontManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class TSpanView extends TextView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Path f23385C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f23386H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextPathView f23387L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f23388M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f23389Q;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final AssetManager f23390k0;

    public TSpanView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f23388M = new ArrayList();
        this.f23389Q = new ArrayList();
        this.f23390k0 = this.mContext.getResources().getAssets();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView
    public final void clearCache() {
        this.f23385C = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f23386H == null) {
            clip(canvas, paint);
            b(canvas, paint, f10);
            return;
        }
        C1420q c1420q = this.f23397f;
        if (c1420q != null && c1420q.f23543a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f10)) {
                n(canvas, paint);
            }
            if (setupStrokePaint(paint, f10 * this.strokeOpacity)) {
                n(canvas, paint);
                return;
            }
            return;
        }
        ArrayList arrayList = this.f23388M;
        int size = arrayList.size();
        if (size > 0) {
            m(paint, e().f23520r);
            for (int i7 = 0; i7 < size; i7++) {
                String str = (String) arrayList.get(i7);
                Matrix matrix = (Matrix) this.f23389Q.get(i7);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        c(canvas, paint, f10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0214  */
    /* JADX WARN: Code duplicated, block: B:104:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0220  */
    /* JADX WARN: Code duplicated, block: B:108:0x022f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0268  */
    /* JADX WARN: Code duplicated, block: B:116:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x027f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0284  */
    /* JADX WARN: Code duplicated, block: B:121:0x028c  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d6 A[EDGE_INSN: B:132:0x02d6->B:133:0x02d8 BREAK  A[LOOP:5: B:125:0x02c1->B:131:0x02d1]] */
    /* JADX WARN: Code duplicated, block: B:135:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f9 A[PHI: r10
      0x02f9: PHI (r10v14 double) = (r10v13 double), (r10v35 double) binds: [B:134:0x02da, B:315:0x02f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x0307  */
    /* JADX WARN: Code duplicated, block: B:150:0x030e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0314  */
    /* JADX WARN: Code duplicated, block: B:155:0x031e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0323  */
    /* JADX WARN: Code duplicated, block: B:157:0x0326  */
    /* JADX WARN: Code duplicated, block: B:158:0x032b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0330  */
    /* JADX WARN: Code duplicated, block: B:160:0x0333  */
    /* JADX WARN: Code duplicated, block: B:161:0x0338  */
    /* JADX WARN: Code duplicated, block: B:162:0x0353  */
    /* JADX WARN: Code duplicated, block: B:163:0x0358  */
    /* JADX WARN: Code duplicated, block: B:165:0x035f  */
    /* JADX WARN: Code duplicated, block: B:208:0x042c  */
    /* JADX WARN: Code duplicated, block: B:212:0x044c  */
    /* JADX WARN: Code duplicated, block: B:214:0x045a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0465  */
    /* JADX WARN: Code duplicated, block: B:219:0x0471  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:226:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:229:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:230:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:233:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:237:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:242:0x0515  */
    /* JADX WARN: Code duplicated, block: B:245:0x052e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0569 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x056b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0589  */
    /* JADX WARN: Code duplicated, block: B:253:0x0597  */
    /* JADX WARN: Code duplicated, block: B:256:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:261:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:263:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:265:0x05da  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:269:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:270:0x0601  */
    /* JADX WARN: Code duplicated, block: B:274:0x064b  */
    /* JADX WARN: Code duplicated, block: B:277:0x0667  */
    /* JADX WARN: Code duplicated, block: B:278:0x068b  */
    /* JADX WARN: Code duplicated, block: B:280:0x069c  */
    /* JADX WARN: Code duplicated, block: B:281:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:283:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:284:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:286:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:291:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:294:0x071c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0729  */
    /* JADX WARN: Code duplicated, block: B:312:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x02d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0477 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fb  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x0196
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final android.graphics.Path getPath(android.graphics.Canvas r86, android.graphics.Paint r87) {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TSpanView.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        Region region;
        if (this.f23386H == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView, android.view.View
    public final void invalidate() {
        this.f23385C = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.TextView
    public final double j(Paint paint) {
        if (!Double.isNaN(this.f23396B)) {
            return this.f23396B;
        }
        String str = this.f23386H;
        double dJ = 0.0d;
        if (str == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof TextView) {
                    dJ += ((TextView) childAt).j(paint);
                }
            }
            this.f23396B = dJ;
            return dJ;
        }
        if (str.length() == 0) {
            this.f23396B = 0.0d;
            return 0.0d;
        }
        C1412i c1412i = e().f23520r;
        m(paint, c1412i);
        l(paint, c1412i);
        double dMeasureText = paint.measureText(str);
        this.f23396B = dMeasureText;
        return dMeasureText;
    }

    public final void l(Paint paint, C1412i c1412i) {
        int i7 = Build.VERSION.SDK_INT;
        double d2 = c1412i.f23473a * ((double) this.mScale);
        double d10 = c1412i.f23486n;
        paint.setLetterSpacing((float) (d10 / d2));
        String str = c1412i.f23479g;
        if (d10 == 0.0d && c1412i.f23481i == 1) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + str);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + str);
        }
        if (i7 >= 26) {
            paint.setFontVariationSettings("'wght' " + c1412i.f23478f + c1412i.f23480h);
        }
    }

    public final void m(Paint paint, C1412i c1412i) {
        int i7 = 0;
        boolean z3 = c1412i.f23477e == b0.Bold || c1412i.f23478f >= 550;
        boolean z8 = c1412i.f23475c == 2;
        if (z3 && z8) {
            i7 = 3;
        } else if (z3) {
            i7 = 1;
        } else if (z8) {
            i7 = 2;
        }
        int i10 = c1412i.f23478f;
        AssetManager assetManager = this.f23390k0;
        Typeface typeface = null;
        String str = c1412i.f23474b;
        if (str != null && str.length() > 0) {
            String strK = q0.k("fonts/", str, ".otf");
            String strK2 = q0.k("fonts/", str, ".ttf");
            if (Build.VERSION.SDK_INT >= 26) {
                Z.s();
                Typeface.Builder builderG = Z.g(assetManager, strK);
                StringBuilder sb2 = new StringBuilder("'wght' ");
                sb2.append(i10);
                String str2 = c1412i.f23480h;
                sb2.append(str2);
                builderG.setFontVariationSettings(sb2.toString());
                builderG.setWeight(i10);
                builderG.setItalic(z8);
                typeface = builderG.build();
                if (typeface == null) {
                    Z.s();
                    Typeface.Builder builderG2 = Z.g(assetManager, strK2);
                    builderG2.setFontVariationSettings("'wght' " + i10 + str2);
                    builderG2.setWeight(i10);
                    builderG2.setItalic(z8);
                    typeface = builderG2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(assetManager, strK), i7);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(assetManager, strK2), i7);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i7, assetManager);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i10, z8);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (c1412i.f23473a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    public final void n(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        C1413j c1413jE = e();
        g();
        C1412i c1412i = c1413jE.f23520r;
        TextPaint textPaint = new TextPaint(paint);
        m(textPaint, c1412i);
        l(textPaint, c1412i);
        double d2 = c1413jE.f23519q;
        int i7 = androidx.camera.camera2.internal.F.i(c1412i.f23482j);
        if (i7 != 1) {
            alignment = i7 != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        SpannableString spannableString = new SpannableString(this.f23386H);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) p264r5.a.k(this.f23397f, canvas.getWidth(), this.mScale, d2)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        int lineAscent = staticLayoutBuild.getLineAscent(0);
        float fC = (float) c1413jE.c(0.0d);
        float fD = (float) (c1413jE.d() + ((double) lineAscent));
        f();
        canvas.save();
        canvas.translate(fC, fD);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }
}
