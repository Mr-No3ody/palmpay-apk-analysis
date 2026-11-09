package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f19975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19979f;

    public k(String str, boolean z3, Path.FillType fillType, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.a aVar2, boolean z8) {
        this.f19976c = str;
        this.f19974a = z3;
        this.f19975b = fillType;
        this.f19977d = aVar;
        this.f19978e = aVar2;
        this.f19979f = z8;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.e(yVar, aVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f19974a + '}';
    }
}
