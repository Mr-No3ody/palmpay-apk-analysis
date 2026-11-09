package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements PathContent, BaseKeyframeAnimation$AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f19768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.m f19769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19770f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19765a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F1.b f19771g = new F1.b(2);

    public m(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.m mVar) {
        this.f19766b = mVar.f19983a;
        this.f19767c = mVar.f19986d;
        this.f19768d = yVar;
        com.airbnb.lottie.animation.keyframe.m mVar2 = new com.airbnb.lottie.animation.keyframe.m((List) mVar.f19985c.f1592b);
        this.f19769e = mVar2;
        aVar.a(mVar2);
        mVar2.a(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        if (obj == LottieProperty.f19607N) {
            this.f19769e.j(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19766b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        boolean z3 = this.f19770f;
        Path path = this.f19765a;
        com.airbnb.lottie.animation.keyframe.m mVar = this.f19769e;
        if (z3 && mVar.f19793e == null) {
            return path;
        }
        path.reset();
        if (this.f19767c) {
            this.f19770f = true;
            return path;
        }
        Path path2 = (Path) mVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f19771g.f(path);
        this.f19770f = true;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19770f = false;
        this.f19768d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Content content = (Content) list.get(i7);
            if (content instanceof o) {
                o oVar = (o) content;
                if (oVar.f19779d == 1) {
                    this.f19771g.f2516a.add(oVar);
                    oVar.a(this);
                } else if (!(content instanceof ShapeModifierContent)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ShapeModifierContent shapeModifierContent = (ShapeModifierContent) content;
                    shapeModifierContent.addUpdateListener(this);
                    arrayList.add(shapeModifierContent);
                }
            } else if (!(content instanceof ShapeModifierContent)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ShapeModifierContent shapeModifierContent2 = (ShapeModifierContent) content;
                shapeModifierContent2.addUpdateListener(this);
                arrayList.add(shapeModifierContent2);
            }
        }
        this.f19769e.f19820m = arrayList;
    }
}
