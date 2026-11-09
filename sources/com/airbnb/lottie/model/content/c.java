package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f19925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f19929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19931h;

    public c(String str, int i7, Path.FillType fillType, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.a aVar2, com.airbnb.lottie.model.animatable.a aVar3, com.airbnb.lottie.model.animatable.a aVar4, boolean z3) {
        this.f19924a = i7;
        this.f19925b = fillType;
        this.f19926c = aVar;
        this.f19927d = aVar2;
        this.f19928e = aVar3;
        this.f19929f = aVar4;
        this.f19930g = str;
        this.f19931h = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.f(yVar, kVar, aVar, this);
    }
}
