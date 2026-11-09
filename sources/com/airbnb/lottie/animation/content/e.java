package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.y;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DrawingContent, BaseKeyframeAnimation$AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f19676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f19680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f19681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f19682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f19683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f19684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.airbnb.lottie.animation.keyframe.d f19685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19686l;

    public e(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.k kVar) {
        Path path = new Path();
        this.f19675a = path;
        this.f19676b = new com.airbnb.lottie.animation.a(1, 0);
        this.f19680f = new ArrayList();
        this.f19677c = aVar;
        this.f19678d = kVar.f19976c;
        this.f19679e = kVar.f19979f;
        this.f19684j = yVar;
        if (aVar.e() != null) {
            com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = ((com.airbnb.lottie.model.animatable.b) aVar.e().f41176b).createAnimation();
            this.f19685k = hVarCreateAnimation;
            hVarCreateAnimation.a(this);
            aVar.a(this.f19685k);
        }
        com.airbnb.lottie.model.animatable.a aVar2 = kVar.f19977d;
        if (aVar2 == null) {
            this.f19681g = null;
            this.f19682h = null;
            return;
        }
        com.airbnb.lottie.model.animatable.a aVar3 = kVar.f19978e;
        path.setFillType(kVar.f19975b);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = aVar2.createAnimation();
        this.f19681g = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation;
        dVarCreateAnimation.a(this);
        aVar.a(dVarCreateAnimation);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation2 = aVar3.createAnimation();
        this.f19682h = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation2;
        dVarCreateAnimation2.a(this);
        aVar.a(dVarCreateAnimation2);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        PointF pointF = LottieProperty.f19608a;
        if (obj == 1) {
            this.f19681g.j(cVar);
            return;
        }
        if (obj == 4) {
            this.f19682h.j(cVar);
            return;
        }
        ColorFilter colorFilter = LottieProperty.f19602I;
        com.airbnb.lottie.model.layer.a aVar = this.f19677c;
        if (obj == colorFilter) {
            r rVar = this.f19683i;
            if (rVar != null) {
                aVar.h(rVar);
            }
            if (cVar == null) {
                this.f19683i = null;
                return;
            }
            r rVar2 = new r(null, cVar);
            this.f19683i = rVar2;
            rVar2.a(this);
            aVar.a(this.f19683i);
            return;
        }
        if (obj == LottieProperty.f19612e) {
            com.airbnb.lottie.animation.keyframe.d dVar = this.f19685k;
            if (dVar != null) {
                dVar.j(cVar);
                return;
            }
            r rVar3 = new r(null, cVar);
            this.f19685k = rVar3;
            rVar3.a(this);
            aVar.a(this.f19685k);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        MaskFilter maskFilter;
        if (this.f19679e) {
            return;
        }
        int iL = this.f19681g.l();
        float fIntValue = ((Integer) this.f19682h.e()).intValue() / 100.0f;
        int iC = (com.airbnb.lottie.utils.g.c((int) (i7 * fIntValue)) << 24) | (iL & FlexItem.MAX_SIZE);
        com.airbnb.lottie.animation.a aVar2 = this.f19676b;
        aVar2.setColor(iC);
        r rVar = this.f19683i;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f19685k;
        if (dVar != null) {
            float fFloatValue = ((Float) dVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (fFloatValue != this.f19686l) {
                com.airbnb.lottie.model.layer.a aVar3 = this.f19677c;
                if (aVar3.f20003A == fFloatValue) {
                    maskFilter = aVar3.f20004B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar3.f20004B = blurMaskFilter;
                    aVar3.f20003A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                aVar2.setMaskFilter(maskFilter);
            }
            this.f19686l = fFloatValue;
        }
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar2);
        } else {
            aVar2.clearShadowLayer();
        }
        Path path = this.f19675a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19680f;
            if (i10 >= arrayList.size()) {
                canvas.drawPath(path, aVar2);
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f19675a;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f19680f;
            if (i7 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i7)).getPath(), matrix);
                i7++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19678d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19684j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Content content = (Content) list2.get(i7);
            if (content instanceof PathContent) {
                this.f19680f.add((PathContent) content);
            }
        }
    }
}
