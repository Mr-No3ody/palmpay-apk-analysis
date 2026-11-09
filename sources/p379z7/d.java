package p379z7;

import A7.b;
import com.rollingtextview.strategy.CharOrderStrategy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p365y7.a;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements CharOrderStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f44503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44505c;

    public d(a strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f44503a = strategy;
        this.f44504b = true;
        this.f44505c = true;
    }

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public final void afterCompute() {
        this.f44503a.afterCompute();
    }

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public final void beforeCompute(CharSequence sourceText, CharSequence targetText, List charPool) {
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(charPool, "charPool");
        this.f44503a.beforeCompute(sourceText, targetText, charPool);
        this.f44504b = true;
        this.f44505c = true;
    }

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public final Pair findCharOrder(CharSequence sourceText, CharSequence targetText, int i7, List charPool) {
        int i10;
        int i11;
        boolean z3;
        boolean z8;
        A7.d dVar;
        b bVar;
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(charPool, "charPool");
        Pair pairFindCharOrder = this.f44503a.findCharOrder(sourceText, targetText, i7, charPool);
        List dVar2 = (List) pairFindCharOrder.f38891a;
        b bVar2 = (b) pairFindCharOrder.f38892b;
        int iMax = Math.max(sourceText.length(), targetText.length());
        Iterator it = dVar2.iterator();
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                int i13 = i12 + 1;
                char cCharValue = ((Character) it.next()).charValue();
                if (cCharValue == '0') {
                    i10 = i12;
                    break;
                }
                if (cCharValue == 0) {
                    i12 = i13;
                }
            }
            i10 = -1;
            break;
        }
        ListIterator listIterator = dVar2.listIterator(dVar2.size());
        int size = dVar2.size();
        while (true) {
            if (listIterator.hasPrevious()) {
                char cCharValue2 = ((Character) listIterator.previous()).charValue();
                size--;
                if (cCharValue2 == '0') {
                    i11 = size;
                    break;
                }
                if (cCharValue2 != 0) {
                }
            }
            i11 = -1;
            break;
        }
        if (!this.f44504b || i10 == -1 || i7 == iMax - 1) {
            this.f44504b = false;
            z3 = false;
        } else {
            z3 = true;
        }
        if (!this.f44505c || i11 == -1 || i7 == iMax - 1) {
            this.f44505c = false;
            z8 = false;
        } else {
            z8 = true;
        }
        if (z3 && z8) {
            dVar2 = new A7.d(dVar2, (char) 0, (char) 0, new c(i10, 0), new c(i11, 1));
        } else {
            if (z3) {
                dVar = new A7.d(dVar2, new c(i10, 2), new c(i11, 3), 4);
            } else if (z8) {
                dVar = new A7.d(dVar2, new c(i10, 4), new c(i11, 5), 2);
            }
            dVar2 = dVar;
        }
        if (z3 && z8) {
            bVar = new b((i11 - i10) + 1, i10, dVar2);
        } else {
            if (!z3) {
                if (z8) {
                    bVar = new b(i11 + 1, 0, dVar2);
                }
                return new Pair(dVar2, bVar2);
            }
            bVar = new b(dVar2.size() - i10, i10, dVar2);
        }
        dVar2 = bVar;
        return new Pair(dVar2, bVar2);
    }

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public final a nextProgress(p365y7.b previousProgress, int i7, List columns, int i10) {
        Intrinsics.checkNotNullParameter(previousProgress, "previousProgress");
        Intrinsics.checkNotNullParameter(columns, "columns");
        return this.f44503a.nextProgress(previousProgress, i7, columns, i10);
    }
}
