package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19982c;

    public l(String str, List list, boolean z3) {
        this.f19980a = str;
        this.f19981b = list;
        this.f19982c = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.c(yVar, aVar, this, kVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f19980a + "' Shapes: " + Arrays.toString(this.f19981b.toArray()) + '}';
    }
}
