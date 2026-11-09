package com.airbnb.lottie.model.content;

import N8.q0;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19986d;

    public m(String str, int i7, com.airbnb.lottie.model.animatable.a aVar, boolean z3) {
        this.f19983a = str;
        this.f19984b = i7;
        this.f19985c = aVar;
        this.f19986d = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.m(yVar, aVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f19983a);
        sb2.append(", index=");
        return q0.m(sb2, this.f19984b, '}');
    }
}
