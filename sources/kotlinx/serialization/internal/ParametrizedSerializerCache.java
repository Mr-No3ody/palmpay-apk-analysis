package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "Lkotlin/reflect/KClass;", "key", "", "Lkotlin/reflect/KType;", "types", "Lxf/q;", "Lkotlinx/serialization/KSerializer;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "get", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ParametrizedSerializerCache<T> {
    @NotNull
    /* JADX INFO: renamed from: get-gIAlu-s, reason: not valid java name */
    Object m126getgIAlus(@NotNull KClass<Object> key, @NotNull List<? extends KType> types);
}
