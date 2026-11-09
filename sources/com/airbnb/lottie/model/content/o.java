package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f20000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f20001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20002f;

    public o(String str, int i7, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z3) {
        this.f19997a = str;
        this.f19998b = i7;
        this.f19999c = bVar;
        this.f20000d = bVar2;
        this.f20001e = bVar3;
        this.f20002f = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.o(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f19999c + ", end: " + this.f20000d + ", offset: " + this.f20001e + "}";
    }
}
