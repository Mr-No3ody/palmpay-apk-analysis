package com.airbnb.lottie.animation.content;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.animation.keyframe.q;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements PathContent, GreedyContent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19719d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.f f19721f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19716a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f19717b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f19718c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19720e = new ArrayList();

    public h(com.airbnb.lottie.model.content.f fVar) {
        this.f19719d = fVar.f19949a;
        this.f19721f = fVar;
    }

    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.f19717b;
        path.reset();
        Path path2 = this.f19716a;
        path2.reset();
        ArrayList arrayList = this.f19720e;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            PathContent pathContent = (PathContent) arrayList.get(size);
            if (pathContent instanceof c) {
                c cVar = (c) pathContent;
                ArrayList arrayList2 = (ArrayList) cVar.a();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((PathContent) arrayList2.get(size2)).getPath();
                    q qVar = cVar.f19666l;
                    if (qVar != null) {
                        matrixE2 = qVar.e();
                    } else {
                        matrixE2 = cVar.f19658d;
                        matrixE2.reset();
                    }
                    path3.transform(matrixE2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(pathContent.getPath());
            }
        }
        int i7 = 0;
        PathContent pathContent2 = (PathContent) arrayList.get(0);
        if (pathContent2 instanceof c) {
            c cVar2 = (c) pathContent2;
            List listA = cVar2.a();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listA;
                if (i7 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((PathContent) arrayList3.get(i7)).getPath();
                q qVar2 = cVar2.f19666l;
                if (qVar2 != null) {
                    matrixE = qVar2.e();
                } else {
                    matrixE = cVar2.f19658d;
                    matrixE.reset();
                }
                path4.transform(matrixE);
                path2.addPath(path4);
                i7++;
            }
        } else {
            path2.set(pathContent2.getPath());
        }
        this.f19718c.op(path2, path, op);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public final void absorbContent(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof PathContent) {
                this.f19720e.add((PathContent) content);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19719d;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Path path = this.f19718c;
        path.reset();
        com.airbnb.lottie.model.content.f fVar = this.f19721f;
        if (!fVar.f19951c) {
            int i7 = F.i(fVar.f19950b);
            if (i7 == 0) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f19720e;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((PathContent) arrayList.get(i10)).getPath());
                    i10++;
                }
            } else {
                if (i7 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i7 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i7 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i7 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f19720e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((PathContent) arrayList.get(i7)).setContents(list, list2);
            i7++;
        }
    }
}
