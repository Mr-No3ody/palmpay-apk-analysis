package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableValue f19955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19962k;

    public g(String str, int i7, com.airbnb.lottie.model.animatable.b bVar, AnimatableValue animatableValue, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z3, boolean z8) {
        this.f19952a = str;
        this.f19953b = i7;
        this.f19954c = bVar;
        this.f19955d = animatableValue;
        this.f19956e = bVar2;
        this.f19957f = bVar3;
        this.f19958g = bVar4;
        this.f19959h = bVar5;
        this.f19960i = bVar6;
        this.f19961j = z3;
        this.f19962k = z8;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.i(yVar, aVar, this);
    }
}
