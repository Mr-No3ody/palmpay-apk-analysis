package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue f19918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19921e;

    public a(String str, AnimatableValue animatableValue, com.airbnb.lottie.model.animatable.a aVar, boolean z3, boolean z8) {
        this.f19917a = str;
        this.f19918b = animatableValue;
        this.f19919c = aVar;
        this.f19920d = z3;
        this.f19921e = z8;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.d(yVar, aVar, this);
    }
}
