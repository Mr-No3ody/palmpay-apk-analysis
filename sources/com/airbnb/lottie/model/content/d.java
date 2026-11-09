package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f19941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f19942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19944m;

    public d(String str, int i7, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.a aVar2, com.airbnb.lottie.model.animatable.a aVar3, com.airbnb.lottie.model.animatable.a aVar4, com.airbnb.lottie.model.animatable.b bVar, int i10, int i11, float f10, ArrayList arrayList, com.airbnb.lottie.model.animatable.b bVar2, boolean z3) {
        this.f19932a = str;
        this.f19933b = i7;
        this.f19934c = aVar;
        this.f19935d = aVar2;
        this.f19936e = aVar3;
        this.f19937f = aVar4;
        this.f19938g = bVar;
        this.f19939h = i10;
        this.f19940i = i11;
        this.f19941j = f10;
        this.f19942k = arrayList;
        this.f19943l = bVar2;
        this.f19944m = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.g(yVar, aVar, this);
    }
}
