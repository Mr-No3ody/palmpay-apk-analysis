package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19996j;

    public n(String str, com.airbnb.lottie.model.animatable.b bVar, ArrayList arrayList, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.a aVar2, com.airbnb.lottie.model.animatable.b bVar2, int i7, int i10, float f10, boolean z3) {
        this.f19987a = str;
        this.f19988b = bVar;
        this.f19989c = arrayList;
        this.f19990d = aVar;
        this.f19991e = aVar2;
        this.f19992f = bVar2;
        this.f19993g = i7;
        this.f19994h = i10;
        this.f19995i = f10;
        this.f19996j = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.n(yVar, aVar, this);
    }
}
