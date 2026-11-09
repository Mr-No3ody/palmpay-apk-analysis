package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f19972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19973c;

    public j(PointF pointF, boolean z3, List list) {
        this.f19972b = pointF;
        this.f19973c = z3;
        this.f19971a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f19972b == null) {
            this.f19972b = new PointF();
        }
        this.f19972b.set(f10, f11);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f19971a.size() + "closed=" + this.f19973c + '}';
    }

    public j() {
        this.f19971a = new ArrayList();
    }
}
