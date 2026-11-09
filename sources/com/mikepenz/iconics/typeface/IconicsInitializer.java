package com.mikepenz.iconics.typeface;

import M5.a;
import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mikepenz/iconics/typeface/IconicsInitializer;", "Landroidx/startup/Initializer;", "LM5/a;", "<init>", "()V", "iconics-typeface-api"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IconicsInitializer implements Initializer<a> {
    @Override // androidx.startup.Initializer
    public final a create(Context value) {
        Intrinsics.checkNotNullParameter(value, "context");
        a aVar = a.f5768a;
        Intrinsics.checkNotNullParameter(value, "value");
        if (a.f5769b == null) {
            a.f5769b = value.getApplicationContext();
        }
        return a.f5768a;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return z.f38935a;
    }
}
