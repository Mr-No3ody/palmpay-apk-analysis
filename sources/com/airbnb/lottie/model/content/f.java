package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.y;
import com.airbnb.lottie.z;
import com.google.maps.android.BuildConfig;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19951c;

    public f(String str, int i7, boolean z3) {
        this.f19949a = str;
        this.f19950b = i7;
        this.f19951c = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content toContent(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        if (((HashSet) yVar.f20283A.f35518b).contains(z.f20329a)) {
            return new com.airbnb.lottie.animation.content.h(this);
        }
        com.airbnb.lottie.utils.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i7 = this.f19950b;
        if (i7 == 1) {
            str = "MERGE";
        } else if (i7 == 2) {
            str = "ADD";
        } else if (i7 == 3) {
            str = "SUBTRACT";
        } else if (i7 != 4) {
            str = i7 != 5 ? BuildConfig.TRAVIS : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
