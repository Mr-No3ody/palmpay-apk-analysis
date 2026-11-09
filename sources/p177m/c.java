package p177m;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final List<Uri> getClipDataUris$activity_release(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return z.f38935a;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i7 = 0; i7 < itemCount; i7++) {
                Uri uri = clipData.getItemAt(i7).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    private c() {
    }
}
