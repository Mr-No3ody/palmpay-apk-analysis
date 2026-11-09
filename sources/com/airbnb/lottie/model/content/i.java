package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f19970b;

    public i(String str, com.airbnb.lottie.model.animatable.b bVar) {
        this.f19969a = str;
        this.f19970b = bVar;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.l(yVar, aVar, this);
    }
}
