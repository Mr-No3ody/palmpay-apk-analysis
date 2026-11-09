package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DrawingContent, PathContent, BaseKeyframeAnimation$AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4.a f19655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f19656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.utils.h f19657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f19658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f19659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f19660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f19663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f19664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f19665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f19666l;

    public c(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.l lVar, com.airbnb.lottie.k kVar) {
        com.airbnb.lottie.model.animatable.d dVar;
        String str = lVar.f19980a;
        List list = lVar.f19981b;
        ArrayList arrayList = new ArrayList(list.size());
        int i7 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Content content = ((ContentModel) list.get(i10)).toContent(yVar, kVar, aVar);
            if (content != null) {
                arrayList.add(content);
            }
        }
        while (true) {
            if (i7 >= list.size()) {
                dVar = null;
                break;
            }
            ContentModel contentModel = (ContentModel) list.get(i7);
            if (contentModel instanceof com.airbnb.lottie.model.animatable.d) {
                dVar = (com.airbnb.lottie.model.animatable.d) contentModel;
                break;
            }
            i7++;
        }
        this(yVar, aVar, str, lVar.f19982c, arrayList, dVar);
    }

    public final List a() {
        if (this.f19665k == null) {
            this.f19665k = new ArrayList();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f19663i;
                if (i7 >= arrayList.size()) {
                    break;
                }
                Content content = (Content) arrayList.get(i7);
                if (content instanceof PathContent) {
                    this.f19665k.add((PathContent) content);
                }
                i7++;
            }
        }
        return this.f19665k;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        q qVar = this.f19666l;
        if (qVar != null) {
            qVar.c(obj, cVar);
        }
    }

    public final boolean b() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19663i;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i7) instanceof DrawingContent) && (i10 = i10 + 1) >= 2) {
                return true;
            }
            i7++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        if (this.f19662h) {
            return;
        }
        Matrix matrix2 = this.f19658d;
        matrix2.set(matrix);
        q qVar = this.f19666l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
            com.airbnb.lottie.animation.keyframe.d dVar = qVar.f19847p;
            i7 = (int) (((((dVar == null ? 100 : ((Integer) dVar.e()).intValue()) / 100.0f) * i7) / 255.0f) * 255.0f);
        }
        y yVar = this.f19664j;
        boolean z3 = (yVar.f20301X && b() && i7 != 255) || (aVar != null && yVar.f20302Y && b());
        int i10 = z3 ? 255 : i7;
        com.airbnb.lottie.utils.h hVar = this.f19657c;
        if (z3) {
            RectF rectF = this.f19656b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(rectF, matrix, true);
            C4.a aVar2 = this.f19655a;
            aVar2.f1155b = i7;
            if (aVar != null) {
                if (Color.alpha(aVar.f20219d) > 0) {
                    aVar2.f1156c = aVar;
                } else {
                    aVar2.f1156c = null;
                }
                aVar = null;
            } else {
                aVar2.f1156c = null;
            }
            canvas = hVar.e(canvas, rectF, aVar2);
        } else if (aVar != null) {
            com.airbnb.lottie.utils.a aVar3 = new com.airbnb.lottie.utils.a(aVar);
            aVar3.b(i10);
            aVar = aVar3;
        }
        ArrayList arrayList = this.f19663i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof DrawingContent) {
                ((DrawingContent) obj).draw(canvas, matrix2, i10, aVar);
            }
        }
        if (z3) {
            hVar.c();
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        Matrix matrix2 = this.f19658d;
        matrix2.set(matrix);
        q qVar = this.f19666l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
        }
        RectF rectF2 = this.f19660f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f19663i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).getBounds(rectF2, matrix2, z3);
                rectF.union(rectF2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19661g;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Matrix matrix = this.f19658d;
        matrix.reset();
        q qVar = this.f19666l;
        if (qVar != null) {
            matrix.set(qVar.e());
        }
        Path path = this.f19659e;
        path.reset();
        if (!this.f19662h) {
            ArrayList arrayList = this.f19663i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Content content = (Content) arrayList.get(size);
                if (content instanceof PathContent) {
                    path.addPath(((PathContent) content).getPath(), matrix);
                }
            }
        }
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19664j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        String str = this.f19661g;
        if (!eVar.c(i7, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            p212o1.e eVar3 = new p212o1.e(eVar2);
            eVar3.f40009a.add(str);
            if (eVar.a(i7, str)) {
                p212o1.e eVar4 = new p212o1.e(eVar3);
                eVar4.f40010b = this;
                list.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i7, str)) {
            return;
        }
        int iB = eVar.b(i7, str) + i7;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19663i;
            if (i10 >= arrayList.size()) {
                return;
            }
            Content content = (Content) arrayList.get(i10);
            if (content instanceof KeyPathElement) {
                ((KeyPathElement) content).resolveKeyPath(eVar, iB, list, eVar2);
            }
            i10++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f19663i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            Content content = (Content) arrayList.get(size2);
            content.setContents(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(content);
        }
    }

    public c(y yVar, com.airbnb.lottie.model.layer.a aVar, String str, boolean z3, ArrayList arrayList, com.airbnb.lottie.model.animatable.d dVar) {
        this.f19655a = new C4.a(8);
        this.f19656b = new RectF();
        this.f19657c = new com.airbnb.lottie.utils.h();
        this.f19658d = new Matrix();
        this.f19659e = new Path();
        this.f19660f = new RectF();
        this.f19661g = str;
        this.f19664j = yVar;
        this.f19662h = z3;
        this.f19663i = arrayList;
        if (dVar != null) {
            q qVar = new q(dVar);
            this.f19666l = qVar;
            qVar.a(aVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof GreedyContent) {
                arrayList2.add((GreedyContent) content);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((GreedyContent) arrayList2.get(size2)).absorbContent(arrayList.listIterator(arrayList.size()));
        }
    }
}
