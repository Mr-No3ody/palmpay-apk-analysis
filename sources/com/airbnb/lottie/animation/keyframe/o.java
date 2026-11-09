package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p243q1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p243q1.b f19827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p243q1.c f19828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p212o1.b f19829e;

    public o(p243q1.b bVar, p243q1.c cVar, p212o1.b bVar2) {
        this.f19827c = bVar;
        this.f19828d = cVar;
        this.f19829e = bVar2;
    }

    @Override // p243q1.c
    public final Object a(p243q1.b bVar) {
        float f10 = bVar.f41436a;
        float f11 = bVar.f41437b;
        String str = ((p212o1.b) bVar.f41438c).f39986a;
        String str2 = ((p212o1.b) bVar.f41439d).f39986a;
        float f12 = bVar.f41440e;
        float f13 = bVar.f41441f;
        float f14 = bVar.f41442g;
        p243q1.b bVar2 = this.f19827c;
        bVar2.f41436a = f10;
        bVar2.f41437b = f11;
        bVar2.f41438c = str;
        bVar2.f41439d = str2;
        bVar2.f41440e = f12;
        bVar2.f41441f = f13;
        bVar2.f41442g = f14;
        String str3 = (String) this.f19828d.a(bVar2);
        p212o1.b bVar3 = (p212o1.b) (bVar.f41441f == 1.0f ? bVar.f41439d : bVar.f41438c);
        String str4 = bVar3.f39987b;
        float f15 = bVar3.f39988c;
        int i7 = bVar3.f39989d;
        int i10 = bVar3.f39990e;
        float f16 = bVar3.f39991f;
        float f17 = bVar3.f39992g;
        int i11 = bVar3.f39993h;
        int i12 = bVar3.f39994i;
        float f18 = bVar3.f39995j;
        boolean z3 = bVar3.f39996k;
        PointF pointF = bVar3.f39997l;
        PointF pointF2 = bVar3.f39998m;
        p212o1.b bVar4 = this.f19829e;
        bVar4.f39986a = str3;
        bVar4.f39987b = str4;
        bVar4.f39988c = f15;
        bVar4.f39989d = i7;
        bVar4.f39990e = i10;
        bVar4.f39991f = f16;
        bVar4.f39992g = f17;
        bVar4.f39993h = i11;
        bVar4.f39994i = i12;
        bVar4.f39995j = f18;
        bVar4.f39996k = z3;
        bVar4.f39997l = pointF;
        bVar4.f39998m = pointF2;
        return bVar4;
    }
}
