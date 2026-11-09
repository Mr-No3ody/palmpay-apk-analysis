package androidx.constraintlayout.core;

import N8.q0;
import androidx.camera.video.u;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements LinearSystem$Row {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayRow$ArrayRowVariables f15085d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f15082a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15083b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15084c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15086e = false;

    public b(androidx.camera.video.internal.c cVar) {
        this.f15085d = new a(this, cVar);
    }

    public final void a(c cVar, int i7) {
        this.f15085d.put(cVar.j(i7), 1.0f);
        this.f15085d.put(cVar.j(i7), -1.0f);
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public void addError(g gVar) {
        int i7 = gVar.f15113d;
        float f10 = 1.0f;
        if (i7 != 1) {
            if (i7 == 2) {
                f10 = 1000.0f;
            } else if (i7 == 3) {
                f10 = 1000000.0f;
            } else if (i7 == 4) {
                f10 = 1.0E9f;
            } else if (i7 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f15085d.put(gVar, f10);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i7) {
        boolean z3 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z3 = true;
            }
            this.f15083b = i7;
        }
        if (z3) {
            this.f15085d.put(gVar, 1.0f);
            this.f15085d.put(gVar2, -1.0f);
            this.f15085d.put(gVar3, -1.0f);
        } else {
            this.f15085d.put(gVar, -1.0f);
            this.f15085d.put(gVar2, 1.0f);
            this.f15085d.put(gVar3, 1.0f);
        }
    }

    public final void c(g gVar, g gVar2, g gVar3, int i7) {
        boolean z3 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z3 = true;
            }
            this.f15083b = i7;
        }
        if (z3) {
            this.f15085d.put(gVar, 1.0f);
            this.f15085d.put(gVar2, -1.0f);
            this.f15085d.put(gVar3, 1.0f);
        } else {
            this.f15085d.put(gVar, -1.0f);
            this.f15085d.put(gVar2, 1.0f);
            this.f15085d.put(gVar3, -1.0f);
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public void clear() {
        this.f15085d.clear();
        this.f15082a = null;
        this.f15083b = 0.0f;
    }

    public final g d(boolean[] zArr, g gVar) {
        int i7;
        int currentSize = this.f15085d.getCurrentSize();
        g gVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < currentSize; i10++) {
            float variableValue = this.f15085d.getVariableValue(i10);
            if (variableValue < 0.0f) {
                g variable = this.f15085d.getVariable(i10);
                if ((zArr == null || !zArr[variable.f15111b]) && variable != gVar && (((i7 = variable.t) == 3 || i7 == 4) && variableValue < f10)) {
                    f10 = variableValue;
                    gVar2 = variable;
                }
            }
        }
        return gVar2;
    }

    public final void e(g gVar) {
        g gVar2 = this.f15082a;
        if (gVar2 != null) {
            this.f15085d.put(gVar2, -1.0f);
            this.f15082a.f15112c = -1;
            this.f15082a = null;
        }
        float fRemove = this.f15085d.remove(gVar, true) * (-1.0f);
        this.f15082a = gVar;
        if (fRemove == 1.0f) {
            return;
        }
        this.f15083b /= fRemove;
        this.f15085d.divideByAmount(fRemove);
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public final g getKey() {
        return this.f15082a;
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public g getPivotCandidate(c cVar, boolean[] zArr) {
        return d(zArr, null);
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public final void initFromRow(LinearSystem$Row linearSystem$Row) {
        if (linearSystem$Row instanceof b) {
            b bVar = (b) linearSystem$Row;
            this.f15082a = null;
            this.f15085d.clear();
            for (int i7 = 0; i7 < bVar.f15085d.getCurrentSize(); i7++) {
                this.f15085d.add(bVar.f15085d.getVariable(i7), bVar.f15085d.getVariableValue(i7), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public boolean isEmpty() {
        return this.f15082a == null && this.f15083b == 0.0f && this.f15085d.getCurrentSize() == 0;
    }

    public String toString() {
        boolean z3;
        String strJ = q0.j(this.f15082a == null ? "0" : "" + this.f15082a, " = ");
        if (this.f15083b != 0.0f) {
            StringBuilder sbS = u.s(strJ);
            sbS.append(this.f15083b);
            strJ = sbS.toString();
            z3 = true;
        } else {
            z3 = false;
        }
        int currentSize = this.f15085d.getCurrentSize();
        for (int i7 = 0; i7 < currentSize; i7++) {
            g variable = this.f15085d.getVariable(i7);
            if (variable != null) {
                float variableValue = this.f15085d.getVariableValue(i7);
                if (variableValue != 0.0f) {
                    String string = variable.toString();
                    if (z3) {
                        if (variableValue > 0.0f) {
                            strJ = q0.j(strJ, " + ");
                        } else {
                            strJ = q0.j(strJ, " - ");
                            variableValue *= -1.0f;
                        }
                    } else if (variableValue < 0.0f) {
                        strJ = q0.j(strJ, "- ");
                        variableValue *= -1.0f;
                    }
                    strJ = variableValue == 1.0f ? q0.j(strJ, string) : strJ + variableValue + " " + string;
                    z3 = true;
                }
            }
        }
        return !z3 ? q0.j(strJ, IdManager.DEFAULT_VERSION_NAME) : strJ;
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public final void updateFromFinalVariable(c cVar, g gVar, boolean z3) {
        if (gVar == null || !gVar.f15115f) {
            return;
        }
        float f10 = this.f15085d.get(gVar);
        this.f15083b = (gVar.f15114e * f10) + this.f15083b;
        this.f15085d.remove(gVar, z3);
        if (z3) {
            gVar.b(this);
        }
        if (this.f15085d.getCurrentSize() == 0) {
            this.f15086e = true;
            cVar.f15089a = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public void updateFromRow(c cVar, b bVar, boolean z3) {
        float fUse = this.f15085d.use(bVar, z3);
        this.f15083b = (bVar.f15083b * fUse) + this.f15083b;
        if (z3) {
            bVar.f15082a.b(this);
        }
        if (this.f15082a == null || this.f15085d.getCurrentSize() != 0) {
            return;
        }
        this.f15086e = true;
        cVar.f15089a = true;
    }

    @Override // androidx.constraintlayout.core.LinearSystem$Row
    public final void updateFromSystem(c cVar) {
        ArrayList arrayList;
        if (cVar.f15094f.length == 0) {
            return;
        }
        boolean z3 = false;
        while (!z3) {
            int currentSize = this.f15085d.getCurrentSize();
            int i7 = 0;
            while (true) {
                arrayList = this.f15084c;
                if (i7 >= currentSize) {
                    break;
                }
                g variable = this.f15085d.getVariable(i7);
                if (variable.f15112c != -1 || variable.f15115f) {
                    arrayList.add(variable);
                }
                i7++;
            }
            int size = arrayList.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) arrayList.get(i10);
                    if (gVar.f15115f) {
                        updateFromFinalVariable(cVar, gVar, true);
                    } else {
                        updateFromRow(cVar, cVar.f15094f[gVar.f15112c], true);
                    }
                }
                arrayList.clear();
            } else {
                z3 = true;
            }
        }
        if (this.f15082a == null || this.f15085d.getCurrentSize() != 0) {
            return;
        }
        this.f15086e = true;
        cVar.f15089a = true;
    }
}
