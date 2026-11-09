package t0;

import androidx.graphics.shapes.Measurer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC1836c;
import kotlin.collections.C1850q;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1836c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f42289e = new k(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Measurer f42290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f42291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Af.d f42292d;

    public m(Measurer measurer, Af.d dVar, ArrayList arrayList, M.m mVar) {
        if (mVar.f5692b != arrayList.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        int i7 = mVar.f5692b;
        int i10 = 0;
        if (i7 == 0) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        float[] fArr = mVar.f5691a;
        float fB = 0.0f;
        if (fArr[0] != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (i7 == 0) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        if (fArr[i7 - 1] != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.f42290b = measurer;
        this.f42292d = dVar;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (mVar.b(i11) - mVar.b(i10) > 1.0E-4f) {
                arrayList2.add(new l(this, (e) arrayList.get(i10), fB, mVar.b(i11)));
                fB = mVar.b(i11);
            }
            i10 = i11;
        }
        l lVar = (l) arrayList2.get(C1850q.g(arrayList2));
        float f10 = lVar.f42286c;
        if (1.0f < f10) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        lVar.f42286c = f10;
        lVar.f42287d = 1.0f;
        this.f42291c = arrayList2;
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        return this.f42291c.size();
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return super.contains((l) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final Object get(int i7) {
        return (l) this.f42291c.get(i7);
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return super.indexOf((l) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return super.lastIndexOf((l) obj);
        }
        return -1;
    }
}
