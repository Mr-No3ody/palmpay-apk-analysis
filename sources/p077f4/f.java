package p077f4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final g create() {
        Gson gsonCreate = new GsonBuilder().addSerializationExclusionStrategy(new e(0)).addDeserializationExclusionStrategy(new e(1)).create();
        Intrinsics.e(gsonCreate);
        return create(gsonCreate);
    }

    private f() {
    }

    @NotNull
    public final g create(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new g(gson);
    }
}
