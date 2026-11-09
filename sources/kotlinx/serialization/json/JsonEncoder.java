package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import p176lg.c;
import p176lg.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Llg/j;", "element", "", "encodeJsonElement", "(Llg/j;)V", "Llg/c;", "getJson", "()Llg/c;", "json", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JsonEncoder extends Encoder, CompositeEncoder {
    void encodeJsonElement(@NotNull j element);

    @NotNull
    c getJson();
}
