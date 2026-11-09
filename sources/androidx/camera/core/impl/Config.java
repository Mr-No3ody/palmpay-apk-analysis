package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface Config {

    public interface OptionMatcher {
        boolean onOptionMatched(@NonNull V v3);
    }

    static boolean hasConflict(@NonNull W w3, @NonNull W w6) {
        W w10 = W.f13996c;
        return w3 == w10 && w6 == w10;
    }

    @NonNull
    static Config mergeConfigs(@Nullable Config config, @Nullable Config config2) {
        if (config == null && config2 == null) {
            return C1000q0.f14125c;
        }
        C0992m0 c0992m0C = config2 != null ? C0992m0.c(config2) : C0992m0.b();
        if (config != null) {
            Iterator<V> it = config.listOptions().iterator();
            while (it.hasNext()) {
                mergeOptionValue(c0992m0C, config2, config, it.next());
            }
        }
        return C1000q0.a(c0992m0C);
    }

    static void mergeOptionValue(@NonNull C0992m0 c0992m0, @NonNull Config config, @NonNull Config config2, @NonNull V v3) {
        if (!Objects.equals(v3, ImageOutputConfig.f13903I)) {
            c0992m0.insertOption(v3, config2.getOptionPriority(v3), config2.retrieveOption(v3));
            return;
        }
        I.b bVar = (I.b) config2.retrieveOption(v3, null);
        I.b bVar2 = (I.b) config.retrieveOption(v3, null);
        W optionPriority = config2.getOptionPriority(v3);
        if (bVar == null) {
            bVar = bVar2;
        } else if (bVar2 != null) {
            top.zibin.luban.io.a aVarD = top.zibin.luban.io.a.d(bVar2);
            I.a aVar = bVar.f3954a;
            if (aVar != null) {
                aVarD.f42645b = aVar;
            }
            I.c cVar = bVar.f3955b;
            if (cVar != null) {
                aVarD.f42646c = cVar;
            }
            Dg.a aVar2 = bVar.f3956c;
            if (aVar2 != null) {
                aVarD.f42647d = aVar2;
            }
            bVar = new I.b((I.a) aVarD.f42645b, (I.c) aVarD.f42646c, (Dg.a) aVarD.f42647d);
        }
        c0992m0.insertOption(v3, optionPriority, bVar);
    }

    boolean containsOption(@NonNull V v3);

    void findOptions(@NonNull String str, @NonNull OptionMatcher optionMatcher);

    @NonNull
    W getOptionPriority(@NonNull V v3);

    @NonNull
    Set<W> getPriorities(@NonNull V v3);

    @NonNull
    Set<V> listOptions();

    @Nullable
    <ValueT> ValueT retrieveOption(@NonNull V v3);

    @Nullable
    <ValueT> ValueT retrieveOption(@NonNull V v3, @Nullable ValueT valuet);

    @Nullable
    <ValueT> ValueT retrieveOptionWithPriority(@NonNull V v3, @NonNull W w3);
}
