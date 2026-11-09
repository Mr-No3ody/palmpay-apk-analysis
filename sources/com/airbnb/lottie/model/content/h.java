package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19963a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableValue f19967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19968f;

    public h(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.d dVar, boolean z3) {
        this.f19964b = str;
        this.f19965c = bVar;
        this.f19967e = bVar2;
        this.f19968f = dVar;
        this.f19966d = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        switch (this.f19963a) {
            case 0:
                return new com.airbnb.lottie.animation.content.j(yVar, aVar, this);
            default:
                return new com.airbnb.lottie.animation.content.k(yVar, aVar, this);
        }
    }

    public String toString() {
        switch (this.f19963a) {
            case 0:
                return "RectangleShape{position=" + this.f19967e + ", size=" + ((com.airbnb.lottie.model.animatable.a) this.f19968f) + '}';
            default:
                return super.toString();
        }
    }

    public h(String str, AnimatableValue animatableValue, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.b bVar, boolean z3) {
        this.f19964b = str;
        this.f19967e = animatableValue;
        this.f19968f = aVar;
        this.f19965c = bVar;
        this.f19966d = z3;
    }
}
