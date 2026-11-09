package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ModifierContent, ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1.c f19904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue f19905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f19906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f19907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f19908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f19909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f19910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f19911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f19912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f19913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f19914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f19915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19916m;

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return null;
    }

    public d(F1.c cVar, AnimatableValue animatableValue, a aVar, b bVar, a aVar2, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8) {
        this.f19916m = false;
        this.f19904a = cVar;
        this.f19905b = animatableValue;
        this.f19906c = aVar;
        this.f19907d = bVar;
        this.f19908e = aVar2;
        this.f19914k = bVar2;
        this.f19915l = bVar3;
        this.f19909f = bVar4;
        this.f19910g = bVar5;
        this.f19911h = bVar6;
        this.f19912i = bVar7;
        this.f19913j = bVar8;
    }
}
